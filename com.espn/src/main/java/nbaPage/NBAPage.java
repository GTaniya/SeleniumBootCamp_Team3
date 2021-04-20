package nbaPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static nbaPage.NBAPageLocators.WEB_ELEMENT_DROP_DOWN_NBA_BAR;

public class NBAPage extends BaseAPI {

    public NBAPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_DROP_DOWN_NBA_BAR)
    WebElement dropDownNBABar;

    public void clickDropDownBar(){clickByXpathUsingJavaScript(WEB_ELEMENT_DROP_DOWN_NBA_BAR);}
}
