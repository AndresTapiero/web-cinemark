package com.andrest.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentTargets {
    //Payment
    public static Target ADD_CREDIT_CARD = Target.the("Add credit card").located(By.xpath("//div[@class='ant-collapse-item panel-payment ']//div[@role='tab']"));
    public static Target CARD_NUMBER_INPUT = Target.the("Card number input").located(By.xpath("//input[@id='payment_creditCard.number']"));
    public static Target CARD_NAME_INPUT = Target.the("Card name input").located(By.xpath("//input[@id='payment_creditCard.name']"));
    public static Target CARD_EXPIRATION_INPUT = Target.the("Card expiration input").located(By.xpath("//span[@id='payment_creditCard.expirationDate']//input[@placeholder='Select date']"));
    public static Target SELECT_YEAR = Target.the("Select year").located(By.xpath("//span[contains(@class,'ant-calendar-month-panel-year-select-content')]"));
    public static Target YEAR = Target.the("Year").located(By.xpath("//a[normalize-space()='2026']"));
    public static Target MONTH = Target.the("Month").located(By.xpath("//td[contains(@title,'sep.')]"));
    public static Target CVV = Target.the("cvv").located(By.xpath("//input[@id='payment_creditCard.securityCode']"));
    public static Target QUOTAS_INPUT = Target.the("Quota input").located(By.xpath("//div[@id='payment_creditCard.installments']//div[contains(@role,'combobox')]"));
    public static Target QUOTA = Target.the("Quota").located(By.xpath("//li[normalize-space()='1']"));
    public static Target TERMS_BUY = Target.the("Terms ").located(By.xpath("//input[@id='payment_agreement']"));
    public static Target TITLE_SURE_BUY = Target.the("Title sure").located(By.xpath("//h3[normalize-space()='¿Estás seguro de realizar el pago?']"));
    public static Target ACCEPT_BUTTON = Target.the("Accept button ").located(By.xpath("//button[@title='ACEPTAR']"));
    public static Target WAITING = Target.the("Terms ").located(By.xpath("//h3[normalize-space()='procesando pago...']"));

    public static Target CODE_CONFIRMATION = Target.the("Code confirmation").located(By.xpath("//h4[normalize-space()='código de confirmación']"));
    public static Target FINISH_BUY = Target.the("Finish flow").located(By.xpath("//button[@title='FINALIZAR']"));

}
