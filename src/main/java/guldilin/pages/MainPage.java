package guldilin.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPage {
    public static final String PAGE_URL = "https://otvet.mail.ru";

    public static final String CATEGORY_BUTTON_XPATH = "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]";
    public static final String CATEGORY_ALL_QUESTIONS_XPATH = "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[1]";

    public static final String CATEGORY_AUTO_XPATH =    "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[3]";
    public static final String CATEGORY_FIN_XPATH =     "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[4]";
    public static final String CATEGORY_CITY_XPATH =    "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[5]";
    public static final String CATEGORY_MAGIC_XPATH =   "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[6]";
    public static final String CATEGORY_HOBBY_XPATH =   "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[7]";
    public static final String CATEGORY_EAT_XPATH =     "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[8]";
    public static final String CATEGORY_ANIMAL_XPATH =  "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[9]";
    public static final String CATEGORY_LOVE_XPATH =    "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[10]";
    public static final String CATEGORY_ART_XPATH =     "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[1]/span[11]";

    public static final String CATEGORY_GAMES_XPATH =       "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[1]";
    public static final String CATEGORY_CONNECT_XPATH =     "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[2]";
    public static final String CATEGORY_HEALTH_XPATH =      "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[3]";
    public static final String CATEGORY_TECHNIC_XPATH =     "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[4]";
    public static final String CATEGORY_EDU_XPATH =         "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[5]";
    public static final String CATEGORY_POLITICS_XPATH =    "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[6]";
    public static final String CATEGORY_PROG_XPATH =        "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[7]";
    public static final String CATEGORY_TRAVEL_XPATH =      "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[8]";
    public static final String CATEGORY_CAREER_XPATH =      "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[9]";
    public static final String CATEGORY_HOME_XPATH =        "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[10]";
    public static final String CATEGORY_SPORT_XPATH =       "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[2]/span[11]";


    public static final String CATEGORY_STYLE_XPATH =       "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[3]/span[1]";
    public static final String CATEGORY_ADULT_XPATH =       "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[3]/span[2]";
    public static final String CATEGORY_ITEMS_XPATH =       "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[3]/span[3]";
    public static final String CATEGORY_PHILO_XPATH =       "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[3]/span[4]";
    public static final String CATEGORY_PHOTO_XPATH =       "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[3]/span[5]";
    public static final String CATEGORY_LAW_XPATH =         "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[3]/span[6]";
    public static final String CATEGORY_HUMOUR_XPATH =      "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[1]/span[1]/span[2]/span[3]/span[7]";

    public static final String SEARCH_INPUT_XPATH =      "/html/body/div[1]/div[5]/div[2]/div[1]/div/div[2]/div/span/span[2]/span[3]/span/form/span[1]/span[1]/input";
    public static final String FIRST_QUESTION_XPATH =      "/html/body/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]";
    public static final String ADULT_BANNER_XPATH =      "/html/body/div[2]/div[1]/div[14]/div/div/div[2]/div";
    public static final String FIRST_QUESTION_FOUND_XPATH =      "/html/body/div[2]/div[3]/div[2]/div/div/div/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/a";

    private final WebDriver driver;

    @FindBy(xpath = SEARCH_INPUT_XPATH)
    private WebElement searchInput;
    @FindBy(xpath = FIRST_QUESTION_XPATH)
    private WebElement firstQuestion;
    @FindBy(xpath = ADULT_BANNER_XPATH)
    private WebElement adultBunner;
    @FindBy(xpath = CATEGORY_BUTTON_XPATH)
    private WebElement categoryButton;
    @FindBy(xpath = FIRST_QUESTION_FOUND_XPATH)
    private WebElement firstQuestionFound;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
