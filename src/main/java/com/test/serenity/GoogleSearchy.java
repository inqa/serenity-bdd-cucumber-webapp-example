package com.test.serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Andrew on 29/04/2017.
 */
public class GoogleSearchy extends GoogleResultsPage {
//TODO: turn this class into a Results tab object that extends a base Google Page that in turn extends PageObject


    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleSearchy.class);

    //LOCATORS
    @FindBy(css = "#rso > div > div > div:nth-child(1) > div > div > h3 > a")
    private WebElementFacade searchyResult;

    public GoogleSearchy() {
        super();
    }

//    public GoogleResultsCalculator(WebDriver driver) {
//        super(driver);
//    }


    //ACTIONS
    public String getSearchyResult() {
        String searchyResultString = searchyResult.getText();
        LOGGER.info("Check calcResultString is: " + searchyResultString);
        return searchyResultString;
    }
}
