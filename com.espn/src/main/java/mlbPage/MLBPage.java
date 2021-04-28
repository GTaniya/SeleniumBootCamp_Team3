package mlbPage;

import common.BaseAPI;
import mlbPage.espnDataDriver.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.util.List;

import static mlbPage.MLBPageLocators.*;

public class MLBPage extends BaseAPI {
    public MLBPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSearButton(){
        clickByXpath(WEB_ELEMENT_INPUT_SEARCH_BUTTON);
    }
    public void searchDiazUsingExcel() throws Exception {

        List<String> name1 = DataSource.getItemsListFromExcel();
        String item = name1.get(2);
        typeOnElement(WEB_ELEMENT_INPUT_SEARCH, item);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);

    }
//************************************************************************************************************

    public void clickMLBPageTab(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_MLB_PAGE);
    }

    public void clickScores(){
        clickByXpath(WEB_ELEMENT_MLB_PAGE_SCORES);
    }

    @FindBy(xpath = WEB_ELEMENT_DATE_SLIDE_ARROW)
    public WebElement slideArrow;

    @FindBy(xpath = WEB_ELEMENT_DATE_WINDOW)
    public WebElement dateWindow;

    @FindBy(xpath = WEB_ELEMENT_DATE_SELECT)
    public WebElement dateSelect;

    @FindBy(xpath = WEB_ELEMENT_AD)
    public WebElement popupAD;

    @FindBy(xpath = WEB_ELEMENT_TEAM_NEW_YORK_METS)
    WebElement teamNewYorkMets;

    @FindBy(xpath = WEB_ELEMENT_TEAM_NEW_YORK_METS_FOLLOW)
    public WebElement NewYorkMetsFollow;

    @FindBy(xpath = WEB_ELEMENT_STATS_PLAYER_NICO)
    WebElement teamPlayerNico;

    public void clickSlideArrow(){

        slideArrow.click();
    }
    //************************************************************************************************************
    public void clickDateWindow(){
        clickByXpath(WEB_ELEMENT_DATE_WINDOW);
    }
    public void chooseDate(){
        dateSelect.click();
    }

    public void dataSelect(){
        clickByXpath(WEB_ELEMENT_DATE_WINDOW);
        dateSelect.click();
    }

    //************************************************************************************************************

    public void clickSchedulePage(){clickByXpath(WEB_ELEMENT_SCHEDULES_PAGE);}
    public void closeAD(){
        waitForVisibilityOfElement(popupAD);
        clickByXpath(WEB_ELEMENT_CLOSE_AD);
    }
    //************************************************************************************************************

    public void clickDropDown(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_TEAM_SCHEDULE);
    }
    public void selectChicagoCubs(){clickByXpathUsingJavaScript(WEB_ELEMENT_TEAM_SCHEDULE_CHICAGO_CUBS);}

    public void clickNewYorkMets(){clickElement(teamNewYorkMets);}

    public void hoverOverFollowButton(){
        hoverOverElement(NewYorkMetsFollow);
    }

    public void clickStatsPage(){clickByXpath(WEB_ELEMENT_STATS);}

    public void choosePlayer(){clickElement(teamPlayerNico);}
}


