
import org.testng.annotations.Test;

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


}
