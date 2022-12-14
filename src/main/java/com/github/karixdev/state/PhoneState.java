package com.github.karixdev.state;

public abstract class PhoneState {
    protected final Phone phone;

    public PhoneState(Phone phone) {
        this.phone = phone;
    }

    public abstract void onPowerButtonClick();
    public abstract void onHomeButtonClick();
}
