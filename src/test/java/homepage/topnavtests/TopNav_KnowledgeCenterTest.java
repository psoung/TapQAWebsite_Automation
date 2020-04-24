package homepage.topnavtests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.knowledgecenterpages.*;
import pages.topnavpages.TopNav_KnowledgeCenterPage;

import static org.testng.Assert.assertEquals;

public class TopNav_KnowledgeCenterTest extends BaseTest {

    @Test
    public void verifyKnowledgeCenterTab() {
        TopNav_KnowledgeCenterPage topNav_knowledgeCenterPage = homePage.goToTopNavPage().goToTopNav_KnowledgeCenterPage();
        assertEquals(topNav_knowledgeCenterPage.getKnowledgeCenter(),"Knowledge Center");
        topNav_knowledgeCenterPage.hoverOverKnowledgeCenter();
        assertEquals(topNav_knowledgeCenterPage.getKnowledgeCenter_News(),"News & Events");
        assertEquals(topNav_knowledgeCenterPage.getKnowledgeCenter_Blog(),"Blog");
        assertEquals(topNav_knowledgeCenterPage.getKnowledgeCenter_Webinars(),"Webinars");
        assertEquals(topNav_knowledgeCenterPage.getKnowledgeCenter_Podcasts(), "Podcasts");
        assertEquals(topNav_knowledgeCenterPage.getKnowledgeCenter_YouTubeChannel(), "YouTube Channel");
    }

    @Test
    public void goToNewsAndEventsPage() {
        TopNav_KnowledgeCenterPage topNav_knowledgeCenterPage = homePage.goToTopNavPage().goToTopNav_KnowledgeCenterPage();
        topNav_knowledgeCenterPage.hoverOverKnowledgeCenter();
        NewsAndEventsPage newsAndEventsPage = topNav_knowledgeCenterPage.goToNewsAndEventsPage();
        assertEquals(newsAndEventsPage.getHeader(), "News & Events");
    }

    @Test
    public void goToBlogPage() {
        TopNav_KnowledgeCenterPage topNav_knowledgeCenterPage = homePage.goToTopNavPage().goToTopNav_KnowledgeCenterPage();
        topNav_knowledgeCenterPage.hoverOverKnowledgeCenter();
        BlogPage blogPage = topNav_knowledgeCenterPage.goToBlogPage();
        assertEquals(blogPage.getHeader(), "Blog");
    }

    @Test
    public void goToWebinarsPage() {
        TopNav_KnowledgeCenterPage topNav_knowledgeCenterPage = homePage.goToTopNavPage().goToTopNav_KnowledgeCenterPage();
        topNav_knowledgeCenterPage.hoverOverKnowledgeCenter();
        WebinarsPage webinarsPage = topNav_knowledgeCenterPage.goToWebinarsPage();
        assertEquals(webinarsPage.getHeader(), "Webinars");
    }

    @Test
    public void goToPodcastsPage() {
        TopNav_KnowledgeCenterPage topNav_knowledgeCenterPage = homePage.goToTopNavPage().goToTopNav_KnowledgeCenterPage();
        topNav_knowledgeCenterPage.hoverOverKnowledgeCenter();
        PodcastsPage podcastsPage = topNav_knowledgeCenterPage.goToPodcastsPage();
        assertEquals(podcastsPage.getHeader(), "tapTALK Podcast");
    }

    @Test
    public void goToYouTubeChannel() {
        TopNav_KnowledgeCenterPage topNav_knowledgeCenterPage = homePage.goToTopNavPage().goToTopNav_KnowledgeCenterPage();
        topNav_knowledgeCenterPage.hoverOverKnowledgeCenter();
        YouTubeChannelPage youTubeChannelPage = topNav_knowledgeCenterPage.goToYouTubeChannel();
        assertEquals(youTubeChannelPage.getUrl(), "https://www.youtube.com/user/tapQA/featured");
    }
}
