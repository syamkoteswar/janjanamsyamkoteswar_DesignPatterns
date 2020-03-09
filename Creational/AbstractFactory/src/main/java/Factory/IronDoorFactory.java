package Factory;

import Door.Door;
import Door.IronDoor;
import Experts.DoorFittingExpert;
import Experts.Welder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IronDoorFactory implements DoorFactory {
    Logger log= LogManager.getLogger(this.getClass());
    @Override
    public Door makeDoor() {
        log.info("Enter into makeDoor() in IronDoorFactory");
        log.info("Exited from makeDoor() in IronDoorFactory");
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        log.info("Enter into makeFittingExpert() in IronDoorFactory");
        log.info("Exited from makeFittingExpert() in IronDoorFactory");
        return new Welder();
    }
}
