package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;


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
        implicitWait(20);
       // Assert.assertTrue(isElementSelected(homepage.radioOptionNike));

//        String actualText = driver.getTitle();
//
//        String expectedText = "Shoes | eBay";
//
//        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test #4
    @Test (enabled = false)
    public void testHover() throws Exception {
        homepage = new Homepage();
        homepage.hoverOverButton();
        implicitWait(20);

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
       implicitWait(20);

        String actualText = driver.getTitle();

        String expectedText = "Brand Outlet products for sale | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test#6
    @Test (enabled = false)
    public void testBrandOutletChampion() throws Exception {
        homepage = new Homepage();
        homepage.clickBrandOutletLink();
        homepage.clickBrandOutletChampionDiscount();
        implicitWait(20);

        String actualText = driver.getTitle();

        String expectedText = "Up to 50% off Champion | eBay. Great deals direct from the brand.";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }


    //Test#7
    @Test (enabled = false)
    public void testShoppingCart() throws Exception {
        homepage = new Homepage();
        homepage.clickShoppingCart();
        implicitWait(20);

        String expectedHeader = "You don't have any items in your cart.";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_CART_HEADER);

    }

    //Test#8
    @Test (enabled = false)
    public void testStartShoppingButton() throws Exception {
        homepage = new Homepage();
        homepage.clickShoppingCart();
        homepage.clickShoppingButton();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Electronics, Cars, Fashion, Collectibles & More | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test#9
    @Test (enabled = true)
    public void testSlideToPrevButton() throws Exception {
        homepage = new Homepage();
        homepage.clickSlidePrevButton();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Electronics, Cars, Fashion, Collectibles & More | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test#10
    @Test (enabled = false)
    public void testSlideToNextButton() throws Exception {
        homepage = new Homepage();
        homepage.clickSlideNextButton();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Electronics, Cars, Fashion, Collectibles & More | eBay";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

}
