package org.openmrs.module.clinic.metadata;

import org.openmrs.module.metadatadeploy.descriptor.PatientIdentifierTypeDescriptor;

public class PatientIdentifierTypes {

    public static PatientIdentifierTypeDescriptor PATIENT_CLINIC_NUMBER = new PatientIdentifierTypeDescriptor() {
        @Override
        public String name() {
            return "Patient Clinic Number";
        }

        @Override
        public String description() {
            return "This is the patient's identifier used at the treating facility";
        }

        public String uuid() {
            return "9baf3fba-ad27-11e9-b05d-6f4d50626c9f";
        }

        public String formatDescription() {
            return "Description will be needed later";
        }
    };

    public static PatientIdentifierTypeDescriptor PATIENT_MOBILE_NUMBER = new PatientIdentifierTypeDescriptor() {
        @Override
        public String name() {
            return "Patient mobile number";
        }

        @Override
        public String description() {
            return "This is the mobile number for te patient";
        }

        public String uuid() {
            return "b3699678-ad27-11e9-95d1-671186f99c27";
        }

        public String formatDescription() {
            return "At least 10 digits are required";
        }
    };

    public static PatientIdentifierTypeDescriptor NATIONAL_ID_NUMBER = new PatientIdentifierTypeDescriptor() {
        @Override
        public String name() {
            return "National Identity Number";
        }

        @Override
        public String description() {
            return "A number that identifies a patient uniquely country wide";
        }

        public String uuid() {
            return "c93092b8-ad27-11e9-b10d-bb8b20202c8e";
        }

        public String formatDescription() {
            return "Will be determined";
        }
    };
}
