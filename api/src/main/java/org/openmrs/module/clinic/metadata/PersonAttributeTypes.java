package org.openmrs.module.clinic.metadata;

import org.openmrs.module.metadatadeploy.descriptor.PersonAttributeTypeDescriptor;

public class PersonAttributeTypes {

    public static PersonAttributeTypeDescriptor NEXT_OF_KIN_NAME = new PersonAttributeTypeDescriptor() {
        @Override
        public String uuid() {
            return "7a9d0922-ad29-11e9-8348-a74bf5ee86d9";
        }

        @Override
        public String name() {
            return "Next of kin NAME";
        }

        @Override
        public String description() {
            return "Next of kin information - name";
        }

        @Override
        public double sortWeight() {
            return 0;
        }
    };

    public static PersonAttributeTypeDescriptor NEXT_OF_KIN_TELEPHONE = new PersonAttributeTypeDescriptor() {
        @Override
        public String uuid() {
            return "adda6ae6-ad29-11e9-9417-d398d403ac11";
        }

        @Override
        public String name() {
            return "Next of kin telephone";
        }

        @Override
        public String description() {
            return "Next of kin telephone number";
        }

        @Override
        public double sortWeight() {
            return 0;
        }
    };

    public static PersonAttributeTypeDescriptor NEXT_OF_KIN_EMAIL = new PersonAttributeTypeDescriptor() {
        @Override
        public String uuid() {
            return "f8fef596-ad29-11e9-a89e-4bb98e2fb278";
        }

        @Override
        public String name() {
            return "Next of kin email";
        }

        @Override
        public String description() {
            return "Next of kin email";
        }

        @Override
        public double sortWeight() {
            return 0;
        }
    };

    public static PersonAttributeTypeDescriptor MODE_OF_PAYMENT = new PersonAttributeTypeDescriptor() {
        @Override
        public String uuid() {
            return "3379c610-ad2a-11e9-ba2e-ff18f696b139";
        }

        @Override
        public String name() {
            return "Mode of payment";
        }

        @Override
        public String description() {
            return "Patients mode of payment";
        }

        @Override
        public double sortWeight() {
            return 0;
        }
    };

    public static PersonAttributeTypeDescriptor MEMBERSHIP_NUMBER = new PersonAttributeTypeDescriptor() {
        @Override
        public String uuid() {
            return "602c6cda-ad2a-11e9-affb-bf6691a871fe";
        }

        @Override
        public String name() {
            return "Membership number";
        }

        @Override
        public String description() {
            return "Patients membership number";
        }

        @Override
        public double sortWeight() {
            return 0;
        }
    };

    public static PersonAttributeTypeDescriptor SCHEME_EMPLOYER = new PersonAttributeTypeDescriptor() {
        @Override
        public String uuid() {
            return "9b93757a-ad2a-11e9-999c-ffbc043e0e08";
        }

        @Override
        public String name() {
            return "Scheme Employer";
        }

        @Override
        public String description() {
            return "Specifies the patient scheme employer";
        }

        @Override
        public double sortWeight() {
            return 0;
        }
    };
}
