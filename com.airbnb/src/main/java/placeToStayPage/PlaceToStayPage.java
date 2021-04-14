package placeToStayPage;


import common.BaseAPI;
import homepage.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.cert.X509Certificate;

import static placeToStayPage.PlaceToStayPageLocators.*;

public class PlaceToStayPage extends BaseAPI {


    @FindBy (xpath = WEB_ELEMENT_CAREERS )
    WebElement airBNBCareers;

    @FindBy(xpath = WEB_ELEMENT_CAREERS_EXPLORE_ROLES_BUTTON)
    WebElement exploreRolesButton;

    @FindBy(xpath =WEB_ELEMENT_CAREERS_UNIVERSITY_BUTTON )
    WebElement exploreAirBNBUniversity;

    public PlaceToStayPage(){
        PageFactory.initElements(driver, this);
    }


    public void checkCareers() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CAREERS);
    }
    public void clickExploreRolesButton(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CAREERS_EXPLORE_ROLES_BUTTON);
    }
    public void clickUniversityLink(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CAREERS_UNIVERSITY_BUTTON);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath =WEB_ELEMENT_INPUT_SEARCH)
    WebElement inputSearch;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;

    public void sendKeysToSearchBox(String keysToSend){
        inputSearch.sendKeys(keysToSend);

    }
    public void clickSearchButton(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }
    public void doSearch(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        typeOnElement(WEB_ELEMENT_INPUT_SEARCH,WEB_ELEMENT_INPUT_SEARCH_TEST);
        clickSearchButton();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = WEB_ELEMENT_DIVERSITY_AND_BELONGING_PAGE)
    WebElement exploreDiversityAndBelonging;

    @FindBy(xpath = WEB_ELEMENT_BELONG_HERE_PAGE)
    WebElement openBelongHerePage;


    public void sendKeysToSearchPage(String keysToSend){
        inputSearch.sendKeys(keysToSend);

    }
    public void clickDiversityAndBelonging(){
        WebDriverWait wait= new WebDriverWait(driver,30);
        clickByXpathUsingJavaScript(WEB_ELEMENT_DIVERSITY_AND_BELONGING_PAGE);

    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = WEB_ELEMENT_HOTEL_TONIGHT)
    WebElement airBNBHotelTonight;

 //  @FindBy(xpath =WEB_ELEMENT_HOTEL_TONIGHT_BOOKING )
  //  WebElement searchHotelToBook;

    public void setSearchHotelToBook( String KeysToSend){
        searchButton.sendKeys(KeysToSend);

    }
    public void findHotelForTonight(){

        WebDriverWait wait = new WebDriverWait(driver,300);
        clickByXpathUsingJavaScript(WEB_ELEMENT_HOTEL_TONIGHT);
    }
    //public void bookingHotel(){
       // WebDriverWait wait = new WebDriverWait(driver,40);
       // clickByXpathUsingJavaScript(WEB_ELEMENT_HOTEL_TONIGHT_BOOKING);
    }















