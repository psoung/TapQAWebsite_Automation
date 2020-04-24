package pages.topnavpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.knowledgecenterpages.*;

public class TopNav_KnowledgeCenterPage {
    private WebDriver driver;

    private By KnowledgeCenter = By.id("menu-item-360");
    private By KnowledgeCenter_News = By.id("menu-item-5493");
    private By KnowledgeCenter_Blog = By.id("menu-item-361");
    private By KnowledgeCenter_Webinars = By.id("menu-item-362");
    private By KnowledgeCenter_Podcasts = By.id("menu-item-363");
    private By KnowledgeCenter_YouTubeChannel = By.id("menu-item-4995");

    public TopNav_KnowledgeCenterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverKnowledgeCenter() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(KnowledgeCenter);
        action.moveToElement(element).perform();
    }

    public String getKnowledgeCenter() { return driver.findElement(KnowledgeCenter).getText(); }
    public String getKnowledgeCenter_News() { return driver.findElement(KnowledgeCenter_News).getText(); }
    public String getKnowledgeCenter_Blog() { return driver.findElement(KnowledgeCenter_Blog).getText(); }
    public String getKnowledgeCenter_Webinars() { return driver.findElement(KnowledgeCenter_Webinars).getText(); }
    public String getKnowledgeCenter_Podcasts() { return driver.findElement(KnowledgeCenter_Podcasts).getText(); }
    public String getKnowledgeCenter_YouTubeChannel() { return driver.findElement(KnowledgeCenter_YouTubeChannel).getText(); }

    public NewsAndEventsPage goToNewsAndEventsPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(KnowledgeCenter_News)).click().perform();
        return new NewsAndEventsPage(driver);
    }

    public BlogPage goToBlogPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(KnowledgeCenter_Blog)).click().perform();
        return new BlogPage(driver);
    }

    public WebinarsPage goToWebinarsPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(KnowledgeCenter_Webinars)).click().perform();
        return new WebinarsPage(driver);
    }

    public PodcastsPage goToPodcastsPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(KnowledgeCenter_Podcasts)).click().perform();
        return new PodcastsPage(driver);
    }

    public YouTubeChannelPage goToYouTubeChannel() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(KnowledgeCenter_YouTubeChannel)).click().perform();
        return new YouTubeChannelPage(driver);
    }

}
