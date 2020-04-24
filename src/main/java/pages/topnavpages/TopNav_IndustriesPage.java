package pages.topnavpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.industriespages.*;

public class TopNav_IndustriesPage {
    WebDriver driver;

    private By Industries = By.id("menu-item-345");
    private By Industries_Healthcare = By.id("menu-item-346");
    private By Industries_Retail = By.id("menu-item-347");
    private By Industries_Insurance = By.id("menu-item-349");
    private By Industries_Financial = By.id("menu-item-350");
    private By Industries_Software = By.id("menu-item-351");
    private By Industries_IoT = By.id("menu-item-354");
    private By Industries_Government = By.id("menu-item-352");
    private By Industries_Media = By.id("menu-item-353");
    private By Industries_Health = By.id("menu-item-355");
    private By Industries_MedicalDevices = By.id("menu-item-356");
    private By Industries_Utilities = By.id("menu-item-4893");

    public TopNav_IndustriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverIndustries() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(Industries);
        action.moveToElement(element).perform();
    }

    public String getIndustries() { return driver.findElement(Industries).getText(); }

    public String getIndustries_Healthcare() { return driver.findElement(Industries_Healthcare).getText(); }
    public String getIndustries_Retail() { return driver.findElement(Industries_Retail).getText(); }
    public String getIndustries_Insurance() { return driver.findElement(Industries_Insurance).getText(); }
    public String getIndustries_Financial() { return driver.findElement(Industries_Financial).getText(); }
    public String getIndustries_Software() { return driver.findElement(Industries_Software).getText(); }
    public String getIndustries_IoT() { return driver.findElement(Industries_IoT).getText(); }
    public String getIndustries_Government() { return driver.findElement(Industries_Government).getText(); }
    public String getIndustries_Media() { return driver.findElement(Industries_Media).getText(); }
    public String getIndustries_Health() { return driver.findElement(Industries_Health).getText(); }
    public String getIndustries_MedicalDevices() { return driver.findElement(Industries_MedicalDevices).getText(); }
    public String getIndustries_Utilities() { return driver.findElement(Industries_Utilities).getText(); }

    public HealthcarePage goToHealthCarePage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Healthcare)).click().perform();
        return new HealthcarePage(driver);
    }

    public RetailPage goToRetailPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Retail)).click().perform();
        return new RetailPage(driver);
    }

    public InsurancePage goToInsurancePage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Insurance)).click().perform();
        return new InsurancePage(driver);
    }

    public FinancialPage goToFinancialPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Financial)).click().perform();
        return new FinancialPage(driver);
    }

    public SoftwareDevelopmentPage goToSoftwareDevelopmentPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Software)).click().perform();
        return new SoftwareDevelopmentPage(driver);
    }

    public IoTPage goToIoTPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_IoT)).click().perform();
        return new IoTPage(driver);
    }

    public GovernmentPage goToGovernmentPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Government)).click().perform();
        return new GovernmentPage(driver);
    }

    public MediaPage goToMediaPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Media)).click().perform();
        return new MediaPage(driver);
    }

    public HealthAndWellnessPage goToHealthAndWellnessPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Health)).click().perform();
        return new HealthAndWellnessPage(driver);
    }

    public MedicalDevicesPage goToMedicalDevicesPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_MedicalDevices)).click().perform();
        return new MedicalDevicesPage(driver);
    }

    public UtilitiesPage goToUtilitiesPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Industries_Utilities)).click().perform();
        return new UtilitiesPage(driver);
    }
}
