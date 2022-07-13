package com.automation.stepdefinitions;

import com.automation.pages.CartPage;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddressDetailsCheckStepDefinitons {

    CartPage cartPage = new CartPage();

    @When("User verifies that delivery address and billing address is fill out")
    public void user_verifies_that_delivery_address_and_billing_address_is_fill_out() {

        Assert.assertFalse(cartPage.addressDelivery.getText().isEmpty());
        Assert.assertFalse(cartPage.addressBilling.getText().isEmpty());

    }
}
