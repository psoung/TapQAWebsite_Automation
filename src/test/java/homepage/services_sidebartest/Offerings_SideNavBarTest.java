package homepage.services_sidebartest;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.servicespages.Offerings_SideNavBarPage;
import pages.servicespages.ServicesPage;
import pages.servicespages.testserviceofferingspages.*;
import pages.topnavpages.TopNav_ServicesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Offerings_SideNavBarTest extends BaseTest {

    @Test
    public void verifyOfferings_SideNavBar() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        Offerings_SideNavBarPage offerings_SideNavBarPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage();
        assertEquals(offerings_SideNavBarPage.getTestServiceOfferings(),"Test Service Offerings");
        assertEquals(offerings_SideNavBarPage.getWebsiteTesting(),"Website Testing");
        assertEquals(offerings_SideNavBarPage.getMobileApplicationTesting(),"Mobile Application Testing");
        assertEquals(offerings_SideNavBarPage.getWebServicesTesting(),"Web Services Testing");
        assertEquals(offerings_SideNavBarPage.getDataWarehouseTesting(),"Data Warehouse / ETL Testing");
        assertEquals(offerings_SideNavBarPage.getContinuousIntegration(),"Continuous Integration & DevTestOps");
        assertEquals(offerings_SideNavBarPage.getIoTTesting(),"IoT Testing");
        assertEquals(offerings_SideNavBarPage.getPackagedSoftwareTesting(),"Packaged Software Implementation Testing");
        assertEquals(offerings_SideNavBarPage.getMigrationTesting(),"Migration Testing");
        assertEquals(offerings_SideNavBarPage.getAccessibilityTesting(),"Accessibility Testing");
        assertEquals(offerings_SideNavBarPage.getTestDataManagement(),"Test Data Management");
        assertEquals(offerings_SideNavBarPage.getSecurityTesting(),"Security Testing");
        assertEquals(offerings_SideNavBarPage.getArtificialIntelligenceTesting(),"Artificial Intelligence Testing");
        assertEquals(offerings_SideNavBarPage.getPerformanceTesting(),"Performance Testing");
        assertEquals(offerings_SideNavBarPage.getTapQASolutions_Text(),"tapQA Solutions");
        assertTrue(offerings_SideNavBarPage.verifyTapQASolutions_Button(),"TapQA Solutions Button is missing");
    }

    @Test
    public void goToTestServiceOfferings() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        ServicesPage servicesPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToTestServiceOfferings();
        assertEquals(servicesPage.getTestServiceOfferings_Header(),"Test Service Offerings");
    }

    @Test
    public void goToWebsiteTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        WebsiteTestingPage websiteTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToWebsiteTestingPage();
        assertEquals(websiteTestingPage.getHeader(),"Website Testing");
    }

    @Test
    public void goToMobileApplicationTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        MobileApplicationTestingPage mobileApplicationTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToMobileApplicationTestingPage();
        assertEquals(mobileApplicationTestingPage.getHeader(),"Mobile Application Testing");
    }

    @Test
    public void goToWebServicesTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        WebServicesTestingPage webServicesTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToWebServicesTestingPage();
        assertEquals(webServicesTestingPage.getHeader(),"Web Services Testing");
    }

    @Test
    public void goToDataWarehouseTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        DataWarehouseTestingPage dataWarehouseTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToDataWarehouseTestingPage();
        assertEquals(dataWarehouseTestingPage.getHeader(),"Data Warehouse / ETL Testing");
    }

    @Test
    public void goToContinuousIntegrationPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        ContinuousIntegrationPage continuousIntegrationPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToContinuousIntegrationPage();
        assertEquals(continuousIntegrationPage.getHeader(),"Continuous Integration & DevTestOps");
    }

    @Test
    public void goToIoTTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        IoTTestingPage ioTTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToIoTTestingPage();
        assertEquals(ioTTestingPage.getHeader(),"IoT Testing");
    }

    @Test
    public void goToPackagedSoftwareTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        PackagedSoftwareTestingPage packagedSoftwareTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToPackagedSoftwareTestingPage();
        assertEquals(packagedSoftwareTestingPage.getHeader(),"Packaged / Enterprise Software Implementation Testing");
    }

    @Test
    public void goToMigrationTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        MigrationTestingPage migrationTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToMigrationTestingPage();
        assertEquals(migrationTestingPage.getHeader(),"Migration Testing");
    }

    @Test
    public void goToAccessibilityTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        AccessibilityTestingPage accessibilityTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToAccessibilityTestingPage();
        assertEquals(accessibilityTestingPage.getHeader(),"Accessibility Testing");
    }

    @Test
    public void goToTestDataManagementPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        TestDataManagementPage testDataManagementPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToTestDataManagementPage();
        assertEquals(testDataManagementPage.getHeader(),"Test Data Management");
    }

    @Test
    public void goToSecurityTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        SecurityTestingPage securityTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToSecurityTestingPage();
        assertEquals(securityTestingPage.getHeader(),"Security Testing");
    }

    @Test
    public void goToArtificialIntelligenceTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        ArtificialIntelligenceTestingPage artificialIntelligenceTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToArtificialIntelligenceTestingPage();
        assertEquals(artificialIntelligenceTestingPage.getHeader(),"Artificial Intelligence Testing");
    }

    @Test
    public void goToPerformanceTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        PerformanceTestingPage performanceTestingPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToPerfomanceTestingPage();
        assertEquals(performanceTestingPage.getHeader(),"Performance Testing");
    }

    @Test
    public void goToTapQASolutions() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        ServicesPage servicesPage = topNav_servicesPage.goToWebsiteTestingPage().goToOfferings_SideNavBarPage().goToTapQASolutions();
        assertEquals(servicesPage.getTapQASolutions_Header(),"tapQA Solutions");
    }

}
