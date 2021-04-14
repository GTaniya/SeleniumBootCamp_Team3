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
    @Test(enabled = false)
    public void testClickLoginButton(){
        fantasyPage = new FantasyPage();
        fantasyPage.clickLoginButton();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Sign In - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
    @Test(enabled = false)
    public void testHoverOverPlayButton(){
        fantasyPage = new FantasyPage();
       fantasyPage.hoverOverButton();

        String actualAttributeValue = fantasyPage.hoverOverPlayButton.getAttribute("title");
        String expectedAttributeValue = "Facebook";

        Assert.assertEquals(actualAttributeValue,expectedAttributeValue,"class not found");


    }
    @Test
    public void testClickPodcastButton(){
        fantasyPage = new FantasyPage();
        fantasyPage.clickPodcastButton();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


    }
}
