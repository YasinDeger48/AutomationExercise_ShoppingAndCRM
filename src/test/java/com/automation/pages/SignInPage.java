package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends LoginPage {


    @FindBy(name = "email")
    public WebElement emailbox;

    @FindBy(name = "password")
    public WebElement passwordBox;


    public void signIn(String email, String password){

        emailbox.sendKeys(email);
        passwordBox.sendKeys(password);
    }


}
