package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import steps.SearchSteps;

import java.io.File;

public class BaseTest {


    public static WebDriver driver;
   // SearchSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }


        @BeforeMethod
        public void setup(){
        File file = new File("/Users/alex/seleniumFramework/src/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.navigate().to("https://www.tami4.co.il/");
    //    steps = new SearchSteps();

    }
//
//    @AfterMethod
//    public void tearDown(){
//        //driver.navigate().back();
//       //driver.quit();
//
//    }
    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod(){
        return new Object[][] {{"selenium java"}, {"selenium javascript"}};

    }
}
