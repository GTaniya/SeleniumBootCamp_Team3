package phoneAndDevicePageTest;

import common.BaseAPI;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;
import phoneAndDevicesPage.PhoneAndDevicePage;

import static phoneAndDevicesPage.PhoneAndDevicePageLocators.WEB_ELEMENT_CLICK_DESKTOP_MENU;

public class TestPhoneAndDevicePage extends BaseAPI {
    PhoneAndDevicePage phoneAndDevicePage;

    @Test(enabled = false)
    public void testPhoneAndDevicePage() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.clickPhoneAndDevicePageLink();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Phones, Cell Phones, & Smartphones from AT&T";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");
    }

    @Test(enabled = false)
    public void testPhoneAndDeviceDeals() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.doSearchPhoneAndDeviceDeals();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Deals on Phones, Wireless Plans, Internet & TV Services";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");
    }

    @Test(enabled = false)
    public void testInputSearchPhoneAndDevice() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.inputSearchPhoneAndDevice();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");
    }

    @Test(enabled = false)
    public void searchTabletAndPcs() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        // phoneAndDevicePage.clickCompareDeviceButton();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");
    }

    @Test(enabled = false)
    public void testSignInMyAtt() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.clickPhoneAndDevicePageLink();
        phoneAndDevicePage.clickDropDown();
        phoneAndDevicePage.signInSearch();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Login Screen";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testInterUserId() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.searchSmartWatches();
        phoneAndDevicePage.clickLowCostsSmartWatches();

        String expectedText ="user id";
        String actualText =driver.getTitle();

        Assert.assertTrue(expectedText.equalsIgnoreCase(actualText));



    }

    @Test(enabled = false)
    public void testClickMenuBar() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.doClickMenu();


        String expectedText ="search";
        String actualText =driver.getTitle();

        Assert.assertTrue(expectedText.equalsIgnoreCase(actualText));



    }

    @Test(enabled = false)
    public void testDeskTopMenuBar()  {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.doClickMenu();
        phoneAndDevicePage.openDesktopMenuBar();

        String expectedValue = "";
        softAssert.assertEquals(expectedValue,WEB_ELEMENT_CLICK_DESKTOP_MENU);


    }

    @Test(enabled = false)
    public void testClickExploreWireLessButton() {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.doClickMenu();
        phoneAndDevicePage.openDesktopMenuBar();
        phoneAndDevicePage.ClickExploreWireLess();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Wireless – Latest Phones & Best Wireless Plans";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testCheckWishList()  {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.checkWishListItems();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }

    @Test(enabled = false)
    public void testSelectPrice()  {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.selectPriceRadioOption();


       Assert.assertFalse(isElementSelected(phoneAndDevicePage.radioOptionPric));


    }
    @Test(enabled = false)
    public void testHomePhoneButton()  {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.doClickMenu();
        phoneAndDevicePage.clickHomePhoneFromMenu();




    Assert.assertFalse(isElementSelected(phoneAndDevicePage.exploreHomePhoneBar));


    }
    @Test
    public void testExploreHomePhoneBar()  {
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.doClickMenu();
        phoneAndDevicePage.clickHomePhoneFromMenu();
        phoneAndDevicePage.clickExploreHomePhone();




    }
}
