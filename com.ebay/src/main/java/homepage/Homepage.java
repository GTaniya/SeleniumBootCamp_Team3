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

//    public void scrollDown(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");
//    }


    @FindBy (xpath = WEB_ELEMENT_RADIO_OPTION_ADIDAS)
    public WebElement radioOptionAdidas;

    @FindBy (xpath = WEB_ELEMENT_RADIO_OPTION_NIKE)
    public WebElement radioOptionNike;

    @FindBy (xpath = WEB_ELEMENT_CHECK_HOVER_OVER)
    public WebElement hoverOverTheButton;


    public void clickRadioAdidasButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        selectElement(radioOptionAdidas);
    }

    public void clickRadioNikeButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        selectElement(radioOptionNike);
    }

    public void hoverOverButton() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        implicitWait();
        //hoverOverElement(hoverOverTheButton);
        basicHoverUsingXpath(WEB_ELEMENT_CHECK_HOVER_OVER);
    }

    @FindBy (xpath = WEB_ELEMENT_CHECK_BRAND_OUTLET_PAGE)
    WebElement brandOutletPage;

    @FindBy (xpath = WEB_ELEMENT_CHECK_BRAND_OUTLET_PAGE_CHAMPION_DISCOUNT)
    WebElement brandOutletDiscount;

    public void clickBrandOutletLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_BRAND_OUTLET_PAGE);}
    public void clickBrandOutletChampionDiscount(){clickByXpathUsingJavaScript(WEB_ELEMENT_CHECK_BRAND_OUTLET_PAGE_CHAMPION_DISCOUNT);}
}