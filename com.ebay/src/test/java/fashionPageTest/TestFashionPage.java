package fashionPageTest;

import common.BaseAPI;
import fashionPage.FashionPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static fashionPage.FashionPageLocators.*;

public class TestFashionPage extends BaseAPI {

    FashionPage fashionPage;

    @Test(enabled = false)
    public void testClickFashionButton(){
        fashionPage = new FashionPage();
        fashionPage.fashionButton();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fashion products for sale | eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testClickShopByCategory()  {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickShopByCategory();


        String expectedTest = "button";
        String actualText = driver.findElement(By.xpath("//'[@id=\"mainContent']/section[1]/div[2]/a[1]/div[2]")).getAttribute("type");

        Assert.assertEquals(actualText,expectedTest,"Test Failed");


    }

    @Test(enabled = false)
    public void testClickFashionWomanPage() {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickShopByCategory();
        fashionPage.clickFashionWoman();



        String expectedTest = "button";
        String actualText = driver.findElement(By.xpath("//a[.='Women']")).getAttribute("type");

        Assert.assertEquals(actualText,expectedTest,"Test Failed");


    }

    @Test(enabled = false)
    public void testSearchDressPage(){
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickShopByCategory();
        fashionPage.clickFashionWoman();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Women's Clothing for Sale - eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testClickJewelryDropDown() {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.clickJeweleryDropDown();

        String expectedText ="b-accordion-text";
        String actualText =fashionPage.clickJewelery.getAttribute("class");

        Assert.assertEquals(actualText,expectedText,"Test Doesn't Work");


    }

    @Test(enabled = false)
    public void testSearchJewelryPage() {
        fashionPage = new FashionPage();
        fashionPage.fashionButton();
        fashionPage.searchJewelryPage();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Jewelry for Sale - Shop Fashion & Fine Jewelry - eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testDropDownMyEbayMenuBar() {
        fashionPage = new FashionPage();
        fashionPage.dropDownMyEbayMenu();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fashion products for sale | eBay";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");



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
    @Test(enabled = false)
    public void testClickBoostDeals(){
        fashionPage = new FashionPage();
        fashionPage.searchDeals();
        fashionPage.dropDownFeatures();
        fashionPage.clickBoostDeal();


        String expectedValue = "";
        softAssert.assertEquals(expectedValue,WEB_ELEMENT_CLICK_BOOST_DEALS);

    }
    @Test(enabled = false)
    public void testHoverHomeAndGarden(){
        fashionPage = new FashionPage();
        fashionPage.hoverHomeAndGardenButton();

        String exp="Home & Garden";
        softAssert.assertEquals(exp,WEB_ELEMENT_HOVER_HOME_AND_GARDEN);
    }
    @Test(enabled = false)
    public void testClickBathIcon(){
        fashionPage = new FashionPage();
        fashionPage.hoverHomeAndGardenButton();
        fashionPage.searchVacuums();


      String expectedText ="vacuums";
      softAssert.assertEquals(expectedText,WEB_ELEMENT_DO_SEARCH_VACUUMS);


    }
    @Test(enabled = false)
    public void testSelectVacuumBrand() {
        fashionPage = new FashionPage();
        fashionPage.hoverHomeAndGardenButton();
        fashionPage.searchVacuums();
        fashionPage.selectVacuumBrand();

        String expectedText = "Dyson Stick Vacuum Cleaners";
        softAssert.assertEquals(expectedText,WEB_ELEMENT_PEAK_VACUUM_HEADER);


    }
    @Test(enabled = false)
    public void testPeakYourItem(){
        fashionPage = new FashionPage();
        fashionPage.hoverHomeAndGardenButton();
        fashionPage.searchVacuums();
        fashionPage.selectVacuumBrand();
        fashionPage.peakYourItem();




    }
    @Test
    public void testSearchBags() throws Exception {
        fashionPage = new FashionPage();
        fashionPage.searchBags();

        String expectedText = " shoes";
        softAssert.assertEquals(expectedText,WEB_ELEMENT_INPUT_SEARCH_BAGS);
    }


}

