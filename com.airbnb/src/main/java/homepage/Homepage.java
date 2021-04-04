package homepage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;

public class Homepage extends BaseAPI {

    @FindBy(css = webElementInputSearch)
    WebElement inputSearchBox;

    @FindBy (css = webElementButtonSearch)
    WebElement buttonSearch;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() {
        buttonSearch.click();
    }

    public void doSearch(String keysToSend) {
        sendKeysToSearchBox(keysToSend);
        clickSearchButton();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy (css = webElementFieldGuide)
    WebElement fieldGuideToggle;

    @FindBy (css = webElementSignUp)
    WebElement signUpSearch;


    public void clickToggleButton() { fieldGuideToggle.click();}

    public void clickSignUpButton() { signUpSearch.click();}

    public void doToggleClick(){
        clickToggleButton();
    }

    public void doSignUp(){
        clickSignUpButton();
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////


}


