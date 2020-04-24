package pages.industriespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndustriesPage {
    private WebDriver driver;

    private By industries_Header = By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/h1/span");

    public IndustriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(industries_Header).getText(); }

}
