package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By firstNameInput = By.id("firstName");
    private By lastNameInput = By.id("lastName");
    private By emailInput = By.id("userEmail");
    private By mobileInput = By.id("userNumber");

    private By genderMale = By.xpath("//label[text()='Male']");

    private By submitButton = By.id("submit");

    private By modalTitle = By.id("example-modal-sizes-title-lg");

    public FormsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void selectGender() {
        wait.until(ExpectedConditions.elementToBeClickable(genderMale)).click();
    }

    public void enterMobile(String mobile) {
        driver.findElement(mobileInput).sendKeys(mobile);
    }

    public void submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public boolean isFormSubmitted() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(modalTitle)
        ).isDisplayed();
    }
}
