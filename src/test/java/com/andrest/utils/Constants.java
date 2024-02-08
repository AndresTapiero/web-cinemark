package com.andrest.utils;

public enum Constants {

    BILLBOARD_PREMIERES_BOGOTA("estrenos / cartelera en Bogota"),
    BOGOTA("andressurez2@yopmail.com"),
    ADDRESS("Calle 38 # 21-130"),
    PASSWORD("TestCine123."),
    CARD_NAME("APPROVED"),
    CARD_NUMBER("4097440000000004"),
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
