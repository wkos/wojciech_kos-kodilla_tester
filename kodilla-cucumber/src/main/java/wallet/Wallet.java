package wallet;

public class Wallet {
    private int amount;
    public Wallet() {
    }

    public void deposit(int money){
        this.amount = money;
    }
    public int getBalance(){
        return amount;
    }
}
