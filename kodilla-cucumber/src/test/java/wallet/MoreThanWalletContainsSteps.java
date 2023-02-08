package wallet;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MoreThanWalletContainsSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);
    private  int cashToWithdraw;

    @When("I withdraw ${int}")
    public void i_withdraw(int amount) {
        cashToWithdraw = amount;
        cashSlot.dispense(cashToWithdraw);
        cashier.withdraw(wallet, cashToWithdraw);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assert.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void you_do_not_have_enough_money() {
        Assert.assertEquals("You don't have enough money in your wallet",
                cashier.messageFromCashier(wallet, cashToWithdraw));
    }
}
