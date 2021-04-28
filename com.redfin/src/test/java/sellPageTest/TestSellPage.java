package sellPageTest;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import sellPage.SellPage;

import java.util.Set;

public class TestSellPage extends BaseAPI {

    SellPage sellPage;

    @Test(enabled = false)
    public void testDropDownSellButton(){
        sellPage = new SellPage();
        sellPage.DropDownSell();

        String expectedText ="true";
        String actualText = sellPage.dropDownSellButton.getAttribute("aria-expanded");

        Assert.assertEquals(actualText,expectedText,"Test Doesn't Work");
    }
    @Test(enabled = false)
    public void testSearchInputBox(){
        sellPage = new SellPage();
        sellPage.DropDownSell();
        sellPage.SearchBox();

        String expectedResult ="searchInputBox";
        String actualResult= driver.findElement(By.xpath("//div[@class='headerUnifiedSearch']//input[@id='search-box-input']")).getAttribute("name");

        Assert.assertEquals(actualResult,expectedResult,"Test Doesn't Work");

    }
    @Test
    public void testClickMortgageButton(){
        sellPage = new SellPage();
        sellPage.clickMortgage();

        String expectedResult ="Mortgage Menu";
        String actualResult = driver.findElement(By.xpath("//a[.='Mortgage ▾']")).getAttribute("title");

        Assert.assertEquals(actualResult,expectedResult,"TEST DOESN'T WORK");
    }

}
