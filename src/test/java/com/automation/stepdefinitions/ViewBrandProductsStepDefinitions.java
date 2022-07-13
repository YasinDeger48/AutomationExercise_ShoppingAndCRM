package com.automation.stepdefinitions;


import com.automation.pages.BrandsPage;
import com.automation.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class ViewBrandProductsStepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    BrandsPage brandsPage = new BrandsPage();
    Random random = new Random();
    String brandTitle = "";


    @When("User verifies that brands are visible on the left side")
    public void user_verifies_that_brands_are_visible_on_the_left_side() {

        Assert.assertTrue(brandsPage.brandsTitle.isDisplayed());

    }
    @When("User clicks any brand name")
    public void user_clicks_any_brand_name() {
        int randomTitle = random.nextInt(brandsPage.allBrandLinks.size());
        String[] brandName = brandsPage.allBrandLinks.get(randomTitle).getText().split("\n");
        brandTitle = brandName[1];
        brandsPage.allBrandLinks.get(randomTitle).click();


    }
    @When("User verifies that navigating to brands page")
    public void user_verifies_that_navigating_to_brands_page() {

        wait.until(ExpectedConditions.visibilityOf(brandsPage.brandsTitle));
        Assert.assertTrue(brandsPage.afterClickingBrandTitle.getText().toLowerCase().contains(brandTitle.toLowerCase()));


    }



}
