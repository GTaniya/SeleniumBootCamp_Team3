package hostYourHomePageTest;

import common.BaseAPI;
import hostYourHomePage.HostYourHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHostYourHomePage extends BaseAPI {
    HostYourHomePage hostYourHomePage;

    @Test(enabled = false)
    public void testNavigateToHomepage(){
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults,expectedResults,"Test failed");
    }

    @Test(enabled = false)
    public void testExploreTheWorld()throws Exception{
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickExploreTheWorld();
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults,expectedResults,"Test failed");
    }

    @Test
    public void testGetStarted()throws Exception{
        hostYourHomePage = new HostYourHomePage();

        hostYourHomePage.clickHostYourPage();
        Thread.sleep(2000);
        hostYourHomePage.clickWebinar();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Host your home on Airbnb";
        Assert.assertEquals(actualResults,expectedResults,"Test failed");
    }




}
