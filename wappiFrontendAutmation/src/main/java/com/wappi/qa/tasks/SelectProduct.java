package com.wappi.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappi.qa.userInterfaces.Offer.PRODUCT_1;

public class SelectProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCT_1));
    }
    public static SelectProduct order(){
        return new SelectProduct();
    }
}
