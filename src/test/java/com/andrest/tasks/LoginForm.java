package com.andrest.tasks;

import com.andrest.utils.EnterDataAfterClick;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;

import static com.andrest.targets.LoginTargets.*;

public class LoginForm implements Task {

    List<Map<String, String>> loginTable;

    public LoginForm(List<Map<String, String>> loginTable) {
        this.loginTable = loginTable;
    }

    public static LoginForm fill(List<Map<String, String>> loginTable) {
        return Instrumented.instanceOf(LoginForm.class).withProperties(loginTable);
    }

    @Override
    @Step("{0} login successfully")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON),
                EnterDataAfterClick.input(loginTable.get(0).get("email"), EMAIL_INPUT),
                EnterDataAfterClick.input(loginTable.get(0).get("password"), PASSWORD_INPUT),
                Click.on(GET_INTO_BUTTON)
        );
    }
}
