package Door;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodenDoor implements Door {
    Logger log= LogManager.getLogger(this.getClass());
    static final String DESCRIPTION = "I am a wooden door";
    @Override
    public String getDescription() {
        log.info("Enter into getDescription() in WoodenDoor");
        log.info("Exited from getDescription() in WoodenDoor");
        return DESCRIPTION;
    }
}
