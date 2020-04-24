package pages.sidebarpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.careerspages.WhyTapQAPage;

public class SideBar_CareersPage {
    private WebDriver driver;

    private By WhytapQA = By.xpath("//*[@id=\"menu-item-5318\"]");
    private By WhytapQA_text = By.xpath("//*[@id=\"menu-item-5318\"]/a/span");

    public SideBar_CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForWhytapQA() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(WhytapQA_text)));
    }

    public String getWhytapQA() { return driver.findElement(WhytapQA).getText(); }

    public WhyTapQAPage goToWhyTapQAPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(WhytapQA)).click().perform();
        return new WhyTapQAPage(driver);
    }
}
