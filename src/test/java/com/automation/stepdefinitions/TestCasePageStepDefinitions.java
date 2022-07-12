package com.automation.stepdefinitions;

import com.automation.pages.HomePage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestCasePageStepDefinitions {

    HomePage homePage = new HomePage();


    @When("User clicks Test Cases link")
    public void user_clicks_test_cases_link() {

        homePage.testCasesLink.click();



    }
    @Then("User navigated test case page successfully")
    public void user_navigated_test_case_page_successfully() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Test Cases").isDisplayed());

    }
}
