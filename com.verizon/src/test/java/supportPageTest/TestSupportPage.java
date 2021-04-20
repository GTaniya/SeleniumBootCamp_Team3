package supportPageTest;

import common.BaseAPI;
import io.cucumber.java.an.E;
import org.testng.Assert;
import org.testng.annotations.Test;
import supportPage.SupportPage;

public class TestSupportPage extends BaseAPI {

    SupportPage supportPage;

    @Test(enabled = false)
    public void testClickSupportButton() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.clickSupportButton();

        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }
    @Test(enabled = false)
    public void testSearchSupportOverview() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.searchSupportOverview();

        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon Support - Mobile & Home";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }
    @Test(enabled = false)
    public void testBillingAndPayments() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.billingAndPayments();

        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");

    }
    @Test(enabled = false)
    public void testDropDown() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.dropDown();

        Thread.sleep(2000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");

    }
    @Test(enabled = false)
    public void testDoSignIn() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.doSearchSignIn();

        Thread.sleep(2000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }
    @Test(enabled = false)
    public void testDoSearch() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.clickSupportButton();
        supportPage.clickSupportSignInLink();


        Thread.sleep(2000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "My Verizon Log In, Sign in to your Verizon Wireless or Fios Account";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testInputUserName() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.clickSupportButton();
        supportPage.clickSupportSignInLink();
        supportPage.enterPassword();

    }
    @Test(enabled = false)
    public void testPageTitle(){
        supportPage = new SupportPage();
        supportPage.clickDealsPage();


        String exp = "Phone Deals on iPhone, Galaxy, Pixel & More";
        String act = driver.getTitle();
        Assert.assertTrue(exp.equalsIgnoreCase(act));

    }
    @Test(enabled = false)
    public void testSearchVerizonVisaCard() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.searchVerizonVisaCard();


        Thread.sleep(2000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Save on Verizon Wireless Bill & Get Rewards | Verizon Visa Card";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");



    }
    @Test(enabled = false)
    public void testClickSiteMap() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.clickMap();


        Thread.sleep(2000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Home and Mobile Sitemap | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testVerizonFiveGPage() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.clickMap();
        supportPage.verizonFiveGPage();


        Thread.sleep(2000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon 5G: This is 5G Built Right | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test
    public void testSelectGetVerizonFiveG() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.clickMap();
        supportPage.verizonFiveGPage();
        supportPage.getVerizonFiveG();


        Thread.sleep(2000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon 5G: This is 5G Built Right | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

}



