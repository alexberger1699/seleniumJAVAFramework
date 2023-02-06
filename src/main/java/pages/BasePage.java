package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.SearchSteps;
import tests.BaseTest;

import static tests.BaseTest.getDriver;

public abstract class BasePage {
     private static WebDriver driver;


    public BasePage(){
        this.driver = getDriver();
        PageFactory.initElements(driver, this);

    }
}
