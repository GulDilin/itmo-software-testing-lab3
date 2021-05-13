package guldilin.pages;

import guldilin.ConfigurationProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static guldilin.pages.MainPage.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QuestionsTest {
    private WebDriver driver;
    private MainPage mainPage;
    private WebDriverWait wait;


    @BeforeAll
    public void init() {
        ConfigurationProvider configurationProvider = ConfigurationProvider.getInstance();
        if (configurationProvider.getProperties().getProperty("current_driver").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", configurationProvider.getProperties().getProperty("chrome_driver_path"));
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", configurationProvider.getProperties().getProperty("mozilla_driver_path"));
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @AfterAll
    public void close() {
        driver.close();
    }

    @Test
    public void openFirstQuestion() throws InterruptedException {
        driver.get(MainPage.PAGE_URL);
        wait.until(presenceOfElementLocated(By.xpath(FIRST_QUESTION_XPATH)));
        String initialUrl = driver.getCurrentUrl();
        mainPage.getFirstQuestion().click();
        Thread.sleep(1000);
        assertNotEquals(initialUrl, driver.getCurrentUrl());
    }
}
