package mortgagePage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static mortgagePage.MortgagePageLocators.*;

public class MortgagePage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_CLICK_DROP_DOWN)
    WebElement dropDownMenu;

    @FindBy(xpath = WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE)
    WebElement navigateToMortgagePage;

    @FindBy (css = WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE_GET_STARTED_BUTTON)
    public WebElement getStarted;

    public MortgagePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickDropDownMenu(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_DROP_DOWN);}

    public void clickMortgagePageLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE);}

    public void clickGetStartedButton(){clickByCssSelectorUsingJavaScript(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE_GET_STARTED_BUTTON);}

    //************************************************************************************************************

    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_SIGN_IN)
    public WebElement buttonSignIn;

    @FindBy (xpath = WEB_ELEMENT_START_ONLINE)
    WebElement startOnlineButton;

    public void hoverOverButtonSignIn() throws Exception {
        hoverOverElement(buttonSignIn);
    }

    public void hoverOverTheButton(){
        basicHoverUsingXpath(WEB_ELEMENT_HOVER_OVER_SIGN_IN);
    }

    public void NavigateToMortgagePage(){

        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_DROP_DOWN);
        waitUntilClickable(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE);
        clickByXpathUsingJavaScript(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE);

    }

    public void clickStartOnlineButton(){
        scrollToElementJScript(startOnlineButton);
        WebDriverWait wait = new WebDriverWait(driver,30);
        clickByXpathUsingJavaScript(WEB_ELEMENT_START_ONLINE);}

 //************************************************************************************************************
    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON_YES)
    public WebElement radioOptionYes;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON_NO)
    public WebElement radioOptionNo;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON__RIGHT_3)
    public WebElement radioOptionRight3;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON__RIGHT_4)
    public WebElement radioOptionRight4;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON__RIGHT_5)
    public WebElement radioOptionRight5;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON_LEFT_2)
    public WebElement radioOptionLeft2;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON_LEFT_1)
    public WebElement radioOptionLeft1;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON_LEFT_0)
    public WebElement radioOptionLeft0;


    public void selectPrevRadioOption(){

        driverWait.until(ExpectedConditions.elementToBeClickable(radioOptionRight3));
        radioOptionRight3.click();
        driverWait.until(ExpectedConditions.elementToBeClickable(radioOptionRight4));
        radioOptionRight4.click();
        driverWait.until(ExpectedConditions.elementToBeClickable(radioOptionRight5));
        radioOptionRight5.click();

    }

    public void selectNextRadioOption(){

        clickElement(radioOptionLeft2);
        clickElement(radioOptionLeft1);
        clickElement(radioOptionLeft0);
    }

    //************************************************************************************************************

    @FindBy(xpath = WEB_ELEMENT_PLAY_VIDEO)
    public WebElement playVideoButton;


    public void ClickPlayVideoButton() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1500)");
//        WebDriverWait wait10 = new WebDriverWait(driver, 20);
//       // WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_PLAY_VIDEO));
//        JavascriptExecutor jss = (JavascriptExecutor) driver;
//        jss.executeScript("arguments[0].click()", playVideoButton);

       //   scrollToElementJScript(playVideoButton);
//        WebDriverWait wait10 = new WebDriverWait(driver, 20);
       // playVideoButton.click();
//        clickByXpathUsingJavaScript(WEB_ELEMENT_PLAY_VIDEO);
//        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_PLAY_VIDEO));
//        element.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        waitForElementToBeClickable(playVideoButton);
        clickByXpathUsingJavaScript(WEB_ELEMENT_PLAY_VIDEO);



    }

    //************************************************************************************************************

    @FindBy(xpath = WEB_ELEMENT_ATM_AND_BRANCH)
    WebElement atmAndBranch;

    @FindBy(xpath = WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BAR)
    WebElement atmAndBranchInputSearch;

    @FindBy(xpath = WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BUTTON)
    WebElement atmAndBranchSearchButton;

    public void NavigateToAtmBranchPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATM_AND_BRANCH);}

    public void clickSearchButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BUTTON);}

    public void doSearch(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        typeOnElement(WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BAR, WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BAR_TEXT);
        clickSearchButton();
    }

    //************************************************************************************************************

    @FindBy (xpath = WEB_ELEMENT_SLIDE_ARROW)
    public WebElement slideArrow;

    @FindBy(xpath = WEB_ELEMENT_HOME_LOANS)
    WebElement homeLoans;

    public void clickSlideArrow(){clickByXpathUsingJavaScript(WEB_ELEMENT_SLIDE_ARROW);}
    public void clickHomeLoansButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_HOME_LOANS);}

    //************************************************************************************************************

    @FindBy (xpath = WEB_ELEMENT_INPUT_USERID)
    WebElement inputUserID;

    @FindBy (xpath = WEB_ELEMENT_INPUT_PASSWORD)
    WebElement inputPassword;

    @FindBy (xpath = WEB_ELEMENT_SIGN_IN_BUTTON)
    WebElement signInButton;

    public void iframeLoginBox(){
        WebElement iframeLogin = driver.findElement(By.xpath(WEB_ELEMENT_IFRAME_LOGIN_BOX));
        iframeHandle(iframeLogin);

    }

    public void clickSearch(){clickByXpathUsingJavaScript(WEB_ELEMENT_SIGN_IN_BUTTON);
    }

    public void addUserCredentials(){
        WebElement iframeLogin = driver.findElement(By.xpath(WEB_ELEMENT_IFRAME_LOGIN_BOX));
        iframeHandle(iframeLogin);
        clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_USERID);
        typeOnElement(WEB_ELEMENT_INPUT_USERID,WEB_ELEMENT_USERID);
        clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_PASSWORD);
        typeOnElement(WEB_ELEMENT_INPUT_PASSWORD,WEB_ELEMENT_PASSWORD);
        clickSearch();
    }

    //************************************************************************************************************

    @FindBy (xpath = WEB_ELEMENT_IFRAME_LOGIN)
    public WebElement login;

    public void hoverOverButton() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,30);
        hoverOverElement(login);
        //basicHoverUsingXpath(WEB_ELEMENT_IFRAME_LOGIN);
    }
}

