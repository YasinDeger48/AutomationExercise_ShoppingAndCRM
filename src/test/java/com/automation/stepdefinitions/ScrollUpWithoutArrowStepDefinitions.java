package com.automation.stepdefinitions;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollUpWithoutArrowStepDefinitions {


    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());

    @And("User scroll up to header")
    public void userScrollUpToHeader() {

        js.executeScript("arguments[0].scrollIntoView();",
                BrowserUtils.isVisible(Driver.getDriver(),
                        "Full-Fledged practice website for Automation Engineers"));
    }
}
