package com.automation.stepdefinitions;

import com.automation.pages.SignUpPage;
import io.cucumber.java.en.When;

public class ExistingMailStepDefinitions {

    SignUpPage signUpPage = new SignUpPage();

    @When("User enters same name or email address")
    public void user_enters_same_name_or_email_address() {

        signUpPage.signup("Kral ŞAKİR","test.equals.quality@gmail.com");

    }


}
