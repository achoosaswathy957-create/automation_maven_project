package com.orangehrm.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepDefinition {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("User enters username and password");
    }

    @And("user clicks the login button")
    public void user_clicks_the_login_button() {
        System.out.println("User clicks login button");
    }

    @Then("user should see the homepage")
    public void user_should_see_the_homepage() {
        System.out.println("User is navigated to homepage");
    }
}
