package mortgagePageTest;

import common.BaseAPI;
import mortgagePage.MortgagePage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMortgagePage extends BaseAPI {

    MortgagePage mortgagePage;

    //Test #1

    @Test(enabled = false)
    public void testNavigationToMortgagePage() throws InterruptedException {

        mortgagePage = new MortgagePage();

        mortgagePage.clickDropDownMenu();
        Thread.sleep(4000);
        mortgagePage.clickMortgagePageLink();
        Thread.sleep(4000);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Chase Mortgage | Home Lending | Chase.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test #2

    @Test(enabled = false)
    public void testGetStartedButton() throws InterruptedException {

        mortgagePage = new MortgagePage();

        mortgagePage.clickDropDownMenu();
        Thread.sleep(4000);
        mortgagePage.clickMortgagePageLink();
        //Thread.sleep(4000);
        mortgagePage.clickGetStartedButton();
        Thread.sleep(4000);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Buying a Home | Home Lending | Chase.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test #3

    @Test (enabled = false)
    public void testHover() throws Exception {
        mortgagePage = new MortgagePage();

        mortgagePage.NavigateToMortgagePage();
        mortgagePage.hoverOverButtonSignIn();

        String actualAttributeValue = mortgagePage.buttonSignIn.getAttribute("class");
        String expectedAttributeValue = "btn btn--primary chaseanalytics-track-link signInBtn";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS DOES NOT MATCH");
    }

    //Test #4

    @Test (enabled = false)
    public void testText() throws Exception {
        mortgagePage = new MortgagePage();

        mortgagePage.NavigateToMortgagePage();

        String actualAttributeValue = driver.findElement(By.xpath("//h2[.='Your home journey starts here']")).getText();

        String expectedAttributeValue = "Your home journey starts here";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS DOES NOT MATCH");
    }

    //Test #5
    @Test (enabled = false)

    public void testStartOnlineButton() throws InterruptedException {
        mortgagePage = new MortgagePage();
        mortgagePage.clickDropDownMenu();
        Thread.sleep(4000);
        mortgagePage.clickMortgagePageLink();
        Thread.sleep(4000);
        mortgagePage.clickStartOnlineButton();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Chase Mortgage | Home Lending | Chase.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #6
    @Test (enabled = false)
    public void testSelectYes() {
        mortgagePage = new MortgagePage();

        mortgagePage.selectYesRadioOption();

        Assert.assertFalse(isElementSelected(mortgagePage.radioOptionYes));

    }

    //Test #7
    @Test (enabled = false)
    public void testSelectNo() {
        mortgagePage = new MortgagePage();

        mortgagePage.selectNoRadioOption();

        Assert.assertFalse(isElementSelected(mortgagePage.radioOptionYes));

    }

    //Test #8
    @Test (enabled = false)
    public void testPlayVideo() throws Exception {
        mortgagePage = new MortgagePage();

        mortgagePage.NavigateToMortgagePage();

        mortgagePage.ClickPlayVideoButton();

    }

    //Test #9
    @Test (enabled = false)
    public void testTab() throws Exception {
        mortgagePage = new MortgagePage();

        mortgagePage.NavigateToMortgagePage();
        mortgagePage.NavigateToAtmBranchPage();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Find a Chase ATM or branch near you | Chase Bank";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test #10
    @Test (enabled = false)
    public void testInputSearch() throws Exception {
        mortgagePage = new MortgagePage();

        mortgagePage.NavigateToMortgagePage();
        mortgagePage.NavigateToAtmBranchPage();
        mortgagePage.doSearch();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Branches and ATMs | Chase Bank";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test 11
    @Test (enabled = false)
    public void testSlideArrowRight() throws Exception {
        mortgagePage = new MortgagePage();

        mortgagePage.clickSlideArrow();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test 12
    @Test (enabled = false)
    public void testHomeLoansButton() throws Exception {
        mortgagePage = new MortgagePage();

        mortgagePage.clickHomeLoansButton();
        softAssertEqualsGetTitle("Chase Mortgage | Home Lending | Chase.com");
    }

    //Test 13

    @Test(enabled = false)
    public void testSignIn() throws InterruptedException {
        mortgagePage = new MortgagePage();
        mortgagePage.addUserCredentials();

    }
    //Test 14
    @Test (enabled = true)
    public void testHoverOver() throws Exception {
        mortgagePage = new MortgagePage();
        Thread.sleep(4000);

        String actualAttributeValue = mortgagePage.login.getAttribute("class");
        String expectedAttributeValue = "btn cta cta--primary cta--large cta--btn-green-aloe";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "COLOR DOES NOT MATCH");
    }


    }
