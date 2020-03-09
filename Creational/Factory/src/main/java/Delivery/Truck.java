package Delivery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Truck implements Transport {
    Logger log= LogManager.getLogger(this.getClass());
    @Override
    public String delivery(int amount) {
        log.info("Enter in to truck delivery()");
        log.info("exit  from truck delivery()");
        return "Delivery in Truck an amount of "+String.valueOf(amount)+" Items.";
    }
}
