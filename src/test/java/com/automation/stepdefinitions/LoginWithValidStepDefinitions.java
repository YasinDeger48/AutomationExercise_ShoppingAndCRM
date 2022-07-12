package com.automation.stepdefinitions;

import com.automation.pages.LoginPage;
import com.automation.pages.SignInPage;
import com.automation.pages.SignUpPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginWithValidStepDefinitions {
    LoginPage page = new LoginPage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("User enter email {string} and password {string}")
    public void user_enter_email_and_password(String string, String string2) {

        signInPage.signIn(string,string2);

    }

    @And("User clicks Login button")
    public void userClicksLoginButton() {

        BrowserUtils.isVisible(Driver.getDriver(),"Login").click();

    }

    @And("User sees own name top right side of the page as {string}")
    public void userSeesOwnNameTopRightSideOfThePageAs(String name) {
       // wait.until(ExpectedConditions.visibilityOf(signUpPage.nameCheck));
        String actualName = signUpPage.nameCheck.getText();
        //System.out.println(actualName);
        Assert.assertTrue(actualName.equals(name));
    }
}
