package homepage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.PreparedStatement;
import java.util.HashMap;

import static homepage.HomepageLocators.*;

public class Homepage  extends BaseAPI {
    public Homepage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_CLICK_COUPE_BUTTON)
    public WebElement clickCoupeButton;

    public void clickCoupe(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_COUPE_BUTTON);}

    public void hoverCLACoupeMenu(){basicHoverUsingXpath(WEB_ELEMENT_CLICK_COUPE_BUTTON);}

    public void clickAMGCLACoupe(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_AMG_CLA_COUPE);}
  //////////////////////////////////////////////////////////////////////////////////////////////////////
   @FindBy(xpath = WEB_ELEMENT_HOVER_VEHICLE_BUTTON)
    public WebElement hoverVehicle;

    public void hoverVehicleButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_HOVER_VEHICLE_BUTTON);}

    public void selectCar(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_CAR);}

    @FindBy(xpath = WEB_ELEMENT_CLICK_MODELS_RADIO_BUTTON)
    public WebElement clickModelsRadioButton;

    public void clickRadioButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_MODELS_RADIO_BUTTON);}

    public void peakTheColor(){clickByXpathUsingJavaScript(WEB_ELEMENT_PEAK_THE_COLOR);}

    @FindBy(xpath = WEB_ELEMENT_CLICK_BUILD_CAR)
    public WebElement clickBuildCar;

    public void clickBuildYourCar(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_BUILD_CAR);}

    public void doChangeWheels(){clickByXpathUsingJavaScript(WEB_ELEMENT_DO_CHANGE_WHEELS);}
}

