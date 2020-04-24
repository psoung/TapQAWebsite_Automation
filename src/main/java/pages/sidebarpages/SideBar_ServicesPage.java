package pages.sidebarpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.industriespages.IoTPage;
import pages.servicespages.ServicesPage;
import pages.servicespages.tapqasolutionspages.*;
import pages.servicespages.testserviceofferingspages.*;

public class SideBar_ServicesPage {
    private WebDriver driver;

    private By tapQASolutions = By.xpath("//*[@id=\"menu-item-5273\"]/div/a/span");
    private By tapQASolutions_PlusButton = By.xpath("//*[@id=\"menu-item-5273\"]/div/a/span/span");
    private By tapQASolutions_QAStaffAugmentation = By.xpath("//*[@id=\"menu-item-373\"]/a/span");
    private By tapQASolutions_QAStrategy = By.xpath("//*[@id=\"menu-item-370\"]/a/span");
    private By tapQASolutions_TestAutomation = By.xpath("//*[@id=\"menu-item-371\"]/a/span");
    private By tapQASolutions_OnshoreTesting = By.xpath("//*[@id=\"menu-item-369\"]/a/span");
    private By tapQASolutions_AutomationAccelerator = By.xpath("//*[@id=\"menu-item-5088\"]/a/span");
    private By tapQASolutions_ContractToHire = By.xpath("//*[@id=\"menu-item-374\"]/a/span");
    private By tapQASolutions_DesignThinking = By.xpath("//*[@id=\"menu-item-386\"]/a/span");

    private By TestServiceOfferings = By.xpath("//*[@id=\"menu-item-5274\"]/div/a/span");
    private By TestServiceOfferings_PlusButton = By.xpath("//*[@id=\"menu-item-5274\"]/div/a/span/span");
    private By TestServiceOfferings_WebsiteTesting = By.xpath("//*[@id=\"menu-item-375\"]/a/span");
    private By TestServiceOfferings_MobileApplicationTesting = By.xpath("//*[@id=\"menu-item-379\"]/a/span");
    private By TestServiceOfferings_WebServicesTesting = By.xpath("//*[@id=\"menu-item-376\"]/a/span");
    private By TestServiceOfferings_DataWarehouseTesting = By.xpath("//*[@id=\"menu-item-377\"]/a/span");
    private By TestServiceOfferings_ContinuousIntegration = By.xpath("//*[@id=\"menu-item-5032\"]/a/span");
    private By TestServiceOfferings_IoTTesting = By.xpath("//*[@id=\"menu-item-382\"]/a/span");
    private By TestServiceOfferings_PackagedSoftwareTesting = By.xpath("//*[@id=\"menu-item-5085\"]");
    private By TestServiceOfferings_MigrationTesting = By.xpath("//*[@id=\"menu-item-385\"]/a/span");
    private By TestServiceOfferings_AccessibilityTesting = By.xpath("//*[@id=\"menu-item-5084\"]/a/span");
    private By TestServiceOfferings_TestDataManagement = By.xpath("//*[@id=\"menu-item-384\"]/a/span");
    private By TestServiceOfferings_SecurityTesting = By.xpath("//*[@id=\"menu-item-5083\"]/a/span");
    private By TestServiceOfferings_AITesting = By.xpath("//*[@id=\"menu-item-5533\"]/a/span");
    private By TestServiceOfferings_PerformanceTesting = By.xpath("//*[@id=\"menu-item-5609\"]/a/span");

