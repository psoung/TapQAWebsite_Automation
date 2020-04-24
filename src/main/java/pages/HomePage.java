package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.careerspages.CareersPage;
import pages.topnavpages.TopNavPage;

public class HomePage {
    private WebDriver driver;

    private By tapLogo = By.xpath("//*[@id=\"tapqa_standardlogo\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean verifyTapLogo() { return driver.findElement(tapLogo).isDisplayed(); }

    /* No longer needed.
    public void addCookies() {
        Cookie cookie1 = new Cookie("_ga","GA1.2.7923500.1585531851",".flywheelsites.com","/",null,true);
        Cookie cookie2 = new Cookie("_gid","GA1.2.314474488.1585619529.",".flywheelsites.com","/",null,true);
        driver.manage().addCookie(cookie1);
        driver.manage().addCookie(cookie2);
    }
    */

    public void hoverOverElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void clickElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

    public void waitFor(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public TopNavPage goToTopNavPage() {
        return new TopNavPage(driver);
    }

    public BottomNavPage goToBottomNavPage() { return new BottomNavPage(driver); }

    /**
    public boolean verifyHamMenu_Services_tapQASolutions_Subcategory1() { return driver.findElement(hamMenu_Services_tapQASolutions_Subcategory1).isDisplayed(); }
    public String getHamMenu_Services_tapQASolutions_Subcategory1() { return driver.findElement(hamMenu_Services_tapQASolutions_Subcategory1).getText(); }
    public boolean verifyHamMenu_Services_tapQASolutions_Subcategory1_PlusButton() { return driver.findElement()}
     **/


}
