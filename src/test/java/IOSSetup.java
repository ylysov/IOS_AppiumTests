import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class IOSSetup {
    protected IOSDriver driver;

    protected void prepareIOSForAppium() throws MalformedURLException {

        //Appium needs the path of app build
        //Set up the desired capabilities and pass the iOS SDK version and app path to Appium
        File app = new File("/Users/ylysov/IdeaProjects/AppiumTestProject/apps/TipCalculator.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();

//        capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
//        capabilities.setCapability(CapabilityType.VERSION, "6.1");
//        capabilities.setCapability(CapabilityType.PLATFORM, "Mac");

       // capabilities.setCapability("device","iOS");

        //mandatory capabilities
        capabilities.setCapability("deviceName","iPhone 6");
       // capabilities.setCapability("platformName","iOS");
        //capabilities.setCapability("platformVersion","8.4");

        capabilities.setCapability("app", app.getAbsolutePath());




        //Create an instance of RemoteWebDriver and connect to the Appium server.
        //Appium will launch the BmiCalc App in iPhone Simulator using the configurations specified in Desired Capabilities
        //"desiredCapabilities":{"platformName":"iOS","platformVersion":"8.4","newCommandTimeout":"999999","automationName":"Appium","deviceName":"iPhone 6"



        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}

//"http://127.0.0.1:4723/wd/hub"   =  ConfigProvider.getHubURL()
// driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

    //File app = new File(ConfigProvider.getAppsDirectoryPath(), ConfigProvider.getAppFile());

