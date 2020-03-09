package Boat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

final class FishingBoat {

    private static final Logger LOGGER = LogManager.getLogger(FishingBoat.class);

    void sail() {
        LOGGER.info("Entered into sail() in FishingBoat");
        LOGGER.info("The fishing boat is sailing");
    }

}

