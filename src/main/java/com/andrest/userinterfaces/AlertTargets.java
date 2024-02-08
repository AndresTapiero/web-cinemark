package com.andrest.userinterfaces;

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
    public static Target TICKET_FREE = Target.the("Ticket free banner").located(By.xpath("(//img[@class='jsx-258256937 image-popup '])[1]"));
    public static Target TICKET_FREE_CLOSE_BUTTON = Target.the("Ticket free close button").located(By.xpath("(//span[@class='ant-modal-close-x'])[1]"));

    //
    public static Target CONFIRM_MODAL_VIEW = Target.the("Confirm seat modal").located(By.xpath("//span[@class='ant-modal-close-x']"));
    public static Target CONFIRM_BUTTON = Target.the("Confirm button").located(By.xpath("//button[@title='CONFIRMAR']"));
    public static Target CONFIRM_MODAL_BUTTON = Target.the("Confirm button").located(By.xpath("//button[@title='confirmar']"));

}
