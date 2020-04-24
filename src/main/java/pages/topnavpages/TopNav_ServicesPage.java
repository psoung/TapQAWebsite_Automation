package pages.topnavpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.servicespages.ServicesPage;
import pages.servicespages.testserviceofferingspages.*;
import pages.servicespages.tapqasolutionspages.*;

public class TopNav_ServicesPage {
    private WebDriver driver;

    private By Services = By.xpath("//*[@id=\"menu-item-326\"]/div");
    private By Services_tapQASolutions = By.xpath("//*[@id=\"menu-item-5411\"]/div/a/span");
    private By Services_tapQASolutions_QAStaffAugmentation = By.xpath("//*[@id=\"menu-item-331\"]/a/span");
    private By Services_tapQASolutions_QAStrategy = By.xpath("//*[@id=\"menu-item-328\"]/a/span");
    private By Services_tapQASolutions_TestAutomation = By.xpath("//*[@id=\"menu-item-329\"]/a/span");
    private By Services_tapQASolutions_OnshoreTesting = By.xpath("//*[@id=\"menu-item-327\"]/a/span");
    private By Services_tapQASolutions_AutomationAccelerator = By.xpath("//*[@id=\"menu-item-5078\"]/a/span");
    private By Services_tapQASolutions_ContractToHire = By.xpath("//*[@id=\"menu-item-332\"]/a/span");
    private By Services_TapQASolutions_DesignThinking = By.xpath("//*[@id=\"menu-item-344\"]/a/span");

    private By Services_TestServices = By.xpath("//*[@id=\"menu-item-5412\"]/div/a/span");
    private By Services_TestServices_WebsiteTesting = By.xpath("//*[@id=\"menu-item-333\"]/a/span");
    private By Services_TestServices_MobileApplicationTesting = By.xpath("//*[@id=\"menu-item-337\"]/a/span");
    private By Services_TestServices_WebServicesTesting = By.xpath("//*[@id=\"menu-item-334\"]/a/span");
    private By Services_TestServices_DataWarehouseTesting = By.xpath("//*[@id=\"menu-item-335\"]/a/span");
    private By Services_TestServices_ContinuousIntegration = By.xpath("//*[@id=\"menu-item-5079\"]/a/span");
    private By Services_TestServices_IoTTesting = By.xpath("//*[@id=\"menu-item-340\"]/a/span");
    private By Services_TestServices_PackagedSoftwareTesting = By.xpath("//*[@id=\"menu-item-5080\"]/a/span");
    private By Services_TestServices_MigrationTesting = By.xpath("//*[@id=\"menu-item-343\"]/a/span");
    private By Services_TestServices_AccessibilityTesting = By.xpath("//*[@id=\"menu-item-5082\"]/a/span");
    private By Services_TestServices_TestDataManagement = By.xpath("//*[@id=\"menu-item-342\"]/a/span");
    private By Services_TestServices_SecurityTesting = By.xpath("//*[@id=\"menu-item-5081\"]/a/span");
    private By Services_TestServices_AITesting = By.xpath("//*[@id=\"menu-item-5532\"]/a/span");
    private By Services_TestServices_PerformanceTesting = By.xpath("//*[@id=\"menu-item-5608\"]/a/span");

