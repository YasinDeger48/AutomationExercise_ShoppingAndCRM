package com.automation.stepdefinitions;

import com.automation.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {



    @After
    public void tear(Scenario scenario){

        if (scenario.isFailed()){
            byte[] snaps = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(snaps,"image/png",scenario.getName());
        }

        Driver.closeDriver();
    }
}
