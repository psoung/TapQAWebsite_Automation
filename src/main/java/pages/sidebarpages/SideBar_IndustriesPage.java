package pages.sidebarpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.industriespages.*;

public class SideBar_IndustriesPage {
    private WebDriver driver;

    private By Healthcare = By.xpath("//*[@id=\"menu-item-388\"]/a/span");
    private By Retail = By.xpath("//*[@id=\"menu-item-389\"]/a/span");
    private By Insurance = By.xpath("//*[@id=\"menu-item-390\"]/a/span");
    private By Financial = By.xpath("//*[@id=\"menu-item-391\"]/a/span");
    private By SoftwareDevelopment = By.xpath("//*[@id=\"menu-item-392\"]/a/span");
    private By Government = By.xpath("//*[@id=\"menu-item-393\"]/a/span");
    private By Media = By.xpath("//*[@id=\"menu-item-394\"]/a/span");
    private By IoT = By.xpath("//*[@id=\"menu-item-395\"]/a/span");
    private By HealthAndWellness = By.xpath("//*[@id=\"menu-item-396\"]/a/span");
    private By MedicalDevices = By.xpath("//*[@id=\"menu-item-397\"]/a/span");
    private By Utilities = By.xpath("//*[@id=\"menu-item-5372\"]/a/span");

    public SideBar_IndustriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForUtilities() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Utilities)));
    }

    public String getHealthcare() { return driver.findElement(Healthcare).getText(); }
    public String getRetail() { return driver.findElement(Retail).getText(); }
    public String getInsurance() { return driver.findElement(Insurance).getText(); }
    public String getFinancial() { return driver.findElement(Financial).getText(); }
    public String getSoftwareDevelopment() { return driver.findElement(SoftwareDevelopment).getText(); }
    public String getGovernment() { return driver.findElement(Government).getText(); }
    public String getMedia() { return driver.findElement(Media).getText(); }
    public String getIoT() { return driver.findElement(IoT).getText(); }
    public String getHealthAndWellness() { return driver.findElement(HealthAndWellness).getText(); }
    public String getMedicalDevices() { return driver.findElement(MedicalDevices).getText(); }
    public String getUtilities() { return driver.findElement(Utilities).getText(); }

    public HealthcarePage goToHealthcarePage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Healthcare)).click().perform();
        return new HealthcarePage(driver);
    }

    public RetailPage goToRetailPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Retail)).click().perform();
        return new RetailPage(driver);
    }

    public InsurancePage goToInsurancePage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Insurance)).click().perform();
        return new InsurancePage(driver);
    }

    public FinancialPage goToFinancialPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Financial)).click().perform();
        return new FinancialPage(driver);
    }

    public SoftwareDevelopmentPage goToSoftwareDevelopmentPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(SoftwareDevelopment)).click().perform();
        return new SoftwareDevelopmentPage(driver);
    }

    public GovernmentPage goToGovernmentPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Government)).click().perform();
        return new GovernmentPage(driver);
    }

    public MediaPage goToMediaPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Media)).click().perform();
        return new MediaPage(driver);
    }

    public IoTPage goToIoTPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(IoT)).click().perform();
        return new IoTPage(driver);
    }

    public HealthAndWellnessPage goToHealthAndWellnessPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(HealthAndWellness)).click().perform();
        return new HealthAndWellnessPage(driver);
    }

    public MedicalDevicesPage goToMedicalDevicesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(MedicalDevices)).click().perform();
        return new MedicalDevicesPage(driver);
    }

    public UtilitiesPage goToUtilitiesPage() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(Utilities)).click().perform();
        return new UtilitiesPage(driver);
    }

}
