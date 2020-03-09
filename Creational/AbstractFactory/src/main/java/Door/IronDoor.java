package Door;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IronDoor implements Door {
    static final String DESCRIPTION = "I am a Iron door";
    Logger log= LogManager.getLogger(this.getClass());
    @Override
    public String getDescription() {
        log.info("Enter into getDescription() in IronDoor");
        log.info("Exited from getDescription() in IronDoor");
        return DESCRIPTION;
    }
}
