package homepage;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static homepage.HomepageLocators.*;

public class Homepage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BOX )
    WebElement inputSearchBox;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);

    }

    public void doSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        typeOnElement(WEB_ELEMENT_INPUT_SEARCH_BOX, WEB_ELEMENT_INPUT_TEXT);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();

    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }


//    @FindBy (xpath = WEB_ELEMENT_RADIO_OPTION_ADIDAS)
//    public WebElement radioOptionAdidas;
//
//    @FindBy (xpath = WEB_ELEMENT_RADIO_OPTION_NIKE)
//    public WebElement radioOptionNike;
//
//    public void selectBMWRadioOption(){
//        selectElement(radioOptionAdidas);
//
//    }
//
//    public void selectBenzRadioOption(){
//        selectElement(radioOptionNike);
//    }

    @FindBy (xpath = WEB_ELEMENT_RADIO_OPTION_ADIDAS)
    public WebElement radioOptionAdidas;

    @FindBy (xpath = WEB_ELEMENT_RADIO_OPTION_NIKE)
    public WebElement radioOptionNike;

    public void clickRadioAdidasButton() {radioOptionAdidas.click();}

    public void clickRadioNikeButton() {radioOptionNike.click();}

}