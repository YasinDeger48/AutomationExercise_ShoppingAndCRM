package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends LoginPage {

    @FindBy(name = "name")
    public WebElement nameBox;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "subject")
    public WebElement subjectBox;

    @FindBy(id = "message")
    public WebElement yourMessageBox;

    @FindBy(name = "upload_file")
    public WebElement uploadButton;

    @FindBy(name = "submit")
    public WebElement submitButton;

}
