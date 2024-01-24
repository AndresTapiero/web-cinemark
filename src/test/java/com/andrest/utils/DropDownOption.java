package com.andrest.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.screenplay.targets.Target;

public class DropDownOption implements Interaction {

    private final String option;
    private final Target dropdownLocator;

    public DropDownOption(String option, Target dropdownLocator){
        this.option = option;
        this.dropdownLocator = dropdownLocator;
    }

    public static DropDownOption from(String option, Target dropdownLocator) {
        return Tasks.instrumented(DropDownOption.class, option,dropdownLocator);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //WebElement dropdownElement = actor.asksFor(WebElementQuestion.about("dropdown element").locatedBy(dropdownLocator));
        WebElement dropdownElement = (WebElement) actor.asksFor(WebElementQuestion.valueOf( dropdownLocator));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(option);

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Interaction.super.then(nextPerformable);
    }
}
