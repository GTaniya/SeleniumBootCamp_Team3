package hostYourHomePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static hostYourHomePage.HostYourHomePageLocators.*;


public class HostYourHomePage extends BaseAPI {

    @FindBy (css = WEB_ELEMENT_HOST_YOUR_PAGE)
    WebElement hostYourPage;

    public HostYourHomePage() {
        PageFactory.initElements(driver, this);
    }

    //public void clickHostYourPage(){
      //  clickByXpathUsingJavaScript(WEB_ELEMENT_HOST_YOUR_PAGE);
    //}

    public void clickHostYourPage(){
        hostYourPage.click();
    }

    @FindBy (xpath = WEB_ELEMENT_EXPLORE_THE_WORLD)
    WebElement exploreTheWorld;

    public void clickExploreTheWorld(){
       clickByXpathUsingJavaScript(WEB_ELEMENT_EXPLORE_THE_WORLD);
    }

    @FindBy (xpath = WEB_ELEMENT_WEBINAR)
    WebElement getwebinarButton;

    public void clickWebinar(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_WEBINAR);
    }
}
