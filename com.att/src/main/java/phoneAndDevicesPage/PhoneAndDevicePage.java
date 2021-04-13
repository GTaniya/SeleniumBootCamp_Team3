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

    @FindBy (xpath = WEB_ELEMENT_PHONE_AND_DEVICE_PAGE )
    WebElement phoneAndDevicePage;

    public void clickPhoneAndDevicePageLink(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_PHONE_AND_DEVICE_PAGE);

    }
    @FindBy(xpath =WEB_ELEMENT_PHONE_AND_DEVICE_DEALS )
    WebElement getPhoneAndDeviceDeals;

    public void doSearchPhoneAndDeviceDeals(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_PHONE_AND_DEVICE_DEALS);
    }
    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH)
    WebElement doInputSearch;

    public void  inputSearchPhoneAndDevice(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_SEARCH);

    }

    @FindBy(xpath = WEB_ELEMENT_CLICK_SHOP_BUTTON)
    WebElement shopButtonPhone;


    public void clickShopPhoneButton(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_SHOP_BUTTON);

   }
   @FindBy(xpath = WEB_ELEMENT_ACCOUNT_DROP_DOWN)
   WebElement accountDropDown;

   @FindBy(xpath = WEB_ELEMENT_SIGN_IN_TO_MY_ATT)
   WebElement doSignInToMyAtt;


   public void clickDropDown(){
       clickByXpathUsingJavaScript(WEB_ELEMENT_ACCOUNT_DROP_DOWN);
   }

    public void signInSearch(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SIGN_IN_TO_MY_ATT);

      //  WebElement element = driver.findElement(By.id)
    }
    @FindBy(xpath = WEB_ELEMENT_SMART_WATCHES)
    WebElement smartWatches;

   @FindBy(xpath = WEB_ELEMENT_LOW_COST_SMART_WATCHES)
   WebElement samsungSmartWatches;

    public void searchSmartWatches(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_SMART_WATCHES);
    }
    public void clickLowCostsSmartWatches(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_LOW_COST_SMART_WATCHES);
    }

    }




