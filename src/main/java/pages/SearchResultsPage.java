package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage{

    @FindBy(xpath = "//div[@class='yuRUbf']//h3")
    private WebElement resultRow;
    public SearchResultsPage() {
        super();
    }
    public void assertThatTopResultContainsCorrectText(String expected){
        assertThat(resultRow.getText()).as("Element has not been displayed").isEqualTo(expected);
        assertThat(resultRow.isDisplayed()).as("Element has not been displayed").isTrue();
    }
    public void assertThatTopResultContainsProperAttributeText(String expected){
        assertThat(resultRow.getAttribute("class")).as("Element has not been displayed").contains(expected);
    }
}
