package org.openmrs.module.aihdconfigs.metadata;

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
            return "c0f8f998-b82a-11e8-a49a-d3244f9756fd";
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
            return "90720e4e-b82b-11e8-904d-6378d77ee591";
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
            return "App: emr.systemAdministration";
        }

        public String description() {
            return "Run the System Administration app";
        }
    };

    public static PrivilegeDescriptor APP_REGISTRATION_REGISTER_PATIENT = new PrivilegeDescriptor() {
        public String uuid() {
            return "f10286f8-b82b-11e8-a07e-177748703ede";
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
            return "d1d08a58-b82d-11e8-b910-4f7195241cdc";
        }

        public String privilege() {
            return PrivilegeConstants.GET_VISITS;
        }

        public String description() {
            return "Get visits";
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
            return "f1abe64a-b82f-11e8-9e00-3331ff9e9bc9";
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
            return "d562cf24-b831-11e8-9af5-63f2106372ad";
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
            return "c7e1f8ac-ba66-11e8-b596-5bd7e07f811a";
        }

        public String privilege() {
            return "Patient Dashboard - View Visits Section";
        }

        public String description() {
            return "Patient Dashboard - View Visits Section";
        }
    };

    public static PrivilegeDescriptor PRV_ADD_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "1cdf0fca-ba67-11e8-96ee-63f8d3660e6b";
        }

        public String privilege() {
            return PrivilegeConstants.ADD_VISITS;
        }

        public String description() {
            return "Add visits";
        }
    };

    public static PrivilegeDescriptor PRV_ACTIVE_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "5fabac82-ba67-11e8-bed2-1ff2b63811ea";
        }

        public String privilege() {
            return "App: coreapps.activeVisits";
        }

        public String description() {
            return "Allow access of the active visit app";
        }
    };

    public static PrivilegeDescriptor PRV_END_VISITS = new PrivilegeDescriptor() {
        public String uuid() {
            return "c0223f90-ba67-11e8-9adc-2ba982dcf931";
        }

        public String privilege() {
            return "Edit Visits";
        }

        public String description() {
            return "Allow users to edit visits";
        }
    };

}
