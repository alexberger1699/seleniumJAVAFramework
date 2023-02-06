package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

import java.io.File;

import static org.openqa.selenium.remote.Browser.CHROME;
import static org.openqa.selenium.remote.Browser.SAFARI;


public class DriverFactory {


    private static WebDriver driver;
    private final static String DRIVER_PATH = "/Users/alex/seleniumFramework/src/resources/";

    public static WebDriver getDriver(utils.Browser browser) {
        File file;

        switch (browser) {

            case CHROME:
                file = new File(DRIVER_PATH + "chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                break;

            case SAFARI:


                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browser);
        }



        driver.manage().window().maximize();
        return driver;

    }
}
