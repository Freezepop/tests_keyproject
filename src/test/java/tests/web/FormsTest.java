package tests.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.web.FormsPage;

import static org.testng.Assert.assertTrue;

public class FormsTest {

    private WebDriver driver;
    private FormsPage formsPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        formsPage = new FormsPage(driver);
    }

    @Test
    public void testFormSubmission() {
        formsPage.enterFirstName("Ivan");
        formsPage.enterLastName("Petrov");
        formsPage.enterEmail("ivan.petrov@test.com");
        formsPage.selectGender();
        formsPage.enterMobile("9998887766");
        formsPage.submitForm();

        assertTrue(formsPage.isFormSubmitted(), "Form was not submitted");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
