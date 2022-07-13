package com.automation.stepdefinitions;

import com.automation.pages.ReviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddReviewStepDefinitions {

    ReviewPage reviewPage = new ReviewPage();

    @When("User enters name,email and review")
    public void user_enters_name_email_and_review() {

        reviewPage.nameReviewBox.sendKeys("Yasin");
        reviewPage.emailReviewBox.sendKeys("kral@sakir.com");
        reviewPage.reviewBox.sendKeys("Items almost good for users. Thanks BRO");

    }
    @When("User clicks the review submit button")
    public void user_clicks_the_review_submit_button() {

        reviewPage.submitReviewButton.click();

    }

    @When("User sees Write Your Review")
    public void user_sees_write_your_review() {

        Assert.assertTrue(reviewPage.writeYourReviewHeader.isDisplayed());

    }
    @Then("User sees Thank you for your review.")
    public void user_sees_thank_you_for_your_review() {

        Assert.assertTrue(reviewPage.thankYouMessageReview.isDisplayed());

    }

}
