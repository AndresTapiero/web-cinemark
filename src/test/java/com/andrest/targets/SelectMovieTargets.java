package com.andrest.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectMovieTargets {

    public static Target FIRST_MOVIE = Target.the("First movie").located(By.xpath("(//div[@class='jsx-2391151467 item-wrap'])[1]"));
    public static Target ORIGINAL_TITLE = Target.the("Original title").located(By.xpath("(//h4[normalize-space()='título original'])[1]"));
    public static Target SELECT_HOUR = Target.the("Select hour").located(By.xpath("(//div[@class='jsx-1092747776 sessions__button--runtime '])[1]"));
    public static Target HOUR_SELECTED = Target.the("Hour Selected").located(By.xpath("(//div[contains(@class,'jsx-1092747776 theaters-detail__container')]/div)[1]"));
    public static Target CONFIRM_BUTTON = Target.the("Confirm button").located(By.xpath("(//button[@title='CONFIRMAR'])[1]"));
    public static Target SEAT_GENERAL_TITLE = Target.the("Seat general title").located(By.xpath("//div[@class='jsx-2857728795 information__top-bar']"));
    public static Target SEAT_GENERAL_INPUT = Target.the("Seat general title").located(By.xpath("(//div[@role='combobox'])[3]"));
    public static Target SEAT_1 = Target.the("Seat 1").located(By.xpath("//li[normalize-space()='1']"));
    public static Target CONTINUE_BUTTON = Target.the("Continue button").located(By.xpath("//button[@title='continuar']"));
    public static Target ROOM = Target.the("Room").located(By.xpath("//div[@class='jsx-30724968 room__seats-container']"));
    public static Target SEAT_SELECTED = Target.the("Room").located(By.xpath("//*[@id=\"map\"]/div/div[291]/button"));

    //CONFITERIA
    public static Target CONFECTIONERY = Target.the("Confectionery").located(By.xpath("//h1[normalize-space()='CONFITERÍA REGULAR']"));
    public static Target MY_COMB_MORE = Target.the("My comb").located(By.xpath("(//button[@type='button'])[5]"));
    public static Target TOTAL_TITLE = Target.the("Total title").located(By.xpath("//div[normalize-space()='total']"));




}
