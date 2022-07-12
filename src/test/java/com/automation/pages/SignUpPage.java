package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends LoginPage{

    @FindBy(id = "password")
    public WebElement passwordInbox;

    @FindBy(id = "days")
    public WebElement daysSelect;

    @FindBy(id = "months")
    public WebElement monthsSelect;

    @FindBy(id = "years")
    public WebElement yearsSelect;

    @FindBy(id = "first_name")
    public WebElement first_name;

    @FindBy(id = "last_name")
    public WebElement last_name;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "country")
    public WebElement countrySelect;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipcode;

    @FindBy(id = "mobile_number")
    public WebElement mobile_number;

    @FindBy(xpath = "//ul/li[10]//b")
    public WebElement nameCheck;


}
