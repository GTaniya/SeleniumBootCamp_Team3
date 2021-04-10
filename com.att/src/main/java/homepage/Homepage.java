package homepage;

import common.BaseAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.Facet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static homepage.HomePageLocators.*;

public class Homepage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BOX)
    WebElement inputSearchBox;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);

    }

    public void doSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        typeOnElement(WEB_ELEMENT_SEARCH_BOX, WEB_ELEMENT_INPUT_TEXT);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = WEB_ELEMENT_DEALS)
    WebElement attDeals;

    @FindBy(xpath = WEB_ELEMENT_DEALS_WIRELESS)
    WebElement attDealsWireless;

    public void clickDealsLink() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_DEALS);
    }

    public void clickDealsWirelessLink() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_DEALS_WIRELESS);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = WEB_ELEMENT_DROP_DOWN_MENU)
    WebElement dropDownMenu;

    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_MENU_INTERNET)
    WebElement dropDownMenuInternet;

    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_MENU_INTERNET_EXPLORE_INTERNET)
    WebElement exploreInternet;

    public void clickDropDownMenu(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_MENU);}

    public void clickDropDownMenuInternet(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_MENU_INTERNET);}

    public void clickDropDownMenuExploreInternet(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_MENU_INTERNET_EXPLORE_INTERNET);}


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_SHOP_NOW_BUTTON)
    WebElement shopNowButton;

    @FindBy (xpath = WEB_ELEMENT_SELECT_PHONE_COLOR)
    WebElement selectPhoneColor;

    @FindBy (xpath = WEB_ELEMENT_SELECT_PHONE_CAPACITY)
    WebElement selectPhoneCapacity;

    public void clickShopNowButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_SHOP_NOW_BUTTON);}

    public void clickToSelectPhoneColor(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_PHONE_COLOR);}

    public void clickToSelectPhoneCapacity(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_PHONE_CAPACITY);}

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_ATT_TV)
    WebElement attTv;

    @FindBy (xpath = WEB_ELEMENT_ATT_TV_CHANNEL_LINE_UP)
    WebElement tvChannelLineUp;

    @FindBy (xpath = WEB_ELEMENT_ATT_TV_CHANNEL_LINE_UP_INPUT_SEARCH_BAR)
    WebElement tvChannelLineUpInputSearchBar;

    @FindBy (xpath = WEB_ELEMENT_ATT_TV_CHANNEL_INPUT_TEXT)
    WebElement tvChannelInputText;

    @FindBy (xpath = WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_SUBMIT_RESULT)
    WebElement tvChannelSearchSubmitResult;

    @FindBy (xpath = WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_A_TO_Z)
    WebElement channelAtoZ;

    @FindBy (xpath = WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_A_TO_Z_CATEGORY)
    WebElement channelAtoZCategory;

    @FindBy (xpath = WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_CATEGORY_INTERNATIONAL)
    WebElement selectInternationalChannels;

    public void clickAttTvButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATT_TV);}
    public void clickAttTvLineUpButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATT_TV_CHANNEL_LINE_UP);}

    public void clickAttTvLineUpInputSearchBar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickByXpathUsingJavaScript(WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_SUBMIT_RESULT);

    }

    public void doSearchChannel() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        typeOnElement(WEB_ELEMENT_ATT_TV_CHANNEL_LINE_UP_INPUT_SEARCH_BAR, WEB_ELEMENT_ATT_TV_CHANNEL_INPUT_TEXT);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();

    }

    public void findAtoZChannels(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_A_TO_Z);}

    public void findAtoZChannelsClickCategory(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_A_TO_Z_CATEGORY);}

    public void findInternationalChannelsFromCategory(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATT_TV_CHANNEL_SEARCH_A_TO_Z_CATEGORY);}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_PREPAID_PAGE)
    public WebElement prepaid;

    @FindBy (xpath = WEB_ELEMENT_BUTTON_SHOP_NOW)
    public WebElement buttonShopNow;

    public void navigateToPrepaidPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_PREPAID_PAGE);}


    public void hoverOverButtonShopNow() throws Exception {

        hoverOverElement(buttonShopNow);
    }






















}

