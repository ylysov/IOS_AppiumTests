
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class FromAppiumInspector {

    protected IOSDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("app", "/Users/ylysov/IdeaProjects/IOS_AppiumTests/apps/TipCalculator.app");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void enterValues() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> tapObject = new HashMap<String, Double>();
        tapObject.put("x", (double) 298); // in pixels from left
        tapObject.put("y", (double) 103); // in pixels from top
        js.executeScript("mobile: tap", tapObject);

        driver.findElement(By.name("Delete")).click();
        driver.findElement(By.name("Delete")).click();
        driver.findElement(By.name("Delete")).click();
        driver.findElement(By.name("2")).click();
        driver.findElement(By.name("5")).click();
        driver.findElement(By.name("0")).click();
        driver.findElement(By.name("20%")).click();
    }
}