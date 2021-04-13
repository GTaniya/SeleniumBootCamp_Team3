package homeLoanPageTest;

import common.BaseAPI;
import homeLoansPage.HomeLoansPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomeLoanPage extends BaseAPI {
    HomeLoansPage homeLoansPage;

    @Test(enabled = false)
    public void testClickHomePage(){
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.clickHomeLoanPage();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
    @Test(enabled = false)
    public void testSearMortgagePage(){
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.clickHomeLoanPage();
        homeLoansPage.doSearchMortgagePage();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Mortgages - Home Mortgage Loans from Bank of America";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }
    @Test(enabled = false)
    public void testMenuButton(){
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.doSearchMortgagePage();
        homeLoansPage.clickMenu();
        homeLoansPage.searchMortgageRate();


        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Mortgage Rates - Today's Rates from Bank of America";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


    }
    @Test(enabled = false)
    public void testHomeLoanRefinance(){
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.homeLoanRefinanceSearch();


        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Mortgage Refinance and Home Refinancing from Bank of America";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }
    @Test(enabled = false)
    public void testMortgageLoanCalculator() throws InterruptedException {
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.homeLoanRefinanceSearch();
        homeLoansPage.mortgageRefinanceCalculator();

        WebDriverWait wait = new WebDriverWait(driver,80);
      //  Thread.sleep(4000);
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Mortgage Refinance Calculator from Bank of America";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


    }
    @Test
    public void testInputSearchBar(){
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.doSearch();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }



}
