package pages.mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private AppiumDriver driver;
    private WebDriverWait wait;

    private By skipButton =
            By.id("org.wikipedia:id/fragment_onboarding_skip_button");

    private By searchContainer =
            By.id("org.wikipedia:id/search_container");

    public MainPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void skipWelcome() {
        if (driver.findElements(skipButton).size() > 0) {
            driver.findElement(skipButton).click();
        }
    }

    public void openSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(searchContainer))
                .click();
    }
}
