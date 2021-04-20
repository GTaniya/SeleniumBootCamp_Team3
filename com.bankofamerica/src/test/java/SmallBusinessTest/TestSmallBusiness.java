package SmallBusinessTest;

import common.BaseAPI;
import SmallBusiness.SmallBusinessPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSmallBusiness extends BaseAPI {
    SmallBusinessPage SmallBusiness;

    @Test(enabled = false)
    public void testSmallBusinessPage() {
        SmallBusiness = new SmallBusinessPage();

       SmallBusiness.clickSmallBusinessPage();
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Small Business Banking, Credit Cards & Loans – Bank of America";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testCashFlow() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickCashFlow();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Cash Flow Monitor - Cash Flow Management Tool";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testOpenAccount() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickOpenAccount();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Business Checking Accounts | Open a Business Bank Account Online";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testZelle() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickZelle();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Zelle® for Your Business from Bank of America";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testBusinessOwner() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickBusinessOwner();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Small Business Checking | Bank of America";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testCheckingCredit() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickCheckingCredit();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Learn the Benefits of a Business Checking and Credit Card Account";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testVideos() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickVideos();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Bank of America - Online Business Suite®";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testPayroll() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickPayroll();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Payroll Best Practices for Managing Your Small Business";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testFinancing() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickFinancing();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Small Business Loans - Compare Loan Types and Start Your Application";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testExploreApp() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickExploreApp();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Mobile Banking from Bank of America | Bank of America";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testChecking() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickChecking();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Small Business Banking, Credit Cards & Loans – Bank of America";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test
    public void testExploringChecking() throws Exception {
        SmallBusiness = new SmallBusinessPage();

        SmallBusiness.clickSmallBusinessPage();
        Thread.sleep(2000);
        SmallBusiness.clickChecking();
        Thread.sleep(2000);
        SmallBusiness.clickExploringChecking();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Business Checking Accounts | Open a Business Bank Account Online";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }
}
