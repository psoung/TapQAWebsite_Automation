package basetest;

import org.testng.annotations.AfterClass;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goHomePage();
    }

    public void goHomePage() {
        driver.get("https://tapqa.com");
        homePage = new HomePage(driver);

    }

   @AfterClass
    public void teardown() {
        driver.quit();
    }

}
