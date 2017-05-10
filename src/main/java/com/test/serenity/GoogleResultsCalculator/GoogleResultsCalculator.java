package com.test.serenity.GoogleResultsCalculator;

import com.test.serenity.GoogleResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Andrew on 29/04/2017.
 */
public class GoogleResultsCalculator extends GoogleResultsPage {
    //TODO: change the inheritance of this to the new GoogleResultsTab (which is a re-write of GoogleSearchy.

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleResultsCalculator.class);

    //LOCATORS
    @FindBy(css = "#cwos")
    private WebElementFacade calcResult;

    public GoogleResultsCalculator() {
        super();
    }

//    public GoogleResultsCalculator(WebDriver driver) {
//        super(driver);
//    }


    //ACTIONS
    public String getCalculationResult() {
        String calcResultString = calcResult.getText();
        LOGGER.info("Check calcResultString is: " + calcResultString);
        return calcResultString;
    }
}
