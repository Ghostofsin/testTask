package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;


public class PersonalInfoPage {

    public final By personalInfoLabel = byXpath("//div[text()='Personal Information']");
    public final By emailField = byXpath("//input[@id='application_email']");
    public final By emailFieldError = byXpath("//span[@id='application_email-error']");
    public final By continueButton = byXpath("//button[@name='button']");

}


