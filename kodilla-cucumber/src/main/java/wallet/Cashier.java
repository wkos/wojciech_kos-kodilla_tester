package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            cashSlot.dispense(amount);
        } else {
            cashSlot.dispense(0);
        }
    }

    public String messageFromCashier(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            return "Here you are";
        } else {
            return "You don't have enough money in your wallet";
        }
    }
}
