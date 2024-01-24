package com.andrest.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.andrest.targets.PaymentTargets.*;
import static com.andrest.targets.PaymentTargets.CVV;
import static com.andrest.targets.SelectMovieTargets.CONTINUE_BUTTON;
import static com.andrest.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PaymentForm implements Task {
    public static PaymentForm fill() {
        return Instrumented.instanceOf(PaymentForm.class).newInstance();
    }

    @Override
    @Step("{0}  fill payment form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ADD_CREDIT_CARD, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ADD_CREDIT_CARD),

                Enter.theValue(CARD_NUMBER.getValue()).into(CARD_NUMBER_INPUT),
                Enter.theValue(CARD_NAME.getValue()).into(CARD_NAME_INPUT),

                //Año
                Click.on(CARD_EXPIRATION_INPUT),
                Click.on(SELECT_YEAR),
                Click.on(YEAR),
                Click.on(MONTH),



                Enter.theValue(CARD_CVV.getValue()).into(CVV),
                Click.on(QUOTAS_INPUT),
                Click.on(QUOTA),
                Click.on(TERMS_BUY),
                Click.on(CONTINUE_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(TITLE_SURE_BUY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ACCEPT_BUTTON),
                WaitUntil.the(WAITING, isVisible())
        );
    }
}
