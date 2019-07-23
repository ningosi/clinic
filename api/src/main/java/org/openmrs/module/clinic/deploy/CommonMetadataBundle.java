package org.openmrs.module.clinic.deploy;


import org.openmrs.module.clinic.metadata.EncounterTypes;
import org.openmrs.module.clinic.metadata.PatientIdentifierTypes;
import org.openmrs.module.clinic.metadata.PersonAttributeTypes;
import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

@Component
public class CommonMetadataBundle extends AbstractMetadataBundle {

    /**
     * @see org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle#install()
     */
    public void install() throws Exception {

        // install the patient identifier types
        log.info("Installing PatientIdentifierTypes");
        install(PatientIdentifierTypes.PATIENT_CLINIC_NUMBER);
        install(PatientIdentifierTypes.PATIENT_MOBILE_NUMBER);
        install(PatientIdentifierTypes.NATIONAL_ID_NUMBER);
        log.info("Patient IdentifierTypes installed");

        // install person attribute types
        log.info("Installing PatientAttributeTypes");
        install(PersonAttributeTypes.NEXT_OF_KIN_NAME);
        install(PersonAttributeTypes.NEXT_OF_KIN_TELEPHONE);
        install(PersonAttributeTypes.MODE_OF_PAYMENT);
        install(PersonAttributeTypes.MEMBERSHIP_NUMBER);
        install(PersonAttributeTypes.SCHEME_EMPLOYER);
        install(PersonAttributeTypes.NEXT_OF_KIN_EMAIL);

        log.info("Person AttributeTypes installed");

        //Install Encounter Type
        log.info("Installing EncounterTypes");
        install(EncounterTypes.CONSULTATIONS_ENCOUNTER_TYPE);



    }
}
