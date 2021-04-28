package sellPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static sellPage.SellPageLocators.*;

public class SellPage extends BaseAPI {

    public SellPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_DROP_DOWN_SELL_BUTTON)
    public WebElement dropDownSellButton;

    public void DropDownSell() {
        basicHoverUsingXpath(WEB_ELEMENT_DROP_DOWN_SELL_BUTTON);
    }

    @FindBy(xpath = WEB_ELEMENT_SEARCH_INPUT_BOX)
    public WebElement SearchInputBox;

    public void SearchBox() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_INPUT_BOX);
    }

        @FindBy(xpath = WEB_ELEMENT_CLICK_MORTGAGE_BUTTON)
        public WebElement clickMortgageButton;

        public void clickMortgage(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_MORTGAGE_BUTTON);}


}
