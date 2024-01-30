package com.andrest.utils;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CustomTargets {
    public static Target withQuotaValue(String value) {
        String xpath = String.format("//li[normalize-space()='%s']", value);
        return Target.the("Element").located(By.xpath(xpath));
    }
}
