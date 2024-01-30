package com.andrest.steps;

import com.andrest.tasks.LoginForm;
import com.andrest.tasks.PaymentForm;
import com.andrest.tasks.SelectComb;
import com.andrest.tasks.SelectMovie;
import com.andrest.utils.DropDownOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static com.andrest.targets.BillboardTargets.*;
import static com.andrest.targets.PaymentTargets.*;
import static com.andrest.utils.CustomTargets.withQuotaValue;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SearchMovieStepsDefinitions {

    @And("log in with correct credentials:")
    public void login(List<Map<String, String>> loginTable) {
        theActorInTheSpotlight().attemptsTo(
                LoginForm.fill(loginTable)
        );
    }

    @And("select city {string}")
    public void selectCity(String city) {
        theActorInTheSpotlight().attemptsTo(
                DropDownOption.from(withQuotaValue(city), DROP_CITY)
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

    @And("add the payment method with the following data:")
    public void addPaymentMethod(List<Map<String, String>> payTable) {
        theActorInTheSpotlight().attemptsTo(
                PaymentForm.fill(payTable)
        );
    }

    @Then("can see the billboard view")
    public void seeScreen() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CODE_CONFIRMATION, isVisible()).forNoMoreThan(90).seconds(),
                Click.on(FINISH_BUY),
                WaitUntil.the(BILLBOARD_BOGOTA_TITLE, isVisible()).forNoMoreThan(15).seconds()
        );
    }
}
