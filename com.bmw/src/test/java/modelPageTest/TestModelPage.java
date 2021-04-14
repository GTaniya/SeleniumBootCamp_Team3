package modelPageTest;

import common.BaseAPI;
import modelsPage.ModelsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModelPage extends BaseAPI {
    ModelsPage modelsPage;

    @Test(enabled = false)
    public void testClickModelButton() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.clickButton();

        Thread.sleep(60);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Luxury SUVs, Sedans, Coupes, Convertibles & Crossovers | BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void testClickBMWMButton(){
        modelsPage = new ModelsPage();
        modelsPage.clickBMWMButton();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Luxury SUVs, Sedans, Coupes, Convertibles & Crossovers | BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");

    }
    @Test(enabled = false)
    public void testVehiclesModels() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.clickBMWMButton();
        modelsPage.checkX6Models();


        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "X6 Sports Activity Coupe® | BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void testSearchLocationBar() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.searchLocationBar();



        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Luxury SUVs, Sedans, Coupes, Convertibles & Crossovers | BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }
    @Test(enabled = false)
    public void testHoverOverButton(){
        modelsPage = new ModelsPage();
        modelsPage.hoverOverButton();

        String actualAttributeValue = modelsPage.hoverOverButtonBuildYourOwn.getAttribute("class");
        String expectedAttributeValue = "cta     icon-none ";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue,expectedAttributeValue,"class not found");
    }
    @Test(enabled = false)
    public void testDesignYourOwnCar() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.designYourOwnCar();


        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Build Your Own – Engine and Drivetrain Options – BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");

    }
    @Test
    public void testHoverOverButtonDesign(){
        modelsPage = new ModelsPage();
        modelsPage.hoverOverButtonDesign();

        String actualAttributeValue = modelsPage.hoverOverButtonBuildYourOwn.getAttribute("class");
        String expectedAttributeValue = "cta-button theme-core byo-core-type variant-tile-cta cta-1";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue,expectedAttributeValue,"class didn't find");

    }

}