    public SideBar_ServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForTestServiceOfferings() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(TestServiceOfferings)));
    }

    public void openTapQASolutionsTab() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_PlusButton)).click().perform();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tapQASolutions_DesignThinking)));
    }

    public void openTestServiceOfferingsTab() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_PlusButton)).click().perform();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(TestServiceOfferings_PerformanceTesting)));
    }

    public SideBarPage goToSideBarPageFromTapQASolutions() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_PlusButton)).click().perform();
        return new SideBarPage(driver);
    }

    public SideBarPage goToSideBarPageFromTestServiceOfferings() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_PlusButton)).click().perform();
        return new SideBarPage(driver);
    }


    public String getTapQASolutions() { return driver.findElement(tapQASolutions).getText(); }
    public Boolean verifyTapQASolutions_PlusButton() { return driver.findElement(tapQASolutions_PlusButton).isDisplayed(); }
    public String getTapQASolutions_QAStaffAugmentation() { return driver.findElement(tapQASolutions_QAStaffAugmentation).getText(); }
    public String getTapQASolutions_QAStrategy() { return driver.findElement(tapQASolutions_QAStrategy).getText(); }
    public String getTapQASolutions_TestAutomation() { return driver.findElement(tapQASolutions_TestAutomation).getText(); }
    public String getTapQASolutions_OnshoreTesting() { return driver.findElement(tapQASolutions_OnshoreTesting).getText(); }
    public String getTapQASolutions_AutomationAccelerator() { return driver.findElement(tapQASolutions_AutomationAccelerator).getText(); }
    public String getTapQASolutions_ContractToHire() { return driver.findElement(tapQASolutions_ContractToHire).getText(); }
    public String getTapQASolutions_DesignThinking() { return driver.findElement(tapQASolutions_DesignThinking).getText(); }

    public String getTestServiceOfferings() { return driver.findElement(TestServiceOfferings).getText(); }
    public Boolean verifyTestServiceOfferings_PlusButton() { return driver.findElement(TestServiceOfferings_PlusButton).isDisplayed(); }
    public String getTestServiceOfferings_WebsiteTesting() { return driver.findElement(TestServiceOfferings_WebsiteTesting).getText(); }
    public String getTestServiceOfferings_MobileApplicationTesting() { return driver.findElement(TestServiceOfferings_MobileApplicationTesting).getText(); }
    public String getTestServiceOfferings_WebServicesTesting() { return driver.findElement(TestServiceOfferings_WebServicesTesting).getText(); }
    public String getTestServiceOfferings_DataWarehouseTesting() { return driver.findElement(TestServiceOfferings_DataWarehouseTesting).getText(); }
    public String getTestServiceOfferings_ContinuousIntegration() { return driver.findElement(TestServiceOfferings_ContinuousIntegration).getText(); }
    public String getTestServiceOfferings_IoTTesting() { return driver.findElement(TestServiceOfferings_IoTTesting).getText(); }
    public String getTestServiceOfferings_PackagedSoftwareTesting() { return driver.findElement(TestServiceOfferings_PackagedSoftwareTesting).getText(); }
    public String getTestServiceOfferings_MigrationTesting() { return driver.findElement(TestServiceOfferings_MigrationTesting).getText(); }
    public String getTestServiceOfferings_Accessibility() { return driver.findElement(TestServiceOfferings_AccessibilityTesting).getText(); }
    public String getTestServiceOfferings_TestDataManagement() { return driver.findElement(TestServiceOfferings_TestDataManagement).getText(); }
    public String getTestServiceOfferings_SecurityTesting() { return driver.findElement(TestServiceOfferings_SecurityTesting).getText(); }
    public String getTestServiceOfferings_AITesting() { return driver.findElement(TestServiceOfferings_AITesting).getText(); }
    public String getTestServiceOfferings_PerformanceTesting() { return driver.findElement(TestServiceOfferings_PerformanceTesting).getText(); }

    public QAStaffAugmentationPage goToQAStaffAugmentationPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_QAStaffAugmentation)).click().perform();
        return new QAStaffAugmentationPage(driver);
    }

    public QAStrategyPage goToQAStrategyPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_QAStrategy)).click().perform();
        return new QAStrategyPage(driver);
    }

    public TestAutomationPage goToTestAutomationPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_TestAutomation)).click().perform();
        return new TestAutomationPage(driver);
    }

    public OnShoreTestingPage goToOnShoreTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_OnshoreTesting)).click().perform();
        return new OnShoreTestingPage(driver);
    }

    public AutomationAcceleratorPage goToAutomationAcceleratorPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_AutomationAccelerator)).click().perform();
        return new AutomationAcceleratorPage(driver);
    }

    public ContractToHirePage goToContractToHirePage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_ContractToHire)).click().perform();
        return new ContractToHirePage(driver);
    }

    public DesignThinkingPage goToDesignThinkingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions_DesignThinking)).click().perform();
        return new DesignThinkingPage(driver);
    }

    public WebsiteTestingPage goToWebsiteTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_WebsiteTesting)).click().perform();
        return new WebsiteTestingPage(driver);
    }

    public MobileApplicationTestingPage goToMobileApplicationTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_MobileApplicationTesting)).click().perform();
        return new MobileApplicationTestingPage(driver);
    }

    public WebServicesTestingPage goToWebServicesTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_WebServicesTesting)).click().perform();
        return new WebServicesTestingPage(driver);
    }

    public DataWarehouseTestingPage goToDataWarehouseTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_DataWarehouseTesting)).click().perform();
        return new DataWarehouseTestingPage(driver);
    }

    public ContinuousIntegrationPage goToContinuousIntegrationPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_ContinuousIntegration)).click().perform();
        return new ContinuousIntegrationPage(driver);
    }

    public IoTTestingPage goToIoTTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_IoTTesting)).click().perform();
        return new IoTTestingPage(driver);
    }

    public PackagedSoftwareTestingPage goToPackagedSoftwareTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_PackagedSoftwareTesting)).click().perform();
        return new PackagedSoftwareTestingPage(driver);
    }

    public MigrationTestingPage goToMigrationTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_MigrationTesting)).click().perform();
        return new MigrationTestingPage(driver);
    }

    public AccessibilityTestingPage goToAccessibilityTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_AccessibilityTesting)).click().perform();
        return new AccessibilityTestingPage(driver);
    }

    public TestDataManagementPage goToTestDataManagementPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_TestDataManagement)).click().perform();
        return new TestDataManagementPage(driver);
    }

    public SecurityTestingPage goToSecurityTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_SecurityTesting)).click().perform();
        return new SecurityTestingPage(driver);
    }

    public ArtificialIntelligenceTestingPage goToArtificialIntelligenceTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_AITesting)).click().perform();
        return new ArtificialIntelligenceTestingPage(driver);
    }

    public PerformanceTestingPage goToPerformanceTestingPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings_PerformanceTesting)).click().perform();
        return new PerformanceTestingPage(driver);
    }

    public ServicesPage goToTapQASolutions() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tapQASolutions)).click().click().perform();
        return new ServicesPage(driver);
    }

    public ServicesPage goToTestServiceOfferings() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(TestServiceOfferings)).click().click().perform();
        return new ServicesPage(driver);
    }

}
