package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps{
    @Given("the user is on the login page.");
    public void userOnLoginPage(){
        System.out.println("User is on the login page.");
    }

    @When("When the user enters valid credentials")
    public void userEntersValidCredentials(){
        System.out.println("User enters valid credentials.");
    }

    @Then("Then the user should be redirected to the homepage")
    public void userRedirectedToHomepage(){
        System.out.println("User is redirected to the homepage.");
    }
}