package com.wappi.qa.steps.user;

import com.wappi.qa.models.Credentials;
import com.wappi.qa.models.ProfileData;
import com.wappi.qa.questions.ConfirmUpdate;
import com.wappi.qa.tasks.GetLogin;
import com.wappi.qa.tasks.OpenBrowser;
import com.wappi.qa.tasks.UpdateProfile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.wappi.qa.userInterfaces.PersonalInformation.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class UpdateProfileSteps {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setMyBrowser(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Wappi user");
    }
    @Given("^user open the site$")
    public void userOpenTheSite() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenBrowser.getUpBrowser());
    }

    @When("^user input correct credentials$")
    public void userInputCorrectCredentials(List<Credentials> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(GetLogin.login(data.get(0)));
    }
    @When("^user input the information to update$")
    public void userInputTheInformationToUpdate(List<ProfileData> dataProfile) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateProfile.updateProfile(dataProfile.get(0)));
        myBrowser.findElement(IMAGE_BUTTON).sendKeys("C:\\Users\\cuadr\\Downloads\\profileWappi.jpg");
        Select dropDown = new Select(myBrowser.findElement(COUNTRY_FIELD));
        dropDown.selectByVisibleText("Colombia");
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(SAVE_BUTTON));
    }

    @Then("^user can see the confirmation message (.*)$")
    public void userCanSeeTheConfirmationMessage(String confirmMessage) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmUpdate.updateConfirm(), org.hamcrest.Matchers.is(confirmMessage)));
    }

}
