package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;

public class TestHomepage extends BaseAPI {

    Homepage homepage;

    //Test #1
    @Test(enabled = false)
    public void testSearchEarringUsingExcel() throws Exception {
        homepage = new Homepage();
        homepage.searchEarringsUsingExcel();
        softAssertAssertEqualsGetText(WEB_ELEMENT_EARRINGS, "earrings");
    }

    //Test #2
    @Test(enabled = false)
    public void testSearchMascaraUsingExcel() throws Exception {
        homepage = new Homepage();
        homepage.searchMascaraUsingExcel();
        softAssertAssertEqualsGetText(WEB_ELEMENT_MASCARA, "Mascara");
    }

    //Test#3
    @Test(enabled = false)
    public void testMenu() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickDropDown();
       // homepage.clickBeauty();


    }

    //Test#4
    @Test(enabled = false)
    public void testLocationSearch() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickStoresLink();
        homepage.SearchStoreLocation();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Find Macy's Department Store Near You - Macy's Store Locator";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

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
    @Test(enabled = false)
    public void testHover() throws InterruptedException {
        homepage = new Homepage();
        homepage.hoverOverSignInLink();

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

        softAssertEqualsGetTitle("Sign In - Macy's");


    }

    //Test#10
    @Test(enabled = true)
    public void testCheckBox() throws InterruptedException {
        homepage = new Homepage();
        homepage.navigateToSignInPage();
        homepage.clickCheckBox();

        softAssertEqualsGetTitle("Sign In - Macy's");


    }


}
