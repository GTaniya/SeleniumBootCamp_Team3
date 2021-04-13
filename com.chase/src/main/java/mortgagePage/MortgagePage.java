package mortgagePage;

import common.BaseAPI;
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

    public MortgagePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickDropDownMenu(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_DROP_DOWN);}

    public void clickMortgagePageLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE);}

    @FindBy (css = WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE_GET_STARTED_BUTTON)
    WebElement getStarted;

    public void clickGetStartedButton(){clickByCssSelectorUsingJavaScript(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE_GET_STARTED_BUTTON);}

    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_SIGN_IN)
    public WebElement buttonSignIn;

    @FindBy (xpath = WEB_ELEMENT_START_ONLINE)
    WebElement startOnlineButton;

    public void hoverOverButtonSignIn() throws Exception {
        hoverOverElement(buttonSignIn);
    }

    public void NavigateToMortgagePage(){

        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_DROP_DOWN);
        waitUntilClickable(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE);
        clickByXpathUsingJavaScript(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE);
        implicitWait();
    }

    public void hoverOverTheButton(){
        basicHoverUsingXpath(WEB_ELEMENT_HOVER_OVER_SIGN_IN);
    }

    public void clickStartOnlineButton(){
        scrollToElementJScript(startOnlineButton);
        implicitWait();
        clickByXpathUsingJavaScript(WEB_ELEMENT_START_ONLINE);}

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON_YES)
    public WebElement radioOptionYes;

    @FindBy (id = WEB_ELEMENT_RADIO_BUTTON_NO)
    public WebElement radioOptionNo;

    public void selectYesRadioOption(){
        selectElement(radioOptionYes);
    }

    public void selectNoRadioOption(){
        selectElement(radioOptionNo);
    }

    @FindBy(xpath = WEB_ELEMENT_PLAY_VIDEO)
    WebElement playVideoButton;

    public void ClickPlayVideoButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        clickByXpathUsingJavaScript(WEB_ELEMENT_PLAY_VIDEO);}

    @FindBy(xpath = WEB_ELEMENT_ATM_AND_BRANCH)
    WebElement atmAndBranch;

    @FindBy(xpath = WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BAR)
    WebElement atmAndBranchInputSearch;

    @FindBy(xpath = WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BUTTON)
    WebElement atmAndBranchSearchButton;

    public void NavigateToAtmBranchPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATM_AND_BRANCH);}

    public void clickSearchButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BUTTON);}

    public void doSearch(){
        implicitWait();
        typeOnElement(WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BAR, WEB_ELEMENT_ATM_AND_BRANCH_INPUT_SEARCH_BAR_TEXT);
        clickSearchButton();
    }

    @FindBy (xpath = WEB_ELEMENT_SLIDE_ARROW)
    WebElement slideArrow;

    @FindBy(xpath = WEB_ELEMENT_HOME_LOANS)
    WebElement homeLoans;

    public void clickSlideArrow(){clickByXpathUsingJavaScript(WEB_ELEMENT_SLIDE_ARROW);}
    public void clickHomeLoansButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_HOME_LOANS);}

}

