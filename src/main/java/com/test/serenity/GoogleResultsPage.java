package com.test.serenity;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WhenPageOpens;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class GoogleResultsPage extends GoogleSearchPage {
    //TODO: Get rid of this class and replace with a re-write of GoogleSearchy as a results tab

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleResultsPage.class);

    //LOCATORS
    @FindBy(xpath = "//h3")
    private List<WebElement> linkTitlesList; // Check if this works with WebElementFacade

    @FindBy(css = "#rso > div > div > div:nth-child(1) > div > div > h3 > a")
    public WebElementFacade firstResultHeader;




//  public GoogleResultsPage(WebDriver driver) {
//    super(driver);
//  }

    public GoogleResultsPage(){
        super();
    }

    //ACTIONS

  @WhenPageOpens
  public void waitForPage() {
    // wait for google sub menu: Web | Images | Videos | ...
    $("#hdtb-msb").waitUntilVisible();
  }

  public List<String> getResultsList() {

    LOGGER.info("WTF size is: " + linkTitlesList.size());

    List<String> resultList = new ArrayList<>();
    for (WebElement element : linkTitlesList) {
      resultList.add(element.getText());
    }
    return resultList;
  }

    public String getFirstResult() {
        String firstResultText = firstResultHeader.getText();
        LOGGER.info("firstResultText is: " + firstResultText);
        return firstResultText;
    }
}
