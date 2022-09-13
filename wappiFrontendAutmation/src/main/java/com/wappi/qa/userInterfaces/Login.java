package com.wappi.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target USERNAME_FIELD = Target
            .the("Username field").located(By.id("username"));

    public static final Target PASSWORD_FIELD = Target
            .the("Password field").located(By.id("password"));
}
