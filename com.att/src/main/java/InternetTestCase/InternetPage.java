package InternetTestCase;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static InternetTestCase.InternetPageLocation.*;


public class InternetPage extends BaseAPI {

    @FindBy(css = WEB_ELEMENT_INTERNET_PAGE)
    WebElement InternetPage;

    public InternetPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickInternetPage() {
        InternetPage.click();
    }

    @FindBy(xpath = WEB_ELEMENT_PLAN_PRICES)
    WebElement planspricesSection;

    public void clickPlansPrices() { clickByXpathUsingJavaScript(WEB_ELEMENT_PLAN_PRICES); }

    @FindBy(xpath = WEB_ELEMENT_EQUIPMENT)
    WebElement equipmentSection;

    public void clickEquipment() { clickByXpathUsingJavaScript(WEB_ELEMENT_EQUIPMENT); }

    @FindBy(xpath = WEB_ELEMENT_BUNDLES)
    WebElement bundlesSection;

    public void clickBundles() { clickByXpathUsingJavaScript(WEB_ELEMENT_BUNDLES); }

    @FindBy(xpath = WEB_ELEMENT_CHECK_AVAILABILITY)
    WebElement checkavailabilityButton;

    public void clickCheckAvailability() { clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_AVAILABILITY); }

    @FindBy(xpath = WEB_ELEMENT_CONSISTENT_SPEEDS)
    WebElement consistentspeedButton;

    public void clickConsistentSpeed() { clickByXpathUsingJavaScript(WEB_ELEMENT_CONSISTENT_SPEEDS); }

    @FindBy(xpath = WEB_ELEMENT_RELIABILITY)
    WebElement reliabilityButton;

    public void clickReliability() { clickByXpathUsingJavaScript(WEB_ELEMENT_RELIABILITY); }

    @FindBy(xpath = WEB_ELEMENT_ANNUAL_CONTRACT)
    WebElement annualcontractButton;

    public void clickAnnualContract() { clickByXpathUsingJavaScript(WEB_ELEMENT_ANNUAL_CONTRACT); }

    @FindBy(xpath = WEB_ELEMENT_RATED_ONE)
    WebElement ratedoneButton;

    public void clickRatedOne() { clickByXpathUsingJavaScript(WEB_ELEMENT_RATED_ONE); }

    @FindBy(xpath = WEB_ELEMENT_SHOP_INTERNET)
    WebElement shopinternetButton;

    public void clickShopInternet() { clickByXpathUsingJavaScript(WEB_ELEMENT_SHOP_INTERNET); }

    @FindBy(xpath = WEB_ELEMENT_DOWNLOAD_APP)
    WebElement downloadappButton;

    public void clickDownloadApp() { clickByXpathUsingJavaScript(WEB_ELEMENT_DOWNLOAD_APP); }

    @FindBy(xpath = WEB_ELEMENT_FASTEST_INTERNET)
    WebElement fastestinternetButton;

    public void clickFastestInternet() { clickByXpathUsingJavaScript(WEB_ELEMENT_FASTEST_INTERNET); }

    @FindBy(xpath = WEB_ELEMENT_RURAL_AREA)
    WebElement ruralareaButton;

    public void clickRuralArea() { clickByXpathUsingJavaScript(WEB_ELEMENT_RURAL_AREA); }

    @FindBy(xpath = WEB_ELEMENT_EXPLORE_INTERNET)
    WebElement exploreinternetButton;

    public void clickExploreInternet() { clickByXpathUsingJavaScript(WEB_ELEMENT_EXPLORE_INTERNET); }

    @FindBy(xpath = WEB_ELEMENT_UVERSE)
    WebElement uverseButton;

    public void clickUverse() { clickByXpathUsingJavaScript(WEB_ELEMENT_UVERSE); }
}
