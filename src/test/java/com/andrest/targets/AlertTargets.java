package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertTargets {
    public static Target CLOSE_REDEBAN_BUTTON = Target.the("Close redeban Button").located(By.xpath("//span[@class='ant-modal-close-x']"));
    public static Target BILLBOARD_TITLE = Target.the("Close redeban Button").located(By.xpath("//h1[normalize-space()='estrenos / cartelera']"));
    public static Target BUY_TICKETS_TITLE = Target.the("Buy tickets title").located(By.xpath("//h3[normalize-space()='PARA PODER COMPRAR TUS BOLETAS, CREA TU CUENTA']"));
    public static Target CREATE_NO_MEMBERSHIP = Target.the("Create no membership button").located(By.xpath("(//button[contains(@type,'button')])[7]"));
    public static Target SUCCESSFUL_REGISTER = Target.the("Successful register").located(By.xpath("//h3[normalize-space()='Registro exitoso']"));

    public static Target CLOSE_SUCCESSFUL_REGISTER_BUTTON = Target.the("Create no membership button").located(By.xpath("//span[@class='ant-modal-close-x']"));

}
