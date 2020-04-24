package pages.socialmediapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.util.ArrayList;

public class LinkedInPage {
    private WebDriver driver;

    public LinkedInPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        return driver.getCurrentUrl();
    }

    public HomePage goBackToHomePage() {
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(newTab.get(0));
        return new HomePage(driver);
    }

    public void waitToReturn() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.urlContains("tapqa"));
    }
}
