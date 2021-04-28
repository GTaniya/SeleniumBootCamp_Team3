package careersPageTest;

import careersPage.CareersPage;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCareersPage extends BaseAPI {
    CareersPage careersPage;

    @Test(enabled = false)
    public void testClickInputBar(){
        careersPage = new CareersPage();
        careersPage.clickInput();

        String actualAttributeValue =careersPage.clickInputBar.getAttribute("type");
        String expectedAttributeValue = "button";


        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "class didn't find");
    }
    @Test(enabled = false)
    public void testEnterPlaceToGo(){
        careersPage = new CareersPage();
        careersPage.clickInput();
        careersPage.enterLocation();


        String actualAttributeValue =careersPage.clickInputBar.getAttribute("type");
        String expectedAttributeValue = "button";


        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "class didn't find");


    }
    @Test(enabled = false)
    public void testSelectCheckingDate(){
        careersPage = new CareersPage();
        careersPage.clickInput();
        careersPage.enterLocation();
        careersPage.selectCheckingDate();

        String actualTitle = BaseAPI.driver.getTitle();
        String expectedTitle = "Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More";
        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't find");

    }
    @Test
    public void testSelectCheckOutDate() {
        careersPage = new CareersPage();
        careersPage.clickInput();
        careersPage.enterLocation();
        careersPage.selectCheckingDate();
        careersPage.selectCheckOut();


        String expectedTest = "button";
        String actualText = driver.findElement(By.xpath("//button[.='May 12']")).getAttribute("type");

        Assert.assertEquals(actualText,expectedTest,"Test Failed");



    }

    }

