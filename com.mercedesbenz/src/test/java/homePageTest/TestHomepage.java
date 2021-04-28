package homePageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;

public class TestHomepage extends BaseAPI {

    Homepage homepage;

    @Test(enabled = false)
    public void testClickCoupeButton() {
        homepage = new Homepage();
        homepage.clickCoupe();

        Assert.assertTrue(isElementSelected(homepage.clickCoupeButton));


    }

    @Test(enabled = false)
    public void testHoverCLACoupe() {
        homepage = new Homepage();
        homepage.clickCoupe();
        homepage.hoverCLACoupeMenu();

        String expectedHeader = "CLA Coupe";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_HOVER_CLA_COUPE);


    }

    @Test(enabled = false)
    public void testClickAMGCLACoupeButton() {
        homepage = new Homepage();
        homepage.clickCoupe();
        homepage.hoverCLACoupeMenu();
        homepage.clickAMGCLACoupe();

        String expectedHeader = "AMG CLA 45 Coupe";
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_CLICK_AMG_CLA_COUPE);


    }

    @Test(enabled = false)
    public void testHoverVehicleButton() {
        homepage = new Homepage();
        homepage.hoverVehicleButton();

        String expectedText = "";
        String actualText = driver.getTitle();

        Assert.assertFalse(expectedText.equalsIgnoreCase(actualText));
    }

    @Test(enabled = false)
    public void testSelectYourCar() {
        homepage = new Homepage();
        homepage.hoverVehicleButton();
        homepage.selectCar();

        String expectedText = "G-Class SUV";
        String actualText = driver.getTitle();

        Assert.assertFalse(expectedText.equalsIgnoreCase(actualText));

    }

    @Test(enabled = false)
    public void testClickModelRadioButton() {
        homepage = new Homepage();
        homepage.hoverVehicleButton();
        homepage.selectCar();
        homepage.clickRadioButton();

        String expectedText = "models";
        String actualText = driver.getTitle();

        Assert.assertFalse(expectedText.equalsIgnoreCase(actualText));


    }

    @Test(enabled = false)
    public void testPeakYurColor() {
        homepage = new Homepage();
        homepage.hoverVehicleButton();
        homepage.selectCar();
        homepage.clickRadioButton();
        homepage.peakTheColor();

        String expectedText = "Select designo Mystic Brown metallic";
        softAssert.assertEquals(expectedText, WEB_ELEMENT_PEAK_THE_COLOR);


    }

    @Test(enabled = false)
    public void testClickBuildButton() {
        homepage = new Homepage();
        homepage.hoverVehicleButton();
        homepage.selectCar();
        homepage.clickBuildYourCar();

        String expectedText = "Build G 550 SUV";
        softAssert.assertEquals(expectedText, WEB_ELEMENT_CLICK_BUILD_CAR);

    }
    @Test
    public void testDoChangeWheels() {
        homepage = new Homepage();
        homepage.hoverVehicleButton();
        homepage.selectCar();
        homepage.clickBuildYourCar();
        homepage.doChangeWheels();

        String expectedText = "wheels";
        softAssert.assertEquals(expectedText, WEB_ELEMENT_CLICK_BUILD_CAR);
    }
    }

