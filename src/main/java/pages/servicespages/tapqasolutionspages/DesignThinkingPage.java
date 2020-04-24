package pages.servicespages.tapqasolutionspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.servicespages.Solutions_SideNavBarPage;

public class DesignThinkingPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");

    public DesignThinkingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(header).getText(); }

    public Solutions_SideNavBarPage goToSolutions_SideNavBarPage() {
        return new Solutions_SideNavBarPage(driver);
    }
}
