package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By elementsCard = By.xpath("//h5[text()='Elements']");
    private By formsCard = By.xpath("//h5[text()='Forms']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/");
    }

    public void clickElementsCard() {
        driver.findElement(elementsCard).click();
    }

}
