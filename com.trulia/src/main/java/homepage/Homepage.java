package homepage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.PreparedStatement;

import static homepage.HomepageLocators.*;

public class Homepage extends BaseAPI {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = WEB_ELEMENT_INPUT_SEARCH_BUTTON)
    WebElement searchButton;

    @FindBy (xpath = WEB_ELEMENT_INPUT_SEARCH_RESULT)
    public WebElement searchResult;

    @FindBy (xpath = WEB_ELEMENT_SIGNUP_BUTTON)
    public WebElement signUpButton;

    @FindBy (xpath = WEB_ELEMENT_FIND_HOME)
    public WebElement findHomeButton;

    @FindBy (xpath = WEB_ELEMENT_HAMBURGER_MENU)
    public WebElement hamburgerMenu;

    @FindBy (xpath = WEB_ELEMENT_HELP_CENTER)
    public WebElement helpCenter;

    public void searchByCity(){
        WebElement city = driver.findElement(By.xpath(WEB_ELEMENT_INPUT_SEARCH_BAR));
        city.sendKeys("Germantown, MD");
        searchButton.click();
    }

    public void clickSignUp(){clickByXpath(WEB_ELEMENT_SIGNUP);}

    public void sendKeysToSearchBar(){
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("taniya@gmail.com");
        signUpButton.click();
    }


    public void hoverOverFindHome(){
        scrollToElementJScript(findHomeButton);
        hoverOverElement(findHomeButton);
    }

    public void clickHamburgerMenu(){hamburgerMenu.click();}

    public void clickAdditionResources(){
        clickByXpath(WEB_ELEMENT_HAMBURGER_MENU_ADDITION_RESOURCES);
    }

    public void clickHelpCenter(){
        selectElement(helpCenter);
    }

    public void clickRealStateProfessionals(){
        clickByXpath(WEB_ELEMENT_HELP_CENTER_REAL_STATE_PROFESSIONALS);
    }

    public void navigateToNeighborhoodGuide(){
        hamburgerMenu.click();
        clickByXpath(WEB_ELEMENT_LOCAL_INFO);
        clickByXpath(WEB_ELEMENT_LOCAL_INFO_NEIGHBORHOOD_GUIDE);
    }

    public void clickImageFromSlider(){
        clickByXpath(WEB_ELEMENT_LOCAL_INFO_NEIGHBORHOOD_GUIDE_DOWNTOWN);
    }
    public void clickImageFromSliderTwo(){
        clickByXpath(WEB_ELEMENT_LOCAL_INFO_NEIGHBORHOOD_GUIDE_HOLLYWOOD_HILLS);
    }
}
