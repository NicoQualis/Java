package com.aleph.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    protected static WebDriver driver;

    static String TYPE_DRIVER_CHROME = "webdriver.chrome.driver";
    static String PATH_DRIVER_CHROME = "src/test/resources/v96/chromedriver.exe";
    static String TYPE_DRIVER_FIREFOX = "webdriver.gecko.driver";
    static String PATH_DRIVER_FIREFOX = "src/test/resources/v96/geckodriver.exe";
    static String TYPE_DRIVER_EDGE = "webdriver.edge.driver";
    static String PATH_DRIVER_EDGE = "src/test/resources/v96/msedgedriver.exe";
    static String TYPE_DRIVER_OPERA = "webdriver.opera.driver";
    static String PATH_DRIVER_OPERA = "src/test/resources/v96/operadriver.exe";


    public static void initializeChrome() {
        System.setProperty(TYPE_DRIVER_CHROME, PATH_DRIVER_CHROME);


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security");
        options.addArguments("--disable-site-isolation-trials");
        //chromeOptions.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    public static void initializeFirefox() {
        System.setProperty(TYPE_DRIVER_FIREFOX, PATH_DRIVER_FIREFOX);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1920, 1080));
    }
    public static void initializeEdge() {
        System.setProperty(TYPE_DRIVER_EDGE, PATH_DRIVER_EDGE);
        driver = new EdgeDriver();
    }
    public static void initializeOpera() {
        System.setProperty(TYPE_DRIVER_OPERA, PATH_DRIVER_OPERA);
        driver = new OperaDriver();
    }

    public static void afterClass() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
