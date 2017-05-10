package com.test.serenity.stepDefinitions;

import com.test.serenity.steps.GoogleCalculatorSteps;
import com.test.serenity.steps.GoogleSearchSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoogleCalculatorStepDefinitions {

  private static final Logger LOGGER = LoggerFactory.getLogger(GoogleCalculatorStepDefinitions.class);

  @Steps
  GoogleCalculatorSteps googleCalculatorSteps;



  @When("^I calculate \"([^\"]*)\"$")
  public void iCalculate(String calculationRequest) {
      LOGGER.info("In iCalculate");
      googleCalculatorSteps.calculate(calculationRequest);
  }

  @Then("^The result should be \"([^\"]*)\"$")
  public void theResultShouldBe(String calculationResult){
    googleCalculatorSteps.verifyCalculationResult(calculationResult);
  }

}
