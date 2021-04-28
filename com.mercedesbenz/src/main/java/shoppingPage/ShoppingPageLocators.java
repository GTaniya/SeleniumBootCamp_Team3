package shoppingPage;

public class ShoppingPageLocators {

    public static final String WEB_ELEMENT_SELECT_SHOPPING = "//button[.='Shopping']";
    public static final String WEB_ELEMENT_SELECT_SHOPPING_BUILD_YOUR_OWN = "//li[@class='global-header__menu-l3-panel-item global-header__menu-l3-panel-item--shopping global-header__menu-l3-panel-item--active']//a[.='Build Your Own']";

    //Color select
    //public static final String WEB_ELEMENT_SELECT_VEHICLE = "//section[@class='all-vehicles module-separator']/section[2]//div[@class='all-vehicles__body-group-listing']/div[1]//a[.='Choose Models']";
    public static final String WEB_ELEMENT_SELECT_VEHICLE = "//img[@alt='GLA SUV']";
    //public static final String WEB_ELEMENT_SELECT_VEHICLE_GLA_SUV = "//span[contains(.,'GLA 250 SUV')]";
    public static final String WEB_ELEMENT_SELECT_VEHICLE_GLA_SUV = "//a[@aria-label='Build GLA 250 SUV']";
    //public static final String WEB_ELEMENT_SELECT_VEHICLE_COLOR_SELECT= "//*[@id=\"option-swatch-2:667\"]/div/picture/img";
    public static final String WEB_ELEMENT_SELECT_VEHICLE_COLOR_SELECT= "//img[@alt='Select Patagonia Red metallic']";

    //Radio Button
    public static final String WEB_ELEMENT_RADIO_BUTTON_VIDEO = "//div[@class='hero-flipbook__nav-selector']/div[2]//div[@class='form__radio-indicator']";

    //Location search
    public static final String WEB_ELEMENT_SCHEDULE_SERVICE = "//ul[@class='global-header__menu-l3-panel-list global-header__menu-l3-panel-list--shopping global-header__menu-l3__container-spacing']//a[.='Schedule Service']";
   // public static final String WEB_ELEMENT_SCHEDULE_SERVICE_SEARCH_BAR = "//input[@id='_knvb0hq1kul3b']";
    public static final String WEB_ELEMENT_SCHEDULE_SERVICE_SEARCH_BAR = "//div[@class='location-search location-search--active']//label[@class='form__input-label']";
    public static final String WEB_ELEMENT_SCHEDULE_SERVICE_SEARCH_BUTTON = "//div[@class='wrapper dealer-locator-module__search-bar']//button[@class='button button_primary']";

    //Compare Vehicle
    public static final String WEB_ELEMENT_COMPARE_VEHICLE = "//li[@class='global-header__menu-l3-panel-item global-header__menu-l3-panel-item--shopping global-header__menu-l3-panel-item--active']//a[.='Compare Vehicles']";
    public static final String WEB_ELEMENT_COMPARE_VEHICLE_TO_ADD_VEHICLE_ONE = "//div[@class='wrapper compare-header__sticky-component']//div[1]//button[1]//div[1]";
    public static final String WEB_ELEMENT_COMPARE_VEHICLE_ADD_SEDAN = "//label[.='A 220 Sedan']";

    //Estimate
    public static final String WEB_ELEMENT_ESTIMATE_PAYMENT = "//a[.='Estimate Payment']";
    public static final String WEB_ELEMENT_ESTIMATE_PAYMENT_SELECT_CLASS = "//div[@class='vehicle-selector__classes']//span[@class='select-control__caret-icon']";
    public static final String WEB_ELEMENT_ESTIMATE_PAYMENT_SELECT_CLASS_CLA = "//li[@aria-label='CLA']";
    public static final String WEB_ELEMENT_ESTIMATE_PAYMENT_SUBMIT_BUTTON = "//button[@class='button button_primary button--wide  vehicle-selector__submit-cta payment-estimator-app__submit-cta']";

    //Header
    public static final String WEB_ELEMENT_SERVICES = "//a[.='Services and Maintenance']";
    public static final String WEB_ELEMENT_SERVICES_ADDITIONAL_RESOURCES = "//span[.='Additional Resources']";
    public static final String WEB_ELEMENT_SERVICES_ADDITIONAL_RESOURCES_HEADER = "//h2[contains(.,'Additional Resources')]";
    public static final String WEB_ELEMENT_SERVICES_OWNERS_MANUAL = "//a[.=\"Owner's Manuals\"]";
    public static final String WEB_ELEMENT_SERVICES_OWNERS_MANUAL_HEADER_IMAGE = "//img[@alt='C-Class Coupe']";

    //slide to Right arrow >

    //public static final String WEB_ELEMENT_OWNERS_MANUAL_SLIDE_ARROW = "//button[@class='tabbed-module__nav-controls tabbed-module__nav-controls--right-arrow icon-mb icon-arrow-right-square active']";
    public static final String WEB_ELEMENT_OWNERS_MANUAL_SLIDE_ARROW = "//a[@href='/content/dam/mb-nafta/us/owners/manuals/2017/operators/MY17_AMG_E-Class_Sedan_Operator.pdf']";


    public static final String WEB_ELEMENT_CHECK_INSIDE_CAR_OPTION = "//span[@class='view-toggle__icon icon-steering-wheel']";
    public static final String WEB_ELEMENT_CHECK_INSIDE_CAR_OPTION_SCROLL_TO_RIGHT = "//span[@class='rotation-controls__icon icon-caret-right-thin']";



}

