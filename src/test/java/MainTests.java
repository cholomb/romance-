
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
        String expectedSearchTitle = "Single Ukrainian women online";
        String expectedSearchUrl = "/users/search";
        String searchPageName = "PRETTY WOMEN";
        String actualTitle = null;
        for (int i = 1; i < tabs.size(); i++) {
            if (tabs.get(i).isDisplayed()) {
                String nameOfTab = tabs.get(i).getText();
                tabs.get(i).click();
                String currentUrl = driver.getCurrentUrl();
                if(!nameOfTab.contains("GIFTS")){
                    actualTitle = driver.findElement(By.xpath("//h1")).getText();
                }
                if(nameOfTab.contains(searchPageName)){
                    if(!currentUrl.contains(expectedSearchUrl)){
                        Assert.fail();
                    }
                    Assert.assertTrue(actualTitle.contains(expectedSearchTitle),"Title is different:" + actualTitle);
                    Assert.assertTrue(currentUrl. contains(expectedSearchUrl), "Url is different:" + currentUrl );
                }
                driver.navigate().back();
                tabs = driver.findElements(Locators.TAB_LINKS);
            }
        }
    }
}
