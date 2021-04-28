package mortgageTest;

import common.BaseAPI;
import mortgagePage.MortgagePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static mortgagePage.MortgageLocators.*;

public class TestMortgage extends BaseAPI {
    MortgagePage mortgagePage;

    @Test(enabled = false)
    public void testDropDownMortgage(){
        mortgagePage = new MortgagePage();
        mortgagePage.dropDownButton();

        String expectedText = "true";
        String actualText = driver.findElement(By.xpath( WEB_ELEMENT_VERIFY_MORTGAGE_ATTRIBUTE)).getAttribute("aria-expanded");

        Assert.assertEquals(actualText,expectedText,"Test failed");


    }
    @Test(enabled = false)
    public void selectMortgageOverview(){
        mortgagePage = new MortgagePage();
        mortgagePage.dropDownButton();
        mortgagePage.selectMortgageOverview();

        String expectedText = "Padding-sc-1tki7vp-0 gijRfk";
        String actualText = mortgagePage.clickMortgage.getAttribute("class");

        Assert.assertEquals(actualText,expectedText,"Test failed");



    }
    @Test(enabled =false)
    public void searchInputBar() {
        mortgagePage = new MortgagePage();
        mortgagePage.dropDownButton();
        mortgagePage.selectMortgageOverview();
       driver.findElement(By.xpath("//input[@id='locationInputs']")).sendKeys("Miami");

        String expectedText = "location-search";
        String actualText =  driver.findElement(By.xpath("//input[@id='locationInputs']")).getAttribute("name");

        Assert.assertEquals(actualText,expectedText,"Test Doesn't Work");



    }
    @Test(enabled = false)
    public void enterZipCode() {
        mortgagePage = new MortgagePage();
        mortgagePage.selectMortgageOverview();
        mortgagePage.enterZipCod();

        String expectedText = "zipCode";
        String actualText = mortgagePage.zipCode.getAttribute("name");

        Assert.assertEquals(actualText,expectedText,"Test Failed");




    }
    @Test(enabled = true)
    public void clickCreditScoreButton(){
        mortgagePage = new MortgagePage();
        mortgagePage.selectMortgageOverview();
        mortgagePage.creditScoreInput();


       String expectedTest = "Choose Credit Score";
       String actualText = driver.findElement(By.id("creditScore")).getAttribute("aria-label");

       Assert.assertEquals(actualText,expectedTest,"Test Failed");


    }
    @Test(enabled =true)
    public void clickServedInTheMilitaryCheckBox()  {
        mortgagePage = new MortgagePage();
        mortgagePage.selectMortgageOverview();
        mortgagePage.clickServedInTheUSMilitaryCheckBox();


        String expectedTest = "checkbox";
        String actualText = mortgagePage.clickCheckBox.getAttribute("type");

        Assert.assertEquals(actualText,expectedTest,"Test Failed");














    }
}
