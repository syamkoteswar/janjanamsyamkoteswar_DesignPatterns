import Door.Door;
import Factory.DoorFactory;
import Factory.IronDoorFactory;
import Factory.WoodenDoorFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger log= LogManager.getLogger(Main.class);
    public static void main(String argc[]){
        DoorFactory fac=new WoodenDoorFactory();
        log.info(fac.makeDoor().getDescription());
        log.info(fac.makeFittingExpert().getDescription());
        DoorFactory fac1=new IronDoorFactory();
        log.info(fac1.makeDoor().getDescription());
        log.info(fac1.makeFittingExpert().getDescription());

    }

}
