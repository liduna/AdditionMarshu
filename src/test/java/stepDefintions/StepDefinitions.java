package stepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    private WebDriver driver;
    private DriverCreator creator;

    @Given("I have used {string} as browser")
    public void i_have_used_as_browser(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have also entered {int} into the calculator")
    public void i_have_also_entered_into_the_calculator(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I press add")
    public void i_press_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("I have used {string} as a browser")
    public void i_have_used_as_a_browser(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("I have entered {int} into calculator")
    public void i_have_entered_into_calculator(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I press addition")
    public void i_press_addition() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the result {int} should be displayed")
    public void the_result_should_be_displayed(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

/*
    @Given("I have used {string} as browser")
    public void i_have_used_as_browser(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I have also entered {int} into the calculator")
    public void i_have_also_entered_into_the_calculator(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I press add")
    public void i_press_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/

}
