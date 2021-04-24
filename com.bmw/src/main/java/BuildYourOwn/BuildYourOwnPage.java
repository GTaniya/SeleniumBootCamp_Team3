package BuildYourOwn;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static BuildYourOwn.BuildYourOwnPageLocators.*;

public class BuildYourOwnPage extends BaseAPI {
    @FindBy(css = WEB_ELEMENT_BUILD_YOUR_OWN)
    WebElement buildYourOwn;

    public BuildYourOwnPage() { PageFactory.initElements(driver, this); }

    public void clickBuildYourOwnPage() { buildYourOwn.click(); }

    @FindBy(css = WEB_ELEMENT_MENU)
    WebElement menu;

    public void clickMenu() { clickByCssSelectorUsingJavaScript(WEB_ELEMENT_MENU); }

    @FindBy(xpath = WEB_ELEMENT_BUILD_THIS_VEHICLE)
    WebElement buildThisVehicle;

    public void clickBuildThisVehicle() { clickByXpathUsingJavaScript(WEB_ELEMENT_BUILD_THIS_VEHICLE); }

    @FindBy(xpath = WEB_ELEMENT_SELECT_SERIES)
    WebElement selectSeries;

    public void clickSelectSeries() { clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_SERIES); }

    @FindBy(xpath = WEB_ELEMENT_X5)
    WebElement x5;

    public void clickX5() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5); }

    @FindBy(xpath = WEB_ELEMENT_X5_SELECT)
    WebElement x5Select;

    public void clickX5SelectButton() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5_SELECT); }

    public void navigateToX5() {
        buildYourOwn.click();
        clickByCssSelectorUsingJavaScript(WEB_ELEMENT_MENU);
        clickByXpathUsingJavaScript(WEB_ELEMENT_BUILD_THIS_VEHICLE);
        clickByXpathUsingJavaScript(WEB_ELEMENT_X5);
    }

    @FindBy(xpath = WEB_ELEMENT_X5_DESIGN_BUTTON)
    WebElement x5Design;

    public void clickX5DesignButton() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5_DESIGN_BUTTON); }

    @FindBy(xpath = WEB_ELEMENT_X5_EXTERIOR_BUTTON)
    WebElement x5Exterior;

    public void clickX5ExteriorButton() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5_EXTERIOR_BUTTON); }

    @FindBy(xpath = WEB_ELEMENT_X5_JET_BLACK)
    WebElement x5JetBlack;

    public void clickX5JetBlack() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5_JET_BLACK); }

    @FindBy(xpath = WEB_ELEMENT_X5_SUMMARY)
    WebElement x5Summary;

    public void clickX5Summary() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5_SUMMARY); }

    @FindBy(xpath = WEB_ELEMENT_X5_ESTIMATE_PAYMENT)
    WebElement x5EstimatePayment;

   // public void clickX5EstimatePayment() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5_ESTIMATE_PAYMENT); }

    @FindBy(xpath = WEB_ELEMENT_X5_ESTIMATE_PAYMENT_BUTTON)
    WebElement x5EstimatePaymentButton;

    @FindBy(xpath = WEB_ELEMENT_X5_ESTIMATE_PAYMENT_ZIP_BOX)
    WebElement x5EstimatePaymentZipBox;

    //public void clickX5EstimatePaymentButton() { clickByXpathUsingJavaScript(WEB_ELEMENT_X5_ESTIMATE_PAYMENT_BUTTON); }

    public void searchEstimateValue(){
        WebElement zipCode = driver.findElement(By.name(WEB_ELEMENT_X5_ESTIMATE_PAYMENT_ZIP_BOX));
        WebElement tradeInValue = driver.findElement(By.id("trade-in-value"));
        zipCode.sendKeys("22031");
        tradeInValue.sendKeys("100");
        x5EstimatePaymentButton.click();
    }

    @FindBy(xpath = WEB_ELEMENT_SEARCH)
    WebElement Search;

    public void clickSearch() { clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH); }

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BOX)
    WebElement searchBox;

    public void SearchBox() {
        WebElement search = driver.findElement(By.name(WEB_ELEMENT_SEARCH_BOX));
        search.sendKeys("X5");

    }

    @FindBy(xpath = WEB_ELEMENT_FIND_BMW_CENTER)
    WebElement bmwCenter;

    @FindBy(xpath = WEB_ELEMENT_FIND_BMW_CENTER_SEARCH_BUTTON)
    WebElement bmwCenterSearch;

    public void clickBMWCenter() { clickByXpathUsingJavaScript(WEB_ELEMENT_FIND_BMW_CENTER); }

    public void setBmwCenterZIPSearch() {
        WebElement zipCode = driver.findElement(By.name("location-search"));
        zipCode.sendKeys("22031");
        bmwCenterSearch.click();
    }

    @FindBy(xpath = WEB_ELEMENT_Z4_SELECT)
    WebElement z4Select;

    public void clickZ4Select() { clickByXpathUsingJavaScript(WEB_ELEMENT_Z4_SELECT); }

    @FindBy(xpath = WEB_ELEMENT_Z4_DESIGN)
    WebElement z4Design;

    public void clickZ4Design() { clickByXpathUsingJavaScript(WEB_ELEMENT_Z4_DESIGN); }

    @FindBy(xpath = WEB_ELEMENT_Z4_SHADOWLINE)
    WebElement z4Shadowline;

    public void clickZ4Shadowline() { clickByXpathUsingJavaScript(WEB_ELEMENT_Z4_SHADOWLINE); }

    @FindBy(xpath = WEB_ELEMENT_Z4)
    WebElement z4;

    public void clickZ4() { clickByXpathUsingJavaScript(WEB_ELEMENT_Z4); }


}
