package org.openmrs.module.aihdconfigs.tasks;

import org.openmrs.Location;
import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.PersonAttribute;
import org.openmrs.PersonAttributeType;
import org.openmrs.api.AdministrationService;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.module.aihdconfigs.metadata.PersonAttributeTypes;
import org.openmrs.module.metadatadeploy.MetadataUtils;
import org.openmrs.scheduler.tasks.AbstractTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Set;

public class TagLocationsToAllIdentifiersTasks extends AbstractTask {

    private static final Logger log = LoggerFactory.getLogger(TagLocationsToAllIdentifiersTasks.class);

    @Override
    public void execute() {
        if (!isExecuting) {
            if (log.isDebugEnabled()) {
                log.debug("Attach location for all patient identifiers for specific patients");
            }

            startExecuting();
            try {
                //do all the work here
                attachLocationsToPatientIdentifiers();
            }
            catch (Exception e) {
                log.error("Error while formatting AIHD number for  for patient", e);
            }
            finally {
                stopExecuting();
            }
        }
    }

    private void attachLocationsToPatientIdentifiers(){

        //this logic will find all the places where we have identifiers without location and set them
        Location requiredLocation = null;
        PatientService patientService = Context.getPatientService();
        AdministrationService as = Context.getAdministrationService();
        PersonAttributeType attributeTypeFromMobile = MetadataUtils.existing(PersonAttributeType.class, PersonAttributeTypes.PATIENT_LOCATION.uuid());
        PersonAttributeType patientLocation= MetadataUtils.existing(PersonAttributeType.class, PersonAttributeTypes.PATIENT_MFL_CODE.uuid());
        List<List<Object>> patientIds_withIds = as.executeSQL("SELECT patient_id FROM patient_identifier WHERE identifier_type IN (SELECT patient_identifier_type_id FROM patient_identifier_type WHERE uuid = 'd0929ad2-f87a-11e7-80ee-672bf941f754')", true);
        if(patientIds_withIds.size() > 0){
            for (List<Object> row : patientIds_withIds) {
                Patient p = patientService.getPatient((Integer) row.get(0));
                PersonAttribute mflCodeForPatient = p.getAttribute(patientLocation);
                PersonAttribute personAttributeFromMobile = p.getAttribute(attributeTypeFromMobile);
                //get all identifiers for this patient and set the location
                Set<PatientIdentifier> allIdentifiersForThisPatient = p.getIdentifiers();

                if(personAttributeFromMobile != null) {
                    Location location = Context.getLocationService().getLocation(personAttributeFromMobile.getValue().replace("_", " "));
                    if(location != null){
                        requiredLocation = location;
                    }
                }

                else if(mflCodeForPatient != null) {
                    List<List<Object>> location = as.executeSQL("SELECT location_id FROM location_attribute WHERE value_reference='"+mflCodeForPatient.getValue()+"'", true);
                    if(location.size() > 0) {
                        requiredLocation = Context.getLocationService().getLocation((Integer) (location.get(0)).get(0));
                    }
                }
                if(requiredLocation != null) {
                    for(PatientIdentifier patientIdentifier: allIdentifiersForThisPatient){
                        if(patientIdentifier.getLocation() == null || !(requiredLocation.equals(patientIdentifier.getLocation()))) {
                           patientIdentifier.setLocation(requiredLocation);
                           p.addIdentifier(patientIdentifier);
                        }
                    }
                }

            }
        }

    }
}
