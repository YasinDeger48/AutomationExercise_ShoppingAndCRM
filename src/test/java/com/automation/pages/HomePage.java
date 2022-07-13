package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends LoginPage {


    @FindBy(xpath = "//ul/li[1]//a")
    public WebElement homeLink;

    @FindBy(xpath = "//ul/li[2]//a")
    public WebElement productsLink;

    @FindBy(xpath = "//ul/li[3]//a")
    public WebElement cartLink;

    @FindBy(xpath = "//ul/li[4]//a")
    public WebElement logoutLink;

/*    @FindBy(xpath = "//ul/li[5]//a")
    public WebElement deleteAccountLink;*/

    @FindBy(xpath = "//ul/li[5]//a")
    public WebElement testCasesLink;

    @FindBy(xpath = "//ul/li[7]//a")
    public WebElement apiTestingLink;

/*
    @FindBy(xpath = "//ul/li[8]//a")
    public WebElement videoTutorialLink;*/

    @FindBy(xpath = "//ul/li[8]//a")
    public WebElement contactUsLink;

    @FindBy(id = "susbscribe_email")
    public WebElement subscribeEmailBox;

    @FindBy(id = "subscribe")
    public WebElement subscribeArrowButton;


    @FindBy(xpath = "//div[@id='recommended-item-carousel']//a[contains(@class,'add-to-cart')]")
    public List<WebElement> recommendedElementsAddButtons;




}
