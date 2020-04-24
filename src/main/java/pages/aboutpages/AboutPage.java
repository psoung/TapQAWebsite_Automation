package pages.aboutpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public AboutPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }
}
