
import exceptions.DriverNotSupportedException;
import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;


public class test001 {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void SetUp() {
        driver = WebDriverFactory.getWebDriver("ff");
        mainPage = new MainPage(driver);
        driver.get("https://otus.ru");
    }

    @AfterEach
    public void close() {
        if(this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }
    }

    @Test
    public void test01() {
        mainPage
                .clickRandomLesson();

        try {

            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
