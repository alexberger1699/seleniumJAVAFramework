package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends BaseTest{


        @Test(dataProvider = "dataProvider")
        public void  openGoogleComInChromeTest1(String text) throws InterruptedException {
//                steps.executeSearchByKeyword(text)
//                        .verifyThatTopResultContainCorrectText("The Selenium Browser Automation Project")
//                        .verifyThatTopResultContainProperAttributeText("LC20lb MBeuO DKV0Md");


        }





}
