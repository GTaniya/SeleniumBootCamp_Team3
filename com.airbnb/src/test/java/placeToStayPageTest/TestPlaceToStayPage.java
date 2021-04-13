package placeToStayPageTest;

import common.BaseAPI;
import homepage.Homepage;
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
    @Test(enabled = true)
    public void testFindHotel(){
        placeToStayPage = new PlaceToStayPage();
        placeToStayPage.findHotelForTonight();
      //  placeToStayPage.bookingHotel();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle ="Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't find");



    }


}

