package BuildYourOwnTest;

import common.BaseAPI;
import BuildYourOwn.BuildYourOwnPage;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    @Test(enabled = false)
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

    @Test(enabled = false)
    public void testSelectSeries() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();

        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        BuildYourOwn.clickSelectSeries();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Build Your Own – Choose Exterior Designs & Trims – BMW USA";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testX5() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();

        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        BuildYourOwn.clickX5();
        Thread.sleep(2000);
       // String actualResults = BaseAPI.driver.getTitle();
       // String expectedResults = "Build Your Own – Start Here – Choose A Series – BMW USA";
       // Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testX5Select() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();
        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        BuildYourOwn.clickX5();
        Thread.sleep(2000);
        BuildYourOwn.clickX5SelectButton();
        Thread.sleep(2000);
        BuildYourOwn.clickX5DesignButton();
        Thread.sleep(2000);
        BuildYourOwn.clickX5ExteriorButton();
        Thread.sleep(2000);
        BuildYourOwn.clickX5JetBlack();
        Thread.sleep(2000);

        //WebDriverWait wait = new WebDriverWait(driver,20);

       // BuildYourOwn.navigateToX5();
       // Thread.sleep(2000);
       // BuildYourOwn.clickX5SelectButton();
       // Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testX5Estimate() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();
        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        BuildYourOwn.clickX5();
        Thread.sleep(2000);
        BuildYourOwn.clickX5SelectButton();
        Thread.sleep(2000);
        BuildYourOwn.clickX5DesignButton();
        Thread.sleep(2000);
        BuildYourOwn.clickX5Summary();
        Thread.sleep(2000);
  //      BuildYourOwn.clickX5EstimatePayment();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testX5EstimatePaymentSendKey() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();
        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        BuildYourOwn.clickX5();
        Thread.sleep(2000);
        BuildYourOwn.clickX5SelectButton();
        Thread.sleep(2000);
        BuildYourOwn.clickX5DesignButton();
        Thread.sleep(2000);
        BuildYourOwn.clickX5Summary();
        Thread.sleep(2000);
       // BuildYourOwn.clickX5EstimatePayment();
        Thread.sleep(2000);
        BuildYourOwn.searchEstimateValue();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testSearch() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();
         BuildYourOwn.clickBMWCenter();
         Thread.sleep(2000);
        BuildYourOwn.setBmwCenterZIPSearch();
    }

    @Test
    public void testZ4Shadowline() throws Exception {
        BuildYourOwn = new BuildYourOwnPage();
        BuildYourOwn.clickMenu();
        Thread.sleep(2000);
        BuildYourOwn.clickBuildYourOwnPage();
        Thread.sleep(2000);
        BuildYourOwn.clickZ4();
        Thread.sleep(2000);
        BuildYourOwn.clickZ4Select();
        Thread.sleep(2000);
        BuildYourOwn.clickZ4Design();
        Thread.sleep(2000);
        BuildYourOwn.clickZ4Shadowline();
        Thread.sleep(2000);
    }



}
