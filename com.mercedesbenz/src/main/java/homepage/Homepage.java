package homepage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

import static homepage.HomepageLocators.*;

public class Homepage  extends BaseAPI {
    public Homepage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_CLICK_COUPE_BUTTON)
    public WebElement clickCoupeButton;

    public void clickCoupe(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_COUPE_BUTTON);}

    public void hoverCLACoupeMenu(){basicHoverUsingXpath(WEB_ELEMENT_CLICK_COUPE_BUTTON);}

    public void clickAMGCLACoupe(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_AMG_CLA_COUPE);}
}
