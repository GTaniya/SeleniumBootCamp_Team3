package shoppingPageTest;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import shoppingPage.ShoppingPage;


    public class TestShoppingPage extends BaseAPI {

        ShoppingPage shoppingPage;

        //Test #1
        @Test(enabled = false)
        public void testShopping() throws InterruptedException {

            shoppingPage = new ShoppingPage();
            shoppingPage.clickShoppingButton();
            shoppingPage.clickBuildYourOwn();
            implicitWait(20);

            //Assert.assertTrue(isElementSelected(shoppingPage.ShoppingBuildYourOwn));
           // Assert.assertEquals(getTextFromElement(shoppingPage.ShoppingBuildYourOwn), "Build Your Own");

            String actualAttribute = shoppingPage.ShoppingBuildYourOwn.getAttribute("class");

            String expectedAttribute = "link link_in-text";

            Assert.assertEquals(actualAttribute, expectedAttribute, "CLASS DOSE NOT MATCH");

        }

        //Test #2
        @Test(enabled = false)
        public void testSelectColor() throws InterruptedException {
            shoppingPage = new ShoppingPage();
            shoppingPage.NavigateToColorChange();
            shoppingPage.clickToChooseVehicle();
            Thread.sleep(2000);
            shoppingPage.clickBuildVehicleButton();
//            implicitWait(20);
            shoppingPage.SelectTheVehicleColor();
            Thread.sleep(2000);


            String actualAttribute = shoppingPage.selectVehicleColor.getAttribute("class");

            String expectedAttribute = "responsive-image";

            Assert.assertEquals(actualAttribute, expectedAttribute, "CLASS DOSE NOT MATCH");


        }
        //Test #2
        @Test(enabled = true)
        public void testTestInsideTheVehicle() throws InterruptedException {
            shoppingPage = new ShoppingPage();
            shoppingPage.NavigateToColorChange();
            shoppingPage.clickToChooseVehicle();
            Thread.sleep(2000);
            shoppingPage.clickBuildVehicleButton();
//            implicitWait(20);
            shoppingPage.selectCheckInsideSuvOption();
            shoppingPage.scrollToRightToCgeckInsideTheSuv();
            Thread.sleep(4000);
        }


        //Test #3
        @Test (enabled = false)
        public void testSelectVideo() {
            shoppingPage = new ShoppingPage();
            shoppingPage.clickRadioButton();

            Assert.assertFalse(isElementSelected(shoppingPage.radioOptionVideo));
        }

        //Test #4
        @Test(enabled = false)
        public void testDoSearch(){
            shoppingPage = new ShoppingPage();
            shoppingPage.clickShoppingButton();
            shoppingPage.clickScheduleServiceLink();

        }

        //Test #5
        @Test(enabled = false)
        public void testCompareVehicles() {
            shoppingPage = new ShoppingPage();
            shoppingPage.clickShoppingButton();
            shoppingPage.clickCompareVehicleLink();
            shoppingPage.AddCompareVehicleOne();
            shoppingPage.clickCheckBoxForSedan();
            implicitWait(20);

           Assert.assertTrue(isElementSelected(shoppingPage.addSedan));
        }

        //Test #6
        @Test(enabled = false)
        public void testDropDown(){
            shoppingPage = new ShoppingPage();
            shoppingPage.clickShoppingButton();
            shoppingPage.clickEstimatePaymentLink();
            implicitWait(20);
            shoppingPage.clickDropDown();
            implicitWait(20);
            shoppingPage.clickDropDownOption();

            SoftAssert softAssert = new SoftAssert();

            softAssert.assertTrue(isElementSelected(shoppingPage.selectClassCLA));

            softAssert.assertAll();
        }

        //Test #7
        @Test(enabled = false)
        public void testHoverOverSubmitButton() {
            shoppingPage = new ShoppingPage();
            shoppingPage.clickShoppingButton();
            shoppingPage.clickEstimatePaymentLink();
            implicitWait(20);
            shoppingPage.hoverOverSubmitButton();
            implicitWait(20);

            String actualAttributeValue = shoppingPage.submitButtonHover.getAttribute("class");
            String expectedAttributeValue = "button button_primary button--wide  vehicle-selector__submit-cta payment-estimator-app__submit-cta";

            Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS DOES NOT MATCH");

        }

        //Test #7
        @Test(enabled = false)
        public void testTab() {
            shoppingPage = new ShoppingPage();
            shoppingPage.clickShoppingButton();
            shoppingPage.clickServicesLink();
            shoppingPage.clickAdditionalResources();

            String expectedHeader = "Additional Resources";

            softAssert.assertEquals(expectedHeader,shoppingPage.servicesAdditionalResourcesHeader );

        }

        //Test#8
        @Test(enabled = false)
        public void testManual() {
            shoppingPage = new ShoppingPage();
            shoppingPage.navigateToServicesPage();
            shoppingPage.clickOwnersLink();

            String expectedImage = "C-Class Coupe";
            softAssert.assertEquals(expectedImage,shoppingPage.headerImage );

        }




    }

