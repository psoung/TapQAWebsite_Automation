package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PartnersPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public PartnersPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }
}
