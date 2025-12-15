package pages.mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

    private AppiumDriver driver;
    private WebDriverWait wait;

    private By searchInput =
            By.id("org.wikipedia:id/search_src_text");

    private By firstResult =
            By.id("org.wikipedia:id/page_list_item_title");

    public SearchPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterSearch(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput))
                .sendKeys(text);
    }

    public void selectFirstResult() {
        wait.until(ExpectedConditions.elementToBeClickable(firstResult))
                .click();
    }
}
