package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePageHelper extends PageBase {

  Actions action = new Actions(driver);

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;


  @FindBy(xpath = "//div[contains(@class,'flex-col hide-for-medium flex-right')]//span[contains(text(),'התחבר')]")
  WebElement loginButton;

  @FindBy(xpath = "//a[@title='Close this box']")
  WebElement closeMessageIcon;


  public HomePageHelper(WebDriver webDriver) {
    super(webDriver);
  }

  public HomePageHelper clickLoginButton()
  {
      action.moveToElement(loginButton).build().perform();
      action.moveToElement(loginButton).click().build().perform();
      return this;
  }

  public HomePageHelper waitUntilLoginButtonClickable()
  {
      waitUntilElementIsClickable(driver, loginButton,10);
      return this;
  }

  public HomePageHelper press_XButton()
  {
      closeMessageIcon.click();
      return this;
  }


}
