package pages.knowledgecenterpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }
}
