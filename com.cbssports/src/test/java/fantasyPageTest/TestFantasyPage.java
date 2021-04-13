package fantasyPageTest;

import common.BaseAPI;
import fantasyPage.FantasyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFantasyPage extends BaseAPI {
    FantasyPage fantasyPage;

    @Test(enabled = false)
    public void testCountOfCategoryDropdownOptions(){
        fantasyPage = new FantasyPage();
        fantasyPage.selectCategoryFromSearchBar();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Fantasy News, Player Stats, Rumors and Rankings - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
    @Test
    public void testClickLoginButton(){
        fantasyPage = new FantasyPage();
        fantasyPage.clickLoginButton();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Sign In - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
}
