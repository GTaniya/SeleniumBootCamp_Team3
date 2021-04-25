package bmwCertifiedPageTest;

import bmwCertifiedPage.BMWCertifiedPage;
import common.BaseAPI;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBMWCertifiedPage extends BaseAPI {

    BMWCertifiedPage bmwCertifiedPage;

    //Test #1
    @Test(enabled = false)

    public void testNavigation() {

        bmwCertifiedPage = new BMWCertifiedPage();

        bmwCertifiedPage.clickBmwCertifiedPageLink();


        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Luxury SUVs, Sedans, Coupes, Convertibles & Crossovers | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #2
    @Test(enabled = false)

    public void testPreOwnedInventoryButton() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();

        bmwCertifiedPage.clickBmwCertifiedPageLink();

        WebDriverWait wait = new WebDriverWait(driver,20);

        bmwCertifiedPage.clickBmwCertifiedPageInventoryButton();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Certified Pre-Owned Luxury Vehicles | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #3

    @Test(enabled = false)

    public void testPreOwnedInventorySearchZipCode() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();
        bmwCertifiedPage.clickBmwCertifiedPageLink();

        implicitWait(20);
        bmwCertifiedPage.clickBmwCertifiedPageInventoryButton();

        implicitWait(20);
        bmwCertifiedPage.doSearch();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Find Your Certified Preowned BMW Luxury Vehicles | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #4
    @Test(enabled = false)

    public void testBmwSeriesAndModelsButton() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();
        bmwCertifiedPage.clickBmwCertifiedPageLink();
        implicitWait(20);
        //WebDriverWait wait = new WebDriverWait(driver,20);
        bmwCertifiedPage.clickBmwSpecialOffersButton();
        implicitWait(20);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Certified Pre-Owned Luxury Vehicles | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #5
    @Test(enabled = false)

    public void testMoreInformationLink() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();
        bmwCertifiedPage.clickBmwCertifiedPageLink();

        WebDriverWait wait = new WebDriverWait(driver,20);
        bmwCertifiedPage.clickBmwSpecialOffersButton();
        bmwCertifiedPage.clickMoreInformationLink();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Certified Pre-Owned Luxury Vehicles | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #6
    @Test(enabled = false)

    public void testSelectX1Button() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();
        bmwCertifiedPage.clickBmwCertifiedPageLink();
        WebDriverWait wait = new WebDriverWait(driver,20);

        bmwCertifiedPage.scroll();
        bmwCertifiedPage.clickPricingAndFeaturesLink();
        implicitWait(20);
        String actualTitle = BaseAPI.driver.getTitle();
        implicitWait(20);

        String expectedTitle = "X1 Sports Activity Vehicle® – Pricing and Features | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #7
    @Test(enabled = false)

    public void testSelectCarColor() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();
        bmwCertifiedPage.clickBmwCertifiedPageLink();
        implicitWait(20);
        //WebDriverWait wait = new WebDriverWait(driver,20);
        bmwCertifiedPage.clickSelectX1Button();
        implicitWait(20);
        bmwCertifiedPage.clickPricingAndFeaturesLink();
        implicitWait(20);
        bmwCertifiedPage.clickSelectX1Button();
        bmwCertifiedPage.selectTheColorOfTheCar();
        implicitWait(20);
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "X1 Sports Activity Vehicle® Overview | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #8
    @Test(enabled = false)

    public void testLearnMoreLink() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();
        bmwCertifiedPage.clickBmwCertifiedPageLink();
        implicitWait(20);
        bmwCertifiedPage.clickLearnMoreLink();
        implicitWait(20);
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Certified Pre-Owned Luxury Vehicles | BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #9
    @Test(enabled = false)

    public void testDesigningCarSedan3() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();

        bmwCertifiedPage.clickDesigningSedan3Link();
        implicitWait(20);
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Build Your Own – Engine and Drivetrain Options – BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }
    //Test #10
    @Test(enabled = false)

    public void testDesigningCarButtons() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();

        bmwCertifiedPage.clickDesigningSedan3Link();
        implicitWait(20);
        bmwCertifiedPage.clickStartDesigningButton();
        implicitWait(20);
        bmwCertifiedPage.clickStartDesigningExteriorLink();
        implicitWait(20);


        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Build Your Own – Choose Exterior Color & Wheels – BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #11
    @Test(enabled = true)

    public void testDesigningCarColor() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();

        bmwCertifiedPage.clickDesigningSedan3Link();
        implicitWait(20);
        bmwCertifiedPage.clickStartDesigningButton();
        implicitWait(20);
        bmwCertifiedPage.clickStartDesigningExteriorLink();
        implicitWait(20);
        bmwCertifiedPage.chooseColorForDesigningExteriorCar();
        implicitWait(20);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Build Your Own – Choose Exterior Color & Wheels – BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");

    }

    //Test #12
    @Test(enabled = false)

    public void testConceptVehicleLink() throws InterruptedException {

        bmwCertifiedPage = new BMWCertifiedPage();

        bmwCertifiedPage.clickConceptVehiclesLink();
        implicitWait(20);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Concept Vehicles - BMW North America - BMW USA";

        Assert.assertEquals(actualTitle, expectedTitle, "PAGE DOES NOT MATCH");


    }


    }
