package com.test.serenity.steps;

import com.test.serenity.GoogleResultsPage;
import com.test.serenity.GoogleSearchPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class GoogleSearchSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleSearchSteps.class);

      GoogleSearchPage searchPage;
      GoogleResultsPage resultsPage;

      @Step
      public void openGoogleSearchPage() {
        searchPage.open();
//        Serenity.getCurrentSession().put("searchPage", searchPage);
      }

//      @Step
//      public void searchFor(String searchRequest) {
//        searchPage.searchFor(searchRequest);
//      }







}
