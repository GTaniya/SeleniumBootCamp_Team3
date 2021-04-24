package BuildYourOwn;

public class BuildYourOwnPageLocators {
    public static final String WEB_ELEMENT_MENU = ".globalnav-primary-dealer__mobile-nav-burger";
    public static final String WEB_ELEMENT_BUILD_YOUR_OWN = "[analytics-event='topnav.byo.byo.link']";
    public static final String WEB_ELEMENT_BUILD_THIS_VEHICLE = "//a[contains(.,'Build This Vehicle')]";
    public static final String WEB_ELEMENT_SELECT_SERIES= "//button[@class='cta-button theme-core byo-core-type series-header-cta cta-2 cta-2']";
    public static final String WEB_ELEMENT_X5= "//button[normalize-space()='X5']";

    // Change color of X5
    public static final String WEB_ELEMENT_X5_SELECT= "//a[@title='X5 Sports Activity Vehicle']";
    public static final String WEB_ELEMENT_X5_DESIGN_BUTTON= "//a[@title='2021 BMW X5 sDrive40i']";
    public static final String WEB_ELEMENT_X5_EXTERIOR_BUTTON= "//a[normalize-space()='Exterior']";
    public static final String WEB_ELEMENT_X5_JET_BLACK= "//div[@title='Jet Black']//div[@class='price byo-core-type label-2 theme-core'][normalize-space()='$0']";

    //Estimate
    public static final String WEB_ELEMENT_X5_SUMMARY= "//a[normalize-space()='Summary']";
    public static final String WEB_ELEMENT_X5_ESTIMATE_PAYMENT= "//div[@class='link-block-header label-2']//a[contains(text(),'Estimate Payment')]";
    public static final String WEB_ELEMENT_X5_ESTIMATE_PAYMENT_BUTTON= "//div[@class='payment-estimator__adjustments']//button[@class='estimate-payments-button'][normalize-space()='Estimate Payments']";
    public static final String WEB_ELEMENT_X5_ESTIMATE_PAYMENT_ZIP_BOX= "//input[@name='zipCodeVecView']";

    //Search
    public static final String WEB_ELEMENT_SEARCH= "//form[@class='globalnav-primary-search globalnav-primary-search--icon-only']/div[@class='globalnav-primary-search__search-holder']";
    public static final String WEB_ELEMENT_SEARCH_BOX= "//div[@class='globalnav-primary-search-results bmw-grid-row bmw-grid-col-default-25 bmw-grid-col-lg-10 bmw-grid-col-lg-offset-14 globalnav-primary-search-results--active']//input[@name='site search']";


    public static final String WEB_ELEMENT_FIND_BMW_CENTER= "//a[contains(.,'Find a BMW Center')]";
    public static final String WEB_ELEMENT_FIND_BMW_CENTER_ZIP= "location-search";
    public static final String WEB_ELEMENT_FIND_BMW_CENTER_SEARCH_BUTTON= "//span[.='Search']";

    //Z4
    public static final String WEB_ELEMENT_Z4_SELECT= "//div[@class='byo-container-fluid']//div[@class='series-tile__info byo-col-default-21 byo-col-default-offset-1 byo-col-md-offset-0 byo-col-md-9 byo-col-xl-8']/a[@href='#/series/Z4/roadster']";
    public static final String WEB_ELEMENT_Z4_DESIGN= "//a[@href='#/studio/21ZB']";
    public static final String WEB_ELEMENT_Z4_SHADOWLINE= "//div[normalize-space()='Shadowline']";
    public static final String WEB_ELEMENT_Z4= "//button[contains(.,'Z4')]";
}
