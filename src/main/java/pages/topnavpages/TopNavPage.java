package pages.topnavpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.careerspages.CareersPage;
import pages.sidebarpages.SideBarPage;
import pages.industriespages.IndustriesPage;
import pages.KnowledgeCenterPage;
import pages.servicespages.ServicesPage;

public class TopNavPage {
    private WebDriver driver;

    private By tapLogo = By.className("fl-photo-img wp-image-196 size-full");
    private By Services = By.id("menu-item-326");
    private By Industries = By.id("menu-item-345");
    private By Careers = By.id("menu-item-359");
    private By KnowledgeCenter = By.id("menu-item-360");
    private By SideBarMenu = By.id("popup-overlay-menu");
    private By WorkWithUs = By.className("fl-button-text");

    public TopNavPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCareers() { return driver.findElement(Careers).getText(); }
    public String getIndustries() { return driver.findElement(Industries).getText(); }

    public TopNav_ServicesPage goToTopNav_ServicesPage() {
        return new TopNav_ServicesPage(driver);
    }
    public TopNav_IndustriesPage goToTopNav_IndustriesPage() {
        return new TopNav_IndustriesPage(driver);
    }
    public TopNav_CareersPage goToTopNav_CareersPage() {
        return new TopNav_CareersPage(driver);
    }
    public TopNav_KnowledgeCenterPage goToTopNav_KnowledgeCenterPage() { return new TopNav_KnowledgeCenterPage(driver); }

    public ServicesPage goToServicesPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Services);
        action.moveToElement(element).click().perform();
        return new ServicesPage(driver);
    }

    public IndustriesPage goToIndustriesPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Industries);
        action.moveToElement(element).click().perform();
        return new IndustriesPage(driver);
    }

    public CareersPage goToCareersPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Careers);
        action.moveToElement(element).click().perform();
        return new CareersPage(driver);
    }

    public KnowledgeCenterPage goToKnowledgeCenter() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(KnowledgeCenter);
        action.moveToElement(element).click().perform();
        return new KnowledgeCenterPage(driver);
    }

    public CareersPage workWithUsButton() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(WorkWithUs);
        action.moveToElement(element).click().perform();
        return new CareersPage(driver);
    }

    public SideBarPage goToSideBarPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(SideBarMenu);
        action.moveToElement(element).click().perform();
        return new SideBarPage(driver);
    }

    public HomePage goToHomePage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(tapLogo);
        action.moveToElement(element).click().perform();
        return new HomePage(driver);
    }

}
