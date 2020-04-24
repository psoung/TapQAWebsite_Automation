package pages.servicespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Services_SolutionsPage {
    private WebDriver driver;

    private By QAStaffAugmentation_InfoBox = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div");
    private By QAStaffAugmentation_Icon = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/span/span/i");
    private By QAStaffAugmentation_Title = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[2]/h3");
    private By QAStaffAugmentation_Text = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div");
    private By QAStaffAugmentation_Link = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/p/span/a");

    private By QAStrategy_InfoBox = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[2]/div/div/div/div/div");
    private By QAStrategy_Icon = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/span/span/i");
    private By QAStrategy_Title = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/h3");
    private By QAStrategy_Text = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div");
    private By QAStrategy_Link = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/p/span/a");

    private By TestAutomation_InfoBox = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[1]/div/div/div/div/div");
    private By TestAutomation_Icon = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/span/span/i");
    private By TestAutomation_Title = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[2]/h3");
    private By TestAutomation_Text = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div");
    private By TestAutomation_Link = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/p/span/a");

    private By OnshoreTesting_InfoBox = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[2]/div/div/div/div/div");
    private By OnshoreTesting_Icon = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/span/span/i");
    private By OnshoreTesting_Title = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/h3");
    private By OnshoreTesting_Text = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div");
    private By OnshoreTesting_Link = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[4]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/p/span/a");

    private By AutomationAccelerator_InfoBox = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[1]/div/div/div/div/div");
    private By AutomationAccelerator_Icon = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/span/span/i");
    private By AutomationAccelerator_Title = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[2]/h3");
    private By AutomationAccelerator_Text = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div");
    private By AutomationAccelerator_Link = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/p/span/a");

    private By ContractToHire_InfoBox = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[2]/div/div/div/div/div");
    private By ContractToHire_Icon = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/span/span/i");
    private By ContractToHire_Title = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/h3");
    private By ContractToHire_Text = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div");
    private By ContractToHire_Link = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[5]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/p/span/a");

    private By DesignThinking_InfoBox = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[6]/div/div/div/div[1]/div/div/div/div/div");
    private By DesignThinking_Icon = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[6]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/span/span/i");
    private By DesignThinking_Title = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[6]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[2]/h3");
    private By DesignThinking_Text = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[6]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div");
    private By DesignThinking_Link = By.xpath("//*[@id=\"fl-post-169\"]/div/div[1]/div[6]/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/p/span/a");


    public Services_SolutionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean verifyQAStaffAugmentation_InfoBox() { return driver.findElement(QAStaffAugmentation_InfoBox).isDisplayed(); }
    public Boolean verifyQAStaffAugmentation_Icon() { return driver.findElement(QAStaffAugmentation_Icon).isDisplayed(); }
    public String getQAStaffAugmentation_Title() { return driver.findElement(QAStaffAugmentation_Title).getText(); }
    public Boolean verifyQAStaffAugmentation_Text() { return driver.findElement(QAStaffAugmentation_Text).isDisplayed(); }
    public String getQAStaffAugmentation_Link() { return driver.findElement(QAStaffAugmentation_Link).getText(); }

    public Boolean verifyQAStrategy_InfoBox() { return driver.findElement(QAStrategy_InfoBox).isDisplayed(); }
    public Boolean verifyQAStrategy_Icon() { return driver.findElement(QAStrategy_Icon).isDisplayed(); }
    public String getQAStrategy_Title() { return driver.findElement(QAStrategy_Title).getText(); }
    public Boolean verifyQAStrategy_Text() { return driver.findElement(QAStrategy_Text).isDisplayed(); }
    public String getQAStrategy_Link() { return driver.findElement(QAStrategy_Link).getText(); }

    public Boolean verifyTestAutomation_InfoBox() { return driver.findElement(TestAutomation_InfoBox).isDisplayed(); }
    public Boolean verifyTestAutomation_Icon() { return driver.findElement(TestAutomation_Icon).isDisplayed(); }
    public String getTestAutomation_Title() { return driver.findElement(TestAutomation_Title).getText(); }
    public Boolean verifyTestAutomation_Text() { return driver.findElement(TestAutomation_Text).isDisplayed(); }
    public String getTestAutomation_Link() { return driver.findElement(TestAutomation_Link).getText(); }

    public Boolean verifyOnshoreTesting_InfoBox() { return driver.findElement(OnshoreTesting_InfoBox).isDisplayed(); }
    public Boolean verifyOnshoreTesting_Icon() { return driver.findElement(OnshoreTesting_Icon).isDisplayed(); }
    public String getOnshoreTesting_Title() { return driver.findElement(OnshoreTesting_Title).getText(); }
    public Boolean verifyOnshoreTesting_Text() { return driver.findElement(OnshoreTesting_Text).isDisplayed(); }
    public String getOnshoreTesting_Link() { return driver.findElement(OnshoreTesting_Link).getText(); }

    public Boolean verifyAutomationAccelerator_InfoBox() { return driver.findElement(AutomationAccelerator_InfoBox).isDisplayed(); }
    public Boolean verifyAutomationAccelerator_Icon() { return driver.findElement(AutomationAccelerator_Icon).isDisplayed(); }
    public String getAutomationAccelerator_Title() { return driver.findElement(AutomationAccelerator_Title).getText(); }
    public Boolean verifyAutomationAccelerator_Text() { return driver.findElement(AutomationAccelerator_Text).isDisplayed(); }
    public String getAutomationAccelerator_Link() { return driver.findElement(AutomationAccelerator_Link).getText(); }

    public Boolean verifyContractToHire_InfoBox() { return driver.findElement(ContractToHire_InfoBox).isDisplayed(); }
    public Boolean verifyContractToHire_Icon() { return driver.findElement(ContractToHire_Icon).isDisplayed(); }
    public String getContractToHire_Title() { return driver.findElement(ContractToHire_Title).getText(); }
    public Boolean verifyContractToHire_Text() { return driver.findElement(ContractToHire_Text).isDisplayed(); }
    public String getContractToHire_Link() { return driver.findElement(ContractToHire_Link).getText(); }

    public Boolean verifyDesignThinking_InfoBox() { return driver.findElement(DesignThinking_InfoBox).isDisplayed(); }
    public Boolean verifyDesignThinking_Icon() { return driver.findElement(DesignThinking_Icon).isDisplayed(); }
    public String getDesignThinking_Title() { return driver.findElement(DesignThinking_Title).getText(); }
    public Boolean verifyDesignThinking_Text() { return driver.findElement(DesignThinking_Text).isDisplayed(); }
    public String getDesignThinking_Link() { return driver.findElement(DesignThinking_Link).getText(); }

}
