package com.automation.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    public static void wait(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }


    public static WebElement isVisible(WebDriver driver , String string){

       return driver.findElement(By.xpath("//*[.='"+string+"']"));

    }


}
