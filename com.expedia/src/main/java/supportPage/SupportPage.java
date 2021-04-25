package supportPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static supportPage.SupportPageLocators.*;

public class SupportPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_SUPPORT_PAGE)
    WebElement supportPage;

    @FindBy (xpath = WEB_ELEMENT_CHAT_BUTTON)
    WebElement chatNowButton;

    @FindBy (xpath = WEB_ELEMENT_FLIGHTS_DROPDOWN)
    WebElement flightsDropdown;

    @FindBy (xpath = WEB_ELEMENT_FLIGHTS_DROPDOWN_SEATS)
    WebElement flightsDropdownSeats;

    @FindBy (xpath = WEB_ELEMENT_THINGS_TO_DO_TAB)
    WebElement thingsToDoTab;

    public SupportPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSupportPageLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_SUPPORT_PAGE);}

    public void clickChatButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_CHAT_BUTTON);}

    public void clickFlightsDropdown(){clickByXpathUsingJavaScript(WEB_ELEMENT_CHAT_BUTTON);}

    public void clickFlightsDropdownSeats(){clickByXpathUsingJavaScript(WEB_ELEMENT_CHAT_BUTTON);}

    public void clickThingsToDoTab(){clickByXpathUsingJavaScript(WEB_ELEMENT_THINGS_TO_DO_TAB);}

    @FindBy (xpath = WEB_ELEMENT_DATE_FIELD)
    WebElement dateField;

    @FindBy (css = WEB_ELEMENT_SELECT_DATE)
    WebElement selectDate;

    @FindBy (xpath = WEB_ELEMENT_SELECT_CHECKBOX)
    public WebElement selectCheckBox;

    public void clickDataField(){
        dateField.click();
    }
    public void selectData(){
        selectDate.click();
    }
    public void selectCheckBox(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_CHECKBOX);}

    @FindBy (xpath = WEB_ELEMENT_CONTACT_US_BUTTON)
    WebElement contactUsButton;

    @FindBy (xpath = WEB_ELEMENT_CONTACT_US_MODEL_WINDOW)
    WebElement contactUsModelWindow;

    @FindBy (xpath = WEB_ELEMENT_CITY)
    WebElement chooseCity;

    @FindBy (xpath = WEB_ELEMENT_SELECT_TRAVELERS)
    WebElement chooseTravelers;

    @FindBy (xpath = WEB_ELEMENT_SELECT_TRAVELERS_ONE)
    public WebElement chooseTravelersDecrease;

    @FindBy (xpath = WEB_ELEMENT_SELECT_CARS)
    WebElement selectCars;

    public void clickContactUsButton(){clickByXpathUsingJavaScript(WEB_ELEMENT_CONTACT_US_BUTTON);}

    public void clickContactUsWindow(){clickByXpathUsingJavaScript(WEB_ELEMENT_CONTACT_US_MODEL_WINDOW);}

    public void selectCity(){clickByXpathUsingJavaScript(WEB_ELEMENT_CITY);}

    public void OpenSelectTravelerLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_TRAVELERS);}

    public void selectCars(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_CARS);}

    public void OpenSelectTravelerDecrease(){
        chooseTravelersDecrease.click();
    }





}
