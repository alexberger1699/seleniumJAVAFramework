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


                SearchPage searchPage = new SearchPage();
                searchPage.fillSearchField(text);
                searchPage.pressEnter();
                Thread.sleep(3000);
                SearchResultsPage searchResultPage= new SearchResultsPage();
                searchResultPage.assertThatTopResultContainsCorrectText("The Selenium Browser Automation Project");
                searchResultPage.assertThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");

        }



        @DataProvider(name = "dataProvider")
        public Object[][] dataProviderMethod(){
                return new Object[][] {{"selenium java"}, {"selenium javascript"}};

        }

}
