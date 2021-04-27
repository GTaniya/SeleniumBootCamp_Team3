package OnlineBanking;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static OnlineBanking.OnlineBankingLocator.*;

public class OnlineBankingPage extends BaseAPI {
    @FindBy(css = WEB_ELEMENT_ONLINE_BANKING)
    WebElement onlineBanking;

    public OnlineBankingPage() { PageFactory.initElements(driver, this); }

    public void clickOnlineBankingpage() { onlineBanking.click(); }

    @FindBy(xpath = WEB_ELEMENT_ENROLL)
    WebElement enroll;

    public void clickEnroll() { clickByXpathUsingJavaScript(WEB_ELEMENT_ENROLL); }

    @FindBy(xpath = WEB_ELEMENT_FAQ)
    WebElement faq;

    public void clickFAQ() { clickByXpathUsingJavaScript(WEB_ELEMENT_FAQ); }

    @FindBy(xpath = WEB_ELEMENT_RESOURCES)
    WebElement resources;

    public void clickResources() { clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCES); }

    @FindBy(xpath = WEB_ELEMENT_ONLINE_BILL_PAY)
    WebElement billPay;

    public void clickOnlineBillPay() { clickByXpathUsingJavaScript(WEB_ELEMENT_ONLINE_BILL_PAY); }

    @FindBy(xpath = WEB_ELEMENT_ENROLL_NOW)
    WebElement enrollNow;

    public void clickEnrollNow() { clickByXpathUsingJavaScript(WEB_ELEMENT_ENROLL_NOW); }

    @FindBy(xpath = WEB_ELEMENT_ZELLE)
    WebElement zelle;

    public void clickZelle() { clickByXpathUsingJavaScript(WEB_ELEMENT_ZELLE); }

    @FindBy(xpath = WEB_ELEMENT_ENROLL_ZELLE)
    WebElement enrollZelle;

    public void clickEnrollZelle() { clickByXpathUsingJavaScript(WEB_ELEMENT_ENROLL_ZELLE); }

    @FindBy(xpath = WEB_ELEMENT_ZELLE_VID_ONE)
    WebElement zelleVideoOne;

    public void clickZelleVideoOne() { clickByXpathUsingJavaScript(WEB_ELEMENT_ZELLE_VID_ONE); }

    @FindBy(xpath = WEB_ELEMENT_PAPERLESS_STATEMENT)
    WebElement paperlessStatement;

    public void clickPaperlessStatement() { clickByXpathUsingJavaScript(WEB_ELEMENT_PAPERLESS_STATEMENT); }

    @FindBy(xpath = WEB_ELEMENT_SHOW_ME_HOW)
    WebElement showMeHow;

    public void clickShowMeHow() { clickByXpathUsingJavaScript(WEB_ELEMENT_SHOW_ME_HOW); }

    @FindBy(xpath = WEB_ELEMENT_ACCOUNT_ALERTS)
    WebElement accountAlerts;

    public void clickAccountAlerts() { clickByXpathUsingJavaScript(WEB_ELEMENT_ACCOUNT_ALERTS); }

    @FindBy(xpath = WEB_ELEMENT_TEXT_BANKING)
    WebElement textBanking;

    public void clickTextBanking() { clickByXpathUsingJavaScript(WEB_ELEMENT_TEXT_BANKING); }

    @FindBy(xpath = WEB_ELEMENT_QUICKDEPOSIT)
    WebElement quickDeposit;

    public void clickQuickDeposit() { clickByXpathUsingJavaScript(WEB_ELEMENT_QUICKDEPOSIT); }

    @FindBy(xpath = WEB_ELEMENT_ATM)
    WebElement atm;

    public void clickATM() { clickByXpathUsingJavaScript(WEB_ELEMENT_ATM); }
}
