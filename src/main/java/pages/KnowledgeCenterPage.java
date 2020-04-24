package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KnowledgeCenterPage {
    private WebDriver driver;

    private By knowledgecenter_Header = By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div[1]/div/h1/span");

    public KnowledgeCenterPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() {
        return driver.findElement(knowledgecenter_Header).getText();
    }

}
