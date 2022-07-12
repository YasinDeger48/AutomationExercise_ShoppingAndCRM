package com.automation.stepdefinitions;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginWithInvalidStepDefinitions {

    @When("User sees {string}")
    public void user_sees(String string) {

        WebElement visibleText = BrowserUtils.isVisible(Driver.getDriver(), "Your email or password is incorrect!");
        Assert.assertTrue(visibleText.getText().equals("Your email or password is incorrect!"));
    }
}
