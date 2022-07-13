package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends HomePage{

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategory;

    @FindBy(xpath = "//div[@id='Women']//li[1]//a")
    public WebElement dressSubLink;

    @FindBy(xpath = "//div[@id='Women']//li[2]//a")
    public WebElement topsSubLink;

    @FindBy(xpath = "//div[@id='Women']//li[3]//a")
    public WebElement sareeSubLink;

    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement menCategory;

    @FindBy(xpath = "//div[@id='Men']//li[1]//a")
    public WebElement tshirtsSubLink;

    @FindBy(xpath = "//div[@id='Men']//li[2]//a")
    public WebElement jeansSubLink;

    @FindBy(xpath = "//a[@href='#Kids']")
    public WebElement kidsCategory;







}
