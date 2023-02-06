package steps;

import pages.OrderCO2FromMainButtonPage;
import pages.SearchPage;

public class OrderDisposableCO2BaloonsSteps {

    private OrderCO2FromMainButtonPage orderCO2FromMainButtonPage = new OrderCO2FromMainButtonPage();

    public OrderDisposableCO2BaloonsSteps verifyTitleOfOrderPage(String expected) {
        orderCO2FromMainButtonPage.verifyTitleOnOrderPage(expected);
        return this;

            }

    }
