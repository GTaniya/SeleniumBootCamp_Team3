package homepage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.cert.X509Certificate;

import static homepage.HomepageLocators.*;

public class Homepage extends BaseAPI {

    @FindBy(xpath = webElementInputSearch)
    WebElement inputSearchBox;

    @FindBy (xpath = webElementButtonSearch)
    WebElement buttonSearch;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickByXpathUsingJavaScript(webElementButtonSearch);

    }

    public void doSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        typeOnElement(webElementInputSearch, webElementText);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (css = webElementFieldGuide)
    WebElement fieldGuideToggle;

    @FindBy (css = webElementSignUp)
    WebElement signUpSearch;


    public void clickToggleButton() { fieldGuideToggle.click();}

    public void clickSignUpButton() { signUpSearch.click();}

    public void doToggleClick(){
        clickToggleButton();
    }

    public void doSignUp(){
        clickSignUpButton();
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = webElementHelpCenter)
    WebElement helpCenterLink;

    @FindBy (css = webElementSignIn)
    WebElement signInLink;

    @FindBy (css = webElementPhoneNumberField)
    WebElement phoneNumberField;

    @FindBy (css = webElementPhoneNumber)
    WebElement phoneNumber;

    @FindBy (xpath = webElementContinue)
    WebElement continueButton;


    public void clickHelpCenterLink() {
        clickByXpathUsingJavaScript(webElementHelpCenter);
    }

    public void clickSignIn() {signInLink.click();}

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void addContactInfo() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        typeOnElement(webElementPhoneNumberField, webElementPhoneNumber);
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
    }

    public void doContinue(){
        clickByXpathUsingJavaScript(webElementContinue);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = webElementCareers)
    WebElement careersLink;

    @FindBy (xpath = webElementExploreRoles)
    WebElement exploreRolesLink;

    @FindBy (xpath = webElementBusinessDevelopment)
    WebElement businessDevelopment;

    @FindBy (xpath = webElementQuestions)
    WebElement questionsPage;

    public void clickCareersLink(){
        clickByXpathUsingJavaScript(webElementCareers);
    }

    public void clickExploreRolesButton(){
        clickByXpathUsingJavaScript(webElementExploreRoles);
    }

    public void clickBusinessDevelopmentButton() throws InterruptedException {
        clickByXpathUsingJavaScript(webElementBusinessDevelopment);
        Thread.sleep(4000);
        //WebDriverWait wait2 = new WebDriverWait(driver, 40);
    }

    public void clickQuestionsLink() throws InterruptedException {
        clickByXpathUsingJavaScript(webElementQuestions);
        Thread.sleep(4000);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = webElementGiftCards)
    WebElement giftCardsLink;

    @FindBy (xpath = webElementBuyGiftCards)
    WebElement buyGiftCardsLink;

    @FindBy (xpath = webElementBuyGiftCardsPrice)
    WebElement buyGiftCardsPrice;

    @FindBy (xpath = webElementBuyGiftCards25)
    WebElement buyGiftCards25;

    @FindBy (xpath = webElementGiftCardsCheckBox)
    WebElement giftCardsCheckBox;

    @FindBy (xpath = webElementRecipientNameField)
    WebElement recipientNameField;

    @FindBy (xpath = webElementRecipientName)
    WebElement recipientName;

    @FindBy (xpath = webElementRecipientEmailField)
    WebElement recipientPhoneField;

    @FindBy (xpath = webElementRecipientEmail)
    WebElement recipientPhone;

    @FindBy (xpath = webElementRecipientMessageField)
    WebElement recipientMessageField;

    @FindBy (xpath = webElementRecipientMessage)
    WebElement recipientMessage;

    @FindBy (xpath = webElementSenderNameField)
    WebElement senderNameField;

    @FindBy (xpath = webElementSenderName)
    WebElement senderName;

    @FindBy (xpath = webElementAddToCart)
    WebElement addToCartButton;

    public void clickGiftCardsLink() {clickByXpathUsingJavaScript(webElementGiftCards);}
    WebDriverWait wait2 = new WebDriverWait(driver, 10);

    public void clickBuyGiftCardsLink() {clickByXpathUsingJavaScript(webElementBuyGiftCards);}
    WebDriverWait wait3 = new WebDriverWait(driver, 10);

    public void clickGiftCards25Button() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        typeOnElement(webElementBuyGiftCardsPrice, webElementBuyGiftCards25);
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
    }

