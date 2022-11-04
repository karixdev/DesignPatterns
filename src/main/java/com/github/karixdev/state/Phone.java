package com.github.karixdev.state;

public class Phone {

    private PhoneState state;

    public void clickPowerPowerBtn() {
        state.onPowerButtonClick();
    }

    public void clickHomeButton() {
        state.onHomeButtonClick();
    }

}
