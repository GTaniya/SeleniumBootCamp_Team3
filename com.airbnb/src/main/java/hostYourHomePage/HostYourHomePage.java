package hostYourHomePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static hostYourHomePage.HostYourHomePageLocators.*;


public class HostYourHomePage extends BaseAPI {

    @FindBy(css = WEB_ELEMENT_HOST_YOUR_PAGE)
    WebElement hostYourPage;

    public HostYourHomePage() {
        PageFactory.initElements(driver, this);
    }

    //public void clickHostYourPage(){
    //  clickByXpathUsingJavaScript(WEB_ELEMENT_HOST_YOUR_PAGE);
    //}

    public void clickHostYourPage() {
        hostYourPage.click();
    }

    @FindBy(xpath = WEB_ELEMENT_EXPLORE_THE_WORLD)
    WebElement exploreTheWorld;

    public void clickExploreTheWorld() { clickByXpathUsingJavaScript(WEB_ELEMENT_EXPLORE_THE_WORLD); }

    @FindBy(xpath = WEB_ELEMENT_WEBINAR)
    WebElement getwebinarButton;

    public void clickWebinar() { clickByXpathUsingJavaScript(WEB_ELEMENT_WEBINAR); }

    @FindBy(xpath = WEB_ELEMENT_SUPPORT_HOST)
    WebElement supporthostButton;

    public void clickSupportHost() { clickByXpathUsingJavaScript(WEB_ELEMENT_SUPPORT_HOST); }

    @FindBy(xpath = WEB_ELEMENT_HOST_PROTECTION)
    WebElement hostprotectionButton;

    public void clickHostProtection() { clickByXpathUsingJavaScript(WEB_ELEMENT_HOST_PROTECTION); }

    @FindBy(xpath = WEB_ELEMENT_COVID_SAFETY)
    WebElement covidsafetyButton;

    public void clickCovidSafety() { clickByXpathUsingJavaScript(WEB_ELEMENT_COVID_SAFETY); }

    @FindBy(xpath = WEB_ELEMENT_GUEST_STANDARD)
    WebElement gueststandardButton;

    public void clickGuestStandard() { clickByXpathUsingJavaScript(WEB_ELEMENT_GUEST_STANDARD); }

    @FindBy(xpath = WEB_ELEMENT_GUEST_SPACE)
    WebElement guestspaceButton;

    public void clickGuestSpace() { clickByXpathUsingJavaScript(WEB_ELEMENT_GUEST_SPACE); }

    @FindBy(xpath = WEB_ELEMENT_GUEST_EXPECT)
    WebElement guestexpectButton;

    public void clickGuestExpect() { clickByXpathUsingJavaScript(WEB_ELEMENT_GUEST_EXPECT); }

    @FindBy(xpath = WEB_ELEMENT_GUEST_REGULATE)
    WebElement guestregulateButton;

    public void clickGuestRegulate() { clickByXpathUsingJavaScript(WEB_ELEMENT_GUEST_REGULATE); }

    @FindBy(xpath = WEB_ELEMENT_EARN_MONEY)
    WebElement earnmoneyButton;

    public void clickEarnMoney() { clickByXpathUsingJavaScript(WEB_ELEMENT_EARN_MONEY); }

    @FindBy(xpath = WEB_ELEMENT_GET_STARTED)
    WebElement getstartedButton;

    public void clickGetStarted() { clickByXpathUsingJavaScript(WEB_ELEMENT_GET_STARTED); }
}
