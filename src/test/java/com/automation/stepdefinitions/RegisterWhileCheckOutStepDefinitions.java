package com.automation.stepdefinitions;

import com.automation.pages.CartPage;
import com.automation.pages.PaymentPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterWhileCheckOutStepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    PaymentPage paymentPage = new PaymentPage();
    Faker faker = new Faker();

    @When("User clicks register-login link")
    public void user_clicks_register_login_link() {

        paymentPage.registerLoginLink.click();
    }


    @When("User verifies address details and ensure that address is displayed")
    public void user_verifies_address_details_and_ensure_that_address_is_displayed() {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(), "Address Details").isDisplayed());

    }

    @When("User enters description in the comment box")
    public void user_enters_description_in_the_comment_box() {

        paymentPage.commentBoxInCart.sendKeys("Kral Şakir Kral gibi adam");

    }

    @When("User enters credit card name")
    public void user_enters_credit_card_name() {

        paymentPage.nameOnCard.sendKeys(faker.name().fullName());

    }

    @When("User enters credit card number")
    public void user_enters_credit_card_number() {

        paymentPage.numberOnCard.sendKeys(faker.business().creditCardNumber());

    }

    @When("User enters credit card cvc")
    public void user_enters_credit_card_cvc() {

        paymentPage.cvcOnCard.sendKeys(faker.numerify("###"));

    }

    @When("User enters credit card expiration date")
    public void user_enters_credit_card_expiration_date() {

        paymentPage.monthOnCard.sendKeys(faker.numerify("##"));
        paymentPage.yearOnCard.sendKeys(faker.numerify("####"));


    }

    @Then("User verifies that {string} message displayed")
    public void user_verifies_that_message_displayed(String string) {


        wait.until(ExpectedConditions.visibilityOf(BrowserUtils.isVisible(Driver.getDriver(),string)));
        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(),string).isDisplayed());

    }

    @When("User clicks Place Order button")
    public void user_clicks_place_order_button() {

        Driver.getDriver().findElement(By.xpath("//a[.='Place Order']")).click();

    }

    @When("User clicks Pay and Confirm Order button")
    public void user_clicks_pay_and_confirm_order_button() {


        Driver.getDriver().findElement(By.xpath("//button[@id='submit']")).click();
    }
}
