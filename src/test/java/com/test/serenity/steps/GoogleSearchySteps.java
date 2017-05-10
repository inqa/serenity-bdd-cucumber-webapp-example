package com.test.serenity.steps;

import com.test.serenity.GoogleResultsCalculator.GoogleResultsCalculator;
import com.test.serenity.GoogleResultsPage;
import com.test.serenity.GoogleSearchPage;
import com.test.serenity.GoogleSearchy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Andrew on 27/04/2017.
 */
public class GoogleSearchySteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleSearchySteps.class);

//    GoogleSearchPage searchPage = (GoogleSearchPage) Serenity.getCurrentSession().get("searchPage");
    GoogleSearchPage searchPage;
    GoogleResultsPage resultsPage;
    GoogleSearchy resultsSearchy;

    @Step
    public void openGoogleSearchPage() {
        searchPage.open();
//        Serenity.getCurrentSession().put("searchPage", searchPage);
    }


    @Step
    public void searchFor(String query) {
//        resultsPage = searchPage.searchFor(query);
        searchPage.searchFor2(query);
    }

    @Step
    public void verifySearchyResults(String searchyResult) {
        String actualSearchyResult = resultsSearchy.getSearchyResult();

        Assert.assertTrue(actualSearchyResult.contains(searchyResult));
        LOGGER.info("Validated that the result is Serenity BDD");
    }


}
