package com.automation.stepdefinitions;

import com.automation.pages.ProductsPage;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchProductStepDefinitions {

    ProductsPage productsPage = new ProductsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @When("User enters product name into search box and click search button")
    public void user_enters_product_name_into_search_box_and_click_search_button() {

        productsPage.searchProductInputBox.sendKeys("blue");
        productsPage.searchProductSearchButton.click();


    }
    @When("User verifies searched product is visible")
    public void user_verifies_searched_product_is_visible() {

        List<WebElement> listedElementsAfterSearching = productsPage.listedElementsAllProducts;
        Assert.assertTrue(listedElementsAfterSearching.size()>0);


    }
    @Then("User verifies all prodcut related to search keyword")
    public void user_verifies_all_prodcut_related_to_search_keyword() {

        for (WebElement each : productsPage.descriptionAllElementsAfterSearching) {
            String actual = each.getText();
            System.out.println(actual);
            Assert.assertTrue(actual.contains("blue") || actual.contains("Blue") ||actual.contains("BLUE"));
        }


    }
}
