package homepage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomepageLocators.*;

public class Homepage extends BaseAPI {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_CLOSE)
    WebElement closeButton;

    public void clickCloseButton(){
        waitForElementToBeClickable(closeButton);
       // clickByXpathUsingJavaScript(WEB_ELEMENT_CLOSE);
    }
}
