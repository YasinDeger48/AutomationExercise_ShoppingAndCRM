package com.automation.stepdefinitions;

import com.automation.pages.CategoryPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewCategoryStepDefinitons {

    CategoryPage categoryPage = new CategoryPage();

    @When("User verifies categories is displayed on left side")
    public void user_verifies_categories_is_displayed_on_left_side() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Category").isDisplayed());

    }
    @When("User clicks the women category")
    public void user_clicks_the_women_category() {

        categoryPage.womenCategory.click();


    }
    @When("User clicks the dress category under the women")
    public void user_clicks_the_dress_category_under_the_women() {

        categoryPage.dressSubLink.click();

    }
    @When("User verifies category name displayed and confirm text")
    public void user_verifies_category_name_displayed_and_confirm_text() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Women - Dress Products").isDisplayed());

    }
    @When("User clicksany sub category under the man category")
    public void user_clicksany_sub_category_under_the_man_category() {

        categoryPage.menCategory.click();
        categoryPage.jeansSubLink.click();

    }
    @Then("User verifies that category name is displayed")
    public void user_verifies_that_category_name_is_displayed() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),"Men - Jeans Products").isDisplayed());

    }

}
