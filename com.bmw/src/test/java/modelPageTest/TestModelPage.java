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
    @Test(enabled = false)
    public void testHoverOverButtonDesign(){
        modelsPage = new ModelsPage();
        modelsPage.hoverOverButtonDesign();

        String actualAttributeValue = modelsPage.hoverOverButtonBuildYourOwn.getAttribute("class");
        String expectedAttributeValue = "cta-button theme-core byo-core-type variant-tile-cta cta-1";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue,expectedAttributeValue,"class didn't find");

    }
    @Test(enabled = false)
    public void testsBMWMountainsButton() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.clickBMWMountainsButton();


        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "BMW.com | The international BMW Website";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");

    }
    @Test(enabled = false)
    public void testBMWModelM5() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.clickButton();
        modelsPage.checkBMWM5Model();


        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "THE M5. BMW 5 Series Sedan M Automobiles: Discover highlights | BMW.com";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void checkTweeterButton() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.checkTweeterButton();


    }
    @Test(enabled = false)
    public void testSearchFutureVehicle() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.searchBMWFutureModel();



        Thread.sleep(1000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Future Vehicles - New BMW Models Coming Soon - BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }
    @Test
    public void testDoSearchConceptVehicle() throws InterruptedException {
        modelsPage = new ModelsPage();
       modelsPage.doSearchVehicle();



        Thread.sleep(15000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Concept Vehicles - BMW North America - BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }
    @Test
    public void testDoClickMyBMW() throws InterruptedException {
        modelsPage = new ModelsPage();
        modelsPage.doClickMyBMW();



        Thread.sleep(15000);
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "My BMW";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
}