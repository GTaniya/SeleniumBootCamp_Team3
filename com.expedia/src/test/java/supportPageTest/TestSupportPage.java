package supportPageTest;

import common.BaseAPI;
import io.cucumber.java.bs.A;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import supportPage.SupportPage;

public class TestSupportPage extends BaseAPI {

    SupportPage supportPage;

    //Test#1
    @Test(enabled = false)
    public void testSupportPage() {

        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();

        String actualText = driver.getTitle();

        String expectedText = "Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test#2
    @Test(enabled = false)
    public void testChatButton() throws InterruptedException {

        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();
        supportPage.clickChatButton();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Customer Service Portal";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test#3
    @Test(enabled = false)
    public void testFlightsHelpArticles() throws InterruptedException {

        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();
        Thread.sleep(4000);
        supportPage.clickFlightsDropdown();
        Thread.sleep(4000);
        supportPage.clickFlightsDropdownSeats();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Customer Service Portal";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test#4
    @Test(enabled = false)
    public void testTabThingsToDo() throws InterruptedException {

        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();
        Thread.sleep(4000);
        supportPage.clickThingsToDoTab();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Things To Do Near Me: Find Fun Activities Nearby | Expedia";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

    //Test #5
    @Test(enabled = false)
    public void testPageTitle() {
        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();

        String exp = "Customer Service Portal";
        String act = driver.getTitle();
        Assert.assertTrue(exp.equalsIgnoreCase(act));

    }

    //Test #6
    @Test(enabled = false)
    public void testDateField() {
        supportPage = new SupportPage();

        supportPage.clickDataField();
        supportPage.selectData();

    }

    //Test #7
    @Test(enabled = false)
    public void testCheckbox() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.selectCheckBox();
        WebDriverWait wait = new WebDriverWait(driver, 20);

    }

    //Test#8
    @Test(enabled = false)
    public void testModelWindow() throws InterruptedException {
        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();
        supportPage.clickContactUsButton();
        supportPage.clickContactUsWindow();
        Thread.sleep(4000);

    }

    //Test #10
    @Test(enabled = false)
    public void testChoosingNewYork() throws InterruptedException {

        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();
        Thread.sleep(4000);
        supportPage.clickThingsToDoTab();
        supportPage.selectCity();
        Thread.sleep(4000);
    }

    //Test#11
    @Test(enabled = false)
    public void testSelectingTravelers() throws InterruptedException {

        supportPage = new SupportPage();
        supportPage.OpenSelectTravelerLink();
        supportPage.OpenSelectTravelerDecrease();
        Thread.sleep(4000);
    }

    //Test#12
    @Test(enabled = true)
    public void testSelectingCarTab() throws InterruptedException {

        supportPage = new SupportPage();
        supportPage.clickSupportPageLink();
        supportPage.selectCars();
        Thread.sleep(4000);

        String actualText = driver.getTitle();

        String expectedText = "Car Rental: Cheap Airport Car Rentals & Rental Car Deals | Expedia";

        Assert.assertEquals(actualText, expectedText, "Test not found");
    }

}