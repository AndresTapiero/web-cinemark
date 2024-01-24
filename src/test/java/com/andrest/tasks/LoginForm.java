package com.andrest.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.andrest.targets.LoginTargets.*;
import static com.andrest.utils.Constants.EMAIL;
import static com.andrest.utils.Constants.PASSWORD;

public class LoginForm implements Task {

    public static LoginForm fill() {
        return Instrumented.instanceOf(LoginForm.class).newInstance();
    }

    @Override
    @Step("{0} login successfully")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON),
                Click.on(EMAIL_INPUT),
                Enter.theValue(EMAIL.getValue()).into(EMAIL_INPUT),
                Click.on(PASSWORD_INPUT),
                Enter.theValue(PASSWORD.getValue()).into(PASSWORD_INPUT),
                Click.on(GET_INTO_BUTTON)
        );
    }
}
