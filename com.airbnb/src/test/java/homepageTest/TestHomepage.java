package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends BaseAPI {
    Homepage homepage;

    @Test
    public void testDoSearch() throws InterruptedException {
        homepage = new Homepage();

        homepage.doSearch();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    @Test
    public void testSignUp() {
        homepage = new Homepage();

        homepage.doToggleClick();

        String actualText = driver.getTitle();

        String expectedText = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualText, expectedText, "Test not found");

    }


    @Test
    public void testHelpCenter(){

        homepage = new Homepage();
        homepage.clickHelpCenterLink();
        homepage.clickSignIn();
        homepage.addContactInfo();
        homepage.doContinue();

        String actualResult = driver.getTitle();

        String expectedResult = "Log In / Sign Up";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }

    @Test
    public void testCareersLink() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickCareersLink();
        homepage.clickExploreRolesButton();
        homepage.clickBusinessDevelopmentButton();
        homepage.clickQuestionsLink();

        String actualResult = driver.getTitle();

        String expectedResult = "FAQ - Careers at Airbnb";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");

    }

    @Test
    public void testGiftCard() {

        homepage = new Homepage();
        homepage.clickGiftCardsLink();
        homepage.clickBuyGiftCardsLink();
        homepage.clickGiftCards25Button();
        homepage.clickSendByTextCheckBox();
        homepage.addRecipientMessage();
        homepage.addRecipientEmail();
        homepage.addRecipientMessage();
        homepage.addSenderName();
        homepage.clickAddToCartButton();

        String actualResult = driver.getTitle();

        String expectedResult = "Airbnb Gift Cards";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");


    }

    @Test
    public void testAirbnbOrg(){

        homepage = new Homepage();
        homepage.clickAirbngOrgLink();
        homepage.clickWhoWeAreLink();
        homepage.clickDonateButton();


        String actualResult = driver.getTitle();

        String expectedResult = "Airbnb.org - About";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }


}

