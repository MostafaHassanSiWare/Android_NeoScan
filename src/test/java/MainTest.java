import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MainTest {

    static AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2" );
        caps.setCapability("platformVersion", "10.0");
        caps.setCapability("deviceName", "HGT6JD3K");
        //caps.setCapability("app", "");
        caps.setCapability("appPackage", "com.neospectrascanapp");
        caps.setCapability("appActivity", "SplashActivity");
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("noReset",true);



        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);

    }

    @Test
    public void testRuns(){



    }


}
