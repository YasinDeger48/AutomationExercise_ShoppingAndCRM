package com.automation.stepdefinitions;

import com.automation.pages.CartPage;
import com.automation.pages.ProductsPage;
import com.automation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchProductAndVerifyStepDefinitions {

    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @Then("User hover over the products one by one and add to cart and clicks the continue button")
    public void user_hover_over_the_products_one_by_one_and_add_to_cart_and_clicks_the_continue_button() {


        for (int i = 1; i <= productsPage.listedElementsAllProducts.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(productsPage.hoverElement(i)));
            actions.moveToElement(productsPage.hoverElement(i)).build().perform();
            productsPage.addElement(i).click();
            productsPage.continueShoppingButton.click();

        }


    }

    @And("User verifies that correct quantity items in the cart")
    public void userVerifiesThatCorrectQuantityItemsInTheCart() {

        int size1 = cartPage.numberOfElements.size();
        int size2 = 7;

        System.out.println(size1);
        System.out.println(size2);

        Assert.assertTrue(size1 == size2);


    }
}
