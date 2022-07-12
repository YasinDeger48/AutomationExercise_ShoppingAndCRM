package com.automation.stepdefinitions;

import com.automation.pages.HomePage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;

public class SubscriptionStepDefinitions {

    HomePage homePage = new HomePage();
    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());


    @When("User scroll down to footer")
    public void user_scroll_down_to_footer() {

        Actions actions = new Actions(Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView();",homePage.subscribeArrowButton);
        BrowserUtils.wait(1);

    }
    @When("User verifies subscription")
    public void user_verifies_subscription() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Subscription").isDisplayed());

    }
    @When("User enters email address and click the arrow button")
    public void user_enters_email_address_and_click_the_arrow_button() {

        homePage.subscribeEmailBox.sendKeys("ost@bsa.com");
        homePage.subscribeArrowButton.click();
    }
    @Then("User verifies that {string} is visible")
    public void user_verifies_that_is_visible(String string) {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"You have been successfully subscribed!").isDisplayed() &&
                string.equals("You have been successfully subscribed!"));

    }

}
