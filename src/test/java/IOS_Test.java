import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



/**
 * Created by ylysov on 2/8/16.
 */
public class IOS_Test extends IOSSetup {


   // String billInput = "//UIATextField[@location='{198, 63}']";
   String billInput = "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]/UIATextField[1]";

    String UIKeyboard ="//UIAApplication[1]/UIAWindow[2]/UIAKeyboard[1]";

    @BeforeClass
    public void setUp() throws Exception {
        prepareIOSForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void keyboardIsAvailable()
    {
        driver.findElement(By.xpath(billInput)).sendKeys("250");


    }
}
