package modelsPage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static modelsPage.ModelsPageLocators.*;

public class ModelsPage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_CLICK_MODEL_BUTTON)
    WebElement clickModelButton;
    @FindBy(xpath = WEB_ELEMENT_CLICK_BMW_M_BUTTON)
    WebElement clickBMWMButton;

    public ModelsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_MODEL_BUTTON);
    }

    public void clickBMWMButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_BMW_M_BUTTON);

    }

    @FindBy(xpath = WEB_ELEMENT_CHECK_x6_MODEL)
    WebElement checkX6Models;

    public void checkX6Models() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_x6_MODEL);
    }


    @FindBy(xpath = WEB_ELEMENT_LOCATION_BAR)
    WebElement locationBar;

    public void searchLocationBar() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_LOCATION_BAR);

    }

    @FindBy(xpath = WEB_ELEMENT_HOVER_OVER_BUTTON_BUILD_YOUR_OWN)
    public WebElement hoverOverButtonBuildYourOwn;

    public void hoverOverButton() {
        implicitWait();
        basicHoverUsingXpath(WEB_ELEMENT_HOVER_OVER_BUTTON_BUILD_YOUR_OWN);
    }

    @FindBy(xpath = WEB_ELEMENT_START_DESIGNING_YOUR_OWN_CAR)
    WebElement startDesigningYourOwnCar;

    public void designYourOwnCar() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_START_DESIGNING_YOUR_OWN_CAR);
    }

    @FindBy(xpath = WEB_ELEMENT_HOVER_OVER_BUTTON_DESIGN)
    public WebElement hoverOverButtonDesign;

    public void hoverOverButtonDesign() {
        implicitWait();
        basicHoverUsingXpath(WEB_ELEMENT_HOVER_OVER_BUTTON_DESIGN);
    }

    @FindBy(xpath = WEB_ELEMENT_CLICK_BMW_MOUNTAINS)
    WebElement clickBMWMountains;

    public void clickBMWMountainsButton() {
        implicitWait();
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_BMW_MOUNTAINS);
    }

    @FindBy(xpath = WEB_ELEMENT_CHECK_M5_MODEL)
    public WebElement checkM5Model;

    public void checkBMWM5Model() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_M5_MODEL);
    }

    @FindBy(xpath = WEB_ELEMENT_CHECK_TWEETER)
    public WebElement checkTweeter;

    public void checkTweeterButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_TWEETER);
    }


    @FindBy(xpath = WEB_ELEMENT_SEARCH_FUTURE_VEHICLE)
    public WebElement searchFutureVehicle;

    public void searchBMWFutureModel() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_FUTURE_VEHICLE);
    }

    @FindBy(xpath = WEB_ELEMENT_DO_SEARCH_CONCEPT_VEHICLE)
    public WebElement doSearchConceptVehicle;

    public void searchConceptVehicle(){clickByXpathUsingJavaScript(WEB_ELEMENT_DO_SEARCH_CONCEPT_VEHICLE);}

}








