package org.openmrs.module.clinic.metadata;

import org.openmrs.module.metadatadeploy.descriptor.EncounterTypeDescriptor;

public class EncounterTypes {

    public static EncounterTypeDescriptor CONSULTATIONS_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Consultations";
        }

        @Override
        public String description() {
            return "Used for collecting Initial encounter information";
        }

        public String uuid() {
            return "6e2a5afc-ad27-11e9-a42d-3704b4679ed4";
        }
    };

}
