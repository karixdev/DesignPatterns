package com.github.karixdev.facade.laundry;

public enum LaundryItemStatus {
    UNCLEAN("unclean"),
    CLEAN("clean");

    private final String value;

    LaundryItemStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
