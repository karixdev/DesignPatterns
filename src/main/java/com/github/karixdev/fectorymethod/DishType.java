package com.github.karixdev.fectorymethod;

public enum DishType {
    BREAKFAST("breakfast"),
    DINNER("dinner"),
    SUPPER("supper");

    private final String value;

    DishType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
