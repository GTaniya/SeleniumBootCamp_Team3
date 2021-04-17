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
        Thread.sleep(4000);

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
    @Test(enabled = true)
    public void testHover() throws InterruptedException {
        homepage = new Homepage();
        homepage.hoverOverSignInLink();
        Thread.sleep(6000);
    }




}
