package com.automation.stepdefinitions;

import com.automation.pages.CartPage;
import com.automation.pages.ProductsPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class ProductQuantityCheckStepDefinitions {

    Random random = new Random();
    ProductsPage productsPage = new ProductsPage();
    int randomNumber = random.nextInt(productsPage.listedElementsAllProducts.size());
    CartPage cartPage = new CartPage();

    @When("User clicks the random view product link")
    public void user_clicks_the_random_view_product_link() {

        productsPage.listedElementsAllProducts.get(randomNumber).click();


    }
    @When("User increases quantity to {int}")
    public void user_increases_quantity_to(Integer int1) {

        productsPage.quantityInTheCart.clear();
        productsPage.quantityInTheCart.sendKeys(int1+"");

    }
    @When("User clicks {string} button")
    public void user_clicks_button(String string) {

        cartPage.addToCartButton.click();


    }
    @Then("User verifies that correct quantity is shown in the cart")
    public void user_verifies_that_correct_quantity_is_shown_in_the_cart() {

        BrowserUtils.isVisible(Driver.getDriver(),"View Cart").click();
        Assert.assertTrue(cartPage.firstElementQuantity.getText().equals("4"));



    }

}
