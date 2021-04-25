package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;

public class TestHomepage extends BaseAPI {

    Homepage homepage;

    //Test #1
    @Test(enabled = false)
    public void testDoSearch() {
        homepage = new Homepage();

        homepage.searchByCity();

        String expectedHeader = "Apartments For Rent in Germantown, MD";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_INPUT_SEARCH_RESULT);
    }

    //Test #2
    @Test(enabled = false)
    public void testSignUp() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickSignUp();
        implicitWait(20);
        homepage.sendKeysToSearchBar();
        fluentWait(40);

//      WebDriverWait wait = new WebDriverWait(driver, 40);

        String expectedHeader = "Sign in or register to save your favorite homes";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_SIGNUP_HEADER);
    }


    //Test #3
    @Test(enabled = false)
    public void testHoverOver() {
        homepage = new Homepage();
        homepage.hoverOverFindHome();
        String actualAttributeValue = homepage.findHomeButton.getAttribute("class");
        String expectedAttributeValue = "ButtonBase-sc-14ooajz-0 PrimaryButton-sc-16zopmz-0 kgAvoi";

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS NOT FOUND");
    }

    //Test #4
    @Test(enabled = false)
    public void testSelectIteMFromHamburger() {
        homepage = new Homepage();
        homepage.clickHamburgerMenu();
        homepage.clickAdditionResources();
        implicitWait(40);
    }

    //Test #5
    @Test(enabled = false)
    public void testHelpCenter() {
        homepage = new Homepage();
        homepage.clickHamburgerMenu();
        homepage.clickAdditionResources();
        homepage.clickHelpCenter();
        implicitWait(40);

        String expectedHeader = "trulia Help Center home page";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_HELP_CENTER_HEADER);
    }

    //Test #6
    @Test(enabled = false)
    public void testHelpCenterProfessionals() {
        homepage = new Homepage();
        homepage.clickHamburgerMenu();
        homepage.clickAdditionResources();
        homepage.clickHelpCenter();
        homepage.clickRealStateProfessionals();
        implicitWait(40);

        String expectedHeader = "Real Estate Professionals";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_HELP_CENTER_REAL_STATE_PROFESSIONALS_HEADER);
    }

    //Test #7
    @Test(enabled = false)
    public void testSelectItemFromSlideShow() {
        homepage = new Homepage();
        homepage.navigateToNeighborhoodGuide();
        implicitWait(20);
        homepage.clickImageFromSlider();

        String expectedHeader = "Neighborhood Overview";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_LOCAL_INFO_NEIGHBORHOOD_GUIDE_DOWNTOWN_HEADER);
    }

    //Test #8
    @Test(enabled = true)
    public void testSelectItem() {
        homepage = new Homepage();
        homepage.navigateToNeighborhoodGuide();
        implicitWait(20);
        homepage.clickImageFromSliderTwo();

        String expectedHeader = "Neighborhood Overview";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_LOCAL_INFO_NEIGHBORHOOD_GUIDE_HOLLYWOOD_HILLS_HEADER);
    }
}

