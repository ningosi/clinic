package org.openmrs.module.aihdconfigs.tasks;

import org.apache.commons.lang3.StringUtils;
import org.openmrs.*;
import org.openmrs.api.AdministrationService;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.module.aihdconfigs.metadata.PatientIdentifierTypes;
import org.openmrs.module.aihdconfigs.metadata.PersonAttributeTypes;
import org.openmrs.module.metadatadeploy.MetadataUtils;
import org.openmrs.scheduler.tasks.AbstractTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

public class ConvertPatientPhoneNumberIntoIdentifierTask extends AbstractTask {

    private static final Logger log = LoggerFactory.getLogger(ConvertPatientPhoneNumberIntoIdentifierTask.class);

    @Override
    public void execute() {
        if (!isExecuting) {
            if (log.isDebugEnabled()) {
                log.debug("Changing the patient phone number form person attribute to patient identifier");
            }

            startExecuting();
            try {
                //do all the work here
                convertPhoneNumberIntoPatientIdentifier();
            }
            catch (Exception e) {
                log.error("Error while converting phone number for patient into patient identifier", e);
            }
            finally {
                stopExecuting();
            }
        }
    }

    private void convertPhoneNumberIntoPatientIdentifier() {
        //logic to perform this will follow here
        PatientService patientService = Context.getPatientService();
        Integer sessionLocationId = Context.getUserContext().getLocationId();
        AdministrationService as = Context.getAdministrationService();
        PersonAttributeType mobileNumber= MetadataUtils.existing(PersonAttributeType.class, PersonAttributeTypes.TELEPHONE_NUMBER.uuid());
        PatientIdentifierType pit_mobile_number = patientService.getPatientIdentifierTypeByUuid(PatientIdentifierTypes.MOBILE_NUMBER.uuid());
        List<List<Object>> patientIds_withIds = as.executeSQL("SELECT patient_id FROM patient_identifier WHERE identifier_type IN (SELECT patient_identifier_type_id FROM patient_identifier_type WHERE uuid = 'd0929ad2-f87a-11e7-80ee-672bf941f754')", true);
        List<List<Object>> patientIds_withoutMobileNo = as.executeSQL("SELECT patient_id FROM patient WHERE patient_id NOT IN(select patient_id from patient_identifier where identifier_type=5)", true);
        if(patientIds_withoutMobileNo.size() > 0){
            for (List<Object> row : patientIds_withoutMobileNo) {
                Patient p = patientService.getPatient((Integer) row.get(0));
                PatientIdentifier identifiers= p.getPatientIdentifier(pit_mobile_number);
                PersonAttribute mobileNo =p.getAttribute(mobileNumber);
                if(mobileNo != null && StringUtils.isNotEmpty(mobileNo.getValue())){
                    for (List<Object> havingPhoneNumber : patientIds_withIds) {
                        Patient patientWithMobileNumber = patientService.getPatient((Integer) row.get(0));
                        PatientIdentifier identifiersMobile= patientWithMobileNumber.getPatientIdentifier(pit_mobile_number);
                        if (mobileNo.getValue().equals(identifiersMobile.getIdentifier())){
                            //There is a patient already who has this identifier of this type hence skipped.
                        }
                        else {
                            PatientIdentifier newMobileNumber = new PatientIdentifier();
                            newMobileNumber.setIdentifier(mobileNo.getValue());
                            newMobileNumber.setIdentifierType(pit_mobile_number);
                            newMobileNumber.setCreator(Context.getAuthenticatedUser());
                            newMobileNumber.setDateCreated(new Date());

                            //
                            p.addIdentifier(newMobileNumber);
                        }

                    }

                }
            }
        }
    }
}
