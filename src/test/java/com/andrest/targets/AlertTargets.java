package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertTargets {
    //public static Target CLOSE_REDEBAN_BUTTON = Target.the("Close redeban Button").located(AppiumBy.xpath("//button/span"));
    public static Target CLOSE_REDEBAN_BUTTON = Target.the("Close redeban Button").located(By.xpath("//div[3]/div/div[2]/div/div[2]/button/span"));
    public static Target BILLBOARD_TITLE = Target.the("Close redeban Button").located(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/section[1]/h1"));

}
