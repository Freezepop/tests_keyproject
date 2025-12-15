package tests.web;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.web.ElementsPage;
import pages.web.HomePage;
import utils.WebDriverFactory;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;
    private ElementsPage elementsPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver();
        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
    }

    @Test
    public void testNavigationToElements() {
        homePage.open();
        homePage.clickElementsCard();
        Assert.assertTrue(driver.getCurrentUrl().contains("elements"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
