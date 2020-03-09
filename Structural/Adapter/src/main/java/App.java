import Boat.Captain;
import Boat.FishingBoatAdapter;

public class App {
    public static void main(String args[]){
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
