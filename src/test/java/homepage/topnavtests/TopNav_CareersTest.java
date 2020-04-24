package homepage.topnavtests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.careerspages.WhyTapQAPage;
import pages.topnavpages.TopNavPage;
import pages.topnavpages.TopNav_CareersPage;

import static org.testng.Assert.assertEquals;

public class TopNav_CareersTest extends BaseTest {

    @Test
    public void verifyCareers() {
        TopNavPage topNavPage = homePage.goToTopNavPage();
        assertEquals(topNavPage.getCareers(),"Careers");
        TopNav_CareersPage topNav_CareersPage = topNavPage.goToTopNav_CareersPage();
        topNav_CareersPage.hoverOverCareers();
        assertEquals(topNav_CareersPage.getCareers_WhytapQA(),"Why tapQA");
    }

    @Test
    public void goToWhyTapQAPage() {
        TopNavPage topNavPage = homePage.goToTopNavPage();
        TopNav_CareersPage topNav_CareersPage = topNavPage.goToTopNav_CareersPage();
        topNav_CareersPage.hoverOverCareers();
        WhyTapQAPage whyTapQAPage = topNav_CareersPage.goToWhyTapQAPage();
        assertEquals(whyTapQAPage.getHeader(), "Why Work for tapQA?");
    }

}
