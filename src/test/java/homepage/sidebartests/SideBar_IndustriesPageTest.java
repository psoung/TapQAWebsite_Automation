package homepage.sidebartests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.sidebarpages.SideBarPage;
import pages.sidebarpages.SideBar_IndustriesPage;
import pages.industriespages.*;

import static org.testng.Assert.assertEquals;

public class SideBar_IndustriesPageTest extends BaseTest {

    @Test
    public void verifySideBar_IndustriesPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        assertEquals(sideBar_IndustriesPage.getHealthcare(),"Healthcare");
        assertEquals(sideBar_IndustriesPage.getRetail(),"Retail & eCommerce");
        assertEquals(sideBar_IndustriesPage.getInsurance(),"Insurance");
        assertEquals(sideBar_IndustriesPage.getFinancial(),"Financial & Banking");
        assertEquals(sideBar_IndustriesPage.getSoftwareDevelopment(),"Software Development");
        assertEquals(sideBar_IndustriesPage.getGovernment(),"Government");
        assertEquals(sideBar_IndustriesPage.getMedia(),"Media / Entertainment");
        assertEquals(sideBar_IndustriesPage.getIoT(),"IoT / Connected Home");
        assertEquals(sideBar_IndustriesPage.getHealthAndWellness(),"Health / Wellness");
        assertEquals(sideBar_IndustriesPage.getMedicalDevices(),"Medical Devices / Radiology");
        assertEquals(sideBar_IndustriesPage.getUtilities(),"Utilities");
    }

    @Test
    public void goToHealthcarePage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        HealthcarePage healthcarePage = sideBar_IndustriesPage.goToHealthcarePage();
        assertEquals(healthcarePage.getHeader(),"Healthcare");
    }

    @Test
    public void goToRetailPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        RetailPage retailPage= sideBar_IndustriesPage.goToRetailPage();
        assertEquals(retailPage.getHeader(),"Retail & eCommerce");
    }

    @Test
    public void goToInsurancePage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        InsurancePage insurancePage= sideBar_IndustriesPage.goToInsurancePage();
        assertEquals(insurancePage.getHeader(),"Insurance");
    }

    @Test
    public void goToFinancialPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        FinancialPage financialPage = sideBar_IndustriesPage.goToFinancialPage();
        assertEquals(financialPage.getHeader(),"Financial & Banking");
    }

    @Test
    public void goToSoftwareDevelopmentPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        SoftwareDevelopmentPage softwareDevelopmentPage = sideBar_IndustriesPage.goToSoftwareDevelopmentPage();
        assertEquals(softwareDevelopmentPage.getHeader(),"Software Development");
    }

    @Test
    public void goToGovernmentPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        GovernmentPage governmentPage = sideBar_IndustriesPage.goToGovernmentPage();
        assertEquals(governmentPage.getHeader(),"Government");
    }

    @Test
    public void goToMediaPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        MediaPage mediaPage = sideBar_IndustriesPage.goToMediaPage();
        assertEquals(mediaPage.getHeader(),"Media / Entertainment");
    }

    @Test
    public void goToIoTPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        IoTPage ioTPage = sideBar_IndustriesPage.goToIoTPage();
        assertEquals(ioTPage.getHeader(),"IoT / Connected Home");
    }

    @Test
    public void goToHealthAndWellnessPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        HealthAndWellnessPage healthAndWellnessPage = sideBar_IndustriesPage.goToHealthAndWellnessPage();
        assertEquals(healthAndWellnessPage.getHeader(),"Health / Wellness");
    }

    @Test
    public void goToMedicalDevicesPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        MedicalDevicesPage medicalDevicesPage = sideBar_IndustriesPage.goToMedicalDevicesPage();
        assertEquals(medicalDevicesPage.getHeader(),"Medical Devices / Radiology");
    }

    @Test
    public void goToUtilitiesPage() {
        SideBarPage sideBarPage = homePage.goToTopNavPage().goToSideBarPage();
        sideBarPage.waitForXButton();
        SideBar_IndustriesPage sideBar_IndustriesPage = sideBarPage.openIndustriesTab();
        sideBar_IndustriesPage.waitForUtilities();
        UtilitiesPage utilitiesPage = sideBar_IndustriesPage.goToUtilitiesPage();
        assertEquals(utilitiesPage.getHeader(),"Utilities");
    }
}
