package placeToStayPageTest;

import common.BaseAPI;
import io.cucumber.java.an.E;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import placeToStayPage.PlaceToStayPage;
import static placeToStayPage.PlaceToStayPageLocators.*;

public class TestPlaceToStayPage extends BaseAPI {
    PlaceToStayPage placeToStayPage;


    @Test(enabled = true)
    public void testExploreRoleButton()  {

        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.checkCareers();
        placeToStayPage.clickExploreRolesButton();

        String expectedText = "";
        softAssert.assertEquals(expectedText,WEB_ELEMENT_CAREERS_EXPLORE_ROLES_BUTTON);
    }

    @Test(enabled = false)
    public void testCareersPage(){

        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.checkCareers();
        // placeToStayPage.clickExploreRolesButton();
        placeToStayPage.clickUniversityLink();




    }

    @Test(enabled = false)
    public void testDoSearch(){

        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.doSearch();


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");
    }
    @Test(enabled = false)
    public void testDiversityAndBelonging(){
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.clickDiversityAndBelonging();


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="Diversity at Airbnb";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");

    }
    @Test(enabled = false)
    public void testFindHotel(){
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.findHotelForTonight();
      //  placeToStayPage.bookingHotel();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");

    }
    @Test(enabled = false)
    public void testButtonCovidKey(){
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.buttonCovidKey();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="COVID-19 Safety";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");

    }
    @Test(enabled = false)
    public void testExploreSafetyPracticePage()  {
        placeToStayPage = new PlaceToStayPage();
      //  placeToStayPage.buttonCovidKey();
        placeToStayPage.exploreSafetyPracticePage();



        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");

    }
    @Test(enabled = false)
    public void testDoSearchAirBNBWork()  {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.doSearchAirBNBWork();



        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "How Airbnb Works";

        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't find");


    }
    @Test(enabled = false)
    public void testSearchAirBNBHomes()  {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.SearchAirBNBHomes();


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Anywhere · Stays · Airbnb";

        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't find");

    }
    @Test(enabled = false)
    public void testTrustAndSafety()  {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.trustAndSafety();


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Airbnb Trust & Safety - Your safety is our priority";

        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't find");


    }
    @Test(enabled = false)
    public void testTrustAndSafetyTravelingButton(){
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.trustAndSafetyTraveling();

        Assert.assertTrue(isElementSelected(placeToStayPage.trustAndSafetyTraveling));


    }
    @Test(enabled = false)
    public void testSearchAllJobs() throws InterruptedException {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.searchAllJobsAirBNB();


    }
    @Test(enabled = false)
    public void testSelectDate(){
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.clickDateField();
        placeToStayPage.selectDate();


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Airbnb: Vacation Rentals, Cabins, Beach Houses, Unique Homes & Experiences";

        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't find");





    }



}

