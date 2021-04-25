package mlbPage;

public class MLBPageLocators {

    public static final String WEB_ELEMENT_INPUT_SEARCH_BUTTON ="//a[@id='global-search-trigger']";
    public static final String WEB_ELEMENT_INPUT_SEARCH ="//input[@placeholder='Search Sports, Teams or Players...']";
    public static final String WEB_ELEMENT_INPUT_SEARCH_DIAZ ="//div[@class='LogoTile__Title']//span[contains(text(),'Kamaru Usman')]";

    //Navigate to MLB
    public static final String WEB_ELEMENT_MLB_PAGE ="//a[@name='&lpos=sitenavdefault+sitenav_mlb']//span[@class='link-text']";
    public static final String WEB_ELEMENT_MLB_PAGE_SCORES ="//a[@name='&lpos=sitenavdefault+mlb_mlbscoreboard']//span[@class='link-text']";
    public static final String WEB_ELEMENT_MLB_PAGE_SCORES_HEADER ="//*[@id=\"scoreboard-page\"]/header/h1";

    //Slide Arrow
    public static final String WEB_ELEMENT_DATE_SLIDE_ARROW ="//button[@class='slick-next slick-arrow']";

    //Date Picker
    public static final String WEB_ELEMENT_DATE_WINDOW ="//div[@class='calendar-container']/a[1]";
    public static final String WEB_ELEMENT_DATE_SELECT ="//tr[5]/td[.='28']";

    //AD close
    public static final String WEB_ELEMENT_SCHEDULES_PAGE ="//a[@name='&lpos=sitenavdefault+mlb_mlbschedule']";
    public static final String WEB_ELEMENT_AD ="//div[@class='j1 align']";
    public static final String WEB_ELEMENT_CLOSE_AD ="//img[@id='close_button_svg']";

    //Drop down select
    //public static final String WEB_ELEMENT_TEAM_SCHEDULE ="//button[normalize-space()='Team Schedules']";
    public static final String WEB_ELEMENT_TEAM_SCHEDULE ="//button[@class='button-filter med dropdown-toggle']";
    public static final String WEB_ELEMENT_TEAM_SCHEDULE_CHICAGO_CUBS ="//a[normalize-space()='Chicago Cubs']";
    public static final String WEB_ELEMENT_TEAM_SCHEDULE_CHICAGO_CUBS_HEADER ="//span[@class='db fw-bold']";

    //Select Teams from drop down
    public static final String WEB_ELEMENT_TEAM_NEW_YORK_METS = "//a[@name='&lpos=subnav+subnav__team_new_york_mets']//span[@class='link-text']";
    public static final String WEB_ELEMENT_TEAM_NEW_YORK_METS_HEADER = "//span[@class='ClubhouseHeader__Location']";

    //Hover
    public static final String WEB_ELEMENT_TEAM_NEW_YORK_METS_FOLLOW = "//button[normalize-space()='Follow']";

    //Select Players
    public static final String WEB_ELEMENT_STATS="//a[@name='&lpos=sitenavdefault+mlb_mlbstats']//span[@class='link-text']";
    public static final String WEB_ELEMENT_STATS_PLAYER_NICO="//img[@alt='Nico Hoerner']";
    public static final String WEB_ELEMENT_STATS_PLAYER_NICO_HEADER="//span[@class='truncate min-w-0']";
}
