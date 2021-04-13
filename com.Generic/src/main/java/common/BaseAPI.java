package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseAPI {

        public static WebDriver driver;
        public static WebDriverWait driverWait;
        public DataReader dataReader;
        public static Actions actions;
        public Properties properties;

        String propertiesFilePath = "src/main/resources/secret.properties";

        public BaseAPI() {

//        try {
//            properties = new Properties();
//            FileInputStream fis = new FileInputStream(propertiesFilePath);
//            properties.load(fis);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

            try {
                dataReader = new DataReader();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        // Parameterization via .xml runner files in each module
        @Parameters({"browserName", "browserVersion", "url"})
        @BeforeMethod
        public static void setUp(@Optional("chrome") String browserName, @Optional("90") String browserVersion,
                                 @Optional("") String url) {

            driver = getLocalDriver(browserName);
            driverWait = new WebDriverWait(driver, 10);
            driver.get(url);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }

        @AfterMethod(alwaysRun = true)
        public static void tearDown() {
            driver.close();
            driver.quit();
        }

        // Method to get local driver, based on the browserName parameter in testNG.xml runner file
        public static WebDriver getLocalDriver(String browserName) {
            if (browserName.toLowerCase().equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserName.toLowerCase().equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browserName.toLowerCase().equals("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } else if (browserName.toLowerCase().equals("opera")) {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
            } else if (browserName.toLowerCase().equals("ie")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            }

            return driver;
        }

        /**
         * Helper Methods
         */

        public void sendKeysToElement(WebElement element, String keysToSend) {

            try {
                driverWait.until(ExpectedConditions.visibilityOf(element));
                element.sendKeys(keysToSend);

            } catch (StaleElementReferenceException staleElementReferenceException) {
                staleElementReferenceException.printStackTrace();
                System.out.println("ELEMENT IS STALE");

            } catch (ElementNotVisibleException elementNotVisibleException) {
                elementNotVisibleException.printStackTrace();
                System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("UNABLE TO SEND KEYS TO WEB ELEMENT");
            }
        }

        public void clickElement(WebElement elementToClick) {

            try {
                driverWait.until(ExpectedConditions.elementToBeClickable(elementToClick));
                elementToClick.click();
            } catch (StaleElementReferenceException staleElementReferenceException) {
                staleElementReferenceException.printStackTrace();
                System.out.println("ELEMENT IS STALE");

            } catch (ElementNotVisibleException elementNotVisibleException) {
                elementNotVisibleException.printStackTrace();
                System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("UNABLE TO CLICK ON WEB ELEMENT");
            }
        }

        public String getTextFromElement(WebElement element) {
            String elementText = "";

            driverWait.until(ExpectedConditions.visibilityOf(element));

            try {
                elementText = element.getText();
                return elementText;
            } catch (StaleElementReferenceException staleElementReferenceException) {
                staleElementReferenceException.printStackTrace();
                System.out.println("ELEMENT IS STALE");
            } catch (ElementNotVisibleException elementNotVisibleException) {
                elementNotVisibleException.printStackTrace();
                System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("UNABLE TO GET TEXT FROM WEB ELEMENT");
            }

            return elementText;
        }

        public String getAttributeFromElement(WebElement element, String attribute) {
            String elementText = "";

            driverWait.until(ExpectedConditions.visibilityOf(element));

            try {
                elementText = element.getAttribute(attribute);
                return elementText;
            } catch (StaleElementReferenceException staleElementReferenceException) {
                staleElementReferenceException.printStackTrace();
                System.out.println("ELEMENT IS STALE");
            } catch (ElementNotVisibleException elementNotVisibleException) {
                elementNotVisibleException.printStackTrace();
                System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("UNABLE TO GET ATTRIBUTE FROM WEB ELEMENT");
            }

            return elementText;
        }

        public List<WebElement> getListOfWebElements(By by) {
            List<WebElement> elementList = new ArrayList<>();

            driverWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(by)));

            try {
                elementList = driver.findElements(by);
                return elementList;
            } catch (StaleElementReferenceException staleElementReferenceException) {
                staleElementReferenceException.printStackTrace();
                System.out.println("ELEMENTS ARE STALE");
            } catch (ElementNotVisibleException elementNotVisibleException) {
                elementNotVisibleException.printStackTrace();
                System.out.println("ELEMENTS ARE NOT VISIBLE IN THE DOM");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("UNABLE TO LOCATE WEB ELEMENTS");
            }

            return elementList;
        }

        /**
         * Assertion Helper Methods
         */

        public boolean compareStrings(String str1, String str2) {
            boolean flag = false;

            if (str1.toLowerCase().equals(str2)) {
                flag = true;
                return flag;
            }

            return flag;
        }

        // Gets text from List<WebElements> and compares against expected String array from Excel workbook
        public boolean compareAttributeListToExpectedStringArray(By by, String attribute, String path, String sheetName) throws IOException {
            List<WebElement> actualList = driver.findElements(by);
            String[] expectedList = dataReader.fileReaderStringXSSF(path, sheetName);

            String[] actual = new String[actualList.size()];

            for (int j = 0; j < actualList.size(); j++) {
                actual[j] = actualList.get(j).getAttribute(attribute).replaceAll("&amp;", "&").replaceAll("’", "'").replaceAll("<br>", "\n").trim();
                actual[j].replaceAll("&amp;", "&").replaceAll("’", "'").replaceAll("<br>", "\n").trim();
//            escapeHtml4(actual[j]);
//            escapeHtml3(actual[j]);
            }

            int falseCount = 0;
            boolean flag = false;

            for (int i = 0; i < expectedList.length; i++) {
                if (actual[i].equalsIgnoreCase(expectedList[i])) {
                    flag = true;
                    System.out.println("ACTUAL " + attribute.toUpperCase() + " " + (i + 1) + ": " + actual[i]);
                    System.out.println("EXPECTED " + attribute.toUpperCase() + " " + (i + 1) + ": " + expectedList[i] + "\n");
                } else {
                    System.out.println("FAILED AT INDEX " + (i + 1) + "\nEXPECTED " + attribute.toUpperCase() + ": " + expectedList[i] +
                            "\nACTUAL " + attribute.toUpperCase() + ": " + actual[i] + "\n");
                    falseCount++;
                }
            }
            if (falseCount > 0) {
                flag = false;
            }
            return flag;
        }


//    public static WebDriver driver;
//    static final String URL = "https://www.airbnb.com/";
//
//    @BeforeMethod
//    public static void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get(URL);
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod
//    public static void tearDown() {
//        driver.close();
//        driver.quit();
//    }

        //use if click interception pops up as error

        public void clickByXpathUsingJavaScript(String locator) {
            WebDriverWait wait10 = new WebDriverWait(driver, 20);
            WebElement element = driver.findElement(By.xpath(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", element);

        }

        public void clickByCssSelectorUsingJavaScript(String locator) {
            WebDriverWait wait10 = new WebDriverWait(driver, 20);
            WebElement element = driver.findElement(By.cssSelector(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", element);

        }

        public void typeOnElement(String locator, String value) {
            try {
                driver.findElement(By.cssSelector(locator)).sendKeys(value);
            } catch (Exception ex) {
                driver.findElement(By.xpath(locator)).sendKeys(value);
            }
        }

        //Helper Method

        public void WebWaitUntilClickByXpath(int seconds, String loc) {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc)));
            driver.findElement(By.xpath(loc)).click();
        }

        public void scrollToElementJScript(WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor) driver;

            try {
                js.executeScript("arguments[0].scrollIntoView();", element);
            } catch (NoSuchElementException e) {
                System.out.println("NO SUCH ELEMENT - " + element);
                e.printStackTrace();
            } catch (StaleElementReferenceException e) {
                System.out.println("STALE ELEMENT - " + element);
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("COULD NOT SCROLL TO ELEMENT - " + element);
                e.printStackTrace();
            }
        }

        // looking at actual and then look at the expected  (It will do  the assertion)

        public void assertEqualsGetTitle(String expected) {
            String actual = driver.getTitle();
            Assert.assertEquals(actual, expected, "\n*** Test Failed - Try Again ***");
        }

        public void waitForElementToBeClickable(WebElement element) {
            try {
                driverWait.until(ExpectedConditions.elementToBeClickable(element));

            } catch (ElementNotInteractableException elementNotInteractableException) {
                elementNotInteractableException.printStackTrace();
                System.out.println("ELEMENT NOT INTERACTABLE");

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("UNABLE TO LOCATE ELEMENT");
            }
        }
        public void waitForElementToBeSelected(WebElement element) {
            try {
                driverWait.until(ExpectedConditions.elementSelectionStateToBe(element, true));

            } catch (ElementNotInteractableException elementNotInteractableException) {
                elementNotInteractableException.printStackTrace();
                System.out.println("ELEMENT NOT INTERACTABLE");

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("UNABLE TO LOCATE ELEMENT");
            }
        }

        public void selectElement(WebElement elementToSelect) {
            waitForElementToBeClickable(elementToSelect);
            clickElement(elementToSelect);
        }

        public boolean isElementSelected(WebElement element) {
            boolean flag = false;

            try {
                waitForElementToBeSelected(element);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("UNABLE TO DETERMINE IF ELEMENT IS SELECTED");
            }

            if (element.isSelected()) {
                flag = true;
                return flag;
            }

            return flag;
        }

        ////////////////////////////////////////////////////////////////////////////////////

        public void hoverOverElement(WebElement elementToHoverOver) {
            try {
                waitForVisibilityOfElement(elementToHoverOver);
                actions.moveToElement(elementToHoverOver).build().perform();

            } catch (ElementNotInteractableException elementNotInteractableException) {
                elementNotInteractableException.printStackTrace();
                System.out.println("ELEMENT IS NOT INTERACTABLE");

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("UNABLE TO HOVER OVER ELEMENT");
            }
        }

        public void waitForVisibilityOfElement(WebElement element) {
            try {
                driverWait.until(ExpectedConditions.visibilityOf(element));

            } catch (ElementNotVisibleException elementNotVisibleException) {
                elementNotVisibleException.printStackTrace();
                System.out.println("ELEMENT NOT VISIBLE");

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("UNABLE TO LOCATE ELEMENT");
            }
        }

       public void waitUntilClickable(String locator){
           WebDriverWait wait = new WebDriverWait(driver, 20);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
       }

        public void basicHoverUsingXpath(String loc) {
            //Hover over Like-New Cams link using Actions
            WebElement ele = driver.findElement(By.xpath(loc));
            //Creating object of an Actions class
            Actions action = new Actions(driver);
            //Performing the mouse hover action on the target element.
            action.moveToElement(ele).perform();


        }

        public void implicitWait(){
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }




    }
