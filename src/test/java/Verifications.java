import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifications {

    @Test
    public void Assertions(){
        String expectedResult = "Bob1";
        String actualResult = "Bob";
        //Assert.assertEquals(actualResult, expectedResult);
        Assert.assertTrue(expectedResult.contains(actualResult));
    }
}
