package com.test.serenity.stepDefinitions;

import com.test.serenity.GoogleSearchPage;
import com.test.serenity.steps.GoogleResultsSteps;
import com.test.serenity.steps.GoogleSearchSteps;
import com.test.serenity.steps.GoogleSearchySteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class GoogleSearchStepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleSearchPage.class);

    @Steps
//    GoogleSearchSteps googleSearchSteps;
            GoogleSearchySteps googleSearchySteps;
//    GoogleResultsSteps googleResultsSteps;

    @Given("I want to search in Google")
    public void iWantToSearchInGoogle() throws Throwable {
        googleSearchySteps.openGoogleSearchPage();
    }

//  @When("I search for '(.*)'")
//  public void iSearchFor(String searchRequest) throws Throwable {
//    googleSearchSteps.searchFor(searchRequest);
//  }


    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String calculationRequest) {
        LOGGER.info("In iCalculate");
        googleSearchySteps.searchFor(calculationRequest);
    }






//    @Then("I should see link to '(.*)'")
//    public void iShouldSeeLinkTo(String searchResult) throws Throwable {
//      LOGGER.info("In Step Def iShouldSeeLinkTo");
//      googleSearchySteps.verifyResult(searchResult);
//    }
//
//
//    @Then("^the results should contain \"([^\"]*)\"$")
//    public void theResultsShouldContain(String expectedSearchResult) {
//        googleSearchySteps.checkResultContent(expectedSearchResult);
//    }


    @Then("^the first result should contain \"([^\"]*)\"$")
    public void theFirstResultShouldContain(String expectedFirstResult) {
        googleSearchySteps.verifySearchyResults(expectedFirstResult);
    }



}
