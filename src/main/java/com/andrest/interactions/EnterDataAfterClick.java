package com.andrest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterDataAfterClick implements Interaction {

    private final String text;

    private final Target inputLocator;

    public EnterDataAfterClick(String text, Target element) {
        this.text = text;
        this.inputLocator = element;
    }


    public static EnterDataAfterClick input(String text, Target element) {
        return Tasks.instrumented(EnterDataAfterClick.class, text, element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(inputLocator, isVisible()),
                Click.on(inputLocator),
                Enter.theValue(text).into(inputLocator)
        );
    }
}
