package Account;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Account {

    private static final Logger LOGGER = LogManager.getLogger(Account.class);
    protected Account successor;
    protected float balance;

    public void setNext(Account $account) {
        this.successor = $account;
    }

    public void pay(float amountToPay) {
        if (this.canPay(amountToPay)) {
            LOGGER.info("Paid" + String.valueOf(amountToPay), successor.getClass().getName());
        } else if (this.successor != null) {
            LOGGER.info("Cannot pay using " + successor.getClass().getName() + " Proceeding ..");
            this.successor.pay(amountToPay);
        }
    }

    public boolean canPay(float amount) {
        return this.balance >= amount;
    }
}
