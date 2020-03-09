package Experts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Welder implements DoorFittingExpert {
    Logger log= LogManager.getLogger(this.getClass());
    static final String DESCRIPTION = "I can only fit iron doors";
    @Override
    public String getDescription() {
        log.info("Enter into getDescription() in Welder");
        log.info("Exited from getDescription() in Welder");
        return DESCRIPTION;
    }
}
