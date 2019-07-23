package org.openmrs.module.clinic.fragment.controller;

import org.openmrs.Location;
import org.openmrs.api.context.Context;
import org.openmrs.module.appframework.domain.Extension;
import org.openmrs.module.appframework.service.AppFrameworkService;
import org.openmrs.module.appui.AppUiExtensions;
import org.openmrs.ui.framework.annotation.SpringBean;
import org.openmrs.ui.framework.fragment.FragmentModel;
import org.openmrs.api.LocationService;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class ClinicHeaderFragmentController {

    private static final String GET_LOCATIONS = "Get Locations";

    private static final String VIEW_LOCATIONS = "View Locations";

    public void controller(@SpringBean AppFrameworkService appFrameworkService, FragmentModel fragmentModel) {
        try {
            Context.addProxyPrivilege(GET_LOCATIONS);
            Context.addProxyPrivilege(VIEW_LOCATIONS);
             
            List<Location> allLocations = Context.getLocationService().getAllLocations();
            allLocations.removeAll(excludeLocationsFromDashBoard());
            fragmentModel.addAttribute("loginLocations", allLocations);

            List<Extension> exts = appFrameworkService.getExtensionsForCurrentUser(AppUiExtensions.HEADER_CONFIG_EXTENSION);
            Map<String, Object> configSettings = exts.size() > 0 ? exts.get(0).getExtensionParams() : null;
            fragmentModel.addAttribute("configSettings", configSettings);
            List<Extension> userAccountMenuItems = appFrameworkService.getExtensionsForCurrentUser(
                    AppUiExtensions.HEADER_USER_ACCOUNT_MENU_ITEMS_EXTENSION);
            fragmentModel.addAttribute("userAccountMenuItems", userAccountMenuItems);
            //Location location = Context.getLocationService().getLocationByUuid(Context.getAdministrationService().getGlobalProperty("clinic.facilityName"));
            //fragmentModel.addAttribute("facility", location);
        }
        finally {
            Context.removeProxyPrivilege(GET_LOCATIONS);
            Context.removeProxyPrivilege(VIEW_LOCATIONS);
        }
    }

    public List<Location> excludeLocationsFromDashBoard(){
        List<Location> toExclude = new ArrayList<Location>();
        LocationService service = Context.getLocationService();
        List<String> unUsedLocations = Arrays.asList("Amani Hospital", "Registration Desk", "Pharmacy", "Inpatient Ward", "Isolation Ward", "Laboratory", "Outpatient Clinic", "Unknown Location");
        for(String s: unUsedLocations){
            toExclude.add(service.getLocation(s));
        }
        return toExclude;

    }
}
