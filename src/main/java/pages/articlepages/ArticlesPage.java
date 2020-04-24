package pages.articlepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlesPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public ArticlesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }
}
