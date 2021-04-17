package golfPageTest;

import common.BaseAPI;
import golfPage.GolfPage;
import org.testng.Assert;
import org.testng.annotations.Test;


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
        Thread.sleep(4000);
    }

    //Test #4
    @Test(enabled = true)
    public void testPlayGoalLink() throws InterruptedException {

        golfPage = new GolfPage();
        golfPage.clickPlayGolfLink();
        Thread.sleep(4000);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");


    }
}
