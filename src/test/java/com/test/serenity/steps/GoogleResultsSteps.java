package com.test.serenity.steps;

import com.test.serenity.GoogleResultsPage;
import com.test.serenity.GoogleSearchPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Andrew on 29/04/2017.
 */
public class GoogleResultsSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleResultsSteps.class);

//    GoogleSearchPage searchPage = (GoogleSearchPage) Serenity.getCurrentSession().get("searchPage");
    GoogleResultsPage resultsPage;
    GoogleSearchPage searchPage;

    @Step
    public void searchFor(String searchRequest) {
        resultsPage = searchPage.searchFor(searchRequest);
    }

    @Step
    public void verifyResult(String searchResult) {
        LOGGER.info("In GoogleSearchSteps verifyResult - why is this all null? ");
        List<String> results = resultsPage.getResultsList();
        Assert.assertTrue(results.contains(searchResult));
    }

    @Step
    public void checkResultContent(String expectedSearchResult) {
        List<String> actualSearchResults = resultsPage.getResultsList();
        Assert.assertTrue(actualSearchResults.contains(expectedSearchResult));
    }

    @Step
    public void checkFirstResult(String expectedFirstResult) {
        String actualFirstResult = resultsPage.getFirstResult();
        Assert.assertTrue(actualFirstResult.contains(expectedFirstResult));
    }

}
