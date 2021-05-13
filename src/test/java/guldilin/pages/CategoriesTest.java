package guldilin.pages;


import guldilin.ConfigurationProvider;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static guldilin.pages.MainPage.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CategoriesTest {
    private WebDriver driver;
    private MainPage mainPage;
    private WebDriverWait wait;
    private final int LOADING_TIMEOUT_MS = 300;

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

    @BeforeEach
    public void openCategoriesList() {
        driver.get(MainPage.PAGE_URL);
        wait.until(presenceOfElementLocated(By.xpath(MainPage.CATEGORY_BUTTON_XPATH)));
        mainPage.getCategoryButton().click();
        wait.until(presenceOfElementLocated(By.xpath(MainPage.CATEGORY_ALL_QUESTIONS_XPATH)));
    }


    @AfterAll
    public void close() {
        driver.close();
    }

    private void doCategoryTest(String category_xpath, String title) throws InterruptedException {
        driver.findElement(By.xpath(category_xpath)).click();
        Thread.sleep(LOADING_TIMEOUT_MS);
        assertEquals(title, driver.getTitle());
    }

    @Test
    public void autoCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_AUTO_XPATH,
                "Ответы Mail.ru: Авто, Мото. Открытые вопросы"
        );
    }

    @Test
    public void finCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_FIN_XPATH,
                "Ответы Mail.ru: Бизнес, Финансы. Открытые вопросы"
        );
    }

    @Test
    public void cityCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_CITY_XPATH,
                "Ответы Mail.ru: Города и Страны. Открытые вопросы"
        );
    }

    @Test
    public void magicCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_MAGIC_XPATH,
                "Ответы Mail.ru: Гороскопы, Магия, Гадания. Открытые вопросы"
        );
    }

    @Test
    public void hobbyCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_HOBBY_XPATH,
                "Ответы Mail.ru: Досуг, Развлечения. Открытые вопросы"
        );
    }

    @Test
    public void eatCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_EAT_XPATH,
                "Ответы Mail.ru: Еда, Кулинария. Открытые вопросы"
        );
    }

    @Test
    public void animalCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_ANIMAL_XPATH,
                "Ответы Mail.ru: Животные, Растения. Открытые вопросы"
        );
    }

    @Test
    public void loveCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_LOVE_XPATH,
                "Ответы Mail.ru: Знакомства, Любовь, Отношения. Открытые вопросы"
        );
    }

    @Test
    public void artCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_ART_XPATH,
                "Ответы Mail.ru: Искусство и Культура. Открытые вопросы"
        );
    }


    @Test
    public void gamesCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_GAMES_XPATH,
                "Ответы Mail.ru: Компьютерные и Видео игры. Открытые вопросы"
        );
    }

    @Test
    public void connectCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_CONNECT_XPATH,
                "Ответы Mail.ru: Компьютеры, Связь. Открытые вопросы"
        );
    }

    @Test
    public void healthCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_HEALTH_XPATH,
                "Ответы Mail.ru: Красота и Здоровье. Открытые вопросы"
        );
    }

    @Test
    public void technicCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_TECHNIC_XPATH,
                "Ответы Mail.ru: Наука, Техника, Языки. Открытые вопросы"
        );
    }

    @Test
    public void eduCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_EDU_XPATH,
                "Ответы Mail.ru: Образование. Открытые вопросы"
        );
    }

    @Test
    public void politicsCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_POLITICS_XPATH,
                "Ответы Mail.ru: Общество, Политика, СМИ. Открытые вопросы"
        );
    }

    @Test
    public void progCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_PROG_XPATH,
                "Ответы Mail.ru: Программирование. Открытые вопросы"
        );
    }

    @Test
    public void travelCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_TRAVEL_XPATH,
                "Ответы Mail.ru: Путешествия, Туризм. Открытые вопросы"
        );
    }

    @Test
    public void careerCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_CAREER_XPATH,
                "Ответы Mail.ru: Работа, Карьера. Открытые вопросы"
        );
    }

    @Test
    public void homeCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_HOME_XPATH,
                "Ответы Mail.ru: Семья, Дом, Дети. Открытые вопросы"
        );
    }

    @Test
    public void sportCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_SPORT_XPATH,
                "Ответы Mail.ru: Спорт. Открытые вопросы"
        );
    }


    @Test
    public void styleCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_STYLE_XPATH,
                "Ответы Mail.ru: Стиль, Мода, Звезды. Открытые вопросы"
        );
    }

    @Test
    public void adultCategoryTest() throws InterruptedException {
        driver.findElement(By.xpath(CATEGORY_ADULT_XPATH)).click();
        Thread.sleep(LOADING_TIMEOUT_MS);
        driver.findElement(By.xpath(ADULT_BANNER_XPATH));
        assertNotNull(driver.findElement(By.xpath(ADULT_BANNER_XPATH)));
    }

    @Test
    public void itemsCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_ITEMS_XPATH,
                "Ответы Mail.ru: Товары и Услуги. Открытые вопросы"
        );
    }

    @Test
    public void philoCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_PHILO_XPATH,
                "Ответы Mail.ru: Философия, Непознанное. Открытые вопросы"
        );
    }

    @Test
    public void photoCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_PHOTO_XPATH,
                "Ответы Mail.ru: Фотография, Видеосъемка. Открытые вопросы"
        );
    }

    @Test
    public void lawCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_LAW_XPATH,
                "Ответы Mail.ru: Юридическая консультация. Открытые вопросы"
        );
    }

    @Test
    public void humourCategoryTest() throws InterruptedException {
        doCategoryTest(
                CATEGORY_HUMOUR_XPATH,
                "Ответы Mail.ru: Юмор. Открытые вопросы"
        );
    }
}
