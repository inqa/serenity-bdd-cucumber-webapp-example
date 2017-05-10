package com.test.serenity.steps;

import com.test.serenity.GoogleResultsCalculator.GoogleResultsCalculator;
import com.test.serenity.GoogleResultsPage;
import com.test.serenity.GoogleSearchPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Andrew on 27/04/2017.
 */
public class GoogleCalculatorSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleCalculatorSteps.class);

//    GoogleSearchPage searchPage = (GoogleSearchPage) Serenity.getCurrentSession().get("searchPage");
    GoogleSearchPage searchPage;
    GoogleResultsPage resultsPage;
    GoogleResultsCalculator resultsCalculator;

    @Step
    public void calculate(String calculation) {
        resultsPage = searchPage.searchFor(calculation);
    }

    @Step
    public void verifyCalculationResult(String calculationResult) {
        String actualCalcResult = resultsCalculator.getCalculationResult();

        Assert.assertTrue(actualCalcResult.contains(calculationResult));
        LOGGER.info("Validated that the result is 49");
    }
}
