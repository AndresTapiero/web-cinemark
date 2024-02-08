package com.andrest.tasks;

import com.andrest.interactions.DropDownOption;
import com.andrest.interactions.EnterDataAfterClick;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;
import java.util.Map;

import static com.andrest.targets.PaymentTargets.*;
import static com.andrest.targets.PaymentTargets.CVV;
import static com.andrest.targets.SelectMovieTargets.CONTINUE_BUTTON;
import static com.andrest.utils.CustomTargets.withValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PaymentForm implements Task {

    List<Map<String, String>> payTable;
    public PaymentForm(List<Map<String, String>> payTable) {
        this.payTable = payTable;
    }
    public static PaymentForm fill(List<Map<String, String>> payTable) {
        return Instrumented.instanceOf(PaymentForm.class).withProperties(payTable);
    }

    @Override
    @Step("{0}  fill payment form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ADD_CREDIT_CARD, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ADD_CREDIT_CARD),
                EnterDataAfterClick.input(payTable.get(0).get("cardNumber"), CARD_NUMBER_INPUT),
                EnterDataAfterClick.input(payTable.get(0).get("cardName"), CARD_NAME_INPUT),
                //Year
                Click.on(CARD_EXPIRATION_INPUT),
                WaitUntil.the(SELECT_YEAR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECT_YEAR),
                Click.on(YEAR),
                Click.on(MONTH),
                //cvv
                EnterDataAfterClick.input(payTable.get(0).get("cardCvv"), CVV),
                DropDownOption.from(withValue(payTable.get(0).get("cardQuotas")), QUOTAS_INPUT),
                Click.on(TERMS_BUY),
                Click.on(CONTINUE_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(TITLE_SURE_BUY, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ACCEPT_BUTTON),
                WaitUntil.the(WAITING, isVisible())
        );
    }
}
