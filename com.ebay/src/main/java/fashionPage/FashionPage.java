package fashionPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.PreparedStatement;

import static fashionPage.FashionPageLocators.*;

public class FashionPage extends BaseAPI {

    public FashionPage() {
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = WEB_ELEMENT_CLICK_FASHION_BUTTON )
        WebElement clickFashionButton;

        public void fashionButton(){
            clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_FASHION_BUTTON);
        }
        public void clickShopByCategory(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_SHOP_BY_CATEGORY);}

        public void clickFashionWoman(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_FASHION_WOMAN);}

        public void searchDressPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_DRESSED_PAGE);}

        public void clickJeweleryDropDown(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_JEWELRY_DROP_DOWN);}

        public void searchJewelryPage (){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_JEWELRY_PAGE);}

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


    }


