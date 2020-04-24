package homepage.sidebartests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.knowledgecenterpages.*;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_KnowledgeCenterPage;

import static org.testng.Assert.assertEquals;

public class SideBar_KnowledgeCenterPageTest extends BaseTest {

    @Test
    public void verifySideBar_KnowledgeCenterPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_KnowledgeCenterPage sideBar_knowledgeCenterPage = sideBarPage.openKnowledgeCenterTab();
        sideBar_knowledgeCenterPage.waitForYouTubeChannel();
        assertEquals(sideBar_knowledgeCenterPage.getNewsAndEvents(),"News & Events");
        assertEquals(sideBar_knowledgeCenterPage.getBlog(),"Blog");
        assertEquals(sideBar_knowledgeCenterPage.getWebinars(),"Webinars");
        assertEquals(sideBar_knowledgeCenterPage.getPodcasts(),"Podcasts");
        assertEquals(sideBar_knowledgeCenterPage.getYouTubeChannel(),"YouTube Channel");
    }

    @Test
    public void goToNewsAndEvents() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_KnowledgeCenterPage sideBar_knowledgeCenterPage = sideBarPage.openKnowledgeCenterTab();
        sideBar_knowledgeCenterPage.waitForYouTubeChannel();
        NewsAndEventsPage newsAndEventsPage = sideBar_knowledgeCenterPage.goToNewsAndEventsPage();
        assertEquals(newsAndEventsPage.getHeader(),"News & Events");
    }

    @Test
    public void goToBlog() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_KnowledgeCenterPage sideBar_knowledgeCenterPage = sideBarPage.openKnowledgeCenterTab();
        sideBar_knowledgeCenterPage.waitForYouTubeChannel();
        BlogPage blogPage = sideBar_knowledgeCenterPage.goToBlogPage();
        assertEquals(blogPage.getHeader(),"Blog");
    }

    @Test
    public void goToWebinars() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_KnowledgeCenterPage sideBar_knowledgeCenterPage = sideBarPage.openKnowledgeCenterTab();
        sideBar_knowledgeCenterPage.waitForYouTubeChannel();
        WebinarsPage webinarsPage = sideBar_knowledgeCenterPage.goToWebinarsPage();
        assertEquals(webinarsPage.getHeader(),"Webinars");
    }

    @Test
    public void goToPodcasts() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_KnowledgeCenterPage sideBar_knowledgeCenterPage = sideBarPage.openKnowledgeCenterTab();
        sideBar_knowledgeCenterPage.waitForYouTubeChannel();
        PodcastsPage podcastsPage = sideBar_knowledgeCenterPage.goToPodcastsPage();
        assertEquals(podcastsPage.getHeader(),"tapTALK Podcast");
    }

    @Test
    public void goToYouTubeChannel() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_KnowledgeCenterPage sideBar_knowledgeCenterPage = sideBarPage.openKnowledgeCenterTab();
        sideBar_knowledgeCenterPage.waitForYouTubeChannel();
        YouTubeChannelPage youTubeChannelPage = sideBar_knowledgeCenterPage.goToYouTubeChannelPage();
        assertEquals(youTubeChannelPage.getUrl(),"https://www.youtube.com/user/tapQA/featured");
        youTubeChannelPage.goBackToSideBarPage();
        sideBarPage.closeKnowledgeCenterTab();
        youTubeChannelPage.waitToReturn();
        sideBarPage.goToHomePage();
        sideBarPage.waitForXButton_Disappear();
    }

}
