package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited ${int} in my wallet")
    public void iHaveDeposited$Money_to_walletInMyWallet(int int1) {
        wallet.deposit(int1);
        Assert.assertEquals(int1, wallet.getBalance());
    }
    @When("I request ${int}")
    public void iRequest$Money_from_wallet(int money_from_wallet) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, money_from_wallet);
    }
    @Then("${int} should be dispensed")
    public void $Money_dispensedShouldBeDispensed(int money_dispensed) {
        Assert.assertEquals(money_dispensed, cashSlot.getContents());
    }
}
