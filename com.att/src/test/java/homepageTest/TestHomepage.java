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

        String expectedTitle = "Results for Iphone - AT&T Search";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    @Test (enabled = false)

    public void testDeals(){
        homepage = new Homepage();
        homepage.clickDealsLink();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "AT&T Deals on Phones, Wireless Plans, Internet & TV Services";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    @Test (enabled = false)

    public void testDropDown() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickDropDownMenu();
        Thread.sleep(4000);


    }

    @Test (enabled = false)

    public void testDropDownClickInternet() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickDropDownMenu();
        homepage.clickDropDownMenuInternet();
        Thread.sleep(4000);
    }

    @Test (enabled = false)

    public void testExploreInternet(){

        homepage = new Homepage();
        homepage.clickDropDownMenu();
        homepage.clickDropDownMenuInternet();
        homepage.clickDropDownMenuExploreInternet();


        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "AT&T INTERNET | Internet for your Home including AT&T Fiber";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    @Test (enabled = false)

    public void testShopNowButton(){

        homepage = new Homepage();
        homepage.clickShopNowButton();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Apple iPhone 11 64 GB - $10/mo. at AT&T";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    @Test (enabled = false)

    public void testPhoneFeaturesColor() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickShopNowButton();
        homepage.clickToSelectPhoneColor();
        Thread.sleep(4000);
    }

    //Test 8

    @Test (enabled = false)

    public void testPhoneFeaturesCapacity() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickShopNowButton();
        homepage.clickToSelectPhoneCapacity();
        Thread.sleep(4000);
    }

    @Test (enabled = false)

    public void testAttTv() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickAttTvButton();
        homepage.clickAttTvLineUpButton();
        Thread.sleep(2000);

    }

    @Test (enabled = false)

    public void testAttChannels() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickAttTvButton();
        homepage.clickAttTvLineUpButton();
        homepage.doSearchChannel();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "AT&T TV Channel Lineup List";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    @Test (enabled = false)

    public void testAtOZChannels() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickAttTvButton();
        homepage.clickAttTvLineUpButton();
        homepage.findAtoZChannels();
        homepage.findAtoZChannelsClickCategory();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "AT&T TV Channel Lineup List";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }


    //Test 12
    @Test (enabled = false)

    public void testInternationalChannels() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickAttTvButton();
        homepage.clickAttTvLineUpButton();
        homepage.findAtoZChannels();
        homepage.findAtoZChannelsClickCategory();
        homepage.findInternationalChannelsFromCategory();
       // Thread.sleep(4000);
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "AT&T TV Channel Lineup List";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    @Test (enabled = false)
    public void testNavigateToPager() throws Exception {
        homepage = new Homepage();
        homepage.navigateToPrepaidPage();

    }

    @Test (enabled = true)
    public void testHover() throws Exception {
        homepage = new Homepage();
        homepage.navigateToPrepaidPage();
        homepage.hoverOverButtonShopNow();
        Thread.sleep(4000);



    }
}


























