package com.andrest.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectMovieTargets {

    public static Target FIRST_MOVIE = Target.the("First movie").located(By.xpath("(//div[@class='jsx-1273177034 info-movie'])[1]"));
    public static Target ORIGINAL_TITLE = Target.the("Original title").located(By.xpath("(//h4[normalize-space()='título original'])[1]"));
    public static Target SELECT_HOUR = Target.the("Select hour").located(By.xpath("//div[normalize-space()='17:35']"));
    public static Target HOUR_SELECTED = Target.the("Hour Selected").located(By.xpath("//small[@class='jsx-2125408045 d-block text--sentence-case text--schedule']"));
    public static Target CONFIRM_BUTTON = Target.the("Confirm button").located(By.xpath("(//button[@title='CONFIRMAR'])[1]"));

    public static Target SEAT_GENERAL_TITLE = Target.the("Seat general title").located(By.xpath("//div[@class='jsx-2857728795 information__top-bar']"));
    public static Target SEAT_GENERAL_INPUT = Target.the("Seat general title").located(By.xpath("(//div[@role='combobox'])[3]"));
    public static Target SEAT_1 = Target.the("Seat 1").located(By.xpath("//li[normalize-space()='1']"));
    public static Target CONTINUE_BUTTON = Target.the("Continue button").located(By.xpath("//button[@title='continuar']"));
    public static Target ROOM = Target.the("Room").located(By.xpath("//div[@class='jsx-30724968 room']"));
    public static Target SEAT_SELECTED = Target.the("Room").located(By.xpath("(//button)[187]"));

    //CONFITERIA
    public static Target CONFECTIONERY = Target.the("Confectionery").located(By.xpath("//h1[normalize-space()='CONFITERÍA REGULAR']"));
    public static Target MY_COMB_MORE = Target.the("My comb").located(By.xpath("(//button[@type='button'])[5]"));
    public static Target TOTAL_TITLE = Target.the("My comb").located(By.xpath("//div[normalize-space()='total']"));




}
