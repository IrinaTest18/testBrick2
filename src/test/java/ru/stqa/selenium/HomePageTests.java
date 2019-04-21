package ru.stqa.selenium;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.stqa.selenium.pages.HomePageHelper;

public class HomePageTests extends TestBase {

  private HomePageHelper homepage;

  @BeforeMethod
  public void initPageObjects()
  {
    homepage = PageFactory.initElements(driver, HomePageHelper.class);
  }

  @Test
  public void testHomePageHasAHeader()
  {
    driver.get(baseUrl);
    Assert.assertFalse("החברים שלנו מרוויחים יותר!".equals(homepage.header.getText()));
  }
}
