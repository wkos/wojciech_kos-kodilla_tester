package numberchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static numberchecker.NumberChecker.checkDivisibleByThreeOrAndFive;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItDivisibleSteps {
    private int number;
    private String result;

    @Given("number is equals to {int}")
    public void number_is_equals_to(Integer int1){
        this.number = int1;
    }

    @When("I ask if number is divisible by three or and five")
    public void i_ask_if_number_is_divisible_by_three_or_and_five() {
        this.result = checkDivisibleByThreeOrAndFive(this.number);
    }

    @Then("It should be told {string}")
    public void it_should_be_told(String string) {
        assertEquals(string, this.result);
    }
}
