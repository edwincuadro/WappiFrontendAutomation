package com.wappi.qa.tasks;

import com.wappi.qa.userInterfaces.Coupon;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappi.qa.userInterfaces.Coupon.*;
import static com.wappi.qa.userInterfaces.Home.HOME;
import static com.wappi.qa.userInterfaces.Offer.CONFIRM_ORDER;
import static com.wappi.qa.userInterfaces.Offer.PRODUCT_1;

public class CouponOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GET_COUPON));
        String couponCode = BrowseTheWeb.as(actor).findBy(COUPON_CODE.getCssOrXPathSelector()).getText(); //Para copiar
        actor.attemptsTo(Click.on(CLOSE_CODE));
        actor.attemptsTo(Click.on(HOME));
        actor.attemptsTo(Click.on(PRODUCT_1));
        actor.attemptsTo(Enter.theValue(couponCode).into(COUPON_FIELD));//Para pegar
        actor.attemptsTo(Click.on(CONFIRM_ORDER));
    }
    public static CouponOrder couponOrder(){
        return new CouponOrder();
    }
}
