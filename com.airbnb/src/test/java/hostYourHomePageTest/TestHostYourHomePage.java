package hostYourHomePageTest;

import common.BaseAPI;
import hostYourHomePage.HostYourHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHostYourHomePage extends BaseAPI {
    HostYourHomePage hostYourHomePage;

    @Test(enabled = false)
    public void testNavigateToHomepage() {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testExploreTheWorld() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickExploreTheWorld();
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testGetStarted() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickWebinar();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testSupportHost() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickWebinar();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testHostProtection() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickHostProtection();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");


    }

    @Test(enabled = false)
    public void testCovidSafety() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickCovidSafety();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testGuestStandard() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickGuestStandard();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testGuestSpace() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickGuestSpace();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testGuestExpect() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickGuestExpect();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testGuestRegulate() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickGuestRegulate();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test(enabled = false)
    public void testEarnMoney() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickEarnMoney();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }

    @Test
    public void testGetStartedWithAirbnb() throws Exception {
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickGetStarted();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");

    }
}
