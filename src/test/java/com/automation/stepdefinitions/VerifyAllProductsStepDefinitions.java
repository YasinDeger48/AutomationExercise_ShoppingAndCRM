package com.automation.stepdefinitions;

import com.automation.pages.HomePage;
import com.automation.pages.ProductsPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyAllProductsStepDefinitions {

    ProductsPage page = new ProductsPage();

    @When("User clicks the product link")
    public void user_clicks_the_product_link() {

        page.productsLink.click();

    }
    @When("User navigate to all products page")
    public void user_navigate_to_all_products_page() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"All Products").isDisplayed());

    }
    @When("User sees all products")
    public void user_sees_all_products() {

        Assert.assertTrue(page.allElements.size()>1);

    }
    @When("User clicks the first product")
    public void user_clicks_the_first_product() {

        page.firstProduct.click();

    }
    @When("User sees product details page")
    public void user_sees_product_details_page() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Write Your Review").isDisplayed());


    }
    @Then("User verifies that all details is visible")
    public void user_verifies_that_all_details_is_visible() {

        Assert.assertTrue(page.productName.isDisplayed());
        Assert.assertTrue(page.categoryName.isDisplayed());
        Assert.assertTrue(page.availability.isDisplayed());
        Assert.assertTrue(page.condition.isDisplayed());
        Assert.assertTrue(page.brand.isDisplayed());

    }
}
