package OnlineBankingTest;

import common.BaseAPI;
import OnlineBanking.OnlineBankingPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnlineBanking extends BaseAPI {
    OnlineBankingPage OnlineBanking;

    @Test(enabled = false)
    public void testNFLPage() throws Exception {
        OnlineBanking = new OnlineBankingPage();

        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "Enroll in Chase Online Banking | Chase";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testEnroll() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickEnroll();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testFAQ() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickFAQ();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testResources() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testEnrollNow() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickOnlineBillPay();
        Thread.sleep(2000);
        OnlineBanking.clickEnrollNow();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testZelle() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickZelle();
        Thread.sleep(2000);
        OnlineBanking.clickEnrollZelle();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testZelleVideoOne() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickZelle();
        Thread.sleep(2000);
        OnlineBanking.clickZelleVideoOne();
        Thread.sleep(2000);
    }

    @Test
    public void testPaperless() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickPaperlessStatement();
        Thread.sleep(2000);
        OnlineBanking.clickShowMeHow();
        Thread.sleep(2000);
    }

    @Test
    public void testAccountAlerts() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickAccountAlerts();
        Thread.sleep(2000);
    }

    @Test
    public void testTextBanking() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickTextBanking();
        Thread.sleep(2000);
    }

    @Test
    public void testQuickDeposit() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickQuickDeposit();
        Thread.sleep(2000);
    }

    @Test
    public void testATM() throws Exception {
        OnlineBanking = new OnlineBankingPage();
        OnlineBanking.clickOnlineBankingpage();
        Thread.sleep(2000);
        OnlineBanking.clickResources();
        Thread.sleep(2000);
        OnlineBanking.clickATM();
        Thread.sleep(2000);
    }
}
