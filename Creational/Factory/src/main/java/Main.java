import Delivery.Ship;
import Delivery.Transport;
import Delivery.Truck;

public class Main {
    public static void main(String args[]){
        Transport vehical=new Ship();
        System.out.println(vehical.delivery(15));

    }

}
