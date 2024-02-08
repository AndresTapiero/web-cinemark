package com.andrest.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;
import java.util.Map;
import static com.andrest.userinterfaces.AlertTargets.*;
import static com.andrest.userinterfaces.RegisterTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterForm implements Task {

    List<Map<String, String>> dataTable;

    public RegisterForm(List<Map<String, String>> dataTable) {
        this.dataTable = dataTable;
    }

    public static RegisterForm fill(List<Map<String, String>> dataTable) {
        return Instrumented.instanceOf(RegisterForm.class).withProperties(dataTable);
    }
    @Override
    @Step("{0} Fill register form")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(REGISTER_BUTTON, isVisible()),
                Click.on(REGISTER_BUTTON),
                WaitUntil.the(BUY_TICKETS_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CREATE_NO_MEMBERSHIP)
        );

        actor.attemptsTo(
                WaitUntil.the(NAME_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(dataTable.get(0).get("firstName")).into(NAME_INPUT),
                Enter.theValue(dataTable.get(0).get("lastName")).into(LAST_NAME_INPUT),
                Click.on(GENDER_INPUT),
                Click.on(GENDER_MEN_INPUT),
                Enter.theValue(dataTable.get(0).get("document")).into(DOCUMENT_NUMBER_INPUT),
                Enter.theValue(dataTable.get(0).get("phone")).into(PHONE_NUMBER_INPUT),
                Enter.theValue(dataTable.get(0).get("address")).into(ADDRESS_INPUT),
                Enter.theValue(dataTable.get(0).get("email")).into(CREATE_EMAIL_INPUT),
                Enter.theValue(dataTable.get(0).get("email")).into(CONFIRM_EMAIL_INPUT),
                Enter.theValue(dataTable.get(0).get("password")).into(CREATE_PASSWORD_INPUT),
                Enter.theValue(dataTable.get(0).get("password")).into(CONFIRM_PASSWORD_INPUT),
                Click.on(SELECT_CITY_INPUT),
                Click.on(SELECT_CITY),
                Click.on(SELECT_THEATER),
                Click.on(THEATER_MULTIPLAZA),
                Click.on(REGISTER_TERMS),
                Click.on(CREATE_ACCOUNT_BUTTON),
                WaitUntil.the(SUCCESSFUL_REGISTER, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(CLOSE_SUCCESSFUL_REGISTER_BUTTON)
        );
    }
}
