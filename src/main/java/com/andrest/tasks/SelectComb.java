package com.andrest.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.userinterfaces.SelectMovieTargets.*;
import static com.andrest.userinterfaces.SelectMovieTargets.CONTINUE_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectComb implements Task {
    public static SelectComb selectMyComb() {
        return Instrumented.instanceOf(SelectComb.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CONFECTIONERY, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(MY_COMB_MORE),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(TOTAL_TITLE, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CONTINUE_BUTTON)
        );
    }
}
