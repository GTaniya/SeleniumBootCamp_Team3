package careersPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static careersPage.CareersPageLocators.*;

public class CareersPage extends BaseAPI {
    public CareersPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath =WEB_ELEMENT_CLICK_INPUT_BAR )
    public WebElement clickInputBar;

    public void clickInput(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_INPUT_BAR);}

    public void enterLocation(){clickByXpathUsingJavaScript(WEB_ELEMENT_ENTER_LOCATION);}

    public void selectCheckingDate(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_DATE);}

    public void selectCheckOut(){clickByXpathUsingJavaScript(WEB_ELEMENT_SELECT_CHECK_OUT_DATE);}

}
