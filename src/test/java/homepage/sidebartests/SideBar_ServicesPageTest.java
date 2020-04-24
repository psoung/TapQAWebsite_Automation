package homepage.sidebartests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.servicespages.ServicesPage;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_ServicesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SideBar_ServicesPageTest extends BaseTest {

    @Test
    public void verifyServicesTab() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        assertEquals(sideBar_ServicesPage.getTapQASolutions(),"tapQA Solutions");
        assertEquals(sideBar_ServicesPage.getTestServiceOfferings(),"Test Service Offerings");
        assertTrue(sideBar_ServicesPage.verifyTapQASolutions_PlusButton(),"tapQASolutions plus button is missing");
        assertTrue(sideBar_ServicesPage.verifyTestServiceOfferings_PlusButton(),"Test Service Offerings plus button is missing");
        sideBarPage.closeServicesTab();
        sideBarPage.goToHomePage();
        sideBarPage.waitForXButton_Disappear();
    }

    @Test
    public void verifyTapQASolutions() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        assertEquals(sideBar_ServicesPage.getTapQASolutions_QAStaffAugmentation(),"QA Staff Augmentation");
        assertEquals(sideBar_ServicesPage.getTapQASolutions_QAStrategy(),"QA Strategy");
        assertEquals(sideBar_ServicesPage.getTapQASolutions_TestAutomation(),"Test Automation");
        assertEquals(sideBar_ServicesPage.getTapQASolutions_OnshoreTesting(),"Onshore Testing (tapLAKESHORE)");
        assertEquals(sideBar_ServicesPage.getTapQASolutions_AutomationAccelerator(),"Automation Accelerator");
        assertEquals(sideBar_ServicesPage.getTapQASolutions_ContractToHire(),"Contract-To-Hire");
        assertEquals(sideBar_ServicesPage.getTapQASolutions_DesignThinking(),"Design Thinking / Humanual Testing");
        sideBarPage = sideBar_ServicesPage.goToSideBarPageFromTapQASolutions();
        sideBarPage.closeServicesTab();
        sideBarPage.goToHomePage();
        sideBarPage.waitForXButton_Disappear();
    }

    @Test
    public void verifyTestServiceOfferings() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTestServiceOfferingsTab();
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
        sideBarPage = sideBar_ServicesPage.goToSideBarPageFromTestServiceOfferings();
        sideBarPage.closeServicesTab();
        sideBarPage.goToHomePage();
        sideBarPage.waitForXButton_Disappear();
    }

    @Test
    public void goToTapQASolutionsPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        ServicesPage servicesPage = sideBar_ServicesPage.goToTapQASolutions();
        assertEquals(servicesPage.getTapQASolutions_Header(),"tapQA Solutions");
    }

    @Test
    public void goToTestServiceOfferingsPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        ServicesPage servicesPage = sideBar_ServicesPage.goToTestServiceOfferings();
        assertEquals(servicesPage.getTestServiceOfferings_Header(),"Test Service Offerings");
    }

}
