package pages.topnavpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.careerspages.WhyTapQAPage;

public class TopNav_CareersPage {
    private WebDriver driver;

    private By Careers = By.id("menu-item-359");
    private By Careers_WhytapQA = By.id("menu-item-5317");

    public TopNav_CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCareers() { return driver.findElement(Careers).getText(); }
    public String getCareers_WhytapQA() { return driver.findElement(Careers_WhytapQA).getText(); }

    public void hoverOverCareers() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Careers);
        action.moveToElement(element).perform();
    }


    public WhyTapQAPage goToWhyTapQAPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Careers_WhytapQA)).click().perform();
        return new WhyTapQAPage(driver);
    }

}
