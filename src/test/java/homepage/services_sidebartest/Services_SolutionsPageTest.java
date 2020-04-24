package homepage.services_sidebartest;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.servicespages.ServicesPage;
import pages.servicespages.Solutions_SideNavBarPage;
import pages.servicespages.tapqasolutionspages.*;
import pages.topnavpages.TopNav_ServicesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Services_SolutionsPageTest extends BaseTest {

    @Test
    public void verifySolutions_SideNavBar() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        Solutions_SideNavBarPage solutions_SideNavBarPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage();
        assertEquals(solutions_SideNavBarPage.getTapQASolutions(),"TapQA Solutions");
        assertEquals(solutions_SideNavBarPage.getQAStaffAugmentation(),"QA Staff Augmentation");
        assertEquals(solutions_SideNavBarPage.getQAStrategy(),"QA Strategy");
        assertEquals(solutions_SideNavBarPage.getTestAutomation(),"Test Automation");
        assertEquals(solutions_SideNavBarPage.getOnshoreTesting(),"Onshore Testing (tapLAKESHORE)");
        assertEquals(solutions_SideNavBarPage.getAutomationAccelerator(),"Automation Accelerator");
        assertEquals(solutions_SideNavBarPage.getContractToHire(),"Contract-To-Hire");
        assertEquals(solutions_SideNavBarPage.getDesignThinking(),"Design Thinking / Humanual Testing");
        assertEquals(solutions_SideNavBarPage.getTestServiceOfferings_Text(),"Test Service Offerings");
        assertTrue(solutions_SideNavBarPage.verifyTestServiceOfferings_Button()," The Test Services Offering Button is missing");
    }

    @Test
    public void goToTapQASolutionsPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        ServicesPage servicesPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToTapQASolutions();
        assertEquals(servicesPage.getTestServiceOfferings_Header(),"Test Service Offerings");
    }

    @Test
    public void goToQAStaffAugmentationPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        QAStaffAugmentationPage qaStaffAugmentationPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToQAStaffAugmentationPage();
        assertEquals(qaStaffAugmentationPage.getHeader(),"QA Staff Augmentation");
    }

    @Test
    public void goToQAStrategyPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        QAStrategyPage qaStrategyPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToQAStrategy();
        assertEquals(qaStrategyPage.getHeader(),"QA Strategy");
    }

    @Test
    public void goToTestAutomationPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        TestAutomationPage testAutomationPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToTestAutomationPage();
        assertEquals(testAutomationPage.getHeader(),"Test Automation");
    }

    @Test
    public void goToOnshoreTestingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        OnShoreTestingPage onShoreTestingPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToOnshoreTestingPage();
        assertEquals(onShoreTestingPage.getHeader(),"Onshore Testing (tapLAKESHORE)");
    }

    @Test
    public void goToAutomationAcceleratorPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        AutomationAcceleratorPage automationAcceleratorPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToAutomationAcceleratorPage();
        assertEquals(automationAcceleratorPage.getHeader(),"Automation Accelerator");
    }

    @Test
    public void goToContractToHirePage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        ContractToHirePage contractToHirePage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToContractToHirePage();
        assertEquals(contractToHirePage.getHeader(),"Contract-To-Hire");
    }

    @Test
    public void goToDesignThinkingPage() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        DesignThinkingPage designThinkingPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToDesignThinkingPage();
        assertEquals(designThinkingPage.getHeader(),"Design Thinking / Humanual Testing");
    }

    @Test
    public void goToTestServiceOfferings() {
        TopNav_ServicesPage topNav_servicesPage = homePage.goToTopNavPage().goToTopNav_ServicesPage();
        topNav_servicesPage.hoverOverServices();
        ServicesPage servicesPage = topNav_servicesPage.goToQAStaffAugmentationPage().goToSolutions_SideNavBarPage().goToTestServiceOfferings();
        assertEquals(servicesPage.getTestServiceOfferings_Header(),"Test Service Offerings");
    }

}
