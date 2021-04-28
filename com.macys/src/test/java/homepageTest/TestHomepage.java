package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;


public class TestHomepage extends BaseAPI {

    Homepage homepage;

    //Test #1
    @Test(enabled = false)
    public void testSearchEarringUsingExcel() throws Exception {
        homepage = new Homepage();
        homepage.searchEarrings();

        String expectedHeader = "earrings";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_EARRINGS);

    }

    //Test #2
    @Test(enabled = false)
    public void testSearchMascaraUsingExcel() throws Exception {
        homepage = new Homepage();
        homepage.searchMascaraUsingExcel();

        String expectedHeader = "Mascara";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_MASCARA);
    }

    //Test#3
    @Test(enabled = false)
    public void testMenu() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickDropDown();
       // homepage.clickBeauty();
        Assert.assertTrue(isElementSelected(homepage.openDropDownDown));

    }

    //Test#4
    @Test(enabled = false)
    public void testLocationSearch() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickStoresLink();
        homepage.SearchStoreLocation();

        String expectedHeader = "Find a Macy's Store";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_STORES_TEXT_HEADER);


    }

    //Test#5
    @Test(enabled = false)
    public void testHelpPage() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickHelpLink();
        homepage.clickHelpLinkSeeAll();
        softAssertEqualsGetTitle("Macy's Customer Service Site");

    }

    //Test#6
    @Test(enabled = true)
    public void testHover() throws InterruptedException {
        homepage = new Homepage();
        homepage.hoverOverSignInLink();

        //Thread.sleep(4000);
        WebDriverWait wait10 = new WebDriverWait(driver, 20);
        String actualAttributeValue = homepage.hoverSignIn.getAttribute("class");
        String expectedAttributeValue = "tier-status";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS DOES NOT MATCH");

    }

    //Test#7
    @Test(enabled = false)
    public void testZipCode() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickCatalogLink();
        homepage.clickSearchBar();

    }

    //Test #8
    @Test(enabled = false)
    public void testStylistPage() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickStylistPageLink();
        homepage.clickStylistAppointmentLink();

        softAssertEqualsGetTitle("Personal Stylist - Book an Online Appointment - Macy's");
    }

    //Test #9
    @Test(enabled = false)
    public void testSignInPage() throws InterruptedException {
        homepage = new Homepage();
        homepage.navigateToSignInPage();
        homepage.addUserCredentials();
        homepage.clickCheckBox();
        WebDriverWait wait10 = new WebDriverWait(driver, 20);

        String expectedValue ="Secure Sign In";
        softAssert.assertEquals(expectedValue,WEB_ELEMENT_SIGN_IN_PAGE_HEADER );



    }

    //Test#10
    @Test(enabled = false)
    public void testCheckBox() throws InterruptedException {
        homepage = new Homepage();
        homepage.navigateToSignInPage();
        homepage.clickCheckBox();

        Assert.assertTrue(isElementSelected(homepage.checkBox));



    }


}
