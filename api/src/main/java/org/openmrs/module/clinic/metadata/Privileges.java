package org.openmrs.module.clinic.metadata;

import org.openmrs.module.metadatadeploy.descriptor.PrivilegeDescriptor;
import org.openmrs.util.PrivilegeConstants;

public class Privileges {

    public static PrivilegeDescriptor APP_AIHDREPORTS_PRV = new PrivilegeDescriptor() {
        public String uuid() {
            return "5176b6da-b827-11e8-9a2f-0bb169a8ff49";
        }

        public String privilege() {
            return "App: aihdreports.viewReports";
        }

        public String description() {
            return "Access to the Reports app by clinicians";
        }
    };

    public static PrivilegeDescriptor PRV_GET_PATIENTS = new PrivilegeDescriptor() {
        public String uuid() {
            return "802d5b4e-b81a-11e8-a218-535c8ca87942";
        }

        public String privilege() {
            return PrivilegeConstants.GET_PATIENTS;
        }

        public String description() {
            return "Get patients";
        }
    };

    public static PrivilegeDescriptor PRV_GET_CONCEPTS = new PrivilegeDescriptor() {
        public String uuid() {
            return "30355898-b81b-11e8-8441-5b70e5bf8ec0";
        }

        public String privilege() {
            return PrivilegeConstants.GET_CONCEPTS;
        }

        public String description() {
            return "Get concepts";
        }
    };

    public static PrivilegeDescriptor PRV_GET_USERS = new PrivilegeDescriptor() {
        public String uuid() {
            return "c688ed0a-b81b-11e8-96f7-13f6ed506608";
        }

        public String privilege() {
            return PrivilegeConstants.GET_USERS;
        }

        public String description() {
            return "Get users";
        }
    };

    public static PrivilegeDescriptor PRV_GET_LOCATIONS = new PrivilegeDescriptor() {
        public String uuid() {
            return "508dd48a-b820-11e8-9c64-fff2b21c8de0";
        }

        public String privilege() {
            return PrivilegeConstants.GET_LOCATIONS;
        }

        public String description() {
            return "Get Locations";
        }
    };

    public static PrivilegeDescriptor APP_COREAPPS_FIND_PATIENT = new PrivilegeDescriptor() {
        public String uuid() {
            return "f94453fe-b827-11e8-a149-6f8d77c27cad";
        }

        public String privilege() {
            return "App: coreapps.findPatient";
        }

        public String description() {
            return "Able to access the find patient app";
        }
    };

    public static PrivilegeDescriptor APP_COREAPPS_PATIENT_DASHBOARD = new PrivilegeDescriptor() {
        public String uuid() {
            return "e4b532cb-9519-41ff-9195-40950404f233";
        }

        public String privilege() {
            return "App: coreapps.patientDashboard";
        }

        public String description() {
            return "Able to access the patient dashboard";
        }
    };

