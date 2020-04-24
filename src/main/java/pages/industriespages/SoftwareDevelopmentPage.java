package pages.industriespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoftwareDevelopmentPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public SoftwareDevelopmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }
}
