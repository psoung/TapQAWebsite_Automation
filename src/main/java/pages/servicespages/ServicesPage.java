package pages.servicespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage {
    private WebDriver driver;

    private By header = By.className("fl-heading-text");
    private By tapQASolutions_Header = By.xpath("//*[@id=\"solutions\"]/div/div/div/div/div/div/div/h2/span");
    private By testServiceOfferings_Header = By.xpath("//*[@id=\"offerings\"]/div/div/div/div/div/div/div/h2/span");


    public ServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() {
        return driver.findElement(header).getText();
    }
    public String getTapQASolutions_Header() {
        return driver.findElement(tapQASolutions_Header).getText();
    }
    public String getTestServiceOfferings_Header() { return driver.findElement(testServiceOfferings_Header).getText(); }

    public Services_SolutionsPage goToServices_SolutionsPage() {
        return new Services_SolutionsPage(driver);
    }

    public Services_OfferingsPage goToServices_OfferingsPage() {
        return new Services_OfferingsPage(driver);
    }
}
