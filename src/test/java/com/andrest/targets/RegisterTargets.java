package com.andrest.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterTargets {



    public static Target REGISTER_BUTTON = Target.the("Register Button").located(By.xpath("(//button[@title='CREAR CUENTA'])[1]"));
    public static Target NAME_INPUT = Target.the("Name input").located(By.xpath("//*[@id=\"register_FirstName\"]"));

    public static Target LAST_NAME_INPUT = Target.the("Name input").located(By.xpath("//*[@id=\"register_LastName\"]"));
    public static Target GENDER_INPUT = Target.the("Gender input").located(By.xpath("//*[@id=\"register_Gender\"]/div/div"));
    public static Target GENDER_MEN_INPUT = Target.the("Gender men input").located(By.xpath("//li[normalize-space()='Masculino']"));
    public static Target DOCUMENT_NUMBER_INPUT = Target.the("Document number input").located(By.xpath("//*[@id=\"register_NationalID\"]"));
    public static Target PHONE_NUMBER_INPUT = Target.the("Phone number input").located(By.xpath("//*[@id=\"register_MobilePhone\"]"));
    public static Target ADDRESS_INPUT = Target.the("Address input").located(By.xpath("//*[@id=\"register_Address1\"]"));
    public static Target CREATE_EMAIL_INPUT = Target.the("Create email input").located(By.xpath("//*[@id=\"register_Email\"]"));
    public static Target CONFIRM_EMAIL_INPUT = Target.the("Confirm email input").located(By.xpath("//*[@id=\"register_confirmEmail\"]"));
    public static Target CREATE_PASSWORD_INPUT = Target.the("Create password input").located(By.xpath("//*[@id=\"register_Password\"]"));
    public static Target CONFIRM_PASSWORD_INPUT = Target.the("Confirm password input").located(By.xpath("//*[@id=\"register_confirmPassword\"]"));
    public static Target SELECT_CITY_INPUT = Target.the("Select city input").located(By.xpath("//*[@id=\"register_PreferredComplexCity\"]/div/div"));
    public static Target SELECT_CITY = Target.the("Select city").located(By.xpath("//li[normalize-space()='Bogota']"));
    public static Target SELECT_THEATER = Target.the("Select theater").located(By.xpath("//div[@id='register_PreferredComplex']//div[contains(@class,'ant-select-selection__rendered')]"));
    public static Target THEATER_MULTIPLAZA = Target.the("Theater multiplaza").located(By.xpath("//li[normalize-space()='Lab v5 Multiplaza']"));
    public static Target REGISTER_TERMS = Target.the("Register terms").located(By.xpath("//input[@id='register_termines']"));
    public static Target CREATE_ACCOUNT_BUTTON = Target.the("Create account button").located(By.xpath("//button[@title='Crear cuenta']"));
}
