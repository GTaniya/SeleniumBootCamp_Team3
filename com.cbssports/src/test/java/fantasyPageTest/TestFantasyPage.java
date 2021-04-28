package fantasyPageTest;

import common.BaseAPI;
import fantasyPage.FantasyPage;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

import static fantasyPage.FantasyPageLocators.WEB_ELEMENT_DROP_DOWN_FANTASY;

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

      Assert.assertTrue(isElementSelected(fantasyPage.clickPodcastButton));

    }
    @Test(enabled = false)
    public void testClickAboutUsButton() {
        fantasyPage = new FantasyPage();
        fantasyPage.clickAboutUsButton();

        Assert.assertTrue(isElementSelected(fantasyPage.clickAboutUs));

    }
    @Test(enabled = true)
    public void testDropDownFantasy()  {
        fantasyPage = new FantasyPage();
        fantasyPage.dropDown();

        String expectedText ="fantasy";
        Assert.assertEquals(expectedText,WEB_ELEMENT_DROP_DOWN_FANTASY);


    }
    @Test(enabled = false)
    public void testOpenBasketballPage()  {
        fantasyPage = new FantasyPage();
       fantasyPage.OpenBasketballPage();



        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Fantasy Basketball News, Stats and Analysis - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }
    @Test(enabled = false)
    public void testClickCheckButton()  {
        fantasyPage = new FantasyPage();
        fantasyPage.checkButton();


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
      @Test(enabled = false)
    public void testDropDownPodcast() {
          fantasyPage = new FantasyPage();
          fantasyPage.doDropDownPodcast();

          Assert.assertTrue(isElementSelected(fantasyPage.dropDownPodcast));



      }
      @Test(enabled = false)
    public void testClickDropDown(){
        fantasyPage = new FantasyPage();
        fantasyPage.clickDropDown();


      }
      @Test(enabled = false)
    public void testClickNavBar() {
        fantasyPage = new FantasyPage();
        fantasyPage.clickNavBar();



          String actualTitle = BaseAPI.driver.getTitle();
          String expectedTitle = "CBS Sports - News, Live Scores, Schedules, Fantasy Games, Video and more. - CBSSports.com";

          Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");



      }
      @Test(enabled = false)
    public void testSearchFlipBoard()  {
          fantasyPage = new FantasyPage();
          fantasyPage.searchInput();



          String actualTitle = BaseAPI.driver.getTitle();
          String expectedTitle = "CBS Sports (@cbssports) on Flipboard";

          Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


      }
      @Test(enabled = false)
    public void testInputUserName(){
        fantasyPage = new FantasyPage();
        fantasyPage.searchInput();
      }


}
