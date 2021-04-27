package NFLTest;

import common.BaseAPI;
import NFL.NFLpage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNFL extends BaseAPI {
    NFLpage NFL;

    @Test(enabled = false)
    public void testNFLPage() throws Exception {
        NFL = new NFLpage();

        NFL.clickNFLPage();
        Thread.sleep(2000);
        String actualResults = BaseAPI.driver.getTitle();
        String expectedResults = "NFL Football - News, Scores, Stats, Standings, and Rumors - National Football League - CBSSports.com";
        Assert.assertEquals(actualResults, expectedResults, "Test failed");
    }

    @Test(enabled = false)
    public void testScore() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickScore();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testSchedule() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickSchedule();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testFreeAgent() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickFreeAgent();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testDraft() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickDraft();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testMockDraft() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickMore();
        Thread.sleep(2000);
        NFL.clickMockDraft();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testStandings() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickMore();
        Thread.sleep(2000);
        NFL.clickStandings();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testFacebook() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickFacebook();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testTwitter() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickTwitter();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testBet() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickBet();
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void testPodcast() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickPodcast();
        Thread.sleep(2000);
    }

    @Test
    public void testInstagram() throws Exception {
        NFL = new NFLpage();
        NFL.clickNFLPage();
        Thread.sleep(2000);
        NFL.clickInstagram();
        Thread.sleep(2000);
    }
}
