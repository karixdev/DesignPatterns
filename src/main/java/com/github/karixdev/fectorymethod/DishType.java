package com.github.karixdev.fectorymethod;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DishType {
    BREAKFAST("breakfast"),
    DINNER("dinner"),
    SUPPER("supper");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
