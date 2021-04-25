package businessAndInstitutionsPageTest;

import businessAndInstitutionsPage.BusinessAndInstitutionsPage;
import common.BaseAPI;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBusinessAndInstitutionsPage extends BaseAPI {

    BusinessAndInstitutionsPage businessAndInstitutionsPage;

    //Test #1
    @Test(enabled = false)
    public void testBusinessInstitutionPage() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();
        businessAndInstitutionsPage.clickToBusinessAndInstitutionsSeeMoreLink();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Coronavirus (COVID-19): Latest Updates from Bank of America";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #2
    @Test(enabled = false)
    public void testHover() throws Exception {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();
        implicitWait(10);
        businessAndInstitutionsPage.hoverOverButtonManagingBusiness();


    }

    //Test #3
    @Test(enabled = false)
    public void testSearchBar() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.doSearch();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Search Results Page";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


    }

    //Test #4
    @Test(enabled = false)
    public void testManageBusinessButton() throws Exception {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();
        implicitWait(10);
        businessAndInstitutionsPage.clickManageBusinessButton();

        businessAndInstitutionsPage.scrollDown();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America Merrill Lynch is Now Bank of America & BofA Securities";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #5
    @Test(enabled = false)
    public void testDropDown() {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickDropDownButton();

        businessAndInstitutionsPage.clickTransactionServicesLink();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Global Financial Transaction Services from Bank of America Merrill Lynch";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #6
    @Test(enabled = false)
    public void testCareersPage() {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickBankCareersLink();

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America Merrill Lynch Career Opportunities";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");


    }


    //Test #7
    @Test(enabled = false)
    public void testCareersPageButton() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickBankCareersLink();

        businessAndInstitutionsPage.clickBankCareersStartButton();
        implicitWait(20);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America Merrill Lynch Career Opportunities";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #8
    @Test(enabled = false)
    public void testCareersPageShareButton() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickBankCareersLink();

        businessAndInstitutionsPage.clickBankCareersShareButton();
        fluentWait(20);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America Merrill Lynch Career Opportunities";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #9
    @Test(enabled = true)
    public void testCareersPageShareButtonLinkedIn() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickBankCareersLink();

        businessAndInstitutionsPage.clickBankCareersShareButton();

        businessAndInstitutionsPage.clickBankCareersShareButtonLinkedIn();
        fluentWait(20);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America Merrill Lynch Career Opportunities";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    //Test #10
    @Test(enabled = false)
    public void testCareersPageAttractTalentLink() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickBankCareersLink();

        businessAndInstitutionsPage.clickBankCareersLinkAttractTalent();
        implicitWait(10);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Employee Recruitment & Retention Strategies Bank of America Merrill Lynch";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    //Test #11
    @Test(enabled = false)
    public void testClientPortalLink() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickToLoginClientPortal();

        implicitWait(20);

    }

    //Test #12
    @Test(enabled = false)
    public void testClientPortalPrimePage() throws InterruptedException {

        businessAndInstitutionsPage = new BusinessAndInstitutionsPage();

        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

        businessAndInstitutionsPage.clickToLoginClientPortal();

        businessAndInstitutionsPage.clickClientPrimePortal();

        implicitWait(20);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Bank of America Merrill Lynch is Now Bank of America & BofA Securities";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }





    }
