package fashionPage;

import common.BaseAPI;
import fashionPage.ebayDataDriver.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static fashionPage.FashionPageLocators.*;

public class FashionPage extends BaseAPI {

    public FashionPage() {
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = WEB_ELEMENT_CLICK_FASHION_BUTTON )
        public WebElement clickFashionButton;

        public void fashionButton(){
            clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_FASHION_BUTTON);
        }
        public void clickShopByCategory(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_SHOP_BY_CATEGORY);}

        public void clickFashionWoman(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_FASHION_WOMAN);}

        public void searchDressPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_DRESSED_PAGE);}

        @FindBy(xpath = WEB_ELEMENT_CLICK_JEWELRY_DROP_DOWN)
        public WebElement clickJewelery;

        public void clickJeweleryDropDown(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_JEWELRY_DROP_DOWN);}

        public void searchJewelryPage (){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_JEWELRY_PAGE);}

        @FindBy(xpath =WEB_ELEMENT_DROP_DOWN_MY_EBAY_MENU )
        public WebElement DropDownMenu;

        public void dropDownMyEbayMenu (){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_MY_EBAY_MENU);}

        public void doSearchFineJewelry (){clickByXpathUsingJavaScript(WEB_ELEMENT_DO_SEARCH_FINE_JEWELRY);}

        public void clickRegistrationButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_REGISTRATION_BUTTON);}

        public void signInYourAccount(){clickByXpathUsingJavaScript(WEB_ELEMENT_SIGN_IN_YOUR_ACCOUNT);}

        public void signUpEbayAccount(){clickByXpathUsingJavaScript(WEB_ELEMENT_SIGN_UP_EBAY_ACCOUNT);}

        public void clickCheckBoxBorder(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_CHECK_BOX_BORDER);}

        public void searchSailAndEvent(){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_SAIL_AND_EVENT);}

        public void searchDeals(){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_DEALS_PAGE);}

        public void dropDownFeatures(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_FEATURES);}

        public void clickBoostDeal(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_BOOST_DEALS);}

        @FindBy(xpath = WEB_ELEMENT_HOVER_HOME_AND_GARDEN)
         public WebElement hoverHomeAndGarden;

        public void hoverHomeAndGardenButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_HOVER_HOME_AND_GARDEN);}

        @FindBy(xpath = WEB_ELEMENT_DO_SEARCH_VACUUMS)
        public WebElement doSearchVacuums;

        public void searchVacuums(){clickByXpathUsingJavaScript(WEB_ELEMENT_DO_SEARCH_VACUUMS);}

        @FindBy(xpath = WEB_ELEMENT_SELECT_DYSON)
        public WebElement selectDyson;

        public void selectVacuumBrand(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_DYSON);}

        @FindBy(xpath = WEB_ELEMENT_PEAK_VACUUM)
        public WebElement peakVacuum;

        public void peakYourItem(){clickByXpathUsingJavaScript(WEB_ELEMENT_PEAK_VACUUM);}

        @FindBy(xpath = WEB_ELEMENT_ADD_TO_CART)
        public WebElement addToCart;

        public void addItemToYourCart(){clickByXpathUsingJavaScript(WEB_ELEMENT_ADD_TO_CART);}

        @FindBy(xpath = WEB_ELEMENT_CLICK_CHECK_OUT)
        public WebElement clickCheckOut;

        public void clickCheckOutButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_CHECK_OUT);}

        public void searchBags() throws Exception {
            List<String> bags = DataSource.getItemsListFromExcel();
            String item = bags.get(1);
            typeOnElement(WEB_ELEMENT_INPUT_SEARCH_BAR,item);
            clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_SEARCH_BUTTON);

        }
        public void searchJewelry() throws Exception {
            List<String> jewelry = DataSource.getItemsListFromExcel();
            String items = jewelry.get(2);
            typeOnElement(WEB_ELEMENT_INPUT_SEARCH_BAR,items);
            clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_SEARCH_JEWELRY);

        }
        public void searchWatches() throws Exception {
            List<String> watches = DataSource.getItemsListFromExcel();
            String itemToSearch = watches.get(3);
            typeOnElement(WEB_ELEMENT_INPUT_SEARCH_BAR,itemToSearch);
            clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_SEARCH_WATCHES);
        }





    }


