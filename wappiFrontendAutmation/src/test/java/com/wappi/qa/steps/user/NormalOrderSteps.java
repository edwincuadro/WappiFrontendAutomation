package com.wappi.qa.steps.user;

import com.wappi.qa.questions.ConfirOrder;
import com.wappi.qa.tasks.ConfirmOrder;
import com.wappi.qa.tasks.SelectProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class NormalOrderSteps {
    @When("^user click choose a product and confirm the order$")
    public void userClickChooseAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.order());
        OnStage.theActorInTheSpotlight().attemptsTo(ConfirmOrder.confirmOrder());
    }

    @Then("^user can see order's confirmation (.*)$")
    public void userCanSeeOrderSConfirmation(String orderConfirmation){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirOrder.confirmOrder(), org.hamcrest.Matchers.is(orderConfirmation)));
    }
}
