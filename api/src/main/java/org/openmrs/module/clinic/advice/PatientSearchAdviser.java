package org.openmrs.module.clinic.advice;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.api.context.Context;
import org.openmrs.api.context.Daemon;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatientSearchAdviser extends StaticMethodMatcherPointcutAdvisor implements Advisor {

    private static final Log log = LogFactory.getLog(PatientSearchAdviser.class);

    @Override
    public boolean matches(Method method, Class targetClass) {
        if (method.getName().equals("getPatients")) {
            return true;
        }
        else if (method.getName().equals("getPatient")) {
            return true;
        }
        else if (method.getName().equals("getPatientByUuid")) {
            return true;
        }
        return false;
    }

    @Override
    public Advice getAdvice() {
        return new PatientSearchAdvise();
    }

    private class PatientSearchAdvise implements MethodInterceptor {
        public Object invoke(MethodInvocation invocation) throws Throwable {
            if (Context.getAuthenticatedUser() == null) {
                return null;
            }
            Object object = invocation.proceed();
            if (Daemon.isDaemonUser(Context.getAuthenticatedUser()) || Context.getAuthenticatedUser().isSuperUser()) {
                return object;
            }

            Integer sessionLocationId = Context.getUserContext().getLocationId();
                if (sessionLocationId != null) {
                    String sessionLocationUuid = Context.getLocationService().getLocation(sessionLocationId).getUuid();
                    if(object instanceof List) {
                        List<Patient> patientList = (List<Patient>) object;
                        for (Iterator<Patient> iterator = patientList.iterator(); iterator.hasNext(); ) {
                            if(!doesPatientBelongToGivenLocation(iterator.next(), sessionLocationUuid)) {
                                iterator.remove();
                            }
                        }
                        object = patientList;
                    }
                    else if(object instanceof Patient) {
                        if(!doesPatientBelongToGivenLocation((Patient)object, sessionLocationUuid)) {
                            object = null;
                        }
                    }
                } else {
                    log.debug("Search Patient : Null Session Location in the UserContext");
                    if(object instanceof Patient) {
                        // If the sessionLocationId is null, then return null for a Patient instance
                        return null;
                    }
                    else {
                        // If the sessionLocationId is null, then return a empty list
                        return new ArrayList<Patient>();
                    }
                }
            return object;
        }

        private boolean doesPatientBelongToGivenLocation(Patient patient, String sessionLocationUuid) {
            boolean thereIsMatch = false;
            PatientIdentifier patientIdentifier = patient.getPatientIdentifier(Context.getPatientService().getPatientIdentifierTypeByUuid("b9ba3418-7108-450c-bcff-7bc1ed5c42d1"));
            if(patientIdentifier != null && patientIdentifier.getLocation() != null) {
                if(patientIdentifier.getLocation().equals(Context.getLocationService().getLocationByUuid(sessionLocationUuid))){
                    thereIsMatch = true;
                }
            }
            return thereIsMatch;
        }
    }
}