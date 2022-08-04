import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTests extends BaseUI {


    By blogButton = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By agencyButton = By.cssSelector("a[href='/content/view/kharkov-dating-agency']");
    By footermenuButton = By.cssSelector("[class='footer-menu-list-group-item-text']");
    By textFieldName = By.cssSelector("input[name='user_name']");
    By textFieldEmail = By.cssSelector("input[name='user_email']");
    By gettextFieldName = By.cssSelector("input[name='subject']");
    By sendButton = By.cssSelector("input[value='Send']");
    String name = "oleg";
    String email = "11111@gmail.com";
    String getname = "vvvv";
    By registrationButton = By.xpath("//button[@id='show-registration-block']");
    By getTextFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton =  By.xpath("//button[@data-action='next-page'][text()='Next']");
    By nicknameTextField = By.xpath("//input[@id='nickname']");
    By dayDropDown = By.xpath("//div[@id='daySelect']");
    By selectedDay = By.xpath("//ul[@class='dropdown-menu show']//li[@data-value='10']");
    By monthDropDown = By.xpath("//div[@id='monthSelect']");
    By selectedMonth = By.xpath("//div[@id='monthSelect']//li[@data-type='9']");
    By yearDropDown = By.xpath("//div[@id='yearSelect']");
    By selectedYear = By.xpath("//div[@id='yearSelect']//a[@data-value='2000']");
    By textFieldPhone = By.cssSelector("input[name='data[phone]'");
    By confirmationCheckbox = By.xpath("//input[@id='confirmation']");
    By regionNameAutoComplete = By.xpath("//input[@name='region_name']");
    By selectedCityofSpain = By.xpath("//div[contains(@id,'region_select')]//li[text()='Barcelona, Spain'][@country='ES']");
    By youtubeFrameLocator = By.xpath("src='https://www.youtube.com/embed/RRECuJzm3IY?start=85'");
    By playYoutubeButton = By.xpath("//button[@aria-label='Смотреть']");
    String getEmail = "2222@gmail.com";
    String password = "12345678";
    String nickname = "Messi";
    String phone = "10101010";
    String city = "Barcelona";


    @Test
    public void contactAdministratorTests1() {
        driver.findElement(blogButton).click();
        driver.findElement(agencyButton).click();
        driver.findElement(footermenuButton).click();
        driver.findElement(textFieldName).sendKeys(name);
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(gettextFieldName).sendKeys(getname);
        driver.findElement(sendButton).click();
    }

    @Test
    public void getStartedTests2(){
        driver.findElement(registrationButton).click();
        driver.findElement(getTextFieldEmail).sendKeys(getEmail);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();
        driver. findElement(nicknameTextField).sendKeys(nickname);
        driver.findElement(dayDropDown).click();
        driver. findElement(selectedDay).click();
        driver.findElement(monthDropDown).click();
        driver.findElement(selectedMonth).click();
        driver.findElement(yearDropDown).click();
        driver.findElement(selectedYear).click();
        driver.findElement(textFieldPhone).sendKeys(phone);
        driver.findElement(confirmationCheckbox).click();
        driver.findElement(regionNameAutoComplete).clear();
        driver.findElement(regionNameAutoComplete).sendKeys(city);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(selectedCityofSpain).click();
    }
    @Test
    public void testIframe(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement youtubeIframe = driver.findElement(youtubeFrameLocator);
        driver.switchTo().frame(youtubeIframe);
        driver.findElement(playYoutubeButton).click();
    }


}
