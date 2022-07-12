package com.automation.stepdefinitions;

import com.automation.pages.LoginPage;
import com.automation.pages.SignUpPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterUserStepDefinitions {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    SignUpPage page = new SignUpPage();
    String fakeName="";


    @Given("User go to the automationexercise homepage")
    public void user_go_to_the_automationexercise_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));

    }

    @When("User sees homepage")
    public void user_sees_homepage() {

        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.automationexercise.com/", currentUrl);

    }

    @When("User clicks Signup Login button")
    public void user_clicks_signup_login_button() {

        page.SignUpLoginLink.click();


    }

    @Then("User verifies {string} is visible")
    public void user_verifies_is_visible(String string) {

        Assert.assertTrue(BrowserUtils.isVisible(Driver.getDriver(), string).isDisplayed());

    }

    @When("User enters name and email address")
    public void user_enters_and_address() {

        Faker faker = new Faker();

        fakeName =faker.name().fullName();
        page.signup(fakeName, faker.internet().emailAddress());

    }

    @When("User clicks the Singup button")
    public void user_clicks_the_singup_button() {

        BrowserUtils.isVisible(Driver.getDriver(),"Signup").click();


    }

    @When("User checks title")
    public void user_checks_title() {


        page.genderForMr.click();

    }

    @When("User enters password")
    public void user_enters_password() {

        page.passwordInbox.sendKeys("Fethiyeliler12");

    }

    @When("User choose birthday as {string}")
    public void user_choose_birthday_as(String string) {

        String[] s = string.split(" "); //11 April 1987

        Select select = new Select(page.daysSelect);
        select.selectByValue("11");
        Select select1 = new Select(page.monthsSelect);
        select1.selectByValue("4");
        Select select2 = new Select(page.yearsSelect);
        select2.selectByValue("1987");

    }

    @When("User clicks the {string}")
    public void user_clicks_the(String string) {

        BrowserUtils.isVisible(Driver.getDriver(),string).click();

    }

    @When("User enters first name")
    public void user_enters_first_name() {

        page.first_name.sendKeys("Osman");

    }

    @When("User enters last name")
    public void user_enters_last_name() {

        page.last_name.sendKeys("Sunka");
    }

    @When("User enters company name")
    public void user_enters_company_name() {

        page.company.sendKeys("sunka corp.");

    }

    @When("User enters Address")
    public void user_enters_address() {

        page.address1.sendKeys("Bakırköy Tımarhanesi İstanbul");

    }

    @And("User choose country name as {string}")
    public void user_choose_country_name_as(String string) {

        Select select = new Select(page.countrySelect);
        select.selectByValue(string);

    }

    @And("User enters state name as {string}")
    public void user_enters_state_name_as(String string) {

        page.state.sendKeys(string);
    }

    @And("User enters city name as {string}")
    public void user_enters_city_name_as(String string) {

        page.city.sendKeys(string);
    }

    @And("User enters zipcode as {string}")
    public void user_enters_zipcode_as(String string) {

        page.zipcode.sendKeys(string);
    }

    @And("User enters mobile number as {string}")
    public void user_enters_mobile_number_as(String string) {

        page.mobile_number.sendKeys(string);
    }

    @And("User clicks the create button")
    public void user_clicks_the_create_button() {

        BrowserUtils.isVisible(Driver.getDriver(),"Create Account").click();
    }

    @And("User clicks the continue button")
    public void user_clicks_the_continue_button() {

        BrowserUtils.isVisible(Driver.getDriver(),"Continue").click();
    }

    @Then("User sees own name top right side of the page")
    public void user_sees_own_name_top_right_side_of_the_page() {
        wait.until(ExpectedConditions.visibilityOf(page.nameCheck));
        String actualName = page.nameCheck.getText();
        Assert.assertTrue(actualName.equals(fakeName));


    }




}
