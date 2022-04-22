import Pages.MainPage;
import Pages.PersonalInfoPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static Urls.Urls.SITE;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@DisplayName("Проверка поля номера телефона")
public class MainFormValidationTest extends MainTest {

    private MainPage mainPage = new MainPage();
    // ------------------------------ test variables ---------------------------------------

    private String wrongPhone = "0887-098-0987";
    private String shortPhone = "0887-098-09";
    // ------------------------------------ --- --------------------------------------------


    @Test
    @Order(1)
    @DisplayName("Клиент вводит номер телефона начинающийся на 08")
    public void test1() {
        open(SITE);
        $(mainPage.mobilePhoneField).shouldBe(visible).setValue(wrongPhone);
        $(mainPage.middleInitialField).shouldBe(visible).click();
        $(mainPage.mobilePhoneErrorLabel).shouldBe(visible).shouldHave(text("Should start with \"09\""));
        sleep(3000);
    }

    @Test
    @Order(2)
    @DisplayName("Клиент вводит номер телефона не полнностью")
    public void test2() {
        open(SITE);
        $(mainPage.mobilePhoneField).shouldBe(visible).setValue(shortPhone);
        $(mainPage.middleInitialField).shouldBe(visible).click();
        $(mainPage.mobilePhoneErrorLabel).shouldBe(visible).shouldHave(text("Should contain 11 numbers"));
        sleep(3000);
    }
}

