import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickBlogButton() {
        driver.findElement(Locators.BLOG_BUTTON).click();
    }

    public void clickJoinButton() {
        driver.findElement(Locators.REGISTRATION_BUTTON).click();

    }
    public void clickGalleryLink(){
        driver.findElement(Locators.GALLERY_LINK).click();
    }

    public void swithToYoutubeFrame(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement youtubeIframe = driver.findElement(Locators.YOUTUBE_FRAMELOCATOR);
        driver.switchTo().frame(youtubeIframe);
    }

    public void clickPlayYoutube(){
        driver.findElement(Locators.PLAYYOUTUBE_BUTTON).click();

    }

}