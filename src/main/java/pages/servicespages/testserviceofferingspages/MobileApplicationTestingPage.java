package pages.servicespages.testserviceofferingspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileApplicationTestingPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public MobileApplicationTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }

}
