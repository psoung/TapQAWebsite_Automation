package pages.servicespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.servicespages.ServicesPage;
import pages.servicespages.testserviceofferingspages.*;

public class Offerings_SideNavBarPage {
    private WebDriver driver;

    private By TestServiceOfferings = By.xpath("//*[@id=\"fl-post-248\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/h3/a/span");
    private By WebsiteTesting = By.xpath("//*[@id=\"menu-item-5173\"]/a/span");
    private By MobileApplicationTesting = By.xpath("//*[@id=\"menu-item-5174\"]/a/span");
    private By WebServicesTesting = By.xpath("//*[@id=\"menu-item-5175\"]/a/span");
    private By DataWarehouseTesting = By.xpath("//*[@id=\"menu-item-5176\"]/a/span");
    private By ContinuousIntegration = By.xpath("//*[@id=\"menu-item-5182\"]/a/span");
    private By IoTTesting = By.xpath("//*[@id=\"menu-item-5177\"]/a/span");
    private By PackagedSoftwareTesting = By.xpath("//*[@id=\"menu-item-5178\"]/a/span");
    private By MigrationTesting = By.xpath("//*[@id=\"menu-item-5179\"]/a/span");
    private By AccessibilityTesting = By.xpath("//*[@id=\"menu-item-5180\"]/a/span");
    private By TestDataManagement = By.xpath("//*[@id=\"menu-item-5181\"]/a/span");
    private By SecurityTesting = By.xpath("//*[@id=\"menu-item-5183\"]/a/span");
    private By ArtificialIntelligenceTesting = By.xpath("//*[@id=\"menu-item-5534\"]/a/span");
    private By PerformanceTesting = By.xpath("//*[@id=\"menu-item-5607\"]/a/span");

    private By tapQASolutions_Text = By.xpath("//*[@id=\"fl-post-248\"]/div/div[1]/div/div/div/div/div[1]/div/div[3]/div/div/div/div/div[1]/h4");
    private By tapQASolutions_Button = By.xpath("//*[@id=\"fl-post-248\"]/div/div[1]/div/div/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div[2]/div/a/span");

    public Offerings_SideNavBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTestServiceOfferings() {return driver.findElement(TestServiceOfferings).getText(); }
    public String getWebsiteTesting() {return driver.findElement(WebsiteTesting).getText(); }
    public String getMobileApplicationTesting() {return driver.findElement(MobileApplicationTesting).getText(); }
    public String getWebServicesTesting() {return driver.findElement(WebServicesTesting).getText(); }
    public String getDataWarehouseTesting() {return driver.findElement(DataWarehouseTesting).getText(); }
    public String getContinuousIntegration() {return driver.findElement(ContinuousIntegration).getText(); }
    public String getIoTTesting() {return driver.findElement(IoTTesting).getText(); }
    public String getPackagedSoftwareTesting() {return driver.findElement(PackagedSoftwareTesting).getText(); }
    public String getMigrationTesting() {return driver.findElement(MigrationTesting).getText(); }
    public String getAccessibilityTesting() {return driver.findElement(AccessibilityTesting).getText(); }
    public String getTestDataManagement() {return driver.findElement(TestDataManagement).getText(); }
    public String getSecurityTesting() {return driver.findElement(SecurityTesting).getText(); }
    public String getArtificialIntelligenceTesting() {return driver.findElement(ArtificialIntelligenceTesting).getText(); }
    public String getPerformanceTesting() {return driver.findElement(PerformanceTesting).getText(); }

    public String getTapQASolutions_Text() {return driver.findElement(tapQASolutions_Text).getText(); }
    public Boolean verifyTapQASolutions_Button() {return driver.findElement(tapQASolutions_Button).isDisplayed(); }

    public ServicesPage goToTestServiceOfferings() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(TestServiceOfferings);
        action.moveToElement(element).click().perform();
        return new ServicesPage(driver);
    }

    public WebsiteTestingPage goToWebsiteTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(WebsiteTesting);
        action.moveToElement(element).click().perform();
        return new WebsiteTestingPage(driver);
    }

    public MobileApplicationTestingPage goToMobileApplicationTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(MobileApplicationTesting);
        action.moveToElement(element).click().perform();
        return new MobileApplicationTestingPage(driver);
    }

    public WebServicesTestingPage goToWebServicesTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(WebServicesTesting);
        action.moveToElement(element).click().perform();
        return new WebServicesTestingPage(driver);
    }

    public DataWarehouseTestingPage goToDataWarehouseTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(DataWarehouseTesting);
        action.moveToElement(element).click().perform();
        return new DataWarehouseTestingPage(driver);
    }

    public ContinuousIntegrationPage goToContinuousIntegrationPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(ContinuousIntegration);
        action.moveToElement(element).click().perform();
        return new ContinuousIntegrationPage(driver);
    }

    public IoTTestingPage goToIoTTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(IoTTesting);
        action.moveToElement(element).click().perform();
        return new IoTTestingPage(driver);
    }

    public PackagedSoftwareTestingPage goToPackagedSoftwareTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(PackagedSoftwareTesting);
        action.moveToElement(element).click().perform();
        return new PackagedSoftwareTestingPage(driver);
    }

    public MigrationTestingPage goToMigrationTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(MigrationTesting);
        action.moveToElement(element).click().perform();
        return new MigrationTestingPage(driver);
    }

    public AccessibilityTestingPage goToAccessibilityTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(AccessibilityTesting);
        action.moveToElement(element).click().perform();
        return new AccessibilityTestingPage(driver);
    }

    public TestDataManagementPage goToTestDataManagementPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(TestDataManagement);
        action.moveToElement(element).click().perform();
        return new TestDataManagementPage(driver);
    }

    public SecurityTestingPage goToSecurityTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(SecurityTesting);
        action.moveToElement(element).click().perform();
        return new SecurityTestingPage(driver);
    }

    public ArtificialIntelligenceTestingPage goToArtificialIntelligenceTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(ArtificialIntelligenceTesting);
        action.moveToElement(element).click().perform();
        return new ArtificialIntelligenceTestingPage(driver);
    }

    public PerformanceTestingPage goToPerfomanceTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(PerformanceTesting);
        action.moveToElement(element).click().perform();
        return new PerformanceTestingPage(driver);
    }

    public ServicesPage goToTapQASolutions() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(tapQASolutions_Button);
        action.moveToElement(element).click().perform();
        return new ServicesPage(driver);
    }

}
