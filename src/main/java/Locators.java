import org.openqa.selenium.By;

public class Locators {
    //MainPage
    public static final By GALLERY_LINK = By.xpath("//a[@href='https://romanceabroad.com/users/search']");


    //Registration
    public static final By BLOG_BUTTON = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By AGENCY_BUTTON = By.cssSelector("a[href='/content/view/kharkov-dating-agency']");
    public static final By FOOTERMENU_BUTTON = By.cssSelector("[class='footer-menu-list-group-item-text']");
    public static final By TEXTFIELD_NAME = By.cssSelector("input[name='user_name']");
    public static final By TEXTFIELD_EMAIL = By.cssSelector("input[name='user_email']");
    public static final By GETTEXTFIELD_NAME = By.cssSelector("input[name='subject']");
    public static final By SEND_BUTTON = By.cssSelector("input[value='Send']");

    public static final By REGISTRATION_BUTTON = By.xpath("//button[@id='show-registration-block']");
    public static final By GETTEXTFIELD_EMAIL = By.cssSelector("input[id='email']");
    public static final By TEXTFIELD_PASSWORD = By.cssSelector("input[id='password']");
    public static final By NEXT_BUTTON = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXTFIELD_NICKNAME = By.xpath("//input[@id='nickname']");
    public static final By DAY_DROPDOWN = By.xpath("//div[@id='daySelect']");
    public static final By SELECTED_DAY = By.xpath("//ul[@class='dropdown-menu show']//li[@data-value='10']");
    public static final By MONTH_DROPDOWN = By.xpath("//div[@id='monthSelect']");
    public static final By SELECTED_MONTH = By.xpath("//div[@id='monthSelect']//li[@data-type='9']");
    public static final By YEAR_DROPDOWN = By.xpath("//div[@id='yearSelect']");
    public static final By SELECTED_YEAR = By.xpath("//div[@id='yearSelect']//a[@data-value='2000']");
    public static final By TEXTFIELD_PHONE = By.cssSelector("input[name='data[phone]'");
    public static final By CONFIRMATION_CHECKBOX = By.xpath("//input[@id='confirmation']");
    public static final By REGIONNAME_AUTOCOMPLETE = By.xpath("//input[@name='region_name']");
    public static final By SELECTEDCITY_OFSPAIN = By.xpath("//div[contains(@id,'region_select')]//li[text()='Barcelona, Spain'][@country='ES']");
    public static final By YOUTUBE_FRAMELOCATOR = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By PLAYYOUTUBE_BUTTON = By.xpath("//button[@class='ytp-large-play-button ytp-button']");

    //Gallery
    public static final By SORT_DROP_DOWN = By.xpath("//select[contains(@id,'sorter-select')]");
}
