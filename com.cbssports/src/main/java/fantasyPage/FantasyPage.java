package fantasyPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static fantasyPage.FantasyPageLocators.*;


public class FantasyPage extends BaseAPI {

    public FantasyPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath =  WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR )
    WebElement selectCategorySearchBar;

    public void selectCategoryFromSearchBar(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR);

    }
    @FindBy(xpath = WEB_ELEMENT_CLICK_LOGIN_BUTTON)
        WebElement  clickLoginButton;

    public void clickLoginButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_LOGIN_BUTTON);

    }
    @FindBy(xpath = WEB_ELEMENT_HOVER_OVER_PLAY_BUTTON)
    public WebElement hoverOverPlayButton;

    public void hoverOverButton(){
        basicHoverUsingXpath(WEB_ELEMENT_HOVER_OVER_PLAY_BUTTON);
        implicitWait();
    }
    @FindBy(xpath = WEB_ELEMENT_CLICK_PODCAST_BUTTON)
    WebElement clickPodcastButton;

    public void clickPodcastButton(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_PODCAST_BUTTON);
    }


    }




