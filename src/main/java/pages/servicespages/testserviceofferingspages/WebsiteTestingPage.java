package pages.servicespages.testserviceofferingspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.servicespages.Offerings_SideNavBarPage;

public class WebsiteTestingPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public WebsiteTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }

    public Offerings_SideNavBarPage goToOfferings_SideNavBarPage() {
        return new Offerings_SideNavBarPage(driver);
    }
}
