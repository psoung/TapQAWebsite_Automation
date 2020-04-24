package homepage.sidebartests.services_sidenavbartests;

import basetest.BaseTest;
import org.testng.annotations.Test;

import pages.servicespages.ServicesPage;
import pages.servicespages.tapqasolutionspages.*;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_ServicesPage;
import pages.topnavpages.TopNav_ServicesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SideBar_ServicesPageSolutionsTest extends BaseTest {

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
    public void goToQAStaffAugmentation() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        QAStaffAugmentationPage qaStaffAugmentationPage = sideBar_ServicesPage.goToQAStaffAugmentationPage();
        assertEquals(qaStaffAugmentationPage.getHeader(),"QA Staff Augmentation");
    }

    @Test
    public void goToQAStrategy() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        QAStrategyPage qaStrategyPage = sideBar_ServicesPage.goToQAStrategyPage();
        assertEquals(qaStrategyPage.getHeader(),"QA Strategy");
    }

    @Test
    public void goToTestAutomation() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        TestAutomationPage testAutomationPage = sideBar_ServicesPage.goToTestAutomationPage();
        assertEquals(testAutomationPage.getHeader(),"Test Automation");
    }

    @Test
    public void goToOnshoreTestingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        OnShoreTestingPage onShoreTestingPage = sideBar_ServicesPage.goToOnShoreTestingPage();
        assertEquals(onShoreTestingPage.getHeader(),"Onshore Testing (tapLAKESHORE)");
    }

    @Test
    public void goToAutomationAcceleratorPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        AutomationAcceleratorPage automationAcceleratorPage = sideBar_ServicesPage.goToAutomationAcceleratorPage();
        assertEquals(automationAcceleratorPage.getHeader(),"Automation Accelerator");
    }

    @Test
    public void goToContractToHirePage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        ContractToHirePage contractToHirePage = sideBar_ServicesPage.goToContractToHirePage();
        assertEquals(contractToHirePage.getHeader(),"Contract-To-Hire");
    }

    @Test
    public void goToDesignThinkingPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_ServicesPage sideBar_ServicesPage = sideBarPage.openServicesTab();
        sideBar_ServicesPage.waitForTestServiceOfferings();
        sideBar_ServicesPage.openTapQASolutionsTab();
        DesignThinkingPage designThinkingPage = sideBar_ServicesPage.goToDesignThinkingPage();
        assertEquals(designThinkingPage.getHeader(),"Design Thinking / Humanual Testing");
    }
}
