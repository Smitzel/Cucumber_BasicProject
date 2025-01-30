package steps;

import io.cucumber.java.en.*;

public class ExampleSteps {

    @Given("I have a working Cucumber setup")
    public void i_have_a_working_cucumber_setup() {
        System.out.println("Given: Cucumber setup works!");
    }

    @When("I run the tests")
    public void i_run_the_tests() {
        System.out.println("When: I run the tests.");
    }

    @Then("I should see the results in the console")
    public void i_should_see_the_results_in_the_console() {
        System.out.println("Then: Results are visible in the console.");
    }
}
