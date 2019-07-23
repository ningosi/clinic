package org.openmrs.module.clinic.flags;

import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.clinic.Dictionary;
import org.openmrs.module.clinic.calculation.AbstractPatientCalculation;
import org.openmrs.module.clinic.calculation.BooleanResult;
import org.openmrs.module.clinic.calculation.ConfigCalculations;
import org.openmrs.module.clinic.calculation.ConfigEmrCalculationUtils;
import org.openmrs.module.clinic.calculation.PatientFlagCalculation;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class MissedAppointmentCalculation extends AbstractPatientCalculation implements PatientFlagCalculation {

    @Override
    public String getFlagMessage() {
        return "Missed Appointments";
    }

    @Override
    public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> map, PatientCalculationContext context) {

        CalculationResultMap ret = new CalculationResultMap();
        CalculationResultMap lastReturnDateObss = ConfigCalculations.lastObs(Dictionary.getConcept(Dictionary.RETURN_VISIT_DATE), cohort, context);
        for(Integer ptId: cohort){
            boolean missed = false;
            Date lastScheduledReturnDate = ConfigEmrCalculationUtils.datetimeObsResultForPatient(lastReturnDateObss, ptId);

            if (lastScheduledReturnDate != null && ConfigEmrCalculationUtils.daysSince(lastScheduledReturnDate, context) > 0) {
                missed = true;
            }
            ret.put(ptId, new BooleanResult(missed, this, context));
        }
        return ret;
    }
}
