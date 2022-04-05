package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileFactory {

    private static AppiumDriver driver;

    public static MobileFactory sistemaOperativo(String so) throws MalformedURLException {
        driver = getDriver(so);
        return new MobileFactory();
    }

    private static AppiumDriver getDriver(String operatingSystem) throws MalformedURLException {
        switch (operatingSystem) {
            case "Emulator":
                DesiredCapabilities dc = new DesiredCapabilities();
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
                dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "la.elenas.embajadoras.application");
                dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
                dc.setCapability(MobileCapabilityType.NO_RESET, true);
                dc.setCapability(MobileCapabilityType.APPLICATION_NAME, "");
                return driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
            default:
                throw new RuntimeException("Driver no soprtado para el S.O: " + operatingSystem);
        }
    }

    public AppiumDriver enLaAppElenas() throws MalformedURLException {
        return driver;
    }

    public static AppiumDriver driver() {
        return driver;
    }
}