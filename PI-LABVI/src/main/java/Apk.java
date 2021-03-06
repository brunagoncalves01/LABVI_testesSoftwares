import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Apk {
	
	public final AppiumDriver driver;
    public final String APK_PATH = "C:/Users/Bruna//Documents/fatec/6sem/Fabricio-testes/VAIdeVAN.apk";

    public Apk() throws MalformedURLException {
        File apk = new File(APK_PATH);
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        config.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        config.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        this.driver = new AppiumDriver(url, config);
    }

}