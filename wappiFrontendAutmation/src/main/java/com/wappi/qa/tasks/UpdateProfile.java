package com.wappi.qa.tasks;

import com.wappi.qa.models.ProfileData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.wappi.qa.userInterfaces.Home.PERSONAL_INFORMATION;
import static com.wappi.qa.userInterfaces.PersonalInformation.*;

public class UpdateProfile implements Task {

    private ProfileData profileData;
    public UpdateProfile(ProfileData profileData){
        this.profileData = profileData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PERSONAL_INFORMATION));
        actor.attemptsTo(Enter.theValue(profileData.getName()).into(NAME_FIELD));
        actor.attemptsTo(Enter.theValue(profileData.getLastName()).into(LAST_NAME_FIELD));
        actor.attemptsTo(Enter.theValue(profileData.getBirth()).into(BORN_DATE_FIELD));
        actor.attemptsTo(Click.on(F_CHOOSE));
    }
    public static UpdateProfile updateProfile(ProfileData profileData){
        return new UpdateProfile(profileData);
    }
}
