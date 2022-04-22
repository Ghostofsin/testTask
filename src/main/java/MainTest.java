import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MainTest {

    @BeforeAll
    public static void setUp() {
//        clearBrowserCache();
        Configuration.browserVersion = "99";
        Configuration.pageLoadTimeout = 150000;
        Configuration.browser = "chrome";
        Configuration.timeout = 40000;
        Configuration.reportsFolder = "target/screenshot";
    }

    @AfterAll
    public static void setOut() {
//        clearBrowserCache();
//        getWebDriver().manage().deleteAllCookies();
        Selenide.closeWindow();
    }

    @BeforeEach
    public void toDoBefore() {
    }

    @AfterEach
    public void toDoAfter() {
//        Selenide.closeWindow();
    }
}
