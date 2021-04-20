package checkingAccountPageTest;

import chechingAccountPage.CheckingAccountPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckingAccountPage extends BaseAPI {
    CheckingAccountPage checkingAccountPage;


    @Test(enabled = false)
    public void testHoverOverOpenAccountButton() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.hoverOverOpenAccountButton();

        String actualAttributeValue = checkingAccountPage.hoverOverOpenAccountButton.getAttribute("role");
        String expectedAttributeValue = "button";

        Thread.sleep(1500);

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "class didn't find");
    }

    @Test(enabled = false)
    public void testSelectRadioButton() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.selectRadioButton();

        Assert.assertFalse(isElementSelected(checkingAccountPage.selectRadioButton));


    }

    @Test(enabled = false)
    public void testInputUserName() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.clickUserName();

        Thread.sleep(1000);

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }

    @Test(enabled = false)
    public void testClickCheckBox() throws InterruptedException {
            checkingAccountPage = new CheckingAccountPage();
            checkingAccountPage.checkBox();

            Thread.sleep(1000);

            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");
        }



    @Test(enabled = false)
    public void testDoSearchHomeLoans() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchHomeLoans();

        Thread.sleep(2000);

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Chase Mortgage | Home Lending | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testClickSignInButton() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchHomeLoans();
        checkingAccountPage.signIn();

        Thread.sleep(2000);

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Sign in - chase.com";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testCheckPreRequest() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchHomeLoans();
        checkingAccountPage.doCheckPreRequest();

        Thread.sleep(2000);

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Get Started - Account Application - chase.com";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testDoSearchCreditCards() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchCreditCards();


        Thread.sleep(24000);

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Credit Cards - Compare Credit Card Offers and Apply Online | Chase";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testHoverOverViewRewardsButton(){
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.hoverOverButton();

       // String actualAttributeValue = checkingAccountPage.hoverOverOpenAccountButton.getAttribute("Title");
       // String expectedAttributeValue ="Credit Cards - Compare Credit Card Offers and Apply Online | Chase";


       // Assert.assertEquals(actualAttributeValue,expectedAttributeValue,"class not found");


    }
    @Test(enabled = false)
    public void testCashBackCredit() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchCreditCards();
        checkingAccountPage.setClickCashBackPage();


        Thread.sleep(24000);

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Compare Cash Back Credit Cards | Chase";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testCheckATMAndBranch() throws InterruptedException {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doCheckAtmAndBranch();

        Thread.sleep(14000);

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Find a Chase ATM or branch near you | Chase Bank";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
      @Test
      public void testConnectWithAnAdvisor() throws InterruptedException {
          checkingAccountPage = new CheckingAccountPage();
          checkingAccountPage.doCheckAtmAndBranch();
          checkingAccountPage.connectWithAdvisor();

          Thread.sleep(14000);

          String actualResult = BaseAPI.driver.getTitle();
          String expectedResult = "J.P. Morgan Financial Advisor Contact Form | Chase";

          Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");



      }


    }






