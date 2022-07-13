package com.automation.stepdefinitions;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ScrollUpUsingArrowStepDefinitions {




    @When("User clicks the arrow for move upward")
    public void user_clicks_the_arrow_for_move_upward() {

        Driver.getDriver().findElement(By.id("scrollUp")).click();

    }

    @Then("User sees Full-Fledged practice website for Automation Engineers")
    public void user_sees_full_fledged_practice_website_for_automation_engineers() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Full-Fledged practice website for Automation Engineers").isDisplayed());
    }


}
