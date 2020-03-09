import Account.Bank;
import Account.Bitcoin;
import Account.Paypal;

public class App {
    public static void main(String args[]){
        Bank b=new Bank(100);
        Paypal p=new Paypal(200);
        Bitcoin bit=new Bitcoin(300);
        b.setNext(p);
        b.setNext(bit);
        b.pay(259);
    }
}
