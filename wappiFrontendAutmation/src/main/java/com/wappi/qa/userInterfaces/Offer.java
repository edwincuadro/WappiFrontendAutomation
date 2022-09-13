package com.wappi.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Offer {
    public static final Target PRODUCT_1 = Target.
            the("Product 1").located(By.xpath("(//tr[@id='offer-0']//button[@class='button success offers-table-block-button'])[1]"));
    public static final Target CONFIRM_ORDER = Target.
            the("Confirm order").located(By.id("order-confirm"));

    public static final Target CONFIRM_MESSAGE = Target.
            the("Confirm message").located(By.xpath("//p[@class='confirmation-modal-info']"));
}
