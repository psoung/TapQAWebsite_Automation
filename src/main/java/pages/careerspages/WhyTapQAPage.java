package pages.careerspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhyTapQAPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public WhyTapQAPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }
}
