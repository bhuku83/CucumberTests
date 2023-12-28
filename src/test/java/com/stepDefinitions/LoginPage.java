package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

    @Given("i have something")
    public void i_have_something() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I have somethings");
    }
    @When("i do some action")
    public void i_do_some_action() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I do some actions");
    }
    @Then("the results are displayed")
    public void the_results_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The Results are displayed");
    }

    @When("i do some action with test")
    public void i_do_some_action_with_test() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I do have some Action with Tests");
    }

}
