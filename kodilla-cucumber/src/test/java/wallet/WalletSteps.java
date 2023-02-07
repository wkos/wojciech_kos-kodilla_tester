package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private int money_to_wallet;
    private int money_from_wallet;
    private int money_dispensed;

    @Given("I have deposited ${int} in my wallet")
    public void iHaveDeposited$Money_to_walletInMyWallet(Integer int1) {
        this.money_to_wallet = int1;
        wallet.deposit(int1);
        Assert.assertEquals(money_to_wallet, wallet.getBalance());
    }
    @When("I request ${int}")
    public void iRequest$Money_from_wallet(Integer int1) {
        this.money_from_wallet = int1;
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, money_from_wallet);
    }
    @Then("${int} should be dispensed")
    public void $Money_dispensedShouldBeDispensed(Integer int1) {
        this.money_dispensed = int1;
        Assert.assertEquals(money_dispensed, cashSlot.getContents());
    }
}