//    public void clickGiftCards25Button() {clickByXpathUsingJavaScript(webElementBuyGiftCardsPrice);}
//    WebDriverWait wait5 = new WebDriverWait(driver, 10);

    public void clickSendByTextCheckBox() {clickByXpathUsingJavaScript(webElementGiftCardsCheckBox);}
    WebDriverWait wait7 = new WebDriverWait(driver, 10);

    public void addRecipientName() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        typeOnElement(webElementRecipientNameField, webElementRecipientName);
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
    }

    public void addRecipientEmail() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        typeOnElement(webElementRecipientEmailField, webElementRecipientEmail);
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
    }

    public void addRecipientMessage() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        typeOnElement(webElementRecipientMessageField, webElementRecipientMessage);
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
    }

    public void addSenderName() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        typeOnElement(webElementSenderNameField, webElementSenderName);
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
    }

    public void clickAddToCartButton() {clickByXpathUsingJavaScript(webElementAddToCart);}
    WebDriverWait wait6 = new WebDriverWait(driver, 10);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = webElementAirbnbOrg)
    WebElement airbnbOrgLink;

    @FindBy (xpath = webElementWhoWeAre)
    WebElement whoWeAreLink;

    @FindBy (xpath = webElementDonate)
    WebElement donateButton;


    public void clickAirbngOrgLink() {clickByXpathUsingJavaScript(webElementAirbnbOrg);}

    public void clickWhoWeAreLink() {clickByXpathUsingJavaScript(webElementWhoWeAre);}
   // WebDriverWait wait9 = new WebDriverWait(driver, 40);

    public void clickDonateButton() {clickByXpathUsingJavaScript(webElementDonate);}
  //  WebDriverWait wait10 = new WebDriverWait(driver, 40);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_RESOURCE_CENTER_LINK)
    WebElement resourceCenterLink;

    @FindBy (xpath = WEB_ELEMENT_RESOURCE_CENTER_TOPICS_MENU_BUTTON)
    WebElement topicsMenuButton;

    @FindBy (xpath = WEB_ELEMENT_RESOURCE_CENTER_TOPICS_DESIGN_DECOR_LINK)
    WebElement designAndDecorLink;

    public void clickResourceCenterLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCE_CENTER_LINK);}

    public void clickResourceCenterTopicsMenuButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCE_CENTER_TOPICS_MENU_BUTTON);}

    public void clickResourceCenterTopicsDesignDecorLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCE_CENTER_TOPICS_DESIGN_DECOR_LINK);}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_RESOURCE_CENTER_LINK2)
    WebElement resourceCenter2;

    @FindBy (xpath = WEB_ELEMENT_RESOURCE_CENTER_GUIDE_MENU_BUTTON)
    WebElement guideMenuButton;

    @FindBy (xpath = WEB_ELEMENT_RESOURCE_CENTER_GUIDE_SETTING_LISTING)
    WebElement settingUpSettingsListing;

    public void clickResourceCenterLink2(){clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCE_CENTER_LINK2);}

    public void clickResourceCenterGuideMenuButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCE_CENTER_GUIDE_MENU_BUTTON);}

    public void clickResourceCenterGuideSettingListing(){clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCE_CENTER_GUIDE_SETTING_LISTING);}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_OCEAN_CITY_IMAGE_LINK)
    WebElement oceanCityImageLink;

    @FindBy (xpath = WEB_ELEMENT_OCEAN_CITY_TYPE_OF_PLACE)
    WebElement oceanCityTypeOfPlace;

    public void clickOceanCityImageLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_OCEAN_CITY_IMAGE_LINK);}

    //WebDriverWait wait12 = new WebDriverWait(driver, 20);

    public void clickOceanCityTypeOfPlaceButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_OCEAN_CITY_TYPE_OF_PLACE);}

   // WebDriverWait wait13 = new WebDriverWait(driver, 40);


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_LANGUAGE_BUTTON)
    WebElement languageButton;

    @FindBy (xpath = WEB_ELEMENT_LANGUAGE_ITALIA)
    WebElement languageItalia;

    public void clickLanguageButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_LANGUAGE_BUTTON);}

    public void clickLanguageItaliaButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_LANGUAGE_ITALIA);}


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_INVESTORS)
    WebElement investorsLink;

    @FindBy (xpath = WEB_ELEMENT_INVESTORS_QUARTERLY_RESULTS)
    WebElement investorsQuarterlyResults;


    public void clickInvestorsLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_INVESTORS);}

    public void clickInvestorsQuarterlyResults(){clickByXpathUsingJavaScript(WEB_ELEMENT_INVESTORS_QUARTERLY_RESULTS);}


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_INVESTORS)
    WebElement investorsLinkButton;

    @FindBy (xpath = WEB_ELEMENT_INVESTORS_STOCK_INFO)
    WebElement investorsStockInfo;

    @FindBy (xpath = WEB_ELEMENT_INVESTORS_STOCK_INFO_QUOTE)
    WebElement investorsStockInfoQuote;

    public void clickInvestorsLinkButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_INVESTORS);}

    public void clickInvestorsStockInfoButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_INVESTORS_STOCK_INFO);}

    public void clickInvestorsStockInfoQuoteButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_INVESTORS_STOCK_INFO_QUOTE);}

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @FindBy (xpath = WEB_ELEMENT_AIRBNB_FOR_WORK)
    WebElement airBnBForWork;

    @FindBy (xpath = WEB_ELEMENT_AIRBNB_FOR_WORK_INPUT_EMAIL)
    WebElement airBnBForWorkEmail;

    @FindBy (xpath = WEB_ELEMENT_AIRBNB_FOR_WORK_INPUT_EMAIL_SUBMIT_BUTTON)
    public WebElement emailSubmitButton;

    public void clickAirBnBLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_AIRBNB_FOR_WORK);}

    public void addEmail(){
        typeOnElement(WEB_ELEMENT_AIRBNB_FOR_WORK_INPUT_EMAIL, WEB_ELEMENT_AIRBNB_FOR_WORK_EMAIL);
    }
    public void submitEmail(){clickByXpathUsingJavaScript(WEB_ELEMENT_AIRBNB_FOR_WORK_INPUT_EMAIL_SUBMIT_BUTTON);}


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = WEB_ELEMENT_FOUNDERS_LETTER)
    WebElement foundersLetter;

    @FindBy (xpath = WEB_ELEMENT_FOUNDERS_LETTER_ABOUT_US)
    WebElement foundersLetterAboutUs;

    public void clickFoundersLetterLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_FOUNDERS_LETTER);}

    public void clickAboutUs(){clickByXpathUsingJavaScript(WEB_ELEMENT_FOUNDERS_LETTER_ABOUT_US);}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

















    }


