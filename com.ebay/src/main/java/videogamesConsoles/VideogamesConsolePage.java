package videogamesConsoles;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import videogamesConsoles.EbayDataDriver.DataSource;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;

import static videogamesConsoles.VideogamesConsolesLocators.*;

public class VideogamesConsolePage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_SHOP_CATEGORY)
    WebElement shopCategory;

    public VideogamesConsolePage() { PageFactory.initElements(driver, this); }

    public void clickShopCategory() { shopCategory.click(); }

    @FindBy(xpath = WEB_ELEMENT_VIDEOGAMES_CONSOLES)
    WebElement videogamesConsoles;

    public void clickVideogamesConsoles() { clickByXpathUsingJavaScript(WEB_ELEMENT_VIDEOGAMES_CONSOLES); }

    @FindBy(xpath = WEB_ELEMENT_MY_EBAY)
    WebElement myEbay;

    public void hoverMyEbay(){
//        Actions builder = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_MY_EBAY));
//        builder.moveToElement(element).build().perform();
        hoverOverElement(myEbay);
    }

        public void searchXbox() throws Exception {
            List<String> Xbox = DataSource.getItemsListFromExcel();
            String item = Xbox.get(1);
            typeOnElement(WEB_ELEMENT_SEARCH_BAR, item);
            clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
           // Robot robot = new Robot();
         //   robot.keyPress(KeyEvent.VK_ENTER);
        }

    public void searchSwitch() throws Exception {
        List<String> Switch = DataSource.getItemsListFromExcel();
        String item = Switch.get(2);
        typeOnElement(WEB_ELEMENT_SEARCH_BAR, item);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
        // Robot robot = new Robot();
        //   robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void searchPS5() throws Exception {
        List<String> PS5 = DataSource.getItemsListFromExcel();
        String item = PS5.get(0);
        typeOnElement(WEB_ELEMENT_SEARCH_BAR, item);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }

    public void searchYakuza() throws Exception {
        List<String> PS5 = DataSource.getItemsListFromExcel();
        String item = PS5.get(3);
        typeOnElement(WEB_ELEMENT_SEARCH_BAR, item);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }

    public void searchMHR() throws Exception {
        List<String> PS5 = DataSource.getItemsListFromExcel();
        String item = PS5.get(4);
        typeOnElement(WEB_ELEMENT_SEARCH_BAR, item);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }
    }

