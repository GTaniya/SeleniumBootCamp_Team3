package videogamesConsolesTest;

import common.BaseAPI;
import videogamesConsoles.VideogamesConsolePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static videogamesConsoles.VideogamesConsolesLocators.*;

public class TestVideogamesConsoles extends BaseAPI {
    VideogamesConsolePage videogamesConsoles;

    @Test(enabled = false)
    public void testVideogamesConsolesPage() throws Exception {
        videogamesConsoles = new VideogamesConsolePage();

        videogamesConsoles.clickShopCategory();
        Thread.sleep(2000);
        videogamesConsoles.clickVideogamesConsoles();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Enroll in Chase Online Banking | Chase";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testMyEbay() throws Exception {
        videogamesConsoles = new VideogamesConsolePage();
        videogamesConsoles.hoverMyEbay();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testXbox() throws Exception {
        videogamesConsoles = new VideogamesConsolePage();
        videogamesConsoles.searchXbox();
        Thread.sleep(2000);
       String expectedText = "xbox series x";
       softAssert.assertEquals(expectedText, WEB_ELEMENT_SEARCH_XBOX);
    }

    @Test(enabled = false)
    public void testSwitch() throws Exception {
        videogamesConsoles = new VideogamesConsolePage();
        videogamesConsoles.searchSwitch();
        Thread.sleep(2000);
        String expectedText = "nintendo switch";
        softAssert.assertEquals(expectedText, WEB_ELEMENT_SEARCH_SWITCH);
    }

    @Test(enabled = false)
    public void testPS5() throws Exception {
        videogamesConsoles = new VideogamesConsolePage();
        videogamesConsoles.searchPS5();
        Thread.sleep(2000);
        String expectedText = "ps5";
        softAssert.assertEquals(expectedText, WEB_ELEMENT_SEARCH_PS5);
    }

    @Test(enabled = false)
    public void testYakuza() throws Exception {
        videogamesConsoles = new VideogamesConsolePage();
        videogamesConsoles.searchYakuza();
        Thread.sleep(2000);
        String expectedText = "yakuza like a dragon";
        softAssert.assertEquals(expectedText, WEB_ELEMENT_SEARCH_YAKUZA);
    }

    @Test
    public void testMHR() throws Exception {
        videogamesConsoles = new VideogamesConsolePage();
        videogamesConsoles.searchMHR();
        Thread.sleep(2000);
        String expectedText = "monster hunter rise";
        softAssert.assertEquals(expectedText, WEB_ELEMENT_SEARCH_MHR);
    }
}
