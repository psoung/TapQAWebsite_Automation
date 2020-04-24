package pages.knowledgecenterpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebinarsPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public WebinarsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }
}
