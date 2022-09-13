package com.wappi.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Coupon {
    public static final Target GET_COUPON = Target
            .the("Get coupon").located(By.id("welcome-coupon"));

    public static final By COUPON_CODE = By.xpath("//span[@id='coupon-code']");

    public static final Target CLOSE_CODE = Target
            .the("Close code").located(By.xpath("//div[@id='coupon-modal']//span[@class='close'][normalize-space()='×']"));

    public static final By COUPON_FIELD = By.xpath("//input[@id='coupon']");
}
