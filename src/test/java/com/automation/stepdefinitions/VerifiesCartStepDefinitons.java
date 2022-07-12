package com.automation.stepdefinitions;

import com.automation.pages.HomePage;
import io.cucumber.java.en.When;

public class VerifiesCartStepDefinitons {

    HomePage homePage = new HomePage();

    @When("User clicks the cart link")
    public void user_clicks_the_cart_link() {
        homePage.cartLink.click();
    }
}
