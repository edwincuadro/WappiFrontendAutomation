package com.wappi.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappi.qa.userInterfaces.Home.HOME;

public class BackHome implements Task {
    @Override
    public <T extends Actor> void performAs(T actorGoesHome) {
        actorGoesHome.attemptsTo(Click.on(HOME));
    }
    public static BackHome goHome(){
        return new BackHome();
    }
}
