package com.automation.stepdefinitions;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void interval(){
        BrowserUtils.wait(2);
    }

    @After
    public void tear(Scenario scenario){

        if (scenario.isFailed()){
            byte[] snaps = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(snaps,"image/png",scenario.getName());
        }

        Driver.closeDriver();
    }
}
