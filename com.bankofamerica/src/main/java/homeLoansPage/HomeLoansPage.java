package homeLoansPage;


import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static homeLoansPage.HomeLoanPageLocators.*;


public class HomeLoansPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_CLICK_HOME_LOAN_PAGE)
    WebElement clickHomeLoanPage;


    public void clickHomeLoanPage() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_HOME_LOAN_PAGE);
    }


    @FindBy(xpath = WEB_ELEMENT_SEARCH_MORTGAGE_PAGE)

    WebElement searchMortgagePage;

    @FindBy(xpath = WEB_ELEMENT_CLICK_MENU_BUTTON)
    WebElement clickMenuButton;

    @FindBy(xpath = WEB_ELEMENT_MORTGAGE_RATES)
    WebElement mortgageRates;


    public void doSearchMortgagePage() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_MORTGAGE_PAGE);
    }
    public void clickMenu(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_MENU_BUTTON);
    }
    public void searchMortgageRate(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_MORTGAGE_RATES);
    }
    @FindBy(xpath = WEB_ELEMENT_HOME_LOAN_REFINANCE)
    WebElement homeLoanRefinance;

    @FindBy(xpath = WEB_ELEMENT_MORTGAGE_REFINANCE_CALCULATOR)
    WebElement mortgageRefinanceCalculator;

    public void homeLoanRefinanceSearch(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_HOME_LOAN_REFINANCE);
    }
    public void mortgageRefinanceCalculator(){

        clickByXpathUsingJavaScript(WEB_ELEMENT_MORTGAGE_REFINANCE_CALCULATOR);

    }
    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BAR)
    WebElement inputSearchBar;

    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BUTTON)
    WebElement inputSearchButton;

    public void clickSearchButton(){
        clickByXpathUsingJavaScript(WEB_ELEMENT_INPUT_SEARCH_BUTTON);
    }
    public void doSearch(){
        typeOnElement(WEB_ELEMENT_INPUT_SEARCH_BAR,WEB_ELEMENT_INPUT_SEARCH_TEXT);
        clickSearchButton();
    }
}
