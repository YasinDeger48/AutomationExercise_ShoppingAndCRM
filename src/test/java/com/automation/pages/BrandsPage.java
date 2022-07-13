package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrandsPage extends HomePage {


    @FindBy(xpath = "//div[@class='brands_products']//li/a")
    public List<WebElement> allBrandLinks;


    @FindBy(xpath = "//div[@class='brands_products']/h2")
    public WebElement brandsTitle;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement afterClickingBrandTitle;


}
