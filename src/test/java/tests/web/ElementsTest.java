package tests.web;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.web.ElementsPage;
import pages.web.HomePage;
import utils.WebDriverFactory;

public class ElementsTest {
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
    public void testTextBoxNavigation() {
        homePage.open();
        homePage.clickElementsCard();
        elementsPage.clickTextBox();
        Assert.assertTrue(elementsPage.getUrl().contains("text-box"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
