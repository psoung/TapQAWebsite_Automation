package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class BottomNavPage {
    private WebDriver driver;

    private By connectWithUsHeader = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[1]/div/h4/span");
    private By facebookLink = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[3]/div/div/a[1]");
    private By twitterLink = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[3]/div/div/a[2]");
    private By youtubeLink = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[3]/div/div/a[3]");
    private By instagramLink = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[3]/div/div/a[4]");
    private By linkedinLink = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[3]/div/div/a[5]");
    private By glassdoorLink = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[3]/div/div/a[6]");
    private By tap10yearsLogo = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[4]/div/div/div/a/img");
    private By address = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[5]/div/div/p[1]");
    private By getDirections = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[1]/div/div[5]/div/div/p[2]");

    private By latestPostHeader = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[2]/div/div[1]/div/h4/span");
    private By latestPost_Subcategory1 = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div/ul/li[1]/a");
    private By latestPost_Subcategory2 = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div/ul/li[2]/a");
    private By latestPost_Subcategory3 = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div/ul/li[3]/a");
    private By latestPost_Subcategory4 = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div/ul/li[4]/a");
    private By latestPost_Subcategory5 = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div/ul/li[5]/a");

    private By softwareHeader = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[3]/div/div[1]/div/h4/span");
    private By softwareText = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/p");
    private By qaStrategy = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/ul/li[1]/a/strong");
    private By automatedQATesting = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/ul/li[2]/a");
    private By manualQATesting = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/ul/li[3]/a");
    private By onshoreServices = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/ul/li[4]/a");
    private By continuousIntegration = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/ul/li[5]/a");

    private By quickLink = By.xpath("/html/body/div/footer/div[1]/div/div/div[1]/div[4]/div/div[1]/div/h4/span");
    private By careers = By.xpath("//*[@id=\"menu-item-418\"]");
    private By services = By.xpath("//*[@id=\"menu-item-416\"]");
    private By industries = By.xpath("//*[@id=\"menu-item-417\"]");
    private By contact = By.xpath("//*[@id=\"menu-item-425\"]");
    private By newsAndEvents = By.xpath("//*[@id=\"menu-item-5031\"]");
    private By blog = By.xpath("//*[@id=\"menu-item-419\"]");
    private By webinars = By.xpath("//*[@id=\"menu-item-420\"]");
    private By podcasts = By.xpath("//*[@id=\"menu-item-421\"]");

    private By evolveCreative = By.xpath("/html/body/div/footer/div[1]/div/div/div[2]/div/div/div/div/div/p/a");

    public BottomNavPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void waitForPodcast() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(podcasts)));
    }

    public String getConnectWithUs() { return driver.findElement(connectWithUsHeader).getText(); }
    public Boolean verifyFacebookLink() { return driver.findElement(facebookLink).isDisplayed(); }
    public Boolean verifyTwitterLink() { return driver.findElement(twitterLink).isDisplayed(); }
    public Boolean verifyYouTubeLink() { return driver.findElement(youtubeLink).isDisplayed(); }
    public Boolean verifyInstagramLink() { return driver.findElement(instagramLink).isDisplayed(); }
    public Boolean verifyLinkedInLink() { return driver.findElement(linkedinLink).isDisplayed(); }
    public Boolean verifyGlassdoor() { return driver.findElement(glassdoorLink).isDisplayed(); }

   public FacebookPage goToFacebookPage() {
       Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(facebookLink)).click().perform();
       return new FacebookPage(driver);
   }

    public TwitterPage goToTwitterPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(twitterLink)).click().perform();
        return new TwitterPage(driver);
    }

    public YouTubeChannelPage goToYouTubePage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(youtubeLink)).click().perform();
        return new YouTubeChannelPage(driver);
    }

    public InstagramPage goToInstagramPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(instagramLink)).click().perform();
        return new InstagramPage(driver);
    }

    public LinkedInPage goToLinkedInPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(linkedinLink)).click().perform();
        return new LinkedInPage(driver);
    }

    public GlassdoorPage goToGlassdoorPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(glassdoorLink)).click().perform();
        return new GlassdoorPage(driver);
    }

    public HomePage clickTapLogo() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(tap10yearsLogo)).click().perform();
        return new HomePage(driver);
    }

    public DirectionsPage goToDirectionsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(getDirections)).click().perform();
        return new DirectionsPage(driver);
    }

    public String getLatestPostHeader() { return driver.findElement(latestPostHeader).getText(); }
    public String getLatestPost_Subcategory1() { return driver.findElement(latestPost_Subcategory1).getText(); }
    public String getLatestPost_Subcategory2() { return driver.findElement(latestPost_Subcategory2).getText(); }
    public String getLatestPost_Subcategory3() { return driver.findElement(latestPost_Subcategory3).getText(); }
    public String getLatestPost_Subcategory4() { return driver.findElement(latestPost_Subcategory4).getText(); }
    public String getLatestPost_Subcategory5() { return driver.findElement(latestPost_Subcategory5).getText(); }

    public ArticlesPage goToArticles1Page() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(latestPost_Subcategory1)).click().perform();
        return new ArticlesPage(driver);
    }

    public ArticlesPage goToArticles2Page() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(latestPost_Subcategory2)).click().perform();
        return new ArticlesPage(driver);
    }

    public ArticlesPage goToArticles3Page() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(latestPost_Subcategory3)).click().perform();
        return new ArticlesPage(driver);
    }

    public ArticlesPage goToArticles4Page() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(latestPost_Subcategory4)).click().perform();
        return new ArticlesPage(driver);
    }

    public ArticlesPage goToArticles5Page() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(latestPost_Subcategory5)).click().perform();
        return new ArticlesPage(driver);
    }

    public String getSoftwareHeader() { return driver.findElement(softwareHeader).getText(); }
    public String getSoftwareText() { return driver.findElement(softwareText).getText(); }
    public String getQAStrategy() { return driver.findElement(qaStrategy).getText(); }
    public String getAutomatedQATesting() { return driver.findElement(automatedQATesting).getText(); }
    public String getManualQATesting() { return driver.findElement(manualQATesting).getText(); }
    public String getOnshoreServices() { return driver.findElement(onshoreServices).getText(); }
    public String getContinuousIntegration() { return driver.findElement(continuousIntegration).getText(); }

    public QAStrategyPage goToQAStrategyPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(qaStrategy)).click().perform();
        return new QAStrategyPage(driver);
    }

    public TestAutomationPage goToAutomatedQATesting() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(automatedQATesting)).click().perform();
        return new TestAutomationPage(driver);
    }

    public DesignThinkingPage goToManualQATesting() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(manualQATesting)).click().perform();
        return new DesignThinkingPage(driver);
    }

    public OnShoreTestingPage goToOnshoreServices() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(onshoreServices)).click().perform();
        return new OnShoreTestingPage(driver);
    }

    public ContinuousIntegrationPage goToContinuousIntegration() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(continuousIntegration)).click().perform();
        return new ContinuousIntegrationPage(driver);
    }

    public String getQuickLink() { return driver.findElement(quickLink).getText(); }
    public String getCareers() { return driver.findElement(careers).getText(); }
    public String getServices() { return driver.findElement(services).getText(); }
    public String getIndustries() { return driver.findElement(industries).getText(); }
    public String getNewsAndEvents() { return driver.findElement(newsAndEvents).getText(); }
    public String getBlog() { return driver.findElement(blog).getText(); }
    public String getWebinars() { return driver.findElement(webinars).getText(); }
    public String getPodcasts() { return driver.findElement(podcasts).getText(); }

    public CareersPage goToCareersPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(careers)).click().perform();
        return new CareersPage(driver);
    }

    public ServicesPage goToServicesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(services)).click().perform();
        return new ServicesPage(driver);
    }

    public IndustriesPage goToIndustriesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(industries)).click().perform();
        return new IndustriesPage(driver);
    }

    public ContactPage goToContactPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(contact)).click().perform();
        return new ContactPage(driver);
    }

    public NewsAndEventsPage goToNewsAndEventsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(newsAndEvents)).click().perform();
        return new NewsAndEventsPage(driver);
    }

    public BlogPage goToBlogPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(blog)).click().perform();
        return new BlogPage(driver);
    }

    public WebinarsPage goToWebinarsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(webinars)).click().perform();
        return new WebinarsPage(driver);
    }

    public PodcastsPage goToPodcastsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(podcasts)).click().perform();
        return new PodcastsPage(driver);
    }

    public String getEvolveCreative() { return driver.findElement(evolveCreative).getText(); }

    public EvolveCreativePage goToEvolveCreativePage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(evolveCreative)).click().perform();
        return new EvolveCreativePage(driver);
        }
}
