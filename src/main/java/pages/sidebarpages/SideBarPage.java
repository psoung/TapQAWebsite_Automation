package pages.sidebarpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactPage;
import pages.HomePage;
import pages.KnowledgeCenterPage;
import pages.PartnersPage;
import pages.aboutpages.AboutPage;
import pages.careerspages.CareersPage;
import pages.industriespages.IndustriesPage;
import pages.servicespages.ServicesPage;

public class SideBarPage {
    private WebDriver driver;

    private By SideBar = By.xpath("//*[@id=\"popup-overlay-menu\"]/div/div/a/i");
    private By XButton = By.xpath("//*[@id=\"offcanvas-5e051819dc8f4\"]/div/div[1]/div/span/i");
    private By Services = By.xpath("//*[@id=\"menu-item-368\"]/div/a/span");
    private By Services_PlusButton = By.xpath("//*[@id=\"menu-item-368\"]/div/a/span/span");
    private By Industries = By.xpath("//*[@id=\"menu-item-387\"]/div/a/span");
    private By Industries_PlusButton = By.xpath("//*[@id=\"menu-item-387\"]/div/a/span/span");
    private By Careers = By.xpath("//*[@id=\"menu-item-400\"]/div/a/span");
    private By Careers_PlusButton = By.xpath("//*[@id=\"menu-item-400\"]/div/a/span/span");
    private By Partners = By.xpath("//*[@id=\"menu-item-401\"]/a/span");
    private By KnowledgeCenter = By.xpath("//*[@id=\"menu-item-402\"]/div/a/span");
    private By KnowledgeCenter_PlusButton = By.xpath("//*[@id=\"menu-item-402\"]/div/a/span/span");
    private By About = By.xpath("//*[@id=\"menu-item-410\"]/div/a/span");
    private By About_PlusButton = By.xpath("//*[@id=\"menu-item-410\"]/div/a/span/span");
    private By Contact = By.xpath("//*[@id=\"menu-item-415\"]/a/span");

    public SideBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForXButton() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(XButton)));
    }

    public void waitForXButton_Disappear() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(XButton)));
    }

    public HomePage goToHomePage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(XButton)).click().perform();
        return new HomePage(driver);
    }

    public void closeServicesTab() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Services_PlusButton)).click().perform();
    }

    public void closeKnowledgeCenterTab() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(KnowledgeCenter_PlusButton)).click().perform();
    }

    public SideBar_ServicesPage openServicesTab() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Services_PlusButton);
        action.moveToElement(element).click().perform();
        return new SideBar_ServicesPage(driver);
    }

    public SideBar_IndustriesPage openIndustriesTab() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Industries_PlusButton);
        action.moveToElement(element).click().perform();
        return new SideBar_IndustriesPage(driver);
    }

    public SideBar_CareersPage openCareersTab() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Careers_PlusButton);
        action.moveToElement(element).click().perform();
        return new SideBar_CareersPage(driver);
    }

    public SideBar_KnowledgeCenterPage openKnowledgeCenterTab() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(KnowledgeCenter_PlusButton);
        action.moveToElement(element).click().perform();
        return new SideBar_KnowledgeCenterPage(driver);
    }

    public SideBar_AboutPage openAboutTab() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(About_PlusButton);
        action.moveToElement(element).click().perform();
        return new SideBar_AboutPage(driver);
    }

    public boolean verifySideBarMenu() { return driver.findElement(SideBar).isDisplayed(); }
    public boolean verifyXbutton() { return driver.findElement(XButton).isDisplayed(); }

    public String getServices() { return driver.findElement(Services).getText(); }
    public boolean verifyServices_PlusButton() { return driver.findElement(Services_PlusButton).isDisplayed(); }
    public String getIndustries() { return driver.findElement(Industries).getText(); }
    public boolean verifyIndustries_PlusButton() { return driver.findElement(Industries_PlusButton).isDisplayed(); }
    public String getCareers() { return driver.findElement(Careers).getText(); }
    public boolean verifyCareers_PlusButton() { return driver.findElement(Careers_PlusButton).isDisplayed(); }
    public String getPartners() { return driver.findElement(Partners).getText(); }
    public String getKnowledgeCenter() { return driver.findElement(KnowledgeCenter).getText(); }
    public boolean verifyKnowledgeCenter_PlusButton() { return driver.findElement(KnowledgeCenter_PlusButton).isDisplayed(); }
    public String getAbout() { return driver.findElement(About).getText(); }
    public boolean verifyAbout_PlusButton() { return driver.findElement(About_PlusButton).isDisplayed(); }
    public String getContact() { return driver.findElement(Contact).getText(); }

    public ServicesPage goToServicesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Services)).click().click().perform();
        return new ServicesPage(driver);
    }

    public IndustriesPage goToIndustriesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Industries)).click().click().perform();
        return new IndustriesPage(driver);
    }

    public CareersPage goToCareersPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Careers)).click().click().perform();
        return new CareersPage(driver);
    }

    public PartnersPage goToPartnersPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Partners)).click().perform();
        return new PartnersPage(driver);
    }

    public KnowledgeCenterPage goToKnowledgeCenter() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(KnowledgeCenter)).click().click().perform();
        return new KnowledgeCenterPage(driver);
    }

    public AboutPage goToAboutPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(About)).click().click().perform();
        return new AboutPage(driver);
    }

    public ContactPage goToContactPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Contact)).click().perform();
        return new ContactPage(driver);
    }

}
