package org.openmrs.module.clinic.fragment.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Obs;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.patient.PatientCalculationService;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.clinic.ConfigCoreUtils;
import org.openmrs.module.clinic.Dictionary;
import org.openmrs.module.clinic.calculation.ConfigCalculations;
import org.openmrs.module.clinic.calculation.ConfigEmrCalculationUtils;
import org.openmrs.module.emrapi.patient.PatientDomainWrapper;
import org.openmrs.ui.framework.annotation.FragmentParam;
import org.openmrs.ui.framework.fragment.FragmentModel;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AppointmentHistoryWidgetFragmentController {

    protected final Log log = LogFactory.getLog(getClass());

    public void controller(FragmentModel model, @FragmentParam("patient") PatientDomainWrapper patient) {
        Map<String, String> summary = new HashMap<String, String>();

        //set context
        PatientCalculationService patientCalculationService = Context.getService(PatientCalculationService.class);
        PatientCalculationContext context = patientCalculationService.createCalculationContext();
        context.setNow(new Date());

        summary.putAll(returnDate(patient.getId(), context));
        model.addAttribute("apointment", summary);
    }

    private Map<String, String> returnDate(Integer patientId, PatientCalculationContext context){
        Map<String, String> results = new HashMap<String, String>();
        CalculationResultMap lastDiabeticObs = ConfigCalculations.lastObs(Dictionary.getConcept(Dictionary.RETURN_VISIT_DATE), Arrays.asList(patientId), context);
        Obs obs =  ConfigEmrCalculationUtils.obsResultForPatient(lastDiabeticObs, patientId);
        if(obs != null){
            results.put("Appointment on:", ConfigCoreUtils.formatDates(obs.getValueDatetime()));
        }
        else {
            results.put("Appointment on:", "None");
        }
        return  results;
    }
}
