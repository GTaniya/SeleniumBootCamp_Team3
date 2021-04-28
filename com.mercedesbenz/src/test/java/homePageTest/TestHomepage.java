package homePageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;

public class TestHomepage extends BaseAPI {

    Homepage homepage;

    @Test(enabled = true)
    public void testClickCoupeButton(){
        homepage = new Homepage();
        homepage.clickCoupe();

        Assert.assertTrue(isElementSelected(homepage.clickCoupeButton));


    }
    @Test
    public void testHoverCLACoupe(){
        homepage = new Homepage();
        homepage.clickCoupe();
        homepage.hoverCLACoupeMenu();

        String expectedHeader = "CLA Coupe";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_HOVER_CLA_COUPE);


    }
    @Test(enabled = false)
    public void testClickAMGCLACoupeButton(){
        homepage = new Homepage();
        homepage.clickCoupe();
        homepage.hoverCLACoupeMenu();
        homepage.clickAMGCLACoupe();

        String expectedHeader = "AMG CLA 45 Coupe";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_CLICK_AMG_CLA_COUPE);


    }

}
