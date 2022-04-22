import static Urls.Urls.SITE;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import Pages.MainPage;
import Pages.PersonalInfoPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.sleep;

@DisplayName("проверка поля почта на странице персональная информация")
public class secondFormValidationTest extends MainTest {


    private MainPage mainPage = new MainPage();
    private PersonalInfoPage personalInfoPage = new PersonalInfoPage();
    // ------------------------------ test variables ---------------------------------------
    private String firstName = "Ivan";
    private String lastName = "Ivanov";
    private String middleName = "Ivanovich";
    private String phone = "0987-098-0987";
    private String wrongEmail1 = "mail.ru";
    private String wrongEmail2 = "ma@ilru";
    // ------------------------------------ --- --------------------------------------------


    @Test
    @Order(1)
    @DisplayName("проверка знака '@' в поле почта")
    public void test1() {
        open(SITE);
        $(mainPage.firstNameField).shouldBe(visible).setValue(firstName);
        $(mainPage.lastNameField).shouldBe(visible).setValue(lastName);
        $(mainPage.middleInitialField).shouldBe(visible).setValue(middleName);
        $(mainPage.mobilePhoneField).shouldBe(visible).setValue(phone);
        $(mainPage.getFirstLoanButton).shouldBe(visible).click();
        $(personalInfoPage.personalInfoLabel).shouldBe(visible);
        $(personalInfoPage.emailField).shouldBe(visible).setValue(wrongEmail1);
        $(personalInfoPage.continueButton).shouldBe(visible).click();
        $(personalInfoPage.emailFieldError).shouldBe(visible).shouldHave(text("Please enter a valid email address."));
        sleep(3000);
    }


    @Test
    @Order(2)
    @DisplayName("проверка знака '.' в поле почта")
    public void test2() {
        open(SITE);
        $(mainPage.firstNameField).shouldBe(visible).setValue(firstName);
        $(mainPage.lastNameField).shouldBe(visible).setValue(lastName);
        $(mainPage.middleInitialField).shouldBe(visible).setValue(middleName);
        $(mainPage.mobilePhoneField).shouldBe(visible).setValue(phone);
        $(mainPage.getFirstLoanButton).shouldBe(visible).click();
        $(personalInfoPage.personalInfoLabel).shouldBe(visible);
        $(personalInfoPage.emailField).shouldBe(visible).setValue(wrongEmail2);
        $(personalInfoPage.continueButton).shouldBe(visible).click();
        $(personalInfoPage.emailFieldError).shouldHave(text("Please enter a valid email address."));
        sleep(3000);
    }
}

