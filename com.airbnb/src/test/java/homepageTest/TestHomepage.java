package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends BaseAPI {
    Homepage homepage;

    @Test
    public void testDoSearch() throws InterruptedException {
        homepage = new Homepage();

        homepage.doSearch();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "California · Stays · Airbnb";

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


}

