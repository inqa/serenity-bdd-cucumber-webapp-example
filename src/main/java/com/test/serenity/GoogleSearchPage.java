package com.test.serenity;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://google.co.uk")
public class GoogleSearchPage extends PageObject {
    //TODO: Turn this class into a search tab that extends a base Google Page that extends PageObject



  @FindBy(id = "lst-ib")
  private WebElementFacade searchInputField;

  @FindBy(css = "#_fZl")
  private WebElementFacade searchButton;


//  public GoogleSearchPage(WebDriver driver) {
//    super(driver);
//  }

    public GoogleSearchPage() {
        super();
    }

  @WhenPageOpens
  public void waitUntilGoogleLogoAppears() {
    $("#hplogo").waitUntilVisible();
  }

  public GoogleResultsPage searchFor(String searchRequest) {
    searchInputField.sendKeys(searchRequest);
    searchButton.click();

//    element(searchInputField).clear();
//    element(searchInputField).typeAndEnter(searchRequest);
    //return new GoogleResultsPage(getDriver());
    return  new GoogleResultsPage();
  }

  public void searchFor2(String searchRequest){
      searchInputField.sendKeys(searchRequest);
      searchButton.click();
  }
}
