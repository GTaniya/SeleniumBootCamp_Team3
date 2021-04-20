package fantasyPageTest;

import common.BaseAPI;
import fantasyPage.FantasyPage;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

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
    @Test(enabled = false)
    public void testClickPodcastButton(){
        fantasyPage = new FantasyPage();
        fantasyPage.clickPodcastButton();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


    }
    @Test(enabled = false)
    public void testClickAboutUsButton() throws InterruptedException {
        fantasyPage = new FantasyPage();
        fantasyPage.clickAboutUsButton();

        Thread.sleep(1000);

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


    }
    @Test(enabled = false)
    public void testDropDownFantasy() throws InterruptedException {
        fantasyPage = new FantasyPage();
        fantasyPage.dropDown();

        Thread.sleep(1000);

    }
    @Test(enabled = false)
    public void testOpenBasketballPage() throws InterruptedException {
        fantasyPage = new FantasyPage();
       fantasyPage.OpenBasketballPage();

        Thread.sleep(1000);


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Fantasy Basketball News, Stats and Analysis - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }
    @Test(enabled = false)
    public void testClickCheckButton() throws InterruptedException {
        fantasyPage = new FantasyPage();
        fantasyPage.checkButton();

        Thread.sleep(1000);
        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
      @Test(enabled = false)
    public void testDropDownPodcast() throws InterruptedException {
          fantasyPage = new FantasyPage();
          fantasyPage.doDropDownPodcast();

          Thread.sleep(1500);

      }
      @Test(enabled = false)
    public void testClickDropDown(){
        fantasyPage = new FantasyPage();
        fantasyPage.clickDropDown();
      }
      @Test(enabled = false)
    public void testClickNavBar() throws InterruptedException {
        fantasyPage = new FantasyPage();
        fantasyPage.clickNavBar();

          Thread.sleep(2000);

          String actualTitle = BaseAPI.driver.getTitle();
          String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

          Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");



      }
      @Test
    public void testSearchFlipBoard() throws InterruptedException {
          fantasyPage = new FantasyPage();
          fantasyPage.searchInput();

          Thread.sleep(2000);

          String actualTitle = BaseAPI.driver.getTitle();
          String expectedTitle = "CBS Sports (@cbssports) on Flipboard";

          Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


      }
      @Test
    public void testInputUserName(){
        fantasyPage = new FantasyPage();
        fantasyPage.searchInput();
      }


}
