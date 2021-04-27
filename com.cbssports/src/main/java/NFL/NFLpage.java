package NFL;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static NFL.NFLLocators.*;

public class NFLpage extends BaseAPI {
    @FindBy(css = WEB_ELEMENT_NFL)
    WebElement nFL;

    public NFLpage() { PageFactory.initElements(driver, this); }

    public void clickNFLPage() { nFL.click(); }

    @FindBy(xpath = WEB_ELEMENT_SCORE)
    WebElement score;

    public void clickScore() { clickByXpathUsingJavaScript(WEB_ELEMENT_SCORE); }

    @FindBy(xpath = WEB_ELEMENT_SCHEDULE)
    WebElement schedule;

    public void clickSchedule() { clickByXpathUsingJavaScript(WEB_ELEMENT_SCHEDULE); }

    @FindBy(xpath = WEB_ELEMENT_FREE_AGENT)
    WebElement freeAgent;

    public void clickFreeAgent() { clickByXpathUsingJavaScript(WEB_ELEMENT_FREE_AGENT); }

    @FindBy(xpath = WEB_ELEMENT_DRAFT)
    WebElement draft;

    public void clickDraft() { clickByXpathUsingJavaScript(WEB_ELEMENT_DRAFT); }

    @FindBy(xpath = WEB_ELEMENT_MORE)
    WebElement more;

    public void clickMore() { clickByXpathUsingJavaScript(WEB_ELEMENT_MORE); }

    @FindBy(xpath = WEB_ELEMENT_MOCK_DRAFT)
    WebElement mockDraft;

    public void clickMockDraft() { clickByXpathUsingJavaScript(WEB_ELEMENT_MOCK_DRAFT); }

    @FindBy(xpath = WEB_ELEMENT_STANDINGS)
    WebElement standings;

    public void clickStandings() { clickByXpathUsingJavaScript(WEB_ELEMENT_STANDINGS); }

    @FindBy(xpath = WEB_ELEMENT_FACEBOOK)
    WebElement facebook;

    public void clickFacebook() { clickByXpathUsingJavaScript(WEB_ELEMENT_FACEBOOK); }

    @FindBy(xpath = WEB_ELEMENT_TWITTER)
    WebElement twitter;

    public void clickTwitter() { clickByXpathUsingJavaScript(WEB_ELEMENT_TWITTER); }

    @FindBy(xpath = WEB_ELEMENT_BET)
    WebElement bet;

    public void clickBet() { clickByXpathUsingJavaScript(WEB_ELEMENT_BET); }

    @FindBy(xpath = WEB_ELEMENT_PODCAST)
    WebElement podcast;

    public void clickPodcast() { clickByXpathUsingJavaScript(WEB_ELEMENT_PODCAST); }

    @FindBy(xpath = WEB_ELEMENT_INSTAGRAM)
    WebElement instagram;

    public void clickInstagram() { clickByXpathUsingJavaScript(WEB_ELEMENT_INSTAGRAM); }
}
