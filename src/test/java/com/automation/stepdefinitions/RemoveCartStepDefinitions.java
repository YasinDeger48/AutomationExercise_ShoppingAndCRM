package com.automation.stepdefinitions;

import com.automation.pages.CartPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RemoveCartStepDefinitions {

    CartPage cartPage = new CartPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("User clicks the delete sign button")
    public void user_clicks_the_delete_sign_button() {

        cartPage.deleteButtonInCart.click();

    }
    @When("User verifies that cart list is empty")
    public void user_verifies_that_cart_list_is_empty() {
        wait.until(ExpectedConditions.visibilityOf(BrowserUtils.isVisible(Driver.getDriver(),"Cart is empty!")));
        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Cart is empty!").isDisplayed());

    }
}
