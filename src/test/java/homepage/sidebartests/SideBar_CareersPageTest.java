package homepage.sidebartests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.careerspages.WhyTapQAPage;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_CareersPage;

import static org.testng.Assert.assertEquals;

public class SideBar_CareersPageTest extends BaseTest {

    @Test
    public void verifySideBar_CareersPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_CareersPage sideBar_CareersPage = sideBarPage.openCareersTab();
        sideBar_CareersPage.waitForWhytapQA();
        assertEquals(sideBar_CareersPage.getWhytapQA(),"Why tapQA");
    }

    @Test
    public void goToWhyTapQAPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_CareersPage sideBar_CareersPage = sideBarPage.openCareersTab();
        sideBar_CareersPage.waitForWhytapQA();
        WhyTapQAPage whyTapQAPage = sideBar_CareersPage.goToWhyTapQAPage();
        assertEquals(whyTapQAPage.getHeader(),"Why Work for tapQA?");
    }
}
