package businessAndInstitutionsPage;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static businessAndInstitutionsPage.BusinessAndInstitutionsPageLocators.*;


public class BusinessAndInstitutionsPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_BUSINESS_INSTITUTIONS_PAGE)
    WebElement businessAndInstitutionsPage;

    @FindBy(xpath = WEB_ELEMENT_BUSINESS_INSTITUTIONS_PAGE_SEE_CORONAVIRUS)
    WebElement businessAndInstitutionsPageCoronaNews;

    public BusinessAndInstitutionsPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToBusinessAndInstitutionsPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_BUSINESS_INSTITUTIONS_PAGE);}

    public void clickToBusinessAndInstitutionsSeeMoreLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_BUSINESS_INSTITUTIONS_PAGE_SEE_CORONAVIRUS);}

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @FindBy(xpath = WEB_ELEMENT_MANAGING_BUSINESS_BUTTON)
    WebElement managingBusinessButton;

    public void hoverOverButtonManagingBusiness() throws Exception {

        hoverOverElement(managingBusinessButton);
    }

    public void clickManageBusinessButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_MANAGING_BUSINESS_BUTTON);}

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BAR)
    WebElement inputSearchBox;

    @FindBy (xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement buttonSearch;

    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);

    }

    public void doSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        typeOnElement(WEB_ELEMENT_INPUT_SEARCH_BAR, WEB_ELEMENT_INPUT_SEARCH_TEXT);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();

    }

    @FindBy (xpath = WEB_ELEMENT_TOGGLE_DROP_DOWN)
    WebElement toggleDropDown;

    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_TRANSACTION_SERVICES)
    WebElement transactionServices;

    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_TRANSACTION_SERVICE_SAVE)
    WebElement transactionServicesSave;

    public void clickDropDownButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_TOGGLE_DROP_DOWN);}

    public void clickTransactionServicesLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_TRANSACTION_SERVICES);}

    public void clickTransactionServicesSaveButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_TRANSACTION_SERVICE_SAVE);}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_BANK_CAREERS)
    WebElement bankCareers;

    @FindBy (xpath = WEB_ELEMENT_BANK_CAREERS_START_HERE_BUTTON)
    WebElement bankCareersStartButton;

    @FindBy (xpath = WEB_ELEMENT_BANK_CAREERS_SHARE_BUTTON)
    WebElement careersShareButton;

    @FindBy (xpath = WEB_ELEMENT_BANK_CAREERS_SHARE_BUTTON_LINKEDIN)
    WebElement careersShareButtonLinkedIn;

    @FindBy (xpath = WEB_ELEMENT_BANK_CAREERS_ATTRACTING_TALENT)
    WebElement attractingTalent;

    public void clickBankCareersLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_BANK_CAREERS);}

    public void clickBankCareersStartButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_BANK_CAREERS_START_HERE_BUTTON);}

    public void clickBankCareersShareButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_BANK_CAREERS_SHARE_BUTTON);}

    public void clickBankCareersShareButtonLinkedIn(){clickByXpathUsingJavaScript(WEB_ELEMENT_BANK_CAREERS_SHARE_BUTTON_LINKEDIN);}

    public void clickBankCareersLinkAttractTalent(){clickByXpathUsingJavaScript(WEB_ELEMENT_BANK_CAREERS_ATTRACTING_TALENT);}
















}
