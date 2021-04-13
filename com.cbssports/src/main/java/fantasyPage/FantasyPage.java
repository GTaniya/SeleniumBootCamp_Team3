package fantasyPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static fantasyPage.FantasyPageLocators.WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR;


public class FantasyPage extends BaseAPI {

    @FindBy(xpath =  WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR )
    WebElement selectCategorySearchBar;

    public void selectCategoryFromSearchBarUsingIndex (){
        Select select = new Select(selectCategorySearchBar);


    }
    }



