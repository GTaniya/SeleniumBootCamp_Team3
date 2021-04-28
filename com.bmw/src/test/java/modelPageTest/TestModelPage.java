package modelPageTest;

import common.BaseAPI;
import modelsPage.ModelsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModelPage extends BaseAPI {
    ModelsPage modelsPage;

    @Test(enabled = false)
    public void testClickModelButton()  {
        modelsPage = new ModelsPage();
        modelsPage.clickButton();


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
    public void testVehiclesModels()  {
        modelsPage = new ModelsPage();
        modelsPage.clickBMWMButton();
        modelsPage.checkX6Models();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "X6 Sports Activity Coupe® | BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void testSearchLocationBar()  {
        modelsPage = new ModelsPage();
        modelsPage.searchLocationBar();



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
    public void testDesignYourOwnCar()  {
        modelsPage = new ModelsPage();
        modelsPage.designYourOwnCar();


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
    public void testsBMWMountainsButton() {
        modelsPage = new ModelsPage();
        modelsPage.clickBMWMountainsButton();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "BMW.com | The international BMW Website";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");

    }
    @Test(enabled = false)
    public void testBMWModelM5()  {
        modelsPage = new ModelsPage();
        modelsPage.clickButton();
        modelsPage.checkBMWM5Model();


        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "THE M5. BMW 5 Series Sedan M Automobiles: Discover highlights | BMW.com";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");
    }
    @Test(enabled = false)
    public void checkTweeterButton()  {
        modelsPage = new ModelsPage();
        modelsPage.checkTweeterButton();


    }
    @Test(enabled = false)
    public void testSearchFutureVehicle()  {
        modelsPage = new ModelsPage();
        modelsPage.searchBMWFutureModel();




        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Future Vehicles - New BMW Models Coming Soon - BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }
    @Test(enabled = false)
    public void testDoSearchConceptVehicle(){
        modelsPage = new ModelsPage();
       modelsPage.searchConceptVehicle();



        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Concept Vehicles - BMW North America - BMW USA";

        Assert.assertEquals(actualResult,expectedResult,"TEST FAILED");


    }



    }








