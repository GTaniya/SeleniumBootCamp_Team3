package mortgagePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static mortgagePage.MortgageLocators.*;

public class MortgagePage extends BaseAPI {

    public MortgagePage() {
        PageFactory.initElements(driver, this);}

        @FindBy(xpath = WEB_ELEMENT_DROP_DOWN_MORTGAGE)
        WebElement dropDownMortgage;

        public void dropDownButton(){basicHoverUsingXpath(WEB_ELEMENT_DROP_DOWN_MORTGAGE);}
        @FindBy(xpath = WEB_ELEMENT_CLICK_MORTGAGE_OVERVIEW )
        public WebElement clickMortgage;

        public void selectMortgageOverview(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_MORTGAGE_OVERVIEW);}

        public void searchInputBar(){clickByXpathUsingJavaScript(WEB_ELEMENT_SEARCH_INPUT_BAR);}

        @FindBy(xpath = WEB_ELEMENT_ENTER_ZIP_CODE)
        public WebElement zipCode;

        public void enterZipCod(){clickByXpathUsingJavaScript(WEB_ELEMENT_ENTER_ZIP_CODE);}

        @FindBy(id = WEB_ELEMENT_CLICK_CREDIT_SCORE_INPUT)
        WebElement clickCreditScoreInput;

        public void creditScoreInput(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_CREDIT_SCORE_INPUT);}

        @FindBy(xpath = WEB_ELEMENT_CLICK_SERVED_IN_THE_US_MILITARY_CHECK_BOX)
        public WebElement clickCheckBox;

        public void clickServedInTheUSMilitaryCheckBox(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_SERVED_IN_THE_US_MILITARY_CHECK_BOX);}

    }





