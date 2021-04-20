package fashionPageTest;

import common.BaseAPI;
import fashionPage.FashionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFashionPage extends BaseAPI {

    FashionPage fashionPage;

    @Test(enabled = false)
    public void testClickFashionButton() throws InterruptedException {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();


        Thread.sleep(15000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fashion products for sale | eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testClickShopByCategory() throws InterruptedException {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickShopByCategory();

        Thread.sleep(1000);


    }

    @Test(enabled = false)
    public void testClickFashionWomanPage() throws InterruptedException {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickShopByCategory();
        fashionPage.clickFashionWoman();

        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Women's Clothing for Sale - eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }

    @Test(enabled = false)
    public void testSearchDressPage() throws InterruptedException {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickShopByCategory();
        fashionPage.clickFashionWoman();

        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Women's Clothing for Sale - eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testClickJewelryDropDown() {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickJeweleryDropDown();


    }

    @Test(enabled = false)
    public void testSearchJewelryPage() throws InterruptedException {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.searchJewelryPage();

        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Jewelry for Sale - Shop Fashion & Fine Jewelry - eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testDropDownMyEbayMenuBar() throws InterruptedException {
        fashionPage = new FashionPage();
        fashionPage.dropDownMyEbayMenu();

        Thread.sleep(1000);
    }
    @Test(enabled = false)
    public void doSearchFineJewelry(){
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.doSearchFineJewelry();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fine Jewelry for Sale - Shop New & Pre-Owned Designer Jewelry - eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testClickRegistrationButton(){
        fashionPage = new FashionPage();
        fashionPage.clickRegistrationButton();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Your eBay account | eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testSignInYourAccount(){
        fashionPage = new FashionPage();
        fashionPage.clickRegistrationButton();
        fashionPage.signInYourAccount();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Signing in to your account | eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testSignUpEbayAccount(){
        fashionPage = new FashionPage();
        fashionPage.clickRegistrationButton();
        fashionPage.signUpEbayAccount();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Register an account | eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testClickCheckBoxBorder(){
        fashionPage = new FashionPage();
        fashionPage.clickRegistrationButton();
        fashionPage.signUpEbayAccount();
        fashionPage.clickCheckBoxBorder();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Security Measure";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testSearchSellAndEvent(){
        fashionPage = new FashionPage();
        fashionPage.searchSailAndEvent();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Sales & Events products for sale | eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testSearchDealPage(){
        fashionPage = new FashionPage();
        fashionPage.searchDeals();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fashion Deals on eBay | Best deals and Free shipping";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testDropDownFeature(){
        fashionPage = new FashionPage();
        fashionPage.searchDeals();
        fashionPage.dropDownFeatures();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fashion Deals on eBay | Best deals and Free shipping";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test
    public void testClickBoostDeals(){
        fashionPage = new FashionPage();
        fashionPage.searchDeals();
        fashionPage.dropDownFeatures();
        fashionPage.clickBoostDeal();

    }

}
