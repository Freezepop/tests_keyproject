package tests.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.mobile.MainPage;
import pages.mobile.SearchPage;

import java.net.MalformedURLException;
import java.net.URL;


public class WikipediaTest {
    private AppiumDriver driver;
    private MainPage mainPage;
    private SearchPage searchPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("appPackage", "org.wikipedia");
        caps.setCapability("appActivity", "org.wikipedia.main.MainActivity");

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                caps
        );

        mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver);
    }

    @Test
    public void searchArticleTest() {
        mainPage.skipWelcome();
        mainPage.openSearch();
        searchPage.enterSearch("Appium");
        searchPage.selectFirstResult();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
