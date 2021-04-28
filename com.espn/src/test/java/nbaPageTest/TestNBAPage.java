package nbaPageTest;

import common.BaseAPI;
import nbaPage.NBAPage;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNBAPage extends BaseAPI {

    TestNBAPage testNBAPage;

    @Test
    public void testDropDownNBA(){
        testNBAPage = new TestNBAPage();
        testNBAPage.testDropDownNBA();

        String exp="";
        String act=driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));

    }

}
