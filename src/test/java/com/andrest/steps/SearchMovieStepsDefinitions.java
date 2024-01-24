package com.andrest.steps;

import com.andrest.tasks.LoginForm;
import com.andrest.tasks.PaymentForm;
import com.andrest.tasks.SelectComb;
import com.andrest.tasks.SelectMovie;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static com.andrest.targets.BillboardTargets.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SearchMovieStepsDefinitions {

    @And("log in with correct credentials")
    public void login() {
        theActorInTheSpotlight().attemptsTo(
                LoginForm.fill()
        );
    }

    @And("select city")
    public void selectCity() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(DROP_CITY),
                Click.on(SELECT_CITY)
        );
    }


    @When("select a movie")
    public void selectMovie() {
        theActorInTheSpotlight().attemptsTo(
                SelectMovie.selectFirst()
        );
    }

    @And("select a comb")
    public void selectComb() {
        theActorInTheSpotlight().attemptsTo(
                SelectComb.selectMyComb()
        );
    }

    @And("add the payment method")
    public void addPaymentMethod() {
        theActorInTheSpotlight().attemptsTo(
                PaymentForm.fill()
        );
    }

    @Then("can see the billboard view")
    public void seeScreen() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(BILLBOARD_TITLE, isVisible())
        );
    }
}
