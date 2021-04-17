package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import io.cucumber.java.bs.A;
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

        String expectedTitle = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test #2
    @Test(enabled = false)
    public void testSignUp() {
        homepage = new Homepage();

        homepage.doToggleClick();

        String actualText = driver.getTitle();

        String expectedText = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualText, expectedText, "Test not found");

    }

    //Test #3
    @Test(enabled = true)
    public void testHelpCenter() {

        homepage = new Homepage();
        homepage.clickHelpCenterLink();
        homepage.clickSignIn();
        homepage.addContactInfo();
        homepage.doContinue();

        String actualResult = driver.getTitle();

        String expectedResult = "Log In / Sign Up";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }

    //Test #4
    @Test(enabled = false)
    public void testCareersLink() throws InterruptedException {

        homepage = new Homepage();
        homepage.clickCareersLink();
        homepage.clickExploreRolesButton();
        homepage.clickBusinessDevelopmentButton();
        homepage.clickQuestionsLink();

        String actualResult = driver.getTitle();

        String expectedResult = "Careers at Airbnb";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");

    }

    //Test #5
    @Test(enabled = false)
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

    //Test #6
    @Test(enabled = false)
    public void testAirbnbOrg() {

        homepage = new Homepage();
        homepage.clickAirbngOrgLink();
        homepage.clickWhoWeAreLink();
        homepage.clickDonateButton();


        String actualResult = driver.getTitle();

        String expectedResult = "Airbnb.org - About";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }

    //Test #7
    @Test(enabled = false)
    public void testDesignAndDecor() {

        homepage = new Homepage();
        homepage.clickResourceCenterLink();
        homepage.clickResourceCenterTopicsMenuButton();
        homepage.clickResourceCenterTopicsDesignDecorLink();

        String actualResult = driver.getTitle();

        String expectedResult = "Design & decor - Resource Center";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }

    //Test #8
    @Test(enabled = false)
    public void testGuideMenu() {
        homepage = new Homepage();
        homepage.clickResourceCenterLink2();
        homepage.clickResourceCenterGuideMenuButton();
        homepage.clickResourceCenterGuideSettingListing();

        String actualResult = driver.getTitle();

        String expectedResult = "Setting up a successful listing - Resource Center";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");

    }

    //Test #9
    @Test(enabled = false)

    public void testOceanCityImageLink() {
        homepage = new Homepage();
        homepage.clickOceanCityImageLink();
        homepage.clickOceanCityTypeOfPlaceButton();

        String actualResult = driver.getTitle();

        String expectedResult = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }


    //Test #10
    @Test(enabled = false)

    public void testLanguage() {
        homepage = new Homepage();
        homepage.clickLanguageButton();
        homepage.clickLanguageItaliaButton();

        String actualResult = driver.getTitle();

        String expectedResult = "Case vacanze, alloggi, esperienze e luoghi - Airbnb";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");

    }

    //Test #11

    @Test(enabled = false)

    public void testInvestors() {

        homepage = new Homepage();
        homepage.clickInvestorsLink();
        homepage.clickInvestorsQuarterlyResults();

        String actualResult = driver.getTitle();

        String expectedResult = "Investor Relations | Airbnb | Financials";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }

    //Test #12
    @Test(enabled = false)

    public void testStockQuote() {

        homepage = new Homepage();
        homepage.clickInvestorsLink();
        homepage.clickInvestorsStockInfoButton();
        homepage.clickInvestorsStockInfoQuoteButton();

        String actualResult = driver.getTitle();

        String expectedResult = "Investor Relations | Airbnb | Stock Info";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");


    }

    //Test #13
    @Test(enabled = false)

    public void testDoSubmit() {
        homepage = new Homepage();
        homepage.clickAirBnBLink();
        homepage.addEmail();
        homepage.submitEmail();

        String actualResult = driver.getTitle();

        String expectedResult = "Business Travel – Airbnb";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }

    //Test #14
    @Test(enabled = false)

    public void testAboutUs() {

        homepage = new Homepage();
        homepage.clickFoundersLetterLink();


        String actualResult = driver.getTitle();

        String expectedResult = "What Makes Airbnb, Airbnb";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }

}
