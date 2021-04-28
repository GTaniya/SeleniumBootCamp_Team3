package checkingAccountPageTest;

import chechingAccountPage.CheckingAccountPage;
import common.BaseAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static chechingAccountPage.CheckingAccountLocators.WEB_ELEMENT_CLICK_INPUT_USER_NAME;

public class TestCheckingAccountPage extends BaseAPI {
    CheckingAccountPage checkingAccountPage;


    @Test(enabled = false)
    public void testHoverOverOpenAccountButton()  {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.hoverOverOpenAccountButton();

        String actualAttributeValue = checkingAccountPage.hoverOverOpenAccountButton.getAttribute("role");
        String expectedAttributeValue = "button";


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

    @Test(enabled = true)
    public void testInputUserName() {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.clickUserName();

      String expectedValue ="";
      softAssert.assertEquals(expectedValue,WEB_ELEMENT_CLICK_INPUT_USER_NAME);



    }

    @Test(enabled = false)
    public void testClickCheckBox() {
            checkingAccountPage = new CheckingAccountPage();
            checkingAccountPage.checkBox();



            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com";

            Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");
        }



    @Test(enabled = false)
    public void testDoSearchHomeLoans() {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchHomeLoans();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Chase Mortgage | Home Lending | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testClickSignInButton()  {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchHomeLoans();
        checkingAccountPage.signIn();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Sign in - chase.com";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testCheckPreRequest()  {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchHomeLoans();
        checkingAccountPage.doCheckPreRequest();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Get Started - Account Application - chase.com";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testDoSearchCreditCards()  {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchCreditCards();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Credit Cards - Compare Credit Card Offers and Apply Online | Chase";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
    @Test(enabled = false)
    public void testHoverOverViewRewardsButton(){
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.hoverOverButton();



    }
    @Test(enabled = false)
    public void testCashBackCredit()  {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doSearchCreditCards();
        checkingAccountPage.setClickCashBackPage();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Compare Cash Back Credit Cards | Chase";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");

    }
    @Test(enabled = false)
    public void testCheckATMAndBranch() {
        checkingAccountPage = new CheckingAccountPage();
        checkingAccountPage.doCheckAtmAndBranch();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Find a Chase ATM or branch near you | Chase Bank";

        Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");


    }
      @Test(enabled = false)
      public void testConnectWithAnAdvisor()  {
          checkingAccountPage = new CheckingAccountPage();
          checkingAccountPage.doCheckAtmAndBranch();
          checkingAccountPage.connectWithAdvisor();



          String actualResult = BaseAPI.driver.getTitle();
          String expectedResult = "J.P. Morgan Financial Advisor Contact Form | Chase";

          Assert.assertEquals(actualResult, expectedResult, "TEST FAILED");



      }


    }






