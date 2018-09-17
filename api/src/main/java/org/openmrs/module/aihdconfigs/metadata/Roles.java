package org.openmrs.module.aihdconfigs.metadata;

import org.openmrs.module.metadatadeploy.descriptor.PrivilegeDescriptor;
import org.openmrs.module.metadatadeploy.descriptor.RoleDescriptor;

import java.util.Arrays;
import java.util.List;

public class Roles {

    public static RoleDescriptor CLINICIANS = new RoleDescriptor() {
        @Override
        public String role() {
            return "aihdconfigs Role: Clinician";
        }

        @Override
        public String description() {
            return "Use to manage clinician roles";
        }

        @Override
        public List<PrivilegeDescriptor> privileges() {
            return Arrays.asList(
                    Privileges.APP_AIHDREPORTS_PRV,
                    Privileges.PRV_GET_PATIENTS,
                    Privileges.PRV_GET_CONCEPTS,
                    Privileges.PRV_GET_USERS,
                    Privileges.PRV_GET_LOCATIONS,
                    Privileges.APP_COREAPPS_FIND_PATIENT,
                    Privileges.APP_COREAPPS_PATIENT_DASHBOARD,
                    Privileges.APP_COREAPPS_PATIENT_VISITS,
                    Privileges.XFORM_GET_FORMS,
                    Privileges.APP_REGISTRATION_REGISTER_PATIENT,
                    Privileges.PRV_GET_VISITS,
                    Privileges.PRV_ADD_PATIENT,
                    Privileges.PRV_EDIT_PATIENT,
                    Privileges.PRV_GET_VISITS_TYPES,
                    Privileges.PRV_GET_VISITS_ATTRIBUTE_TYPES,
                    Privileges.PRV_GET_PEOPLE,
                    Privileges.PRV_GET_ENCOUNTERS,
                    Privileges.PRV_GET_PROVIDERS,
                    Privileges.PRV_GET_CONCEPT_SOURCES,
                    Privileges.PRV_GET_VISITS_PATIENT_DASHBOARD,
                    Privileges.PRV_ADD_VISITS,
                    Privileges.PRV_ACTIVE_VISITS,
                    Privileges.PRV_END_VISITS

            );
        }

        public String uuid() {
            return "e7038b8e-b826-11e8-a61a-9f44f32fd4d4";
        }
    };
}
