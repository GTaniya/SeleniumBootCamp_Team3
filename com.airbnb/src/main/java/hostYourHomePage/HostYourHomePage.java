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

    @FindBy(xpath = WEB_ELEMENT_HOST_AIRBNB)
    WebElement HostAirbnbButton;

    public void clickHostAirbnb() { clickByXpathUsingJavaScript(WEB_ELEMENT_HOST_AIRBNB); }

    @FindBy(xpath = WEB_ELEMENT_PRIVACY_POLICY)
    WebElement PrivacyPolicyButton;

    public void clickPrivacyPolicy() { clickByXpathUsingJavaScript(WEB_ELEMENT_PRIVACY_POLICY); }

    @FindBy(xpath = WEB_ELEMENT_PRIVACY_POLICY)
    WebElement OnlineExperienceButton;

    public void clickOnlineExperience() { clickByXpathUsingJavaScript(WEB_ELEMENT_ONLINE_EXPERIENCE);}

    @FindBy(xpath = WEB_ELEMENT_HOST_EXPERIENCE)
    WebElement HostExperienceButton;

    public void clickHostExperience() { clickByXpathUsingJavaScript(WEB_ELEMENT_HOST_EXPERIENCE);}

    @FindBy(xpath = WEB_ELEMENT_RESPONSIBLE_HOSTING)
    WebElement ResponsibleHostingButton;

    public void clickResponsibleHosting() { clickByXpathUsingJavaScript(WEB_ELEMENT_RESPONSIBLE_HOSTING);}

    @FindBy(xpath = WEB_ELEMENT_RESOURCE_CENTER)
    WebElement ResourceCenterButton;

    public void clickResourceCenter() { clickByXpathUsingJavaScript(WEB_ELEMENT_RESOURCE_CENTER);}

    @FindBy(xpath = WEB_ELEMENT_COMMUNITY_CENTER)
    WebElement CommunityCenterButton;

    public void clickCommunityCenter() { clickByXpathUsingJavaScript(WEB_ELEMENT_COMMUNITY_CENTER);}

    @FindBy(xpath = WEB_ELEMENT_AIRBNB_WORKS)
    WebElement AirbnbWorksButton;

    public void clickAirbnbWorks() { clickByXpathUsingJavaScript(WEB_ELEMENT_AIRBNB_WORKS);}
}
