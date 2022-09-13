package com.wappi.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wappi.qa.userInterfaces.PersonalInformation.SAVE_CONFIRM;

public class ConfirmUpdate implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((SAVE_CONFIRM), WebElementStateMatchers.isVisible()));
        return Text.of(SAVE_CONFIRM).viewedBy(actor).asString();
    }
    public static ConfirmUpdate updateConfirm(){
        return new ConfirmUpdate();
    }
}
