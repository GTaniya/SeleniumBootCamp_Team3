package mlbPageTest;

import common.BaseAPI;
import mlbPage.MLBPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static mlbPage.MLBPageLocators.*;

public class TestMLBPage extends BaseAPI {

    MLBPage mlbPage;

    //Test #1
    @Test(enabled = false)
    public void testSearchKamaruUsingExcel() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickSearButton();
        mlbPage.searchDiazUsingExcel();
        softAssertAssertEqualsGetText(WEB_ELEMENT_INPUT_SEARCH_DIAZ, "Kamaru Usman");
    }

    //Test #2
    @Test(enabled = false)
    public void testScoreTab() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        mlbPage.clickScores();

        String expectedHeader = "MLB Scoreboard";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_MLB_PAGE_SCORES_HEADER );

    }

    //Test #2
    @Test(enabled = false)
    public void testSlideArrow() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        mlbPage.clickScores();
        fluentWait(20);
        mlbPage.clickSlideArrow();

        String actualAttributeValue = mlbPage.slideArrow.getAttribute("class");
        String expectedAttributeValue = "slick-next slick-arrow";

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS DOES NOT MATCH");
    }

    //Test #3
    @Test(enabled = true)
    public void testDatePicker() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        mlbPage.clickScores();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        mlbPage.clickDateWindow();
        mlbPage.chooseDate();

        String expectedHeader = "MLB Scoreboard";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_MLB_PAGE_SCORES_HEADER );
    }

    //Test #4
    @Test(enabled = false)
    public void testADHandle() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        mlbPage.clickSchedulePage();
        mlbPage.closeAD();

    }

    //Test #5
    @Test(enabled = false)
    public void testScheduleDropDown() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        mlbPage.clickSchedulePage();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        mlbPage.clickDropDown();
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        mlbPage.selectChicagoCubs();

        String expectedHeader = "CHICAGO CUBS";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_TEAM_SCHEDULE_CHICAGO_CUBS_HEADER );
    }

    //Test #6
    @Test(enabled = false)
    public void testTeamSelection() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        implicitWait(20);
        mlbPage.clickNewYorkMets();

        String expectedHeader = "NEW YORK METS";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_TEAM_NEW_YORK_METS_HEADER );
    }

    //Test #7
    @Test(enabled = false)
    public void testHoverFollowButton() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        mlbPage.clickNewYorkMets();
        implicitWait(20);
        mlbPage.hoverOverFollowButton();
        WebDriverWait wait2 = new WebDriverWait(driver, 20);

        String actualAttributeValue = mlbPage.NewYorkMetsFollow.getAttribute("class");
        String expectedAttributeValue = "btn ClubhouseHeader__Follow button-alt sm";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS DOSE NOT FOUND");
    }

    //Test #8
    @Test(enabled = false)
    public void testSelectPlayer() throws Exception {
        mlbPage = new MLBPage();
        mlbPage.clickMLBPageTab();
        fluentWait(20);
        mlbPage.clickStatsPage();
        mlbPage.choosePlayer();
        implicitWait(20);

        String expectedHeader = "NEW YORK METS";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_STATS_PLAYER_NICO_HEADER );

    }

    }



