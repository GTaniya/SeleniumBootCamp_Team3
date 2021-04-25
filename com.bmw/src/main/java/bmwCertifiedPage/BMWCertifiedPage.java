package bmwCertifiedPage;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import static bmwCertifiedPage.BMWCertifiedPageLocators.*;


public class BMWCertifiedPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_NAVIGATE_TO_BMW_CERTIFIED_PAGE)
    WebElement bmwCertifiedPage;

    @FindBy(css = WEB_ELEMENT_PRE_OWNED_INVENTORY_BUTTON)
    WebElement bmwCertifiedPageButtonInventory;

    public BMWCertifiedPage() {PageFactory.initElements(driver, this);
    }

    public void clickBmwCertifiedPageLink(){bmwCertifiedPage.click();}

    public void clickBmwCertifiedPageInventoryButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_PRE_OWNED_INVENTORY_BUTTON);}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE_SEARCH)
    WebElement inputSearchBox;

    @FindBy (xpath = WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE_SEARCH_BUTTON)
    WebElement buttonSearch;



    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickByXpathUsingJavaScript(WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE_SEARCH_BUTTON);

    }

    public void doSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        typeOnElement(WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE_SEARCH, WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();

    }

    @FindBy (xpath = WEB_ELEMENT_SEE_SPECIAL_OFFERS_BUTTON)
    WebElement bmwSpecialOffersButton;

    @FindBy (xpath = WEB_ELEMENT_MORE_INFORMATION_LINK)
    WebElement moreInformationLink;

    public void clickBmwSpecialOffersButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_SEE_SPECIAL_OFFERS_BUTTON);}

    public void clickMoreInformationLink(){
        moreInformationLink.click();
    }

    @FindBy (xpath = WEB_ELEMENT_SELECT_SERIES_X1)
    WebElement selectSeriesX1;

    @FindBy (xpath = WEB_ELEMENT_SELECT_SERIES_X1_PRICING_AND_FEATURES)
    WebElement x1PricingAndFeatures;

    @FindBy (xpath = WEB_ELEMENT_SELECT_SERIES_X1_PRICING_AND_FEATURES_SELECT_CAR_COLOR)
    WebElement selectColorOfCar;

    public void clickSelectX1Button(){
        selectSeriesX1.click();
    }

    public void clickPricingAndFeaturesLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_SERIES_X1_PRICING_AND_FEATURES);}

    public void scroll(){scrollToElementJScript(selectColorOfCar);}

    public void selectTheColorOfTheCar(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_SERIES_X1_PRICING_AND_FEATURES_SELECT_CAR_COLOR);}


    @FindBy (css = WEB_ELEMENT_BMW_VERIFIED_LEARN_MORE)
    WebElement learnMoreLink;

    public void clickLearnMoreLink(){
        learnMoreLink.click();
    }

    @FindBy (xpath = WEB_ELEMENT_BMW_START_DESIGNING_SEDAN_3)
    WebElement designingSedan3;

    @FindBy (xpath = WEB_ELEMENT_BMW_START_DESIGNING_BUTTON)
    WebElement startDesigningButton;

    @FindBy (xpath = WEB_ELEMENT_BMW_START_DESIGNING_EXTERIOR)
    WebElement designingExterior;

    @FindBy (xpath = WEB_ELEMENT_BMW_START_DESIGNING_EXTERIOR_COLOR_RED)
    WebElement exteriorColorRed;

    public void clickDesigningSedan3Link(){clickByXpathUsingJavaScript(WEB_ELEMENT_BMW_START_DESIGNING_SEDAN_3);}
    public void clickStartDesigningButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_BMW_START_DESIGNING_BUTTON);}
    public void clickStartDesigningExteriorLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_BMW_START_DESIGNING_EXTERIOR);}
//    public void clickStartDesigningExteriorLink(){
//        designingExterior.click();
//    }
    public void chooseColorForDesigningExteriorCar(){
        //clickByXpathUsingJavaScript(WEB_ELEMENT_BMW_START_DESIGNING_EXTERIOR_COLOR_RED);
    exteriorColorRed.click();
    }

    @FindBy (xpath = WEB_ELEMENT_BMW_FOOTER_LINK_CONCEPT_VEHICLES)
    WebElement conceptVehiclesLink;

    @FindBy (xpath = WEB_ELEMENT_DOWNLOAD_FILE)
    WebElement downloadFile;

    public void clickConceptVehiclesLink(){
        conceptVehiclesLink.click();
    }

    public void downloadTheFile(){clickByXpathUsingJavaScript(WEB_ELEMENT_DOWNLOAD_FILE);}




}
