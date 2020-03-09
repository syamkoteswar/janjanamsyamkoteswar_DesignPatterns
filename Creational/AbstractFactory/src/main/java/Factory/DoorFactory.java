package Factory;

import Door.Door;
import Experts.DoorFittingExpert;

public interface DoorFactory {
    public Door makeDoor();
    public DoorFittingExpert makeFittingExpert();
}
