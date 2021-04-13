package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends BaseAPI {

    Homepage homepage;

    //Test#1

    @Test(enabled = false)
    public void testDoSearch() throws InterruptedException {
        homepage = new Homepage();

        homepage.doSearch();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Shoes | eBay";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }


    //Test#2
    @Test(enabled = false)
    public void testSelectAdidas() throws InterruptedException {

        homepage = new Homepage();
        homepage.doSearch();

        homepage.clickRadioAdidasButton();

        String actualText = driver.getTitle();

        String expectedText = "Shoes | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test #3
    @Test(enabled = false)
    public void testSelectNike() throws InterruptedException {

        homepage = new Homepage();
        homepage.doSearch();

        homepage.clickRadioNikeButton();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Shoes | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test #4
    @Test (enabled = false)
    public void testHover() throws Exception {
        homepage = new Homepage();
        homepage.hoverOverButton();
        Thread.sleep(4000);

        String actualAttributeValue = homepage.hoverOverTheButton.getAttribute("class");
        String expectedAttributeValue = "hl-cta__default hl-cta__default-js hl-loyalty__call-to-action";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "COLOR DOES NOT MATCH");
    }

    //Test#5
    @Test (enabled = false)
    public void testBrandOutletPage() throws Exception {
        homepage = new Homepage();
        homepage.clickBrandOutletLink();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Brand Outlet products for sale | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test#6
    @Test (enabled = true)
    public void testBrandOutletChampion() throws Exception {
        homepage = new Homepage();
        homepage.clickBrandOutletLink();
        homepage.clickBrandOutletChampionDiscount();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Up to 50% off Champion | eBay. Great deals direct from the brand.";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }



}
