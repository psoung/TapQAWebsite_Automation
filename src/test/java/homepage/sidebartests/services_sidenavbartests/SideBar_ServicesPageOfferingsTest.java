package homepage.sidebartests.services_sidenavbartests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.servicespages.testserviceofferingspages.*;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_ServicesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SideBar_ServicesPageOfferingsTest extends BaseTest {

    @Test
    public void verifySideBar_ServiceOfferings() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings(),"Test Service Offerings");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_WebsiteTesting(),"Website Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_MobileApplicationTesting(),"Mobile Application Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_WebServicesTesting(),"Web Services Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_DataWarehouseTesting(),"Data Warehouse / ETL Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_ContinuousIntegration(),"Continuous Integration & DevTestOps");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_IoTTesting(),"IoT Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_PackagedSoftwareTesting(),"Packaged Software Implementation Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_MigrationTesting(),"Migration Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_Accessibility(),"Accessibility Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_TestDataManagement(),"Test Data Management");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_SecurityTesting(),"Security Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_AITesting(),"Artificial Intelligence Testing");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings_PerformanceTesting(),"Performance Testing");
        assertTrue(sideBar_ServicesPage.verifyTapQASolutions_PlusButton(),"TapQA Solutions Button is missing");
        sideBarPage = sideBar_ServicesPage.goToSideBarPageFromTestServiceOfferings();
        sideBarPage.closeServicesTab();
        sideBarPage.goToHomePage();
        sideBarPage.waitForXButton_Disappear();
    }

    @Test
    public void goToWebsiteTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        WebsiteTestingPage websiteTestingPage = sideBar_ServicesPage.goToWebsiteTestingPage();
        assertEquals(websiteTestingPage.getHeader(),"Website Testing");
    }

    @Test
    public void goToMobileApplicationTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        MobileApplicationTestingPage mobileApplicationTestingPage = sideBar_ServicesPage.goToMobileApplicationTestingPage();
        assertEquals(mobileApplicationTestingPage.getHeader(),"Mobile Application Testing");
    }

    @Test
    public void goToWebServicesTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        WebServicesTestingPage webServicesTestingPage = sideBar_ServicesPage.goToWebServicesTestingPage();
        assertEquals(webServicesTestingPage.getHeader(),"Web Services Testing");
    }

    @Test
    public void goToDataWarehouseTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        DataWarehouseTestingPage dataWarehouseTestingPage = sideBar_ServicesPage.goToDataWarehouseTestingPage();
        assertEquals(dataWarehouseTestingPage.getHeader(),"Data Warehouse / ETL Testing");
    }

    @Test
    public void goToContinuousIntegrationPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        ContinuousIntegrationPage continuousIntegrationPage = sideBar_ServicesPage.goToContinuousIntegrationPage();
        assertEquals(continuousIntegrationPage.getHeader(),"Continuous Integration & DevTestOps");
    }

    @Test
    public void goToIoTTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        IoTTestingPage ioTTestingPage = sideBar_ServicesPage.goToIoTTestingPage();
        assertEquals(ioTTestingPage.getHeader(),"IoT Testing");
    }

    @Test
    public void goToPackagedSoftwareTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        PackagedSoftwareTestingPage packagedSoftwareTestingPage = sideBar_ServicesPage.goToPackagedSoftwareTestingPage();
        assertEquals(packagedSoftwareTestingPage.getHeader(),"Packaged / Enterprise Software Implementation Testing");
    }

    @Test
    public void goToMigrationTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        MigrationTestingPage migrationTestingPage = sideBar_ServicesPage.goToMigrationTestingPage();
        assertEquals(migrationTestingPage.getHeader(),"Migration Testing");
    }

    @Test
    public void goToAccessibilityTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        AccessibilityTestingPage accessibilityTestingPage = sideBar_ServicesPage.goToAccessibilityTestingPage();
        assertEquals(accessibilityTestingPage.getHeader(),"Accessibility Testing");
    }

    @Test
    public void goToTestDataManagementPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        TestDataManagementPage testDataManagementPage = sideBar_ServicesPage.goToTestDataManagementPage();
        assertEquals(testDataManagementPage.getHeader(),"Test Data Management");
    }

    @Test
    public void goToSecurityTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        SecurityTestingPage securityTestingPage = sideBar_ServicesPage.goToSecurityTestingPage();
        assertEquals(securityTestingPage.getHeader(),"Security Testing");
    }

    @Test
    public void goToArtificialIntelligenceTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        ArtificialIntelligenceTestingPage artificialIntelligenceTestingPage = sideBar_ServicesPage.goToArtificialIntelligenceTestingPage();
        assertEquals(artificialIntelligenceTestingPage.getHeader(),"Artificial Intelligence Testing");
    }

    @Test
    public void goToPerformanceTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
        PerformanceTestingPage performanceTestingPage = sideBar_ServicesPage.goToPerformanceTestingPage();
        assertEquals(performanceTestingPage.getHeader(),"Performance Testing");
    }

}
