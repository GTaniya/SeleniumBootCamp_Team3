package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomepageLocators.*;

public class TestHomepage extends BaseAPI {

    Homepage homepage;

    //Test #1
    @Test(enabled = false)
    public void testDoSearch(){
        homepage = new Homepage();

        homepage.searchByCity();

        String expectedHeader = "Apartments For Rent in Germantown, MD";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_INPUT_SEARCH_RESULT );
    }

    //Test #2
    @Test(enabled = true)
    public void testSignUp() throws InterruptedException {
        homepage = new Homepage();
        homepage.clickSignUp();
        implicitWait(20);
        homepage.sendKeysToSearchBar();
        fluentWait(40);

//      WebDriverWait wait = new WebDriverWait(driver, 40);

        String expectedHeader = "Sign in or register to save your favorite homes";
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_SIGNUP_HEADER );
    }

}
