package fantasyPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static fantasyPage.FantasyPageLocators.*;


public class FantasyPage extends BaseAPI {

    public FantasyPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_DROP_DOWN_FANTASY)
    public WebElement dropDownFantasy;

    public void dropDown() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_FANTASY);

    }

    @FindBy(xpath = WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR)
    WebElement selectCategorySearchBar;

    public void selectCategoryFromSearchBar() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_CATEGORY_SEARCH_BAR);

    }

    @FindBy(xpath = WEB_ELEMENT_CLICK_LOGIN_BUTTON)
    WebElement clickLoginButton;

    public void clickLoginButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_LOGIN_BUTTON);

    }

    @FindBy(xpath = WEB_ELEMENT_HOVER_OVER_PLAY_BUTTON)
    public WebElement hoverOverPlayButton;

    public void hoverOverButton() {
        basicHoverUsingXpath(WEB_ELEMENT_HOVER_OVER_PLAY_BUTTON);
        implicitWait();
    }

    @FindBy(xpath = WEB_ELEMENT_CLICK_PODCAST_BUTTON)
   public WebElement clickPodcastButton;

    public void clickPodcastButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_PODCAST_BUTTON);
    }

    @FindBy(xpath = WEB_ELEMENT_OPEN_SPORTS_PAGE)
   public WebElement openSportsPage;

    public void openSportsPage() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_OPEN_SPORTS_PAGE);
    }


    @FindBy(xpath = WEB_ELEMENT_CLICK_ABOUT_US)
   public WebElement clickAboutUs;

    public void clickAboutUsButton() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_ABOUT_US);
    }

    @FindBy(xpath = WEB_ELEMENT_FANTASY_GAMES_BASKETBALL)
    WebElement fantasyGameBasketball;

    public void OpenBasketballPage() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_FANTASY_GAMES_BASKETBALL);
    }

    @FindBy(css = WEB_ELEMENT_CHECK_BUTTON_TEXT)
    WebElement checkButtonText;

    public void checkButton() {
        clickByCssSelectorUsingJavaScript(WEB_ELEMENT_CHECK_BUTTON_TEXT);
    }

    @FindBy(xpath = WEB_ELEMENT_DROP_DOWN_PODCAST)
   public WebElement dropDownPodcast;

    public void doDropDownPodcast() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_PODCAST);
    }

    @FindBy(xpath = WEB_ELEMENT_DO_DROP_DOWN)
   public WebElement doDropDown;

    public void clickDropDown(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_PODCAST);
}
    @FindBy(xpath = WEB_ELEMENT_CLICK_NAVIGATION_BAR)
    public WebElement clickNavigationBar;

    public void clickNavBar(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_NAVIGATION_BAR);
    }
    @FindBy(xpath = WEB_ELEMENT_SEARCH_FLIP_BOARD)
    WebElement searchFlipBoard;

    public void searchInput(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_FLIP_BOARD);

    }
}






