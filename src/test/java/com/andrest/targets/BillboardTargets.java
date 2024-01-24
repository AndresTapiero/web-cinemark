package com.andrest.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BillboardTargets {
    public static Target DROP_CITY = Target.the("Drop down city").located(By.xpath("//div[@class='select-location ant-select ant-select-enabled']//div[@class='ant-select-selection__rendered']"));
    public static Target SELECT_CITY = Target.the("Select city").located(By.xpath("//li[normalize-space()='Bogota']"));
    public static Target BILLBOARD_BOGOTA_TITLE = Target.the("Billboard bogota title").located(By.xpath("//h1[normalize-space()='estrenos / cartelera en Bogota']"));

}
