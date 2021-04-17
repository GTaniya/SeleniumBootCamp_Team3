package golfPage;

public class GolfPageLocators {

    //Navigate to Golf Page
    public static final String WEB_ELEMENT_HAMBURGER_MENU = "//span[@class='icon-more icon-moon-nav-more']";
    public static final String WEB_ELEMENT_HAMBURGER_MENU_SELECT_GOLF = "//ul[@class='site-nav-dropdown is-the-dots is-wide']//a[.='Golf']";

    //Leaderboard
    public static final String WEB_ELEMENT_GOLF_LEADERBOARD = "//nav[@class='site-nav-list']//li[@class='nav-list-item nav-item-overflow ']/a[.='Leaderboard']";

    //Select date
    public static final String WEB_ELEMENT_SELECT_DATE_FIELD = "//input[@id='s-datepicker']";
    public static final String WEB_ELEMENT_SELECT_DATE = "//a[.='28']";

    public static final String WEB_ELEMENT_SELECT_PLAY_GOLF = "//ul[@class='nav-networks']//a[contains(.,'Play Golf')]";

}

