package homepage.sidebartests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.aboutpages.AccoladesPage;
import pages.aboutpages.HistoryPage;
import pages.aboutpages.LeadershipPage;
import pages.knowledgecenterpages.NewsAndEventsPage;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_AboutPage;

import static org.testng.Assert.assertEquals;

public class SideBar_AboutPageTest extends BaseTest {

    @Test
    public void verifySideBar_AboutPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_AboutPage sideBar_aboutPage = sideBarPage.openAboutTab();
        sideBar_aboutPage.waitForNewsAndEvents();
        assertEquals(sideBar_aboutPage.getLeadership(),"Leadership");
        assertEquals(sideBar_aboutPage.getHistory(),"History");
        assertEquals(sideBar_aboutPage.getAccolades(),"Accolades");
        assertEquals(sideBar_aboutPage.getNewsAndEvents(),"News & Events");
    }

    @Test
    public void goToLeadershipPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_AboutPage sideBar_aboutPage = sideBarPage.openAboutTab();
        sideBar_aboutPage.waitForNewsAndEvents();
        LeadershipPage leadershipPage = sideBar_aboutPage.goToLeadershipPage();
        assertEquals(leadershipPage.getHeader(),"Leadership Team");
    }

    @Test
    public void goToHistoryPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_AboutPage sideBar_aboutPage = sideBarPage.openAboutTab();
        sideBar_aboutPage.waitForNewsAndEvents();
        HistoryPage historyPage = sideBar_aboutPage.goToHistoryPage();
        assertEquals(historyPage.getHeader(),"History");
    }

    @Test
    public void goToAccoladesPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_AboutPage sideBar_aboutPage = sideBarPage.openAboutTab();
        sideBar_aboutPage.waitForNewsAndEvents();
        AccoladesPage accoladesPage = sideBar_aboutPage.goToAccoladesPage();
        assertEquals(accoladesPage.getHeader(),"Accolades");
    }

    @Test
    public void goToNewsAndEventsPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_AboutPage sideBar_aboutPage = sideBarPage.openAboutTab();
        sideBar_aboutPage.waitForNewsAndEvents();
        NewsAndEventsPage newsAndEventsPage = sideBar_aboutPage.goToNewsAndEvents();
        assertEquals(newsAndEventsPage.getHeader(),"News & Events");
    }
}
