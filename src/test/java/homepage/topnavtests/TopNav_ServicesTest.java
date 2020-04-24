package homepage.topnavtests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.servicespages.ServicesPage;
import pages.servicespages.testserviceofferingspages.*;
import pages.servicespages.tapqasolutionspages.*;
import pages.topnavpages.TopNav_ServicesPage;

import static org.testng.Assert.assertEquals;

public class TopNav_ServicesTest extends BaseTest {

    @Test
    public void verifyServices() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        assertEquals(topNav_ServicesPage.getServices(),"Services");
    }

    @Test
    public void verifytapQASolutions() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_tapQASolutions(),"tapQA Solutions");
    }

    @Test
    public void verifyQAStaffAugmentation() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_tapQASolutions_QAStaffAugmentation(),"QA Staff Augmentation");
    }

    @Test
    public void verifyQAStrategy() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_tapQASolutions_QAStrategy(),"QA Strategy");
    }

    @Test
    public void verifyTestAutomation() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_tapQASolutions_TestAutomation(),"Test Automation");
    }

    @Test
    public void verifyOnshoreTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_tapQASolutions_OnshoreTesting(),"Onshore Testing (tapLAKESHORE)");
    }

    @Test
    public void verifyAutomationAccelerator() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_tapQASolutions_AutomationAccelerator(),"Automation Accelerator");
    }

    @Test
    public void verifyContractToHire() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_tapQASolutions_ContractToHire(),"Contract-To-Hire");
    }

    @Test
    public void verifyDesignThinking() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TapQASolutions_DesignThinking(),"Design Thinking / Humanual Testing");
    }

    @Test
    public void verifyTestServiceOfferings() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices(),"Test Service Offerings");
    }

    @Test
    public void verifyWebsiteTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_WebsiteTesting(),"Website Testing");
    }

    @Test
    public void verifyMobileApplicationTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_MobileApplicationTesting(),"Mobile Application Testing");
    }

    @Test
    public void verifyWebServicesTestings() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_WebServicesTesting(),"Web Services Testing");
    }

    @Test
    public void verifyDataWarehouse_ETLTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_DataWarehouseTesting(),"Data Warehouse / ETL Testing");
    }

    @Test
    public void verifyContinuousIntegration_DevTestOps() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_ContinuousIntegration(),"Continuous Integration & DevTestOps");
    }

    @Test
    public void verifyIoTTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_IoTTesting(),"IoT Testing");
    }

    @Test
    public void verifyPackagedSoftwareImplementationTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_PackagedSoftwareTesting(),"Packaged Software Implementation Testing");
    }

    @Test
    public void verifyMigrationTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_MigrationTesting(),"Migration Testing");
    }

    @Test
    public void verifyAccessibilityTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_AccessibilityTesting(),"Accessibility Testing");
    }

    @Test
    public void verifyTestDataManagement() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_TestDataManagement(),"Test Data Management");
    }

    @Test
    public void verifySecurityTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_SecurityTesting(),"Security Testing");
    }

    @Test
    public void verifyArtificialIntelligenceTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_AITesting(),"Artificial Intelligence Testing");
    }

    @Test
    public void verifyPerformanceTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        assertEquals(topNav_ServicesPage.getServices_TestServices_PerformanceTesting(),"Performance Testing");
    }

    @Test
    public void goTotapQASolutionsPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        ServicesPage servicesPage = topNav_ServicesPage.goTotapQASolutionsPage();
        assertEquals(servicesPage.getTapQASolutions_Header(), "tapQA Solutions");
    }

    @Test
    public void goToTestServiceOfferings() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        ServicesPage servicesPage = topNav_ServicesPage.goToTestServiceOfferingsPage();
        assertEquals(servicesPage.getTestServiceOfferings_Header(), "Test Service Offerings");
    }

    @Test
    public void goToQAStaffAugmentationPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        QAStaffAugmentationPage qaStaffAugmentationPage = topNav_ServicesPage.goToQAStaffAugmentationPage();
        assertEquals(qaStaffAugmentationPage.getHeader(), "QA Staff Augmentation");
    }

    @Test
    public void goToQAStrategyPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        QAStrategyPage qaStrategyPage = topNav_ServicesPage.goToQAStrategyPage();
        assertEquals(qaStrategyPage.getHeader(), "QA Strategy");
    }

    @Test
    public void goToTestAutomationPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        TestAutomationPage testAutomationPage = topNav_ServicesPage.goToTestAutomationPage();
        assertEquals(testAutomationPage.getHeader(), "Test Automation");
    }

    @Test
    public void goToOnShoreTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        OnShoreTestingPage onshoreTestingPage = topNav_ServicesPage.goToOnShoreTestingPage();
        assertEquals(onshoreTestingPage.getHeader(), "Onshore Testing (tapLAKESHORE)");
    }

    @Test
    public void goToAutomationAcceleratorPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        AutomationAcceleratorPage automationAcceleratorPage = topNav_ServicesPage.goToAutomationAcceleratorPage();
        assertEquals(automationAcceleratorPage.getHeader(), "Automation Accelerator");
    }

    @Test
    public void goToContractToHirePage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        ContractToHirePage contractToHirePage = topNav_ServicesPage.goToContractToHirePage();
        assertEquals(contractToHirePage.getHeader(), "Contract-To-Hire");
    }

    @Test
    public void goToDesignThinkingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        DesignThinkingPage designThinkingPage = topNav_ServicesPage.goToDesignThinkingPage();
        assertEquals(designThinkingPage.getHeader(), "Design Thinking / Humanual Testing");
    }

    @Test
    public void goToWebSiteTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        WebsiteTestingPage websiteTestingPage = topNav_ServicesPage.goToWebsiteTestingPage();
        assertEquals(websiteTestingPage.getHeader(), "Website Testing");
    }

    @Test
    public void goToMobileApplicationTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        MobileApplicationTestingPage mobileApplicationTestingPage = topNav_ServicesPage.goToMobileApplicationTesting();
        assertEquals(mobileApplicationTestingPage.getHeader(), "Mobile Application Testing");
    }

    @Test
    public void goToWebServicesTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        WebServicesTestingPage webServicesTestingPage = topNav_ServicesPage.goToWebServicesTestingPage();
        assertEquals(webServicesTestingPage.getHeader(), "Web Services Testing");
    }

    @Test
    public void goToDataWarehouseTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        DataWarehouseTestingPage dataWarehouseTestingPage = topNav_ServicesPage.goToDataWarehouseTestingPage();
        assertEquals(dataWarehouseTestingPage.getHeader(), "Data Warehouse / ETL Testing");
    }

    @Test
    public void goToContinousIntegration() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        ContinuousIntegrationPage continuousIntegrationPage = topNav_ServicesPage.goToContinuousIntegrationPage();
        assertEquals(continuousIntegrationPage.getHeader(), "Continuous Integration & DevTestOps");
    }

    @Test
    public void goToIoTTesting() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        IoTTestingPage ioTTestingPage = topNav_ServicesPage.goToIoTTestingPage();
        assertEquals(ioTTestingPage.getHeader(), "IoT Testing");
    }

    @Test
    public void goToPackagedSoftwareImplementationTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        PackagedSoftwareTestingPage packagedSoftwareTestingPage = topNav_ServicesPage.goToPackagedSoftwareTestingPage();
        assertEquals(packagedSoftwareTestingPage.getHeader(), "Packaged / Enterprise Software Implementation Testing");
    }

    @Test
    public void goToMigrationTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        MigrationTestingPage migrationTestingPage = topNav_ServicesPage.goToMigrationTesting();
        assertEquals(migrationTestingPage.getHeader(), "Migration Testing");
    }

    @Test
    public void goToAccessibilityTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        AccessibilityTestingPage accessibilityTestingPage = topNav_ServicesPage.goToAccessibilityTestingPage();
        assertEquals(accessibilityTestingPage.getHeader(), "Accessibility Testing");
    }

    @Test
    public void goToTestDataManagementPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        TestDataManagementPage testDataManagementPage = topNav_ServicesPage.goToTestDataManagementPage();
        assertEquals(testDataManagementPage.getHeader(), "Test Data Management");
    }

    @Test
    public void goToSecurityTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        SecurityTestingPage securityTestingPage = topNav_ServicesPage.goToSecurityTestingPage();
        assertEquals(securityTestingPage.getHeader(), "Security Testing");
    }

    @Test
    public void goToArtificialIntelligenceTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        ArtificialIntelligenceTestingPage artificialIntelligenceTestingPage = topNav_ServicesPage.goToArtificialIntelligenceTestingPage();
        assertEquals(artificialIntelligenceTestingPage.getHeader(), "Artificial Intelligence Testing");
    }

    @Test
    public void goToPerformanceTestingPage() {
        TopNav_ServicesPage topNav_ServicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_ServicesPage.hoverOverServices();
        PerformanceTestingPage performanceTestingPage = topNav_ServicesPage.goToPerformanceTesting();
        assertEquals(performanceTestingPage.getHeader(), "Performance Testing");
    }
}
