package com.andrest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginTargets {

    public static Target LOGIN_BUTTON = Target.the("Login Button").located(By.xpath("(//button[contains(@title,'INICIAR SESIÓN')])[1]"));
    public static Target EMAIL_INPUT = Target.the("Emil input").located(By.xpath("(//input[@id='MemberEmail'])[1]"));
    public static Target PASSWORD_INPUT = Target.the("Password input").located(By.xpath("//input[@id='MemberPassword']"));
    public static Target GET_INTO_BUTTON = Target.the("Get into button").located(By.xpath("//button[@title='Ingresar']"));



}
