package pages.sidebarpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.knowledgecenterpages.*;

public class SideBar_KnowledgeCenterPage {
    private WebDriver driver;

    private By NewsAndEvents = By.xpath("//*[@id=\"menu-item-5492\"]/a/span");
    private By Blog = By.xpath("//*[@id=\"menu-item-403\"]/a/span");
    private By Webinars = By.xpath("//*[@id=\"menu-item-404\"]/a/span");
    private By Podcasts = By.xpath("//*[@id=\"menu-item-405\"]/a/span");
    private By YouTubeChannel = By.xpath("//*[@id=\"menu-item-4994\"]/a/span");

    public SideBar_KnowledgeCenterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForYouTubeChannel() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(YouTubeChannel)));
    }

    public String getNewsAndEvents() { return driver.findElement(NewsAndEvents).getText(); }
    public String getBlog() { return driver.findElement(Blog).getText(); }
    public String getWebinars() { return driver.findElement(Webinars).getText(); }
    public String getPodcasts() { return driver.findElement(Podcasts).getText(); }
    public String getYouTubeChannel() { return driver.findElement(YouTubeChannel).getText(); }

    public NewsAndEventsPage goToNewsAndEventsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(NewsAndEvents)).click().perform();
        return new NewsAndEventsPage(driver);
    }

    public BlogPage goToBlogPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Blog)).click().perform();
        return new BlogPage(driver);
    }

    public WebinarsPage goToWebinarsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Webinars)).click().perform();
        return new WebinarsPage(driver);
    }

    public PodcastsPage goToPodcastsPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Podcasts)).click().perform();
        return new PodcastsPage(driver);
    }

    public YouTubeChannelPage goToYouTubeChannelPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(YouTubeChannel)).click().perform();
        return new YouTubeChannelPage(driver);
    }

}
