package homepageTest;

import common.BaseAPI;
import homepage.Homepage;
import org.testng.annotations.Test;

public class TestHomepage extends BaseAPI {
    Homepage homepage;

    @Test
    public void testCloseButton(){
        homepage = new Homepage();
        homepage.clickCloseButton();
    }
}
