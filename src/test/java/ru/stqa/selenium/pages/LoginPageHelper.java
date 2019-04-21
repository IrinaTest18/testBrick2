package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHelper extends PageBase
{
    @FindBy(xpath = "//div[contains(@class,'the_champ_social_login_title')]")
    WebElement registrationControl;


    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginPageOpened() {
        System.out.println(registrationControl.getText());
        return registrationControl.getText().equals("רישום וחיבור מהיר עם:");
    }

    public LoginPageHelper waitUntilRegistrationFormLoaded()
    {
        waitUntilElementIsloaded(driver, registrationControl, 10);
        return this;
    }
}
