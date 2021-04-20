package SmallBusiness;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static SmallBusiness.SmallBusinessPageLocators.*;

public class SmallBusinessPage extends BaseAPI {
    @FindBy(css = WEB_ELEMENT_SMALL_BUSINESS)
    WebElement smallBusinessPage;

    public SmallBusinessPage() { PageFactory.initElements(driver, this); }

    public void clickSmallBusinessPage() { smallBusinessPage.click(); }

    @FindBy(xpath = WEB_ELEMENT_CASH_FLOW)
    WebElement cashflow;

    public void clickCashFlow() { clickByXpathUsingJavaScript(WEB_ELEMENT_CASH_FLOW); }

    @FindBy(xpath = WEB_ELEMENT_OPEN_ACCOUNT)
    WebElement openaccount;

    public void clickOpenAccount() { clickByXpathUsingJavaScript(WEB_ELEMENT_OPEN_ACCOUNT); }

    @FindBy(xpath = WEB_ELEMENT_ZELLE)
    WebElement zelle;

    public void clickZelle() { clickByXpathUsingJavaScript(WEB_ELEMENT_ZELLE); }

    @FindBy(xpath = WEB_ELEMENT_BUSINESS_OWNER)
    WebElement businessowner;

    public void clickBusinessOwner() { clickByXpathUsingJavaScript(WEB_ELEMENT_BUSINESS_OWNER); }

    @FindBy(xpath = WEB_ELEMENT_CHECKING_CREDIT)
    WebElement checkingcredit;

    public void clickCheckingCredit() { clickByXpathUsingJavaScript(WEB_ELEMENT_CHECKING_CREDIT); }

    @FindBy(xpath = WEB_ELEMENT_VIDEOS)
    WebElement videos;

    public void clickVideos() { clickByXpathUsingJavaScript(WEB_ELEMENT_VIDEOS); }

    @FindBy(xpath = WEB_ELEMENT_PAYROLL)
    WebElement payroll;

    public void clickPayroll() { clickByXpathUsingJavaScript(WEB_ELEMENT_PAYROLL); }

    @FindBy(xpath = WEB_ELEMENT_FINANCING)
    WebElement financing;

    public void clickFinancing() { clickByXpathUsingJavaScript(WEB_ELEMENT_FINANCING); }

    @FindBy(xpath = WEB_ELEMENT_EXPLORE_APP)
    WebElement exploreapp;

    public void clickExploreApp() { clickByXpathUsingJavaScript(WEB_ELEMENT_EXPLORE_APP); }

    @FindBy(xpath = WEB_ELEMENT_CHECKING)
    WebElement checking;

    public void clickChecking() { clickByXpathUsingJavaScript(WEB_ELEMENT_CHECKING); }

    @FindBy(xpath = WEB_ELEMENT_EXPLORING_CHECKING)
    WebElement exploringchecking;

    public void clickExploringChecking() { clickByXpathUsingJavaScript(WEB_ELEMENT_EXPLORING_CHECKING); }
}
