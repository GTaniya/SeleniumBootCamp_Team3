package fantasyPageTest;

import common.BaseAPI;
import fantasyPage.FantasyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFantasyPage extends BaseAPI {
    FantasyPage fantasyPage;

    @Test
    public void testCountOfCategoryDropdownOptions(){
        fantasyPage = new FantasyPage();
        fantasyPage.selectCategoryFromSearchBarUsingIndex();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
}
