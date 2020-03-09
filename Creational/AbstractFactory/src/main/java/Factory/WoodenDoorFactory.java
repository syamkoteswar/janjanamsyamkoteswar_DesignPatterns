package Factory;

import Door.Door;
import Door.WoodenDoor;
import Experts.Carpenter;
import Experts.DoorFittingExpert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodenDoorFactory implements DoorFactory {
    Logger log= LogManager.getLogger(this.getClass());
    @Override
    public Door makeDoor() {
        log.info("Enter into makeDoor() in WoodenDoorFactory");
        log.info("Exited from makeDoor() in WoodenDoorFactory");
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        log.info("Enter into makeFittingExpert() in WoodenDoorFactory");
        log.info("Exited from makeFittingExpert() in WoodenDoorFactory");
        return new Carpenter();
    }
}
