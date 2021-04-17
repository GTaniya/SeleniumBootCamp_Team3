package homepage;

import common.BaseAPI;
import homepage.macysDataDriver.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static homepage.HomepageLocators.*;


public class Homepage extends BaseAPI {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void searchEarringsUsingExcel() throws Exception {
        List<String> earrings = DataSource.getItemsListFromExcel();
        String item = earrings.get(2);
        typeOnElement(WEB_ELEMENT_INPUT_SEARCH, item);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);

    }

    public void searchMascaraUsingExcel() throws Exception {
        List<String> mascara = DataSource.getItemsListFromExcel();
        String item = mascara.get(3);
        typeOnElement(WEB_ELEMENT_INPUT_SEARCH, item);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);

    }

    @FindBy( xpath = WEB_ELEMENT_OPEN_DROP_DOWN_MENU)
    WebElement openDropDownDown;

    @FindBy( xpath = WEB_ELEMENT_DROP_DOWN_MENU_BEAUTY)
    WebElement beauty;

    public void clickDropDown(){clickByXpathUsingJavaScript(WEB_ELEMENT_OPEN_DROP_DOWN_MENU); }
   // public void clickBeauty(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_MENU_BEAUTY); }
    public void clickBeauty() {
        driver.findElement(By.xpath(WEB_ELEMENT_DROP_DOWN_MENU_BEAUTY)).click();
    }

    @FindBy (xpath = WEB_ELEMENT_STORES)
    WebElement stores;

    @FindBy (xpath = WEB_ELEMENT_STORES_INPUT_SEARCH)
    WebElement storesInputSearchBar;

    @FindBy (xpath = WEB_ELEMENT_STORES_SEARCH_BUTTON)
    WebElement searchButton;

    public void clickStoresLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_STORES);}
    public void clickStoreSearchButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_STORES_SEARCH_BUTTON);}
    public void SearchStoreLocation(){
        typeOnElement(WEB_ELEMENT_STORES_INPUT_SEARCH, WEB_ELEMENT_STORES_TEXT);
        clickStoreSearchButton();
    }

    @FindBy (xpath = WEB_ELEMENT_HELP)
    WebElement helpPage;

    @FindBy (xpath = WEB_ELEMENT_HELP_SEE_ALL)
    WebElement seeAllHelpTopics;

    @FindBy (xpath = WEB_ELEMENT_HOVER_SIGN_IN)
    WebElement hoverSignIn;

    public void clickHelpLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_HELP);}
    public void clickHelpLinkSeeAll(){clickByXpathUsingJavaScript(WEB_ELEMENT_HELP_SEE_ALL);}
    public void hoverOverSignInLink(){
        hoverOverElement(hoverSignIn);
    }
}
