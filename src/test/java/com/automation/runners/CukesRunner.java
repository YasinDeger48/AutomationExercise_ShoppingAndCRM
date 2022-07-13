package com.automation.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
          "html:target/reports/cucumber.html",
          "json:target/reports/cucumber.json",
          "rerun:target/reports/cucumber.txt"
        },
        features = "src/test/resources/features",
        glue = "com/automation/stepdefinitions",
        dryRun = false,
        tags = ""
)




public class CukesRunner {
}
