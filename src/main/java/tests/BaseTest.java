package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;

public class BaseTest {


    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }
        @BeforeClass
    public void setup(){
        File file = new File("/Users/alex/seleniumFramework/src/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

    }

    @AfterMethod
    public void tearDown(){
        driver.navigate().back();
       // driver.quit();

    }

}
