package supportPage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

import static supportPage.SupportPageLocator.*;


public class SupportPage extends BaseAPI {

    public SupportPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = WEB_ELEMENT_CLICK_SUPPORT_BUTTON)
    public WebElement clickSupportButton;

    public void clickSupportButton() {
        selectElement(clickSupportButton);
    }


    @FindBy(xpath = WEB_ELEMENT_SEARCH_SUPPORT_OVERVIEW)
    public WebElement searchSupportOverview;

    public void searchSupportOverview() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_SUPPORT_OVERVIEW);
    }

    @FindBy(xpath = WEB_ELEMENT_BILLING_AND_PAYMENTS)
    public WebElement billingAndPayments;

    public void billingAndPayments() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_BILLING_AND_PAYMENTS);
    }

    @FindBy(xpath = WEB_ELEMENT_DROP_DOWN)
    public WebElement dropDown;

    public void dropDown() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN);
    }

    @FindBy(xpath = WEB_ELEMENT_DO_SIGN_IN)
    public WebElement doSearchSignIn;

    public void doSearchSignIn() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_DO_SIGN_IN);
    }

    @FindBy(xpath = WEB_ELEMENT_INPUT_USER_ID_BOX)
    public WebElement inputUserIdBox;

    public void sendKeysToInputBox(String searchKeys) {
        sendKeysToElement(inputUserIdBox, searchKeys);
    }

    @FindBy(xpath = WEB_ELEMENT_INPUT_USER_NAME_FILED)
    WebElement inputUserNameField;

    @FindBy(xpath = WEB_ELEMENT_INPUT_PASSWORD_FILED)
    WebElement inputPasswordField;

    @FindBy(xpath = WEB_ELEMENT_INPUT_SUBMIT_BUTTON)
    WebElement inputSubmitButton;

    @FindBy(xpath = WEB_ELEMENT_SUPPORT_SIGN_IN)
    WebElement supportSignIn;

    public void clickSupportSignInLink() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SUPPORT_SIGN_IN);
    }


    public void sendKeyToSearchBar(String searchKeys) {
        sendKeysToElement(inputUserNameField, searchKeys);
    }

    public void clickSearchButton() {
        clickElement(inputSubmitButton);
    }

    public void doSearch(String searchKeys) {
        sendKeyToSearchBar(searchKeys);
        clickSearchButton();

    }

    public void enterPassword() {
        driver.findElement(By.cssSelector("#main-content > .row [type='text']")).sendKeys("emailaddress");
    }

    @FindBy(xpath = WEB_ELEMENT_DEALS_PAGE)
    WebElement dealsPage;

    public void clickDealsPage() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_DEALS_PAGE);
    }

    public void searchVerizonVisaCard(){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_VERIZON_VISA_CARD);}

    public void clickMap(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_MAP);}

    public void verizonFiveGPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_VERIZON_FIVE_G_PAGE);}

    public void getVerizonFiveG(){clickByXpathUsingJavaScript(WEB_ELEMENT_VERIZON_FIVE_G_PAGE);}}























