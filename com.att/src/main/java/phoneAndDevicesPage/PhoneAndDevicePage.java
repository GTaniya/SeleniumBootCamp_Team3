package phoneAndDevicesPage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.logging.XMLFormatter;

import static phoneAndDevicesPage.PhoneAndDevicePageLocators.*;

public class PhoneAndDevicePage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_PHONE_AND_DEVICE_PAGE)
    WebElement phoneAndDevicePage;

    public void clickPhoneAndDevicePageLink() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_PHONE_AND_DEVICE_PAGE);

    }

    @FindBy(xpath = WEB_ELEMENT_PHONE_AND_DEVICE_DEALS)
    WebElement getPhoneAndDeviceDeals;

    public void doSearchPhoneAndDeviceDeals() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_PHONE_AND_DEVICE_DEALS);
    }

    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH)
    WebElement doInputSearch;

    public void inputSearchPhoneAndDevice() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_SEARCH);

    }

    @FindBy(xpath = WEB_ELEMENT_CLICK_SHOP_BUTTON)
    WebElement shopButtonPhone;


    public void clickShopPhoneButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_SHOP_BUTTON);

    }

    @FindBy(xpath = WEB_ELEMENT_ACCOUNT_DROP_DOWN)
    WebElement accountDropDown;

    @FindBy(xpath = WEB_ELEMENT_SIGN_IN_TO_MY_ATT)
    WebElement doSignInToMyAtt;


    public void clickDropDown() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_ACCOUNT_DROP_DOWN);
    }

    public void signInSearch() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SIGN_IN_TO_MY_ATT);

        //  WebElement element = driver.findElement(By.id)
    }

    @FindBy(xpath = WEB_ELEMENT_SMART_WATCHES)
    WebElement smartWatches;

    @FindBy(xpath = WEB_ELEMENT_LOW_COST_SMART_WATCHES)
    WebElement samsungSmartWatches;

    public void searchSmartWatches() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SMART_WATCHES);
    }

    public void clickLowCostsSmartWatches() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_LOW_COST_SMART_WATCHES);
    }


    @FindBy(css = WEB_ELEMENT_CLICK_MENU_BAR)
    WebElement clickMenuBar;
    @FindBy(xpath = WEB_ELEMENT_CLICK_DESKTOP_MENU)
    WebElement clickDesktopMenu;
    @FindBy(xpath = WEB_ELEMENT_EXPLORE_WIRELESS)
    WebElement exploreWireLess;

    public void doClickMenu(){
        clickByCssSelectorUsingJavaScript(WEB_ELEMENT_CLICK_MENU_BAR);

    }
    public void openDesktopMenuBar(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_DESKTOP_MENU);

    }
    public void ClickExploreWireLess(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_EXPLORE_WIRELESS);
    }


    @FindBy(xpath = WEB_ELEMENT_CHECK_WISH_LIST)
    WebElement checkWishList;

    public void checkWishListItems(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_WISH_LIST);

    }
    @FindBy(name = WEB_ELEMENT_RADIO_OPTION_PRICE)
    WebElement radioOptionPrice;

    public void selectPriceRadioOption(){
        selectElement(radioOptionPrice);
    }
    @FindBy(xpath = WEB_ELEMENT_CLICK_HOME_PHONE_)
    WebElement clickHomePhone;
    @FindBy(xpath = WEB_ELEMENT_EXPLORE_HOME_PHONE_BAR_)
    WebElement exploreHomePhoneBar;

    public void clickHomePhoneFromMenu(){
        selectElement(clickHomePhone);
    }
    public void clickExploreHomePhone(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_EXPLORE_HOME_PHONE_BAR_);
    }



}








