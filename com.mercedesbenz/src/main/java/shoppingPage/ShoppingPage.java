package shoppingPage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.PreparedStatement;

import static shoppingPage.ShoppingPageLocators.*;

public class ShoppingPage extends BaseAPI {

    public ShoppingPage() { PageFactory.initElements(driver, this);}

    @FindBy (xpath = WEB_ELEMENT_SELECT_SHOPPING)
    WebElement selectShopping;

    @FindBy (xpath = WEB_ELEMENT_SELECT_SHOPPING_BUILD_YOUR_OWN)
    public WebElement ShoppingBuildYourOwn;

    @FindBy (xpath = WEB_ELEMENT_SELECT_VEHICLE)
    WebElement selectVehicle;

    @FindBy (xpath = WEB_ELEMENT_SELECT_VEHICLE_GLA_SUV)
    WebElement selectBuildButton;

    @FindBy (xpath = WEB_ELEMENT_SELECT_VEHICLE_COLOR_SELECT)
    public WebElement selectVehicleColor;

    @FindBy (xpath = WEB_ELEMENT_RADIO_BUTTON_VIDEO)
    public WebElement radioOptionVideo;

    @FindBy (xpath = WEB_ELEMENT_SCHEDULE_SERVICE_SEARCH_BUTTON)
    WebElement submitButton;

    @FindBy(xpath = WEB_ELEMENT_SCHEDULE_SERVICE_SEARCH_BAR)
    WebElement searchBar;


    public void clickShoppingButton(){
        clickByXpath(WEB_ELEMENT_SELECT_SHOPPING);
    }

    public void clickBuildYourOwn(){
        clickByXpath(WEB_ELEMENT_SELECT_SHOPPING_BUILD_YOUR_OWN);
    }

    public void clickToChooseVehicle(){clickByXpath(WEB_ELEMENT_SELECT_VEHICLE);}

    public void clickBuildVehicleButton(){
        waitForElementToBeClickable(selectBuildButton);
        clickByXpath(WEB_ELEMENT_SELECT_VEHICLE_GLA_SUV);
    }

    public void SelectTheVehicleColor(){clickByXpath(WEB_ELEMENT_SELECT_VEHICLE_COLOR_SELECT);}

    public void NavigateToColorChange(){
        clickByXpath(WEB_ELEMENT_SELECT_SHOPPING);
        clickByXpath(WEB_ELEMENT_SELECT_SHOPPING_BUILD_YOUR_OWN);

        }

    public void clickRadioButton(){
        clickByXpath(WEB_ELEMENT_RADIO_BUTTON_VIDEO);
    }

    public void clickScheduleServiceLink(){clickByXpath(WEB_ELEMENT_SCHEDULE_SERVICE);}

    public void clickSearchBar(){searchBar.click();}

    public void SearchZipCode(){
        WebElement zipCode = driver.findElement(By.id(WEB_ELEMENT_SCHEDULE_SERVICE_SEARCH_BAR));

        zipCode.sendKeys("20874");

    }

    @FindBy (xpath = WEB_ELEMENT_COMPARE_VEHICLE)
    WebElement compareVehicleLink;

    @FindBy (xpath = WEB_ELEMENT_COMPARE_VEHICLE_TO_ADD_VEHICLE_ONE)
    WebElement compareVehicleOne;

    @FindBy (xpath = WEB_ELEMENT_COMPARE_VEHICLE_ADD_SEDAN)
    public WebElement addSedan;

    public void clickCompareVehicleLink(){clickByXpath(WEB_ELEMENT_COMPARE_VEHICLE);}
    public void AddCompareVehicleOne(){clickByXpath(WEB_ELEMENT_COMPARE_VEHICLE_TO_ADD_VEHICLE_ONE);}
    public void clickCheckBoxForSedan(){addSedan.click();}


    @FindBy(xpath = WEB_ELEMENT_ESTIMATE_PAYMENT_SELECT_CLASS)
    WebElement selectClass;

    @FindBy(xpath = WEB_ELEMENT_ESTIMATE_PAYMENT_SELECT_CLASS_CLA)
    public WebElement selectClassCLA;

    @FindBy(xpath = WEB_ELEMENT_ESTIMATE_PAYMENT_SUBMIT_BUTTON)
    public WebElement submitButtonHover;

    @FindBy (xpath = WEB_ELEMENT_SERVICES_ADDITIONAL_RESOURCES)
    public WebElement servicesAdditionalResources;

    @FindBy (xpath = WEB_ELEMENT_SERVICES_ADDITIONAL_RESOURCES_HEADER)
    public WebElement servicesAdditionalResourcesHeader;

    @FindBy (xpath = WEB_ELEMENT_SERVICES_OWNERS_MANUAL_HEADER_IMAGE)
    public WebElement headerImage;


    public void clickEstimatePaymentLink(){clickByXpath(WEB_ELEMENT_ESTIMATE_PAYMENT);}
    public void clickDropDown(){clickByXpath(WEB_ELEMENT_ESTIMATE_PAYMENT_SELECT_CLASS);}
    public void clickDropDownOption(){ selectClassCLA.click();}

    public void hoverOverSubmitButton()  {
        hoverOverElement(submitButtonHover);
    }

    public void clickServicesLink(){clickByXpath(WEB_ELEMENT_SERVICES);}
    public void clickAdditionalResources(){servicesAdditionalResources.click();}

    public void navigateToServicesPage(){
        clickByXpath(WEB_ELEMENT_SELECT_SHOPPING);
        clickByXpath(WEB_ELEMENT_SERVICES);
        servicesAdditionalResources.click();

    }

    public void clickOwnersLink(){
        clickByXpath(WEB_ELEMENT_SERVICES_OWNERS_MANUAL);
    }


    public void clickSlideArrow(){
        WebElement slider = driver.findElement(By.xpath(WEB_ELEMENT_OWNERS_MANUAL_SLIDE_ARROW));
    }

}
