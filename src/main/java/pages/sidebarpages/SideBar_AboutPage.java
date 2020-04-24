package pages.sidebarpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.aboutpages.AccoladesPage;
import pages.aboutpages.HistoryPage;
import pages.aboutpages.LeadershipPage;
import pages.knowledgecenterpages.NewsAndEventsPage;

public class SideBar_AboutPage {
    private WebDriver driver;

    private By Leadership = By.xpath("//*[@id=\"menu-item-414\"]");
    private By History = By.xpath("//*[@id=\"menu-item-412\"]");
    private By Accolades = By.xpath("//*[@id=\"menu-item-413\"]");
    private By NewsAndEvents = By.xpath("//*[@id=\"menu-item-5491\"]");

    public SideBar_AboutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForNewsAndEvents() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(NewsAndEvents)));
    }

    public String getLeadership() { return driver.findElement(Leadership).getText(); }
    public String getHistory() { return driver.findElement(History).getText(); }
    public String getAccolades() { return driver.findElement(Accolades).getText(); }
    public String getNewsAndEvents() { return driver.findElement(NewsAndEvents).getText(); }

    public LeadershipPage goToLeadershipPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Leadership)).click().perform();
        return new LeadershipPage(driver);
    }

    public HistoryPage goToHistoryPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(History)).click().perform();
        return new HistoryPage(driver);
    }

    public AccoladesPage goToAccoladesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Accolades)).click().perform();
        return new AccoladesPage(driver);
    }

    public NewsAndEventsPage goToNewsAndEvents() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(NewsAndEvents)).click().perform();
        return new NewsAndEventsPage(driver);
    }

}
