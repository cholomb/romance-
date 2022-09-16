
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MainTests extends BaseUI {

    @Test
    public void contactAdministratorTests1() {
        mainPage.clickBlogButton();
        registrationForm.completePartofRegistration();
    }

    @Test
    public void getStartedTests2() {
        mainPage.clickJoinButton();
        registrationForm.completeFirstPartofRegistration();
        registrationForm.completeSecondPartofRegistration();

    }

    @Test
    public void testIframe() {
        mainPage.swithToYoutubeFrame();
        mainPage.clickPlayYoutube();
    }

    @Test
    public void testFooter() {
        mainPage.jsScroll(Locators.PHONE_LINK);
        mainPage.jsClick(Locators.PHONE_LINK);

    }

    @Test
    public void testMainTabs() {
        List<WebElement> tabs = driver.findElements(Locators.TAB_LINKS);
        for (int i = 1; i < tabs.size(); i++) {
            if (tabs.get(i).isDisplayed()) {
                String text = tabs.get(i).getText();
                tabs.get(i).click();
                System.out.println(text);
                driver.navigate().back();
                tabs = driver.findElements(Locators.TAB_LINKS);
            }
        }
    }
}
