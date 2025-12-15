package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
    private WebDriver driver;
    private By textBoxMenu = By.xpath("//span[text()='Text Box']");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTextBox() {
        driver.findElement(textBoxMenu).click();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
