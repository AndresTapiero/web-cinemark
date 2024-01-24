package com.andrest.steps;

import com.andrest.tasks.RegisterForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.andrest.navigation.NavigateTo;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.targets.AlertTargets.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterStepDefinition {

    @Given("{actor} is on the main page")
    public void searchMovie(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
        closeBannerView(actor);
    }


    @Step("close location view")
    private void closeBannerView(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(CLOSE_REDEBAN_BUTTON, isVisible()).forNoMoreThan(10).seconds()
        );
        actor.attemptsTo(
                Click.on(CLOSE_REDEBAN_BUTTON),
                WaitUntil.the(BILLBOARD_TITLE, isVisible())
        );
    }

    @When("create a new user")
    public void createNewUser() {
        createNewAccount();
    }



    @Step("create account")
    private void createNewAccount(){
        theActorInTheSpotlight().attemptsTo(
                RegisterForm.fill()
        );
    }

    @Then("see the billboard view")
    public void seeScreen() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(BILLBOARD_TITLE, isVisible())
        );
    }
}
