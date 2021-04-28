package supportPageTest;

import common.BaseAPI;
import io.cucumber.java.an.E;
import org.testng.Assert;
import org.testng.annotations.Test;
import supportPage.SupportPage;

public class TestSupportPage extends BaseAPI {

    SupportPage supportPage;

    @Test(enabled = false)
    public void testClickSupportButton() {
        supportPage = new SupportPage();
        supportPage.clickSupportButton();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }

    @Test(enabled = false)
        public void testSearchVerizonVisa() {
            supportPage = new SupportPage();
            supportPage.searchSupportOverview();


            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Verizon Support - Mobile & Home";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

        }


    @Test(enabled = false)
    public void testBillingAndPayments() {
        supportPage = new SupportPage();
        supportPage.billingAndPayments();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testDropDown() {
        supportPage = new SupportPage();
        supportPage.dropDown();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testDoSignIn() {
        supportPage = new SupportPage();
        supportPage.doSearchSignIn();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }


        @Test(enabled = false)
        public void testDoSearch () {
            supportPage = new SupportPage();
            supportPage.clickSupportButton();
            supportPage.clickSupportSignInLink();


            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "My Verizon Log In, Sign in to your Verizon Wireless or Fios Account";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

        }
        @Test(enabled = false)
        public void testInputUserName () {
            supportPage = new SupportPage();
            supportPage.clickSupportButton();
            supportPage.clickSupportSignInLink();
            supportPage.enterPassword();

        }
        @Test(enabled = false)
        public void testPageTitle () {
            supportPage = new SupportPage();
            supportPage.clickDealsPage();


            String exp = "Phone Deals on iPhone, Galaxy, Pixel & More";
            String act = driver.getTitle();
            Assert.assertTrue(exp.equalsIgnoreCase(act));

        }
        @Test(enabled = false)
        public void testSearchVerizonVisaCard () {
            supportPage = new SupportPage();
            supportPage.searchVerizonVisaCard();


            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Save on Verizon Wireless Bill & Get Rewards | Verizon Visa Card";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


        }
        @Test(enabled = false)
        public void testClickSiteMap () {
            supportPage = new SupportPage();
            supportPage.clickMap();


            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Home and Mobile Sitemap | Verizon";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


        }
        @Test(enabled = false)
        public void testVerizonFiveGPage () {
            supportPage = new SupportPage();
            supportPage.clickMap();
            supportPage.verizonFiveGPage();


            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Verizon 5G: This is 5G Built Right | Verizon";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

        }
        @Test
        public void testSelectGetVerizonFiveG () {
            supportPage = new SupportPage();
            supportPage.clickMap();
            supportPage.verizonFiveGPage();
            supportPage.getVerizonFiveG();


            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Verizon 5G: This is 5G Built Right | Verizon";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

        }

    }



