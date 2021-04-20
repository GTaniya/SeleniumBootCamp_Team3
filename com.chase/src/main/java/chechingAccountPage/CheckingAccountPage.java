package chechingAccountPage;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static chechingAccountPage.CheckingAccountLocators.*;

public class CheckingAccountPage extends BaseAPI {

    public CheckingAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = WEB_ELEMENT_HOVER_OVER_OPEN_ACCOUNT_BUTTON)
    public WebElement hoverOverOpenAccountButton;

    public void hoverOverOpenAccountButton() {
        clickByCssSelectorUsingJavaScript(WEB_ELEMENT_HOVER_OVER_OPEN_ACCOUNT_BUTTON);
    }

    @FindBy(id = WEB_ELEMENT_SELECT_RADIO_BUTTON)
    public WebElement selectRadioButton;


    public void selectRadioButton() {
        selectElement(selectRadioButton);
    }


    @FindBy(xpath = WEB_ELEMENT_CLICK_INPUT_USER_NAME)
    WebElement clickInputUserName;

    public void clickUserName() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_INPUT_USER_NAME);
    }

    @FindBy(xpath = WEB_ELEMENT_CLICK_CHECK_BOX)
    WebElement clickCheckBox;

    public void checkBox() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_CHECK_BOX);
    }


    @FindBy(xpath = WEB_ELEMENT_SEARCH_HOME_LOANS)
    WebElement searchHomeLoans;

    public void doSearchHomeLoans() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_HOME_LOANS);
    }


    @FindBy(xpath = WEB_ELEMENT_CLICK_SIGN_IN)
    WebElement clickSignIn;

    public void signIn() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_SIGN_IN);
    }

    @FindBy(xpath = WEB_ELEMENT_CHECK_PRE_REQUEST)
    WebElement checkPreRequest;

    public void doCheckPreRequest() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_PRE_REQUEST);
    }

    @FindBy(xpath = WEB_ELEMENT_SEARCH_CREDIT_CARDS)
    WebElement searchCreditCards;

    public void doSearchCreditCards() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_CREDIT_CARDS);
    }


    @FindBy(xpath = WEB_ELEMENT_HOVER_OVER_VIEW_ALL_REWARDS_CARDS)
    public WebElement hoverOverViewAllRewardsCards;

    public void hoverOverButton() {
        basicHoverUsingXpath(WEB_ELEMENT_HOVER_OVER_VIEW_ALL_REWARDS_CARDS);
        implicitWait();
    }
    @FindBy(xpath =WEB_ELEMENT_CHECK_CASH_BACK_CREDIT)
    WebElement checkCashBackCredit;

    public void setClickCashBackPage(){clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_CASH_BACK_CREDIT);}

   @FindBy(xpath = WEB_ELEMENT_CHECK_ATM_AND_BRANCH)
   WebElement checkAtmAndBranch;

    public void doCheckAtmAndBranch(){clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_ATM_AND_BRANCH);}

   public void connectWithAdvisor(){clickByXpathUsingJavaScript(WEB_ELEMENT_CONNECT_WITH_AN_ADVISOR);}}


















