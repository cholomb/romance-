import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
    String getEmail = "2222@gmail.com";
    By textFieldPassword = By.cssSelector("input[id='password']");
    String Password = "12345678";
    By nextButton =  By.xpath("//button[@data-action='next-page'][text()='Next']");


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
        driver.findElement(textFieldPassword).sendKeys(Password);
        driver.findElement(nextButton).click();
    }


}
