package Experts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Carpenter implements DoorFittingExpert{
    Logger log= LogManager.getLogger(this.getClass());
    static final String DESCRIPTION = "I can only fit wooden doors";
    @Override
    public String getDescription() {
        log.info("Enter into getDescription() in Carpenter");
        log.info("Exited from getDescription() in Carpenter");
        return DESCRIPTION;
    }
}
