package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.assertj.core.api.Assertions.assertThat;




public class OrderCO2FromMainButtonPage extends BasePage{
    public OrderCO2FromMainButtonPage(){
        super();

    }


    @FindBy(xpath = "//img[@src = 'https://www.tami4.co.il/sites/default/files/2021-07/Soda%202_0.png']")
    private WebElement orderCO2MainButton;

    @FindBy(xpath = "//h1[@class = 'ui_headline__UI_HeadlineMainTitle_h1-sc-1lxlbd8-2 gjSBpQ' ]")
    private WebElement orderCO2PageTitleElement;

    @FindBy(xpath = "//*[text()[contains(.,'חד פעמי')]]")
    private WebElement oneTimeUseBaloonButton;

    @FindBy(xpath = "//*[text()[contains(.,'4 מכלים ב- 145')]]")
    private WebElement oneTimeUse4BaloonOrderButton;

    @FindBy(xpath = "//*[text()[contains(.,'לסיכום הזמנה')]]")
    private WebElement endOrderButton;

    //Open site for ordering inventory for Tami4 water bar
    public void openOrderFormForOneUseBaloonCO2(String expected) throws InterruptedException {
        Thread.sleep(3000);
        orderCO2MainButton.click();
        Thread.sleep(3000);
        assertThat(orderCO2PageTitleElement.getText()).as("Wrong title").isEqualTo(expected);
        oneTimeUseBaloonButton.click();
        oneTimeUse4BaloonOrderButton.click();
        Thread.sleep(3000);
        endOrderButton.click();
    }
}
