package com.automation.stepdefinitions;

import com.automation.pages.HomePage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutUserStepDefinitions {

    HomePage homePage = new HomePage();

    @When("User clicks the logout button")
    public void user_clicks_the_logout_button() {

        homePage.logoutLink.click();

    }
    @Then("User sees the login page")
    public void user_sees_the_login_page() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.automationexercise.com/login";
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertTrue(actualUrl.contains(expectedURL));

    }
}
