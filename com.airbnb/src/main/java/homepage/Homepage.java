package homepage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;

public class Homepage extends BaseAPI {


    @FindBy(xpath = webElementInputSearch)
    WebElement inputSearchBox;

    @FindBy (xpath = webElementButtonSearch)
    WebElement buttonSearch;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickByXpathUsingJavaScript(webElementButtonSearch);

    }

    public void clickByXpathUsingJavaScript(String webElementButtonSearch) {
    }

    public void doSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        typeOnElement(webElementInputSearch, webElementText);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();

    }

   public void typeOnElement(String webElementInputSearch, String webElementText) {
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


