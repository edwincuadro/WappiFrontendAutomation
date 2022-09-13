package com.wappi.qa.steps.user;

import com.wappi.qa.models.Credentials;
import com.wappi.qa.tasks.BackHome;
import com.wappi.qa.tasks.GetLogin;
import com.wappi.qa.tasks.OpenBrowser;
import com.wappi.qa.tasks.SelectProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.wappi.qa.userInterfaces.Coupon.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CouponOrderSteps {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setMyBrowser(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Wappi user");
    }
    @Given("^user open the page$")
    public void userOpenTheSite() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenBrowser.getUpBrowser());
    }

    @When("^user input correct credential$")
    public void userInputCorrectCredentials(List<Credentials> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(GetLogin.login(data.get(0)));
    }
    @When("^user get coupon order a product$")
    public void userGetCouponOrderAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(GET_COUPON));
        Actions a = new Actions(myBrowser);
        WebElement code = myBrowser.findElement(COUPON_CODE);
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(COUPON_CODE));
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(COUPON_CODE));
        a.doubleClick(code).build().perform();
        a.keyDown(Keys.CONTROL).sendKeys("a");
        a.sendKeys("c");
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(CLOSE_CODE));
        OnStage.theActorInTheSpotlight().attemptsTo(BackHome.goHome());
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.order());
        WebElement pay = myBrowser.findElement(COUPON_FIELD);
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(COUPON_FIELD));
        a.doubleClick(pay).keyDown(Keys.CONTROL).sendKeys("v");
        a.keyUp(Keys.CONTROL).build();

    }

    @When("^use the coupon to pay$")
    public void useTheCouponToPay() {

    }

    @Then("^user can see order confirmation$")
    public void userCanSeeTheConfirmationMessage() {

    }
}
