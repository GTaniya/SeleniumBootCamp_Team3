package InternetTestCase;

import common.BaseAPI;
import InternetTestCase.InternetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInternetPage extends BaseAPI {
    InternetPage InternetTestCase;

    @Test(enabled = false)
    public void testNavigateToInternetPage() {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T INTERNET | Internet for your Home including AT&T Fiber";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testPlansPrices() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickPlansPrices();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Internet Plans & Services - Plans, Speeds & Prices | AT&T INTERNET";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testEquipment() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickEquipment();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Home Internet Services & AT&T Wi-Fi Gateway | AT&T Internet";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testBundles() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickBundles();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T Bundles | Our Best TV & Internet Bundles & Packages";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testCheckAvailability() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickCheckAvailability();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T Bundles | Our Best TV & Internet Bundles & Packages";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testConsistentSpeed() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickConsistentSpeed();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Shop AT&T Bundles";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testReliability() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickReliability();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Shop AT&T Bundles";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testAnnualContract() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickAnnualContract();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Shop AT&T Bundles";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testRatedOne() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickRatedOne();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Shop AT&T Bundles";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testShopInternet() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickShopInternet();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T INTERNET | Internet for your Home including AT&T Fiber";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testDownloadApp() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickDownloadApp();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Login Screen";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testFastestInternet() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickFastestInternet();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T Fiber Internet – A Faster Connection | AT&T Internet";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testRuralArea() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickRuralArea();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T Fixed Wireless Internet - Rural Internet Without a Satellite";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testExploreInternet() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickExploreInternet();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T INTERNET | Internet for your Home including AT&T Fiber";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test
    public void testUverse() throws Exception {
        InternetTestCase = new InternetPage();

        InternetTestCase.clickInternetPage();
        Thread.sleep(2000);
        InternetTestCase.clickUverse();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "AT&T U-verse Internet Plans - AT&T® Official Site";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }
}
