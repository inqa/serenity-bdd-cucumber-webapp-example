package com.test.serenity.runTests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty:output", "html:target/cucumber"},
        features = { "src/test/resources/features" },
        tags = {"@run"},
        glue = { "com.test.serenity.stepDefinitions" })
public class GoogleSearchTests {
}
