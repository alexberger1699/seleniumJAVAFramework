import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.io.File;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class SearchTest {
        @Test
        public void  openGoogleComInChromeTest() throws InterruptedException {
                File file = new File("/Users/alex/seleniumFramework/src/resources/chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                WebDriver driver = new ChromeDriver();
                driver.navigate().to("https://www.google.com/");
                System.out.println(driver.getTitle());
                WebElement searchField = driver.findElement(By.name("q"));

                searchField.click();
                searchField.sendKeys("selenium java");
                searchField.sendKeys(Keys.RETURN);
                Thread.sleep(3000);
                WebElement resultRow = driver.findElement(By.xpath("//div[@class='yuRUbf']//h3"));
                assertTrue(resultRow.isDisplayed(),"Element has not been displayed");
                assertEquals(resultRow.getText(), "The Selenium Browser Automation Project");
                assertEquals(resultRow.getAttribute("class"), "LC20lb MBeuO DKV0Md");
                driver.quit();
        }



        }
