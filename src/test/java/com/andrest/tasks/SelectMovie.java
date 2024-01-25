package com.andrest.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.targets.AlertTargets.*;
import static com.andrest.targets.AlertTargets.CONFIRM_BUTTON;
import static com.andrest.targets.BillboardTargets.*;
import static com.andrest.targets.SelectMovieTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectMovie implements Task {
    public static SelectMovie selectFirst() {
        return Instrumented.instanceOf(SelectMovie.class).newInstance();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BILLBOARD_BOGOTA_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(FIRST_MOVIE),
                WaitUntil.the(ORIGINAL_TITLE, isVisible()),
                Click.on(SELECT_HOUR),
                WaitUntil.the(CONFIRM_BUTTON, isVisible()),
                Click.on(CONFIRM_BUTTON)
        );


        actor.attemptsTo(
                WaitUntil.the(TICKET_FREE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TICKET_FREE_CLOSE_BUTTON),
                WaitUntil.the(SEAT_GENERAL_TITLE, isVisible()),
                Click.on(SEAT_GENERAL_INPUT),
                Click.on(SEAT_1),
                Click.on(CONTINUE_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(ROOM, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SEAT_SELECTED),
                Click.on(CONTINUE_BUTTON)
        );

        actor.attemptsTo(
                        WaitUntil.the(CONFIRM_MODAL_VIEW, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(CONFIRM_MODAL_BUTTON)
        );
    }
}
