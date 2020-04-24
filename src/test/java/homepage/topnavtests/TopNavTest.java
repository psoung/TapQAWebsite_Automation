package homepage.topnavtests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.careerspages.CareersPage;
import pages.industriespages.IndustriesPage;
import pages.KnowledgeCenterPage;
import pages.servicespages.ServicesPage;
import pages.topnavpages.TopNavPage;
import pages.topnavpages.TopNav_ServicesPage;

import static org.testng.Assert.assertEquals;

public class TopNavTest extends BaseTest {

    @Test
    public void goToServicesPage() {
        ServicesPage servicesPage = homePage.goToTopNavPage().goToServicesPage();
        assertEquals(servicesPage.getHeader(),"Services");
    }

    @Test
    public void goToIndustries() {
        IndustriesPage industriesPage = homePage.goToTopNavPage().goToIndustriesPage();
        assertEquals(industriesPage.getHeader(),"Industries");
    }

    @Test
    public void goToCareers() {
        CareersPage careersPage = homePage.goToTopNavPage().goToCareersPage();
        assertEquals(careersPage.getHeader(),"Careers");
    }

    @Test
    public void goToKnowledgeCenter() {
        KnowledgeCenterPage knowledgeCenterPage = homePage.goToTopNavPage().goToKnowledgeCenter();
        assertEquals(knowledgeCenterPage.getHeader(),"Knowledge Center");
    }

    @Test
    public void workWithUs() {
        CareersPage careersPage = homePage.goToTopNavPage().workWithUsButton();
        assertEquals(careersPage.getHeader(),"Careers");
    }
}
