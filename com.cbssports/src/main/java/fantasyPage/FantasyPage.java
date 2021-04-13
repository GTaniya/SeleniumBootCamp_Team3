package fantasyPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static fantasyPage.FantasyPageLocators.*;


public class FantasyPage extends BaseAPI {

    @FindBy(xpath =  WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR )
    WebElement selectCategorySearchBar;

    public void selectCategoryFromSearchBar(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR);

    }
    @FindBy(xpath = WEB_ELEMENT_CLICK_LOGIN_BUTTON)
        WebElement  clickLoginButton;

    public void clickLoginButton(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_LOGIN_BUTTON);



        }
    }




