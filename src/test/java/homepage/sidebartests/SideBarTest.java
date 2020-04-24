package homepage.sidebartests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.KnowledgeCenterPage;
import pages.PartnersPage;
import pages.aboutpages.AboutPage;
import pages.careerspages.CareersPage;
import pages.industriespages.IndustriesPage;
import pages.servicespages.ServicesPage;
import pages.sidebarpages.SideBarPage;

import java.security.Provider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SideBarTest extends BaseTest {

    @Test
    public void verifySideBar() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        assertEquals(sideBarPage.getServices(),"Services");
        assertTrue(sideBarPage.verifyServices_PlusButton(),"Services Plus Button is missing.");
        assertEquals(sideBarPage.getIndustries(),"Industries");
        assertTrue(sideBarPage.verifyIndustries_PlusButton(),"Industries Plus Button is missing.");
        assertEquals(sideBarPage.getCareers(),"Careers");
        assertTrue(sideBarPage.verifyCareers_PlusButton(),"Careers Plus Button is missing.");
        assertEquals(sideBarPage.getPartners(),"Partners");
        assertEquals(sideBarPage.getKnowledgeCenter(),"Knowledge Center");
        assertTrue(sideBarPage.verifyKnowledgeCenter_PlusButton(),"Knowledge Center Plus Button is missing.");
        assertEquals(sideBarPage.getKnowledgeCenter(),"Knowledge Center");
        assertTrue(sideBarPage.verifyKnowledgeCenter_PlusButton(),"Knowledge Center Plus Button is missing.");
        assertEquals(sideBarPage.getContact(),"Contact");
        sideBarPage.goToHomePage();
        sideBarPage.waitForXButton_Disappear();
    }

    @Test
    public void goToServicesPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        ServicesPage servicesPage = sideBarPage.goToServicesPage();
        assertEquals(servicesPage.getHeader(),"Services");
    }

    @Test
    public void goToIndustriesPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        IndustriesPage industriesPage = sideBarPage.goToIndustriesPage();
        assertEquals(industriesPage.getHeader(),"Industries");
    }

    @Test
    public void goToCareersPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        CareersPage careersPage = sideBarPage.goToCareersPage();
        assertEquals(careersPage.getHeader(),"Careers");
    }

    @Test
    public void goToPartnersPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        PartnersPage partnersPage = sideBarPage.goToPartnersPage();
        assertEquals(partnersPage.getHeader(),"Partners");
    }

    @Test
    public void goToKnowledgeCenterPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        KnowledgeCenterPage knowledgeCenterPage = sideBarPage.goToKnowledgeCenter();
        assertEquals(knowledgeCenterPage.getHeader(),"Knowledge Center");
    }

    @Test
    public void goToAboutPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        AboutPage aboutPage = sideBarPage.goToAboutPage();
        assertEquals(aboutPage.getHeader(),"Testing and QA is what we do.");
    }

    @Test
    public void goToContactPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        ContactPage contactPage = sideBarPage.goToContactPage();
        assertEquals(contactPage.getHeader(),"Contact tapQA");
    }
}
