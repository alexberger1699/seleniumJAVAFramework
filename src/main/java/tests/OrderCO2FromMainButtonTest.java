package tests;

import org.testng.annotations.Test;
import pages.OrderCO2FromMainButtonPage;

public class OrderCO2FromMainButtonTest extends BaseTest{



    @Test
    public void orderCO2FromTheSite() throws InterruptedException {
        OrderCO2FromMainButtonPage orderCO2FromMainButtonPage = new OrderCO2FromMainButtonPage();

        orderCO2FromMainButtonPage.openOrderFormForDisposableBaloonCO2("הזמנת מכלי הגזה");

    }

}
