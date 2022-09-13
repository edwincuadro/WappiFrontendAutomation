package com.wappi.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static final Target HOME = Target
            .the("Validate home").located(By.xpath("//a[normalize-space()='Inicio']"));

    public static final Target PERSONAL_INFORMATION = Target
            .the("Select personal information").located(By.xpath("//a[normalize-space()='Información personal']"));
}
