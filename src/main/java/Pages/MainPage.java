package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byXpath;

public class MainPage {

    public final By firstNameField = byXpath("//input[@id='application_first_name']");
    public final By middleInitialField = byXpath("//input[@id='application_middle_initial']");
    public final By lastNameField = byXpath("//input[@id='application_last_name']");
    public final By mobilePhoneField = byXpath("//input[@id='application_mobile_phone']");
    public final By getFirstLoanButton = byXpath("//input[@name='commit']");
    public final By mobilePhoneErrorLabel= byXpath("//span[@id='application_mobile_phone-error']");


}


