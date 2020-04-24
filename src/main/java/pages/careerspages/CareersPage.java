package pages.careerspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPage {
    private WebDriver driver;

    private By careers_Header = By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/h1/span");
    private By text1Header = By.xpath("//*[@id=\"fl-post-173\"]/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/h2/span");
    private By text1Body = By.xpath("//*[@id=\"fl-post-173\"]/div/div[1]/div[1]/div/div/div[2]/div/div/div[1]/div/div");

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() { return driver.findElement(careers_Header).getText(); }

    public boolean verifyCareersPage_text1Header() {return driver.findElement(careers_Header).isDisplayed(); }
    public String getCareersPage_text1Header() { return driver.findElement(careers_Header).getText(); }

}
