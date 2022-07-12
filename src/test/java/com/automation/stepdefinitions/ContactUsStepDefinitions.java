package com.automation.stepdefinitions;

import com.automation.pages.ContactUsPage;
import com.automation.pages.HomePage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsStepDefinitions {
    HomePage homePage = new HomePage();
    ContactUsPage contactUsPage = new ContactUsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @When("User clicks the Contact us button")
    public void user_clicks_the_contact_us_button() {

        homePage.contactUsLink.click();

    }
    @When("User enters name, email, subject and your message")
    public void user_enters_name_email_subject_and_your_message() {

        contactUsPage.nameBox.sendKeys("Kral");
        contactUsPage.emailBox.sendKeys("Sakir@sakirce.cc");
        contactUsPage.subjectBox.sendKeys("Kral Şakiri Hikayeleri");
        contactUsPage.yourMessageBox.sendKeys("Kral şakirin fil necati ile mucizeevi maceraları ve /n" +
                "onlarla beraber oynadıkları oyunların kuralları yazılır. ");


    }
    @When("User upload file")
    public void user_upload_file() {

        contactUsPage.uploadButton.sendKeys("/Users/values/Desktop/Screen Shot 2022-06-02 at 18.43.12.png");

    }
    @When("User clicks the submit button")
    public void user_clicks_the_submit_button() {

        contactUsPage.submitButton.click();

    }
    @When("User clicks OK on the alert button")
    public void user_clicks_ok_on_the_alert_button() {

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }
    @When("User clicks the home button")
    public void user_clicks_the_home_button() {

        BrowserUtils.isVisible(Driver.getDriver()," Home").click();

    }

}
