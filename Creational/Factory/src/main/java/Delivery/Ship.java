package Delivery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ship implements Transport {
    Logger log= LogManager.getLogger(this.getClass());
    @Override
    public String delivery(int amount) {
        log.info("Enter in ship to delivery()");
        log.info("exit ship from delivery()");
        return "Delivery in ship an amount of "+String.valueOf(amount)+" Items.";
    }
}
