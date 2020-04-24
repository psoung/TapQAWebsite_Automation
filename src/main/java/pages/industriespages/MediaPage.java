package pages.industriespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MediaPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public MediaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }

}
