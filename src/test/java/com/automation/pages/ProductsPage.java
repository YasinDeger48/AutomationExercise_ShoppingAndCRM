package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends HomePage{

    @FindBy(xpath = "//div[@class='col-sm-4']")
    public List<WebElement> allElements;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement firstProduct;

    @FindBy(xpath = "(//div[@class='single-products'])[1]")
    public WebElement firstElementForHover;

    @FindBy(xpath = "(//div[@class='single-products'])[2]")
    public WebElement secondElementForHover;

    @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement firstElementAddToCartButton;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement secondElementAddToCartButton;

    @FindBy(xpath = "//div[@class='product-information']//h2")
    public WebElement productName;

    @FindBy(xpath = "(//div[@class='product-information']//p)[1]")
    public WebElement categoryName;

    @FindBy(xpath = "(//div[@class='product-information']//p)[2]")
    public WebElement availability;

    @FindBy(xpath = "(//div[@class='product-information']//p)[3]")
    public WebElement condition;

    @FindBy(xpath = "(//div[@class='product-information']//p)[4]")
    public WebElement brand;

    @FindBy(id = "search_product")
    public WebElement searchProductInputBox;

    @FindBy(id = "submit_search")
    public WebElement searchProductSearchButton;

    @FindBy(xpath = "//a[contains(@style,'color: brown;')]")
    public List<WebElement> listedElementsAfterSearching;

    @FindBy(xpath = "(//div[@class='productinfo text-center']//p)")
    public List<WebElement> descriptionAllElementsAfterSearching;
}
