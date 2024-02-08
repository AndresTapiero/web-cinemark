package com.andrest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DropDownOption implements Interaction {

    private final Target option;
    private final Target dropdownLocator;

    public DropDownOption(Target option, Target dropdownLocator){
        this.option = option;
        this.dropdownLocator = dropdownLocator;
    }

    public static DropDownOption from(Target option, Target dropdownLocator) {
        return Tasks.instrumented(DropDownOption.class, option, dropdownLocator);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(dropdownLocator, isVisible()),
                Click.on(dropdownLocator),
                Click.on(option)
        );
    }
}
