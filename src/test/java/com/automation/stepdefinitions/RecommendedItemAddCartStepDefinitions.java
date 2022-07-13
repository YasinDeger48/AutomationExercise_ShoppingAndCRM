package com.automation.stepdefinitions;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class RecommendedItemAddCartStepDefinitions {

        HomePage homePage = new HomePage();
        CartPage cartPage = new CartPage();
        Random random = new Random();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("User verifies that Recommended Items is displayed")
    public void user_verifies_that_recommended_items_is_displayed() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"recommended items").isDisplayed());

    }
    @When("User and to cart one Recommended Item")
    public void user_and_to_cart_one_recommended_item() {

       // int i = random.nextInt(homePage.recommendedElementsAddButtons.size());
        //homePage.recommendedElementsAddButtons.get(i).click();

        BrowserUtils.wait(2);

        Driver.getDriver().findElement(By.xpath("//div[@id='recommended-item-carousel']//a[@data-product-id='5']")).click();

        BrowserUtils.wait(2);
    }
    @Then("User verifies that product displayed in cart")
    public void user_verifies_that_product_displayed_in_cart() {
        wait.until(ExpectedConditions.visibilityOf(cartPage.firstElementPrice));
        Assert.assertTrue(cartPage.numberOfElements.size()>0);

    }

}
