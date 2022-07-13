package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends ProductsPage{

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> numberOfElements;

    @FindBy(xpath = "//tbody//tr[1]//td[3]/p")
    public WebElement firstElementPrice;

    @FindBy(xpath = "//tbody//tr[2]//td[3]/p")
    public WebElement secondElementPrice;

    @FindBy(xpath = "//tbody//tr[1]//td[4]//button")
    public WebElement firstElementQuantity;

    @FindBy(xpath = "//tbody//tr[2]//td[4]//button")
    public WebElement secondElementQuantity;

    @FindBy(xpath = "//tbody//tr[1]//td[5]//p")
    public WebElement firstElementTotalPrice;

    @FindBy(xpath = "//tbody//tr[2]//td[5]//p")
    public WebElement secondElementTotalPrice;
}
