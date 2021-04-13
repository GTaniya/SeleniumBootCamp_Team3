package bmwCertifiedPage;

public class BMWCertifiedPageLocators {

    public static final String WEB_ELEMENT_NAVIGATE_TO_BMW_CERTIFIED_PAGE = "//a[.='BMW Certified']";
    public static final String WEB_ELEMENT_PRE_OWNED_INVENTORY_BUTTON = "//a[@href='https://www.bmwusa.com/certified-preowned-search.html#/results']";

    //Zip code Entry
    public static final String WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE_SEARCH = "//input[@id='zip-input-cpo']";
    public static final String WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE = "20874";
    public static final String WEB_ELEMENT_PRE_OWNED_INVENTORY_INPUT_ZIP_CODE_SEARCH_BUTTON = "//button[@class='cta-button cta-1']";

    //Special Offers Button
    public static final String WEB_ELEMENT_SEE_SPECIAL_OFFERS_BUTTON = "//a[contains(.,'See Special Offers')]";

    //
    public static final String WEB_ELEMENT_MORE_INFORMATION_LINK = "//a[@href='#!/fs-apr-36month']/span[@class='label-2--bold underline-dark']";

    public static final String WEB_ELEMENT_SELECT_SERIES_X1 = "//nav[@class='globalnav-footer__series-select-nav']//a[contains(.,'X1')]";
    public static final String WEB_ELEMENT_SELECT_SERIES_X1_PRICING_AND_FEATURES = "//a[contains(.,'Pricing & Features')]";
    public static final String WEB_ELEMENT_SELECT_SERIES_X1_PRICING_AND_FEATURES_SELECT_CAR_COLOR = "//button[@class='color-selector-button selected']";


    public static final String WEB_ELEMENT_BMW_VERIFIED_LEARN_MORE = "[analytics-event='certified-preowned.protection-program.learn-more.button']";

    //SedanBuild
    public static final String WEB_ELEMENT_BMW_START_DESIGNING_SEDAN_3 = "//a[@href='/build-your-own.html#/series/3/sedan']";
    public static final String WEB_ELEMENT_BMW_START_DESIGNING_BUTTON = "//a[@href='#/studio/213O']";
    public static final String WEB_ELEMENT_BMW_START_DESIGNING_EXTERIOR = "//a[contains(.,'Exterior')]";
 //   public static final String WEB_ELEMENT_BMW_START_DESIGNING_EXTERIOR_COLOR_RED = "//div[@class='byo-rail-option-base selected']//div[@class='name byo-core-type label-2 theme-core']";
    public static final String WEB_ELEMENT_BMW_START_DESIGNING_EXTERIOR_COLOR_RED = "//div[@class='byo-rail-option-base selected']//div[@class='name byo-core-type label-2 theme-core']";

    //Concept Vehicles
    public static final String WEB_ELEMENT_BMW_FOOTER_LINK_CONCEPT_VEHICLES = "//footer[@class='globalnav-footer']//a[contains(.,'Concept Vehicles')]";
}
