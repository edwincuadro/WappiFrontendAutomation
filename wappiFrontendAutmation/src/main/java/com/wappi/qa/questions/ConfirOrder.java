package com.wappi.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wappi.qa.userInterfaces.Offer.CONFIRM_MESSAGE;

public class ConfirOrder implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CONFIRM_MESSAGE), WebElementStateMatchers.isVisible()));
        return Text.of(CONFIRM_MESSAGE).viewedBy(actor).asString();
    }
    public static ConfirOrder confirmOrder(){
        return new ConfirOrder();
    }
}
