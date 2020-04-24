package homepage.topnavtests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.industriespages.*;
import pages.topnavpages.TopNavPage;
import pages.topnavpages.TopNav_IndustriesPage;

import static org.testng.Assert.assertEquals;

public class TopNav_IndustriesTest extends BaseTest {

    @Test
    public void verifyIndustriesTab() {
        TopNavPage topNavPage = homePage.goToTopNavPage();
        assertEquals(topNavPage.getIndustries(),"Industries");
        TopNav_IndustriesPage topNav_IndustriesPage = topNavPage.goToTopNav_IndustriesPage();
        topNav_IndustriesPage.hoverOverIndustries();
        assertEquals(topNav_IndustriesPage.getIndustries_Healthcare(),"Healthcare");
        assertEquals(topNav_IndustriesPage.getIndustries_Retail(),"Retail & eCommerce");
        assertEquals(topNav_IndustriesPage.getIndustries_Insurance(),"Insurance");
        assertEquals(topNav_IndustriesPage.getIndustries_Financial(),"Financial & Banking");
        assertEquals(topNav_IndustriesPage.getIndustries_Software(),"Software Development");
        assertEquals(topNav_IndustriesPage.getIndustries_IoT(),"IoT / Connected Home");
        assertEquals(topNav_IndustriesPage.getIndustries_Government(),"Government");
        assertEquals(topNav_IndustriesPage.getIndustries_Media(),"Media / Entertainment");
        assertEquals(topNav_IndustriesPage.getIndustries_Health(),"Health & Wellness");
        assertEquals(topNav_IndustriesPage.getIndustries_MedicalDevices(),"Medical Devices / Radiology");
        assertEquals(topNav_IndustriesPage.getIndustries_Utilities(),"Utilities");
    }

    @Test
    public void goToHealthcare() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        HealthcarePage healthcarePage = topNav_industriesPage.goToHealthCarePage();
        assertEquals(healthcarePage.getHeader(), "Healthcare");
    }

    @Test
    public void goToRetailPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        RetailPage retailPage = topNav_industriesPage.goToRetailPage();
        assertEquals(retailPage.getHeader(), "Retail & eCommerce");
    }

    @Test
    public void goToInsurancePage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        InsurancePage insurancePage = topNav_industriesPage.goToInsurancePage();
        assertEquals(insurancePage.getHeader(), "Insurance");
    }

    @Test
    public void goToFinancialPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        FinancialPage financialPage = topNav_industriesPage.goToFinancialPage();
        assertEquals(financialPage.getHeader(), "Financial & Banking");
    }

    @Test
    public void goToSoftwareDevelopmentPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        SoftwareDevelopmentPage softwareDevelopmentPage = topNav_industriesPage.goToSoftwareDevelopmentPage();
        assertEquals(softwareDevelopmentPage.getHeader(), "Software Development");
    }

    @Test
    public void goToIoTPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        IoTPage ioTPage = topNav_industriesPage.goToIoTPage();
        assertEquals(ioTPage.getHeader(), "IoT / Connected Home");
    }

    @Test
    public void goToGovernmentPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        GovernmentPage governmentPage = topNav_industriesPage.goToGovernmentPage();
        assertEquals(governmentPage.getHeader(), "Government");
    }

    @Test
    public void goToMediaPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        MediaPage mediaPage = topNav_industriesPage.goToMediaPage();
        assertEquals(mediaPage.getHeader(), "Media / Entertainment");
    }

    @Test
    public void goToHealthAndWellnessPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        HealthAndWellnessPage healthAndWellnessPage = topNav_industriesPage.goToHealthAndWellnessPage();
        assertEquals(healthAndWellnessPage.getHeader(), "Health / Wellness");
    }

    @Test
    public void goToMedicalDevicesPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        MedicalDevicesPage medicalDevicesPage = topNav_industriesPage.goToMedicalDevicesPage();
        assertEquals(medicalDevicesPage.getHeader(), "Medical Devices / Radiology");
    }

    @Test
    public void goToUtilitiesPage() {
        TopNav_IndustriesPage topNav_industriesPage = homePage.goToTopNavPage().goToTopNav_IndustriesPage();
        topNav_industriesPage.hoverOverIndustries();
        UtilitiesPage utilitiesPage = topNav_industriesPage.goToUtilitiesPage();
        assertEquals(utilitiesPage.getHeader(), "Utilities");
    }

}
