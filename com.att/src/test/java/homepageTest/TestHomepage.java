package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends BaseAPI {
    Homepage homepage;

    //Test #1
    @Test(enabled = false)
    public void testDoSearch() throws InterruptedException {
        homepage = new Homepage();

        homepage.doSearch();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Results for Iphone - AT&T Search";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test #2
    @Test (enabled = false)

    public void testDeals(){
        homepage = new Homepage();
        homepage.clickDealsLink();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "AT&T Deals on Phones, Wireless Plans, Internet & TV Services";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #3
    @Test (enabled = false)

    public void testDropDown() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickDropDownMenu();
        WebDriverWait wait = new WebDriverWait(driver, 20);


    }

    //Test #4
    @Test (enabled = false)

    public void testDropDownClickInternet() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickDropDownMenu();
        homepage.clickDropDownMenuInternet();
        WebDriverWait wait = new WebDriverWait(driver, 20);
    }

    //Test #5
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

    //Test #6
    @Test (enabled = false)

    public void testShopNowButton(){

        homepage = new Homepage();
        homepage.clickShopNowButton();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Apple iPhone 11 64 GB - $10/mo. at AT&T";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #7
    @Test (enabled = true)

    public void testPhoneFeaturesColor() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickShopNowButton();
        homepage.clickToSelectPhoneColor();
        WebDriverWait wait = new WebDriverWait(driver, 20);
    }

    //Test #8

    @Test (enabled = false)

    public void testPhoneFeaturesCapacity() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickShopNowButton();
        homepage.clickToSelectPhoneCapacity();
        WebDriverWait wait = new WebDriverWait(driver, 20);
    }

    //Test #9
    @Test (enabled = false)

    public void testAttTv() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickAttTvButton();
        homepage.clickAttTvLineUpButton();
        WebDriverWait wait = new WebDriverWait(driver, 20);
    }

    //Test #10
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

    //Test #11
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

    //Test #13
    @Test (enabled = false)
    public void testNavigateToPager() throws Exception {
        homepage = new Homepage();
        homepage.navigateToPrepaidPage();

    }

    //Test #14
    @Test (enabled = true)
    public void testHover() throws Exception {
        homepage = new Homepage();
        homepage.navigateToPrepaidPage();
        homepage.hoverOverButtonShopNow();
        WebDriverWait wait = new WebDriverWait(driver, 20);



    }
}


























