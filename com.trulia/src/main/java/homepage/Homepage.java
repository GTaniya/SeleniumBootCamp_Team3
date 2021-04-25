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

    @FindBy (xpath = WEB_ELEMENT_INPUT_SEARCH_BUTTON)
    WebElement searchButton;

    @FindBy (xpath = WEB_ELEMENT_INPUT_SEARCH_RESULT)
    public WebElement searchResult;

    @FindBy (xpath = WEB_ELEMENT_SIGNUP_BUTTON)
    public WebElement signUpButton;


    public void searchByCity(){
        WebElement city = driver.findElement(By.xpath(WEB_ELEMENT_INPUT_SEARCH_BAR));
        city.sendKeys("Germantown, MD");
        searchButton.click();
    }

    public void clickSignUp(){clickByXpath(WEB_ELEMENT_SIGNUP);}

    public void sendKeysToSearchBar(){
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("taniya@gmail.com");
        signUpButton.click();
    }
}
