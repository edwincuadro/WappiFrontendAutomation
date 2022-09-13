package com.wappi.qa.tasks;

import com.wappi.qa.models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.wappi.qa.userInterfaces.Login.PASSWORD_FIELD;
import static com.wappi.qa.userInterfaces.Login.USERNAME_FIELD;

public class GetLogin implements Task {

    private Credentials credentials;
    public GetLogin(Credentials credentials){
        this.credentials = credentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(USERNAME_FIELD));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(PASSWORD_FIELD).thenHit(Keys.ENTER));

    }
    public static GetLogin login(Credentials credentials){
        return new GetLogin(credentials);
    }
}
