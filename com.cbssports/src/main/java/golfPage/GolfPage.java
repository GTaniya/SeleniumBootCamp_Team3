package golfPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static golfPage.GolfPageLocators.*;

public class GolfPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_HAMBURGER_MENU)
    WebElement hamburgerMenu;

    @FindBy (xpath = WEB_ELEMENT_HAMBURGER_MENU_SELECT_GOLF)
    WebElement hamburgerMenuSelectGolf;

    @FindBy (xpath = WEB_ELEMENT_GOLF_LEADERBOARD)
    WebElement golfLeaderBoard;

    public GolfPage() {PageFactory.initElements(driver, this);
    }

    public void clickHamburgerMenu(){clickByXpathUsingJavaScript(WEB_ELEMENT_HAMBURGER_MENU);}

    public void clickGolfLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_HAMBURGER_MENU_SELECT_GOLF);}

    public void clickGolfLeaderBoard(){clickByXpathUsingJavaScript(WEB_ELEMENT_GOLF_LEADERBOARD);}


    @FindBy (xpath = WEB_ELEMENT_SELECT_DATE_FIELD)
    WebElement dateField;

    @FindBy (xpath = WEB_ELEMENT_SELECT_DATE)
    WebElement selectDate;

    @FindBy(xpath = WEB_ELEMENT_SELECT_PLAY_GOLF)
    WebElement selectPlayGolf;

    @FindBy (xpath = WEB_ELEMENT_SELECT_PLAYERS)
    public WebElement selectPlayers;

    @FindBy (xpath = WEB_ELEMENT_SELECT_PLAYERS_FOUR)
    public WebElement selectFourPlayers;

    public void clickDateField(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_DATE_FIELD);}
    public void clickDate(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_DATE);}

    public void clickPlayGolfLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_PLAY_GOLF);}

    public void clickGolf(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_HAMBURGER_MENU);
        clickByXpathUsingJavaScript(WEB_ELEMENT_HAMBURGER_MENU_SELECT_GOLF);
    }

    public void scrollDown(){
        scrollToElementJScript(selectPlayers);
    }
    public void selectPlayersDropDown(){
        clickByXpath(WEB_ELEMENT_SELECT_PLAYERS);
    }

    public void selectOptionFour(){
        clickByXpath(WEB_ELEMENT_SELECT_PLAYERS_FOUR);
    }


}
