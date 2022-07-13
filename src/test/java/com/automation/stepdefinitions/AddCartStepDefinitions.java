package com.automation.stepdefinitions;

import com.automation.pages.CartPage;
import com.automation.pages.ProductsPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;

public class AddCartStepDefinitions {

    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("User hover over the first product and add to cart")
    public void user_hover_over_the_first_product_and_add_to_cart() {


        actions.moveToElement(productsPage.firstElementForHover).build().perform();
        productsPage.firstElementAddToCartButton.click();

    }
    @When("User clicks the {string} button")
    public void user_clicks_the_button(String string) {

        BrowserUtils.isVisible(Driver.getDriver(),string).click();

    }
    @When("User hover over the second product and add to cart")
    public void user_hover_over_the_second_product_and_add_to_cart() {

        actions.moveToElement(productsPage.secondElementForHover).build().perform();
        productsPage.secondElementAddToCartButton.click();


    }
    @When("User clicks the {string} link")
    public void user_clicks_the_link(String string) {

        BrowserUtils.isVisible(Driver.getDriver(),string).click();


    }
    @When("User verifies that both products are added to cart")
    public void user_verifies_that_both_products_are_added_to_cart() {

        Assert.assertTrue(cartPage.numberOfElements.size() == 2);

    }
    @Then("User verifies their prices,quantity and total prices")
    public void user_verifies_their_prices_quantity_and_total_prices() {

        Assert.assertTrue(cartPage.firstElementPrice.getText().equals("Rs. 500"));
        Assert.assertTrue(cartPage.secondElementPrice.getText().equals("Rs. 400"));
        Assert.assertTrue(cartPage.firstElementQuantity.getText().equals("1"));
        Assert.assertTrue(cartPage.secondElementQuantity.getText().equals("1"));
        Assert.assertTrue(cartPage.firstElementTotalPrice.getText().equals("Rs. 500"));
        Assert.assertTrue(cartPage.secondElementTotalPrice.getText().equals("Rs. 400"));
    }

}
