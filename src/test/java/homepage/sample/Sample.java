package homepage.sample;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.BottomNavPage;
import pages.aboutpages.AboutPage;
import pages.industriespages.*;
import pages.knowledgecenterpages.BlogPage;
import pages.knowledgecenterpages.WebinarsPage;
import pages.knowledgecenterpages.YouTubeChannelPage;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_IndustriesPage;
import pages.sidebarpages.SideBar_KnowledgeCenterPage;
import pages.socialmediapages.*;
import pages.topnavpages.TopNav_IndustriesPage;

import static org.testng.Assert.assertEquals;

public class Sample extends BaseTest {

    @Test
    public void goToRetailPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        RetailPage retailPage= sideBar_IndustriesPage.goToRetailPage();
        assertEquals(retailPage.getHeader(),"Retail & eCommerce");
    }

    @Test
    public void goToInsurancePage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        InsurancePage insurancePage= sideBar_IndustriesPage.goToInsurancePage();
        assertEquals(insurancePage.getHeader(),"Insurance");
    }

    @Test
    public void goToFinancialPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        FinancialPage financialPage = sideBar_IndustriesPage.goToFinancialPage();
        assertEquals(financialPage.getHeader(),"Financial & Banking");
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
    public void goToAboutPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        AboutPage aboutPage = sideBarPage.goToAboutPage();
        assertEquals(aboutPage.getHeader(),"Testing and QA is what we do.");
    }

    @Test
    public void goToGovernmentPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        GovernmentPage governmentPage = topNav_industriesPage.goToGovernmentPage();
        assertEquals(governmentPage.getHeader(), "Government");
    }

    @Test
    public void goToMediaPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        MediaPage mediaPage = topNav_industriesPage.goToMediaPage();
        assertEquals(mediaPage.getHeader(), "Media / Entertainment");
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
}
