package com.automation.stepdefinitions;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.When;

public class DownloadInvoiceStepDefinitions {

    @When("User clicks the Download Invoice button")
    public void user_clicks_the_download_invoice_button() {

        BrowserUtils.isVisible(Driver.getDriver(),"Download Invoice").click();
        BrowserUtils.wait(2);

    }
}
