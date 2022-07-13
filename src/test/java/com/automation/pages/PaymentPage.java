package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends CartPage{

    @FindBy(name = "name_on_card")
    public WebElement nameOnCard;

    @FindBy(name = "card_number")
    public WebElement numberOnCard;

    @FindBy(name = "cvc")
    public WebElement cvcOnCard;

    @FindBy(name = "expiry_month")
    public WebElement monthOnCard;

    @FindBy(name = "expiry_year")
    public WebElement yearOnCard;

    @FindBy(id = "success_message")
    public WebElement successMessage;

}