    public TopNav_ServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverServices() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Services);
        action.moveToElement(element).perform();
    }

    public String getServices() { return driver.findElement(Services).getText(); }

    public String getServices_tapQASolutions() { return driver.findElement(Services_tapQASolutions).getText(); }
    public String getServices_tapQASolutions_QAStaffAugmentation() { return driver.findElement(Services_tapQASolutions_QAStaffAugmentation).getText(); }
    public String getServices_tapQASolutions_QAStrategy() { return driver.findElement(Services_tapQASolutions_QAStrategy).getText(); }
    public String getServices_tapQASolutions_TestAutomation() { return driver.findElement(Services_tapQASolutions_TestAutomation).getText(); }
    public String getServices_tapQASolutions_OnshoreTesting() { return driver.findElement(Services_tapQASolutions_OnshoreTesting).getText(); }
    public String getServices_tapQASolutions_AutomationAccelerator() { return driver.findElement(Services_tapQASolutions_AutomationAccelerator).getText(); }
    public String getServices_tapQASolutions_ContractToHire() { return driver.findElement(Services_tapQASolutions_ContractToHire).getText(); }
    public String getServices_TapQASolutions_DesignThinking() { return driver.findElement(Services_TapQASolutions_DesignThinking).getText(); }

    public String getServices_TestServices() { return driver.findElement(Services_TestServices).getText(); }
    public String getServices_TestServices_WebsiteTesting() { return driver.findElement(Services_TestServices_WebsiteTesting).getText(); }
    public String getServices_TestServices_MobileApplicationTesting() { return driver.findElement(Services_TestServices_MobileApplicationTesting).getText(); }
    public String getServices_TestServices_WebServicesTesting() { return driver.findElement(Services_TestServices_WebServicesTesting).getText(); }
    public String getServices_TestServices_DataWarehouseTesting() { return driver.findElement(Services_TestServices_DataWarehouseTesting).getText(); }
    public String getServices_TestServices_ContinuousIntegration() { return driver.findElement(Services_TestServices_ContinuousIntegration).getText(); }
    public String getServices_TestServices_IoTTesting() { return driver.findElement(Services_TestServices_IoTTesting).getText(); }
    public String getServices_TestServices_PackagedSoftwareTesting() { return driver.findElement(Services_TestServices_PackagedSoftwareTesting).getText(); }
    public String getServices_TestServices_MigrationTesting() { return driver.findElement(Services_TestServices_MigrationTesting).getText(); }
    public String getServices_TestServices_AccessibilityTesting() { return driver.findElement(Services_TestServices_AccessibilityTesting).getText(); }
    public String getServices_TestServices_TestDataManagement() { return driver.findElement(Services_TestServices_TestDataManagement).getText(); }
    public String getServices_TestServices_SecurityTesting() { return driver.findElement(Services_TestServices_SecurityTesting).getText(); }
    public String getServices_TestServices_AITesting() { return driver.findElement(Services_TestServices_AITesting).getText(); }
    public String getServices_TestServices_PerformanceTesting() { return driver.findElement(Services_TestServices_PerformanceTesting).getText(); }

    public ServicesPage goTotapQASolutionsPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_tapQASolutions)).click().perform();
        return new ServicesPage(driver);
    }

    public ServicesPage goToTestServiceOfferingsPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices)).click().perform();
        return new ServicesPage(driver);
    }

    public QAStaffAugmentationPage goToQAStaffAugmentationPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_tapQASolutions_QAStaffAugmentation)).click().perform();
        return new QAStaffAugmentationPage(driver);
    }

    public QAStrategyPage goToQAStrategyPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_tapQASolutions_QAStrategy)).click().perform();
        return new QAStrategyPage(driver);
    }

    public TestAutomationPage goToTestAutomationPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_tapQASolutions_TestAutomation)).click().perform();
        return new TestAutomationPage(driver);
    }

    public OnShoreTestingPage goToOnShoreTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_tapQASolutions_OnshoreTesting)).click().perform();
        return new OnShoreTestingPage(driver);
    }

    public AutomationAcceleratorPage goToAutomationAcceleratorPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_tapQASolutions_AutomationAccelerator)).click().perform();
        return new AutomationAcceleratorPage(driver);
    }

    public ContractToHirePage goToContractToHirePage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_tapQASolutions_ContractToHire)).click().perform();
        return new ContractToHirePage(driver);
    }

    public DesignThinkingPage goToDesignThinkingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TapQASolutions_DesignThinking)).click().perform();
        return new DesignThinkingPage(driver);
    }

    public WebsiteTestingPage goToWebsiteTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_WebsiteTesting)).click().perform();
        return new WebsiteTestingPage(driver);
    }

    public MobileApplicationTestingPage goToMobileApplicationTesting() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_MobileApplicationTesting)).click().perform();
        return new MobileApplicationTestingPage(driver);
    }

    public WebServicesTestingPage goToWebServicesTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_WebServicesTesting)).click().perform();
        return new WebServicesTestingPage(driver);
    }

    public DataWarehouseTestingPage goToDataWarehouseTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_DataWarehouseTesting)).click().perform();
        return new DataWarehouseTestingPage(driver);
    }

    public ContinuousIntegrationPage goToContinuousIntegrationPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_ContinuousIntegration)).click().perform();
        return new ContinuousIntegrationPage(driver);
    }

    public IoTTestingPage goToIoTTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_IoTTesting)).click().perform();
        return new IoTTestingPage(driver);
    }

    public PackagedSoftwareTestingPage goToPackagedSoftwareTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_PackagedSoftwareTesting)).click().perform();
        return new PackagedSoftwareTestingPage(driver);
    }

    public MigrationTestingPage goToMigrationTesting() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_MigrationTesting)).click().perform();
        return new MigrationTestingPage(driver);
    }

    public AccessibilityTestingPage goToAccessibilityTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_AccessibilityTesting)).click().perform();
        return new AccessibilityTestingPage(driver);
    }

    public TestDataManagementPage goToTestDataManagementPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_TestDataManagement)).click().perform();
        return new TestDataManagementPage(driver);
    }

    public SecurityTestingPage goToSecurityTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_SecurityTesting)).click().perform();
        return new SecurityTestingPage(driver);
    }

    public ArtificialIntelligenceTestingPage goToArtificialIntelligenceTestingPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_AITesting)).click().perform();
        return new ArtificialIntelligenceTestingPage(driver);
    }

    public PerformanceTestingPage goToPerformanceTesting() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Services_TestServices_PerformanceTesting)).click().perform();
        return new PerformanceTestingPage(driver);
    }
}
