package phoneAndDevicePageTest;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import phoneAndDevicesPage.PhoneAndDevicePage;

public class TestPhoneAndDevicePage extends BaseAPI {
    PhoneAndDevicePage phoneAndDevicePage;

    @Test(enabled = false)
    public void testPhoneAndDevicePage(){
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.clickPhoneAndDevicePageLink();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Phones, Cell Phones, & Smartphones from AT&T";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled =false)
    public void testPhoneAndDeviceDeals(){
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.doSearchPhoneAndDeviceDeals();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Deals on Phones, Wireless Plans, Internet & TV Services";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void testInputSearchPhoneAndDevice(){
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.inputSearchPhoneAndDevice();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void searchTabletAndPcs(){
        phoneAndDevicePage = new PhoneAndDevicePage();
       // phoneAndDevicePage.clickCompareDeviceButton();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void testSignInMyAtt(){
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.clickPhoneAndDevicePageLink();
        phoneAndDevicePage.clickDropDown();
        phoneAndDevicePage.signInSearch();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Login Screen";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");

    }
    @Test
    public void testInterUserId(){
        phoneAndDevicePage = new PhoneAndDevicePage();
        phoneAndDevicePage.searchSmartWatches();
        phoneAndDevicePage.clickLowCostsSmartWatches();


    }

}
