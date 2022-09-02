import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions {

    public RegistrationForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void completePartofRegistration() {
        driver.findElement(Locators.AGENCY_BUTTON).click();
        driver.findElement(Locators.FOOTERMENU_BUTTON).click();
        driver.findElement(Locators.TEXTFIELD_NAME).sendKeys(Data.name);
        driver.findElement(Locators.TEXTFIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.GETTEXTFIELD_NAME).sendKeys(Data.getname);
        driver.findElement(Locators.SEND_BUTTON).click();
    }

    public void completeFirstPartofRegistration() {
        driver.findElement(Locators.GETTEXTFIELD_EMAIL).sendKeys(Data.getEmail);
        driver.findElement(Locators.TEXTFIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.NEXT_BUTTON).click();
    }

    public void completeSecondPartofRegistration() {
        driver.findElement(Locators.TEXTFIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.DAY_DROPDOWN).click();
        driver.findElement(Locators.SELECTED_DAY).click();
        driver.findElement(Locators.MONTH_DROPDOWN).click();
        driver.findElement(Locators.SELECTED_MONTH).click();
        driver.findElement(Locators.YEAR_DROPDOWN).click();
        driver.findElement(Locators.SELECTED_YEAR).click();
        driver.findElement(Locators.TEXTFIELD_PHONE).sendKeys(Data.phone);
        driver.findElement(Locators.CONFIRMATION_CHECKBOX).click();
        driver.findElement(Locators.REGIONNAME_AUTOCOMPLETE).clear();
        driver.findElement(Locators.REGIONNAME_AUTOCOMPLETE).sendKeys(Data.city);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(Locators.SELECTEDCITY_OFSPAIN).click();

    }

}

