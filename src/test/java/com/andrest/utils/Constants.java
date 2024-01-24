package com.andrest.utils;

public enum Constants {

    NAME("Andres"),
    LAST_NAME("Suarez"),
    EMAIL("andressurez2@yopmail.com"),
    DOCUMENT_NUMBER("1012432338"),
    PHONE_NUMBER("3154323422"),
    ADDRESS("Calle 38 # 21-130"),
    PASSWORD("TestCine123."),
    CARD_NAME("APPROVED"),
    CARD_NUMBER("4093551018099251"),
    EXPIRATION_DATE("0726"),
    CARD_CVV("777");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
