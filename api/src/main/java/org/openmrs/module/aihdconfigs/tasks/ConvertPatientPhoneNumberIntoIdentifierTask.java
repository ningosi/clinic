package org.openmrs.module.aihdconfigs.tasks;

import org.openmrs.scheduler.tasks.AbstractTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    }
}