    public static PrivilegeDescriptor APP_COREAPPS_PATIENT_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "56e3d9aa-892a-4c2e-b44c-7c2d34c9aeb4";
        }

        public String privilege() {
            return "App: coreapps.patientVisits";
        }

        public String description() {
            return "Able to access the patient visits screen";
        }
    };

    public static PrivilegeDescriptor XFORM_GET_FORMS = new PrivilegeDescriptor() {
        public String uuid() {
            return "d05118c6-2490-4d78-a41a-390e3596a240";
        }

        public String privilege() {
            return "Get Forms";
        }

        public String description() {
            return "Able to access forms";
        }
    };

    public static PrivilegeDescriptor APP_EMR_SYSTEM_ADMINISTRATION = new PrivilegeDescriptor() {
        public String uuid() {
            return "ff556f40-b82b-11e8-ad8b-a3f65c55422d";
        }

        public String privilege() {
            return "App: coreapps.systemAdministration";
        }

        public String description() {
            return "Run the System Administration app";
        }
    };

    public static PrivilegeDescriptor APP_REGISTRATION_REGISTER_PATIENT = new PrivilegeDescriptor() {
        public String uuid() {
            return "cbb48840-aafd-4777-a22d-939896782296";
        }

        public String privilege() {
            return "App: registrationapp.registerPatient";
        }

        public String description() {
            return "Able to access the register patient app";
        }
    };

    public static PrivilegeDescriptor APP_REPORTINGUI_REPORTS = new PrivilegeDescriptor() {
        public String uuid() {
            return "e37a8260-b82b-11e8-a659-c3fc69999383";
        }

        public String privilege() {
            return "App: reportingui.reports";
        }

        public String description() {
            return "Use the Reports app provided by the reportingui module";
        }
    };

    public static PrivilegeDescriptor PRV_GET_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "d05118c6-2490-4d78-a41a-390e3596a214";
        }

        public String privilege() {
            return PrivilegeConstants.GET_VISITS;
        }

        public String description() {
            return "Able to get visits";
        }
    };

    public static PrivilegeDescriptor PRV_ADD_PATIENT = new PrivilegeDescriptor() {
        public String uuid() {
            return "0c00b28e-b82e-11e8-9a46-9bf22adaef4f";
        }

        public String privilege() {
            return PrivilegeConstants.ADD_PATIENTS;
        }

        public String description() {
            return "Add patients";
        }
    };

    public static PrivilegeDescriptor PRV_EDIT_PATIENT = new PrivilegeDescriptor() {
        public String uuid() {
            return "0b4588e6-b82f-11e8-94d4-230485181b50";
        }

        public String privilege() {
            return PrivilegeConstants.EDIT_PATIENTS;
        }

        public String description() {
            return "Get patients";
        }
    };

    public static PrivilegeDescriptor PRV_GET_VISITS_TYPES = new PrivilegeDescriptor() {
        public String uuid() {
            return "d05118c6-2490-4d78-a41a-390e3596a215";
        }

        public String privilege() {
            return PrivilegeConstants.GET_VISIT_TYPES;
        }

        public String description() {
            return "Get visits types";
        }
    };

    public static PrivilegeDescriptor PRV_GET_VISITS_ATTRIBUTE_TYPES = new PrivilegeDescriptor() {
        public String uuid() {
            return "d05118c6-2490-4d78-a41a-390e3596a213";
        }

        public String privilege() {
            return PrivilegeConstants.GET_VISIT_ATTRIBUTE_TYPES;
        }

        public String description() {
            return "Get visits attribute types";
        }
    };

    public static PrivilegeDescriptor PRV_GET_PEOPLE = new PrivilegeDescriptor() {
        public String uuid() {
            return "1e9fc76c-b834-11e8-8d2f-fffcb9830ac6";
        }

        public String privilege() {
            return "Get People";
        }

        public String description() {
            return "Get people";
        }
    };

    public static PrivilegeDescriptor PRV_GET_ENCOUNTERS = new PrivilegeDescriptor() {
        public String uuid() {
            return "5ab5f284-ba60-11e8-ac46-7b40c60f0c81";
        }

        public String privilege() {
            return PrivilegeConstants.GET_ENCOUNTERS;
        }

        public String description() {
            return "Get encounters";
        }
    };

    public static PrivilegeDescriptor PRV_GET_PROVIDERS = new PrivilegeDescriptor() {
        public String uuid() {
            return "fe762024-ba60-11e8-b17b-27614e4572f9";
        }

        public String privilege() {
            return PrivilegeConstants.GET_PROVIDERS;
        }

        public String description() {
            return "Get Providers";
        }
    };

    public static PrivilegeDescriptor PRV_GET_CONCEPT_SOURCES = new PrivilegeDescriptor() {
        public String uuid() {
            return "342d9b4a-ba64-11e8-bd7b-6f82e74bc3a2";
        }

        public String privilege() {
            return PrivilegeConstants.GET_CONCEPT_SOURCES;
        }

        public String description() {
            return "Get Concept Sources";
        }
    };

    public static PrivilegeDescriptor PRV_GET_VISITS_PATIENT_DASHBOARD = new PrivilegeDescriptor() {
        public String uuid() {
            return "29ccbdf2-3c48-4c9f-a9f5-1f8e4f2d049b";
        }

        public String privilege() {
            return "Patient Dashboard - View Visits Section";
        }

        public String description() {
            return "Able to view the 'Visits' tab on the patient dashboard";
        }
    };

    public static PrivilegeDescriptor PRV_ADD_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "65d14b28-3989-11e6-899a-a4d646d86a8a";
        }

        public String privilege() {
            return PrivilegeConstants.ADD_VISITS;
        }

        public String description() {
            return "Able to add visits";
        }
    };

    public static PrivilegeDescriptor PRV_ACTIVE_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "79f7f974-eb03-4f6d-869a-9e81a2cff878";
        }

        public String privilege() {
            return "App: coreapps.activeVisits";
        }

        public String description() {
            return "Allow access of the active visit app";
        }
    };

    public static PrivilegeDescriptor PRV_EDIT_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "6be42691-3c0a-46bc-a995-8646f075b91c";
        }

        public String privilege() {
            return "Edit Visits";
        }

        public String description() {
            return "Able to edit visits";
        }
    };

    public static PrivilegeDescriptor PRV_LOCATION_ATTRIBUTE_TYPES = new PrivilegeDescriptor() {
        public String uuid() {
            return "8dfcbe3c-ba71-11e8-acc0-9b539c687351";
        }

        public String privilege() {
            return PrivilegeConstants.GET_LOCATION_ATTRIBUTE_TYPES;
        }

        public String description() {
            return "Get Location Attribute Types";
        }
    };

    public static PrivilegeDescriptor PRV_DATA_MANAGEMENT = new PrivilegeDescriptor() {
        public String uuid() {
            return "73350ecc-ba73-11e8-911f-674916180ff9";
        }

        public String privilege() {
            return "App: coreapps.dataManagement";
        }

        public String description() {
            return "Data management";
        }
    };

    public static PrivilegeDescriptor PRV_CONFIGURE_METADATA = new PrivilegeDescriptor() {
        public String uuid() {
            return "cd16f158-ba73-11e8-8b5e-8f504c684d2d";
        }

        public String privilege() {
            return "App: adminui.configuremetadata";
        }

        public String description() {
            return "Configure Metadata";
        }
    };

    public static PrivilegeDescriptor PRV_MANAGE_APPS = new PrivilegeDescriptor() {
        public String uuid() {
            return "2d11af76-ba74-11e8-820a-2f383c045c9f";
        }

        public String privilege() {
            return "App: referenceapplication.manageApps";
        }

        public String description() {
            return "Manage apps";
        }
    };

    public static PrivilegeDescriptor PRV_ADD_USERS = new PrivilegeDescriptor() {
        public String uuid() {
            return "9efa3820-ba7d-11e8-b2fc-d3eb1fac9162";
        }

        public String privilege() {
            return PrivilegeConstants.ADD_USERS;
        }

        public String description() {
            return "Add users";
        }
    };

    public static PrivilegeDescriptor PRV_PROVIDER_MANAGEMENT_API = new PrivilegeDescriptor() {
        public String uuid() {
            return "4a5039e0-ba7e-11e8-bbd7-9704c924ed21";
        }

        public String privilege() {
            return "Provider Management API";
        }

        public String description() {
            return "Provider Management";
        }
    };

    public static PrivilegeDescriptor PRV_PROVIDER_MANAGEMENT_API_READ_ONLY = new PrivilegeDescriptor() {
        public String uuid() {
            return "7f077464-ba7e-11e8-9a4c-6f12c61f841c";
        }

        public String privilege() {
            return "Provider Management API - Read-only";
        }

        public String description() {
            return "Provider Management Read only";
        }
    };

    public static PrivilegeDescriptor PRV_ATTACHMENT_PAGE = new PrivilegeDescriptor() {
        public String uuid() {
            return "5e91d97a-5fee-48e3-9ff9-4f1b08992394";
        }

        public String privilege() {
            return "App: attachments.attachments.page";
        }

        public String description() {
            return "Allowed to access the main attachments page";
        }
    };

    public static PrivilegeDescriptor PRV_VISITS_CONFIGURE = new PrivilegeDescriptor() {
        public String uuid() {
            return "d38d2f86-ecbe-4600-8e41-6c7861c8494f";
        }

        public String privilege() {
            return "Configure Visits";
        }

        public String description() {
            return "Able to choose encounter visit handler and enable/disable encounter visits";
        }
    };

    public static PrivilegeDescriptor PRV_VISITS_DELETE = new PrivilegeDescriptor() {
        public String uuid() {
            return "a9df9475-5339-4b9f-be1a-6313bc22190b";
        }

        public String privilege() {
            return "Delete Visits";
        }

        public String description() {
            return "Able to delete visits";
        }
    };

    public static PrivilegeDescriptor PRV_VISITS_RETROSPECTIVE = new PrivilegeDescriptor() {
        public String uuid() {
            return "75cb5b9a-c3e0-40cb-95d2-8707cdf2b232";
        }

        public String privilege() {
            return "Task: coreapps.createRetrospectiveVisit";
        }

        public String description() {
            return "Able to create a retrospective visit";
        }
    };

    public static PrivilegeDescriptor PRV_VISITS_CORE_APPS_CREATE = new PrivilegeDescriptor() {
        public String uuid() {
            return "00474997-a89b-48b7-a4a5-29b18660b1a7";
        }

        public String privilege() {
            return "Task: coreapps.createVisit";
        }

        public String description() {
            return "Able to create a visit";
        }
    };

    public static PrivilegeDescriptor PRV_VISITS_CORE_APPS_END = new PrivilegeDescriptor() {
        public String uuid() {
            return "112f8c97-d7ed-4161-991b-4ef0d8b1eda7";
        }

        public String privilege() {
            return "Task: coreapps.endVisit";
        }

        public String description() {
            return "Able to end visit";
        }
    };

}
