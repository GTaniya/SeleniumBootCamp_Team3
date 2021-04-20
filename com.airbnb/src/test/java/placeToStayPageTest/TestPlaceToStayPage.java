package placeToStayPageTest;

import common.BaseAPI;
import io.cucumber.java.an.E;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import placeToStayPage.PlaceToStayPage;

public class TestPlaceToStayPage extends BaseAPI {
    PlaceToStayPage placeToStayPage;


    @Test(enabled = false)
    public void testExploreRoleButton() throws InterruptedException {

        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.checkCareers();
        placeToStayPage.clickExploreRolesButton();
        Thread.sleep(2000);


        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="Careers at Airbnb";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");

    }

    @Test(enabled = false)
    public void testCareersPage(){

        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.checkCareers();
        // placeToStayPage.clickExploreRolesButton();
        placeToStayPage.clickUniversityLink();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="University - Careers at Airbnb";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");

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
    public void testExploreSafetyPracticePage() throws InterruptedException {
        placeToStayPage = new PlaceToStayPage();
      //  placeToStayPage.buttonCovidKey();
        placeToStayPage.exploreSafetyPracticePage();


        Thread.sleep(2000);
        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");

    }
    @Test(enabled = false)
    public void testDoSearchAirBNBWork() throws InterruptedException {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.doSearchAirBNBWork();


        Thread.sleep(3000);
        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "How Airbnb Works";

        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't find");


    }
    @Test(enabled = false)
    public void testSearchAirBNBHomes() throws InterruptedException {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.SearchAirBNBHomes();


        Thread.sleep(3000);
        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Anywhere · Stays · Airbnb";

        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't find");

    }
    @Test(enabled = false)
    public void testTrustAndSafety() throws InterruptedException {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.trustAndSafety();


        Thread.sleep(3000);
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
    @Test
    public void testSearchAllJobs() throws InterruptedException {
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.searchAllJobsAirBNB();


    }



}

