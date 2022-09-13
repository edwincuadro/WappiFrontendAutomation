package com.wappi.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformation {

    public static final By IMAGE_BUTTON = By.xpath("//input[@id='image']");

    public static final Target NAME_FIELD = Target.
            the("Name field").located(By.id("name"));

    public static final Target LAST_NAME_FIELD = Target.
            the("Last name field").located(By.id("lastName"));

    public static final Target BORN_DATE_FIELD = Target.
            the("Last name field").located(By.id("bornDate"));

    public static final By COUNTRY_FIELD = By.id("country");

    public static final Target F_CHOOSE = Target.
            the("Female choose").located(By.id("F"));

    public static final Target M_CHOOSE = Target.
            the("Male choose").located(By.id("M"));

    public static final Target SAVE_BUTTON = Target.
            the("Save button").located(By.id("save-profile"));

    public static final Target SAVE_CONFIRM = Target.
            the("Save confirmation").located(By.className("confirmation-modal-info"));
}
