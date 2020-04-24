package homepage;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.BottomNavPage;
import pages.ContactPage;
import pages.EvolveCreativePage;
import pages.HomePage;
import pages.articlepages.ArticlesPage;
import pages.careerspages.CareersPage;
import pages.industriespages.IndustriesPage;
import pages.knowledgecenterpages.*;
import pages.servicespages.ServicesPage;
import pages.servicespages.tapqasolutionspages.DesignThinkingPage;
import pages.servicespages.tapqasolutionspages.OnShoreTestingPage;
import pages.servicespages.tapqasolutionspages.QAStrategyPage;
import pages.servicespages.tapqasolutionspages.TestAutomationPage;
import pages.servicespages.testserviceofferingspages.ContinuousIntegrationPage;
import pages.socialmediapages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BottomNavPageTest extends BaseTest {

    @Test
    public void verifyBottomNavPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        assertEquals(bottomNavPage.getConnectWithUs(),"CONNECT WITH US");

        assertTrue(bottomNavPage.verifyFacebookLink(),"Facebook link is missing");
        assertTrue(bottomNavPage.verifyTwitterLink(),"Twitter link is missing");
        assertTrue(bottomNavPage.verifyYouTubeLink(),"YouTube link is missing");
        assertTrue(bottomNavPage.verifyInstagramLink(),"Instagram link is missing");
        assertTrue(bottomNavPage.verifyLinkedInLink(),"LinkedIn link is missing");
        assertTrue(bottomNavPage.verifyGlassdoor(),"Glassdoor link is missing");

     //   assertTrue();
    }

    @Test
    public void goToFacebookPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        FacebookPage facebookPage = bottomNavPage.goToFacebookPage();
        assertEquals(facebookPage.getUrl(),"https://www.facebook.com/tapQA");
        facebookPage.goBackToHomePage();
        facebookPage.waitToReturn();
    }

    @Test
    public void goToTwitterPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        TwitterPage twitterPage = bottomNavPage.goToTwitterPage();
        assertEquals(twitterPage.getUrl(),"https://twitter.com/tapqa");
        twitterPage.goBackToHomePage();
        twitterPage.waitToReturn();
    }

    @Test
    public void goToYouTubePage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        YouTubeChannelPage youTubeChannelPage = bottomNavPage.goToYouTubePage();
        assertEquals(youTubeChannelPage.getUrl(),"https://www.youtube.com/user/tapQA");
        youTubeChannelPage.goBackToHomePage();
        youTubeChannelPage.waitToReturn();
    }

    @Test
    public void goToInstagramPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        InstagramPage instagramPage = bottomNavPage.goToInstagramPage();
        assertEquals(instagramPage.getUrl(),"https://www.instagram.com/tap_qa/");
        instagramPage.goBackToHomePage();
        instagramPage.waitToReturn();
    }

    @Test
    public void goToLinkedInPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        LinkedInPage linkedInPage = bottomNavPage.goToLinkedInPage();
        assertEquals(linkedInPage.getUrl(),"https://www.linkedin.com/company/tap-qa-llc?trk=tyah");
        linkedInPage.goBackToHomePage();
        linkedInPage.waitToReturn();
    }

    @Test
    public void goToGlassdoorPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        GlassdoorPage glassdoorPage = bottomNavPage.goToGlassdoorPage();
        assertEquals(glassdoorPage.getUrl(),"https://www.glassdoor.com/Overview/Working-at-tapQA-EI_IE736930.11,16.htm");
        glassdoorPage.goBackToHomePage();
        glassdoorPage.waitToReturn();
    }

    @Test
    public void goToHomePage() { //Should fail when not clicking the logo, not sure why.
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        HomePage homePage = bottomNavPage.clickTapLogo();
        assertTrue(homePage.verifyTapLogo(),"You are not on the HomePage");
    }

    /* WIP doesn't seem to be running, maybe too long of a link???
    @Test
    public void goToDirectionsPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();;
        bottomNavPage.waitForPodcast();
        DirectionsPage directionsPage = bottomNavPage.goToDirectionsPage();
        assertEquals(directionsPage.getUrl(),"https://www.google.com/maps/dir//tap%7CQA,+1660+MN-100+%23415,+St+Louis+Park,+MN+55416/@44.9646148,-93.3475504,17z/data=!4m8!4m7!1m0!1m5!1m1!1s0x52b334a6a645380b:0x245823b2b422d850!2m2!1d-93.3453564!2d44.9646148");
        directionsPage.goBackToHomePage();
        directionsPage.waitToReturn();
    }
     */

    @Test
    public void goToArticle1Page() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        String articleName = bottomNavPage.getLatestPost_Subcategory1();
        ArticlesPage articlesPage = bottomNavPage.goToArticles1Page();
        assertEquals(articlesPage.getHeader(),articleName);
    }

    @Test
    public void goToArticle2Page() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        String articleName = bottomNavPage.getLatestPost_Subcategory2();
        ArticlesPage articlesPage = bottomNavPage.goToArticles2Page();
        assertEquals(articlesPage.getHeader(),articleName);
    }

    @Test
    public void goToArticle3Page() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        String articleName = bottomNavPage.getLatestPost_Subcategory3();
        ArticlesPage articlesPage = bottomNavPage.goToArticles3Page();
        assertEquals(articlesPage.getHeader(),articleName);
    }

    @Test
    public void goToArticle4Page() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        String articleName = bottomNavPage.getLatestPost_Subcategory4();
        ArticlesPage articlesPage = bottomNavPage.goToArticles4Page();
        assertEquals(articlesPage.getHeader(),articleName);
    }

    @Test
    public void goToArticle5Page() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        String articleName = bottomNavPage.getLatestPost_Subcategory5();
        ArticlesPage articlesPage = bottomNavPage.goToArticles5Page();
        assertEquals(articlesPage.getHeader(),articleName);
    }

    @Test
    public void goToQAStrategyPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        QAStrategyPage qaStrategyPage = bottomNavPage.goToQAStrategyPage();
        assertEquals(qaStrategyPage.getHeader(),"QA Strategy");
    }

    @Test
    public void goToAutomatedQATestingPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        TestAutomationPage testAutomationPage = bottomNavPage.goToAutomatedQATesting();
        assertEquals(testAutomationPage.getHeader(),"Test Automation");
    }

    @Test
    public void goToManualQATestingPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        DesignThinkingPage designThinkingPage = bottomNavPage.goToManualQATesting();
        assertEquals(designThinkingPage.getHeader(),"Design Thinking / Humanual Testing");
    }

    @Test
    public void goToOnshoreServicesPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        OnShoreTestingPage onShoreTestingPage = bottomNavPage.goToOnshoreServices();
        assertEquals(onShoreTestingPage.getHeader(),"Onshore Testing (tapLAKESHORE)");
    }

    @Test
    public void goToContinuousIntegrationPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        ContinuousIntegrationPage continuousIntegrationPage = bottomNavPage.goToContinuousIntegration();
        assertEquals(continuousIntegrationPage.getHeader(),"Continuous Integration & DevTestOps");
    }

    @Test
    public void goToCareersPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        CareersPage careersPage = bottomNavPage.goToCareersPage();
        assertEquals(careersPage.getHeader(),"Careers");
    }

    @Test
    public void goToServicesPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        ServicesPage servicesPage= bottomNavPage.goToServicesPage();
        assertEquals(servicesPage.getHeader(),"Services");
    }

    @Test
    public void goToIndustriesPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        IndustriesPage industriesPage = bottomNavPage.goToIndustriesPage();
        assertEquals(industriesPage.getHeader(),"Industries");
    }

    @Test
    public void goToContactPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        ContactPage contactPage = bottomNavPage.goToContactPage();
        assertEquals(contactPage.getHeader(),"Contact tapQA");
    }

    @Test
    public void goToNewsAndEventsPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        NewsAndEventsPage newsAndEventsPage = bottomNavPage.goToNewsAndEventsPage();
        assertEquals(newsAndEventsPage.getHeader(),"News & Events");
    }

    @Test
    public void goToBlogPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        BlogPage blogPage = bottomNavPage.goToBlogPage();
        assertEquals(blogPage.getHeader(),"Blog");
    }

    @Test
    public void goToWebinarPages() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        WebinarsPage webinarsPage = bottomNavPage.goToWebinarsPage();
        assertEquals(webinarsPage.getHeader(),"Webinars");
    }

    @Test
    public void goToPodcastsPage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        PodcastsPage podcastsPage = bottomNavPage.goToPodcastsPage();
        assertEquals(podcastsPage.getHeader(),"Podcasts");
    }

    @Test
    public void goToEvolveCreativePage() {
        BottomNavPage bottomNavPage = homePage.goToBottomNavPage();
        bottomNavPage.scrollToBottom();
        bottomNavPage.waitForPodcast();
        EvolveCreativePage evolveCreativePage = bottomNavPage.goToEvolveCreativePage();
        assertEquals(evolveCreativePage.getUrl(),"https://www.evolve-creative.com/");
        evolveCreativePage.goBackToHomePage();
        evolveCreativePage.waitToReturn();
    }
}
