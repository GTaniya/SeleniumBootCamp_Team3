package BuildYourOwnTest;

import common.BaseAPI;
import BuildYourOwn.BuildYourOwnPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBuildYourOwn extends BaseAPI {
    BuildYourOwnPage BuildYourOwn;

    @Test(enabled = false)
    public void testMenu() throws Exception {
       BuildYourOwn = new BuildYourOwnPage();

        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Build Your Own – Start Here – Choose A Series – BMW USA";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test
    public void testBuildThisVehicle() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();

        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildThisVehicle();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Build Your Own – Choose Exterior Designs & Trims – BMW USA";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }
}
