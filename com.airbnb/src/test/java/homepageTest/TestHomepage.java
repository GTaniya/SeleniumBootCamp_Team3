package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends BaseAPI {
    Homepage homepage;

    @Test
    public void testDoSearch() {
        homepage = new Homepage();

        homepage.doSearch("California, United States");
        String actualTitle = driver.getTitle();


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
    public void testOnlineExperienceLink(){

        homepage = new Homepage();

        homepage.clickOnlineExperienceLink();

        homepage.clickCookingLink();

        String actualResult = driver.getTitle();

        String expectedResult = "";

        Assert.assertEquals(actualResult, expectedResult, "Test Failed");
    }


}

