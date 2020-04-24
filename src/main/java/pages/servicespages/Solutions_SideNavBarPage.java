package pages.servicespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.servicespages.ServicesPage;
import pages.servicespages.tapqasolutionspages.*;

public class Solutions_SideNavBarPage {
    private WebDriver driver;

    private By tapQASolutions = By.xpath("//*[@id=\"fl-post-244\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/h3/a/span");
    private By QAStaffAugmentation = By.xpath("//*[@id=\"menu-item-5153\"]/a/span");
    private By QAStrategy = By.xpath("//*[@id=\"menu-item-5154\"]/a/span");
    private By TestAutomation = By.xpath("//*[@id=\"menu-item-5155\"]/a/span");
    private By OnshoreTesting = By.xpath("//*[@id=\"menu-item-5156\"]/a/span");
    private By AutomationAccelerator = By.xpath("//*[@id=\"menu-item-5151\"]/a/span");
    private By ContractToHire = By.xpath("//*[@id=\"menu-item-5157\"]/a/span");
    private By DesignThinking = By.xpath("//*[@id=\"menu-item-5158\"]/a/span");

    private By TestServiceOfferings_Text = By.xpath("//*[@id=\"fl-post-244\"]/div/div[1]/div/div/div/div/div[1]/div/div[3]/div/div/div/div/div[1]/h4");
    private By TestServiceOfferings_Button = By.xpath("//*[@id=\"fl-post-244\"]/div/div[1]/div/div/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div[2]/div/a/span");


    public Solutions_SideNavBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTapQASolutions() { return driver.findElement(tapQASolutions).getText(); }
    public String getQAStaffAugmentation() { return driver.findElement(QAStaffAugmentation).getText(); }
    public String getQAStrategy() { return driver.findElement(QAStrategy).getText(); }
    public String getTestAutomation() { return driver.findElement(TestAutomation).getText(); }
    public String getOnshoreTesting() { return driver.findElement(OnshoreTesting).getText(); }
    public String getAutomationAccelerator() { return driver.findElement(AutomationAccelerator).getText(); }
    public String getContractToHire() { return driver.findElement(ContractToHire).getText(); }
    public String getDesignThinking() { return driver.findElement(DesignThinking).getText(); }
    public String getTestServiceOfferings_Text() { return driver.findElement(TestServiceOfferings_Text).getText(); }
    public Boolean verifyTestServiceOfferings_Button() { return driver.findElement(TestServiceOfferings_Button).isDisplayed(); }

    public QAStaffAugmentationPage goToQAStaffAugmentationPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(QAStaffAugmentation);
        action.moveToElement(element).click().perform();
        return new QAStaffAugmentationPage(driver);
    }

    public QAStrategyPage goToQAStrategy() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(QAStrategy);
        action.moveToElement(element).click().perform();
        return new QAStrategyPage(driver);
    }

    public TestAutomationPage goToTestAutomationPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(TestAutomation);
        action.moveToElement(element).click().perform();
        return new TestAutomationPage(driver);
    }

    public OnShoreTestingPage goToOnshoreTestingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(OnshoreTesting);
        action.moveToElement(element).click().perform();
        return new OnShoreTestingPage(driver);
    }

    public AutomationAcceleratorPage goToAutomationAcceleratorPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(AutomationAccelerator);
        action.moveToElement(element).click().perform();
        return new AutomationAcceleratorPage(driver);
    }

    public ContractToHirePage goToContractToHirePage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(ContractToHire);
        action.moveToElement(element).click().perform();
        return new ContractToHirePage(driver);
    }

    public DesignThinkingPage goToDesignThinkingPage() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(DesignThinking);
        action.moveToElement(element).click().perform();
        return new DesignThinkingPage(driver);
    }

    public ServicesPage goToTestServiceOfferings() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(TestServiceOfferings_Button);
        action.moveToElement(element).click().perform();
        return new ServicesPage(driver);
    }

    public ServicesPage goToTapQASolutions() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(tapQASolutions);
        action.moveToElement(element).click().perform();
        return new ServicesPage(driver);
    }


}
