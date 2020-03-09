package Boat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Captain {
    private static final Logger LOGGER = LogManager.getLogger(Captain.class);

    private RowingBoat rowingBoat;

    public Captain() {
    }

    public Captain(final RowingBoat boat) {
        this.rowingBoat = boat;
    }

    void setRowingBoat(final RowingBoat boat) {
        LOGGER.info("Entered into setRowingBoat() in Captin");
        this.rowingBoat = boat;
    }

    public void row() {
        rowingBoat.row();
    }

}

