package com.wappi.qa.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappi.qa.userInterfaces.Offer.CONFIRM_ORDER;

public class ConfirmOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(6000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(CONFIRM_ORDER));
    }
    public static ConfirmOrder confirmOrder(){
        return new ConfirmOrder();
    }
}
