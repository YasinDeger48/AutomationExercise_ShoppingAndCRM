package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ReviewPage extends HomePage{

    @FindBy(id = "name")
    public WebElement nameReviewBox;

    @FindBy(id = "email")
    public WebElement emailReviewBox;

    @FindBy(name = "review")
    public WebElement reviewBox;

    @FindBy(id = "button-review")
    public WebElement submitReviewButton;

    @FindBy(xpath = "//a[.='Write Your Review']")
    public WebElement writeYourReviewHeader;

    @FindBy(xpath = "//span[.='Thank you for your review.']")
    public WebElement thankYouMessageReview;



}
