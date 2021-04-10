package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends BaseAPI {

    Homepage homepage;

    @Test(enabled = false)
    public void testDoSearch() throws InterruptedException {
        homepage = new Homepage();

        homepage.doSearch();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Shoes | eBay";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

//    @Test ()
//    public void testSelectBMW() throws InterruptedException {
//
//        homepage = new Homepage();
//        homepage.doSearch();
//        homepage.scrollDown();
//        homepage.selectBMWRadioOption();
//
//        Assert.assertTrue(isElementSelected(homepage.radioOptionAdidas));
//    }
//
//    @Test ()
//    public void testSelectBenz() throws InterruptedException {
//        homepage = new Homepage();
//        homepage.doSearch();
//        homepage.scrollDown();
//        homepage.selectBenzRadioOption();
//
//        Assert.assertTrue(isElementSelected(homepage.radioOptionNike));
//    }

    @Test
    public void testSelectAdidas() throws InterruptedException {

        homepage = new Homepage();
        homepage.doSearch();
        homepage.clickRadioAdidasButton();
       // homepage.clickRadioNikeButton();

        String actualText = driver.getTitle();

        String expectedText = "Shoes | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }


}
