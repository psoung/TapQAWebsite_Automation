package pages.aboutpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadershipPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public LeadershipPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }

}
