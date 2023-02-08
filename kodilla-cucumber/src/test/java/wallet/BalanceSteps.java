package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BalanceSteps {
    private final Wallet wallet = new Wallet();
    private int answer_from_wallet;

    @Given("there is ${int} in my wallet")
    public void there_is_$_in_my_wallet(int balance) {
        wallet.deposit(balance);
    }
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        this.answer_from_wallet = wallet.getBalance();
    }
    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$(int answer_balance) {
        Assert.assertEquals(answer_balance, answer_from_wallet);
    }
}
