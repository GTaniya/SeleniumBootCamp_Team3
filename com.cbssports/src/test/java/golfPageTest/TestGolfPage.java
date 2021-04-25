package golfPageTest;

import common.BaseAPI;
import golfPage.GolfPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static golfPage.GolfPageLocators.*;


public class TestGolfPage extends BaseAPI {

    GolfPage golfPage;

    //Test #1 75
    @Test(enabled = false)
    public void testNavigateToGolfPage(){

        golfPage = new GolfPage();

        golfPage.clickHamburgerMenu();
        golfPage.clickGolfLink();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "PGA Tour - Golf News, Scores, Stats, Standings, and Rumors - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #2
    @Test(enabled = false)
    public void testGolfLeaderboardTab(){

        golfPage = new GolfPage();

        golfPage.clickHamburgerMenu();
        golfPage.clickGolfLink();
        golfPage.clickGolfLeaderBoard();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "RBC Heritage Preview - RBC Heritage 2021 - CBS Sports - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #3
    @Test(enabled = false)
    public void testSelectDate() throws InterruptedException {

        golfPage = new GolfPage();

        golfPage.clickHamburgerMenu();
        golfPage.clickGolfLink();
        golfPage.clickDateField();
        golfPage.clickDate();

    }

    //Test #4
    @Test(enabled = false)
    public void testPlayGoalLink() throws InterruptedException {

        golfPage = new GolfPage();
        golfPage.clickPlayGolfLink();


        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #5
    @Test(enabled = true)
    public void testSelectPlayers() throws InterruptedException {
        golfPage = new GolfPage();
        golfPage.clickGolf();
        golfPage.scrollDown();
        fluentWait(20);
        golfPage.selectPlayersDropDown();
        golfPage.selectOptionFour();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_SELECT_PLAYERS_FOUR));
    }
}
