package com.automation.pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[4]/a")
    public WebElement SignUpLoginLink;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignUpText;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@data-qa='signup-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "(//h2/b)[1]")
    public WebElement enterAccountInformationText;

    @FindBy(id = "id_gender1")
    public WebElement genderForMr;



    public void signup(String name, String email){

        nameBox.sendKeys(name);
        emailBox.sendKeys(email);
    }
}
