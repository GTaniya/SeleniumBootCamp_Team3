package BuildYourOwn;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static BuildYourOwn.BuildYourOwnPageLocators.*;

public class BuildYourOwnPage extends BaseAPI {
    @FindBy(css = WEB_ELEMENT_BUILD_YOUR_OWN)
    WebElement buildYourOwn;

    public BuildYourOwnPage() { PageFactory.initElements(driver, this); }

    public void clickBuildYourOwnPage() { buildYourOwn.click(); }

    @FindBy(css = WEB_ELEMENT_MENU)
    WebElement menu;

    public void clickMenu() { clickByCssSelectorUsingJavaScript(WEB_ELEMENT_MENU); }

    @FindBy(xpath = WEB_ELEMENT_BUILD_THIS_VEHICLE)
    WebElement buildThisVehicle;

    public void clickBuildThisVehicle() { clickByXpathUsingJavaScript(WEB_ELEMENT_BUILD_THIS_VEHICLE); }
}
