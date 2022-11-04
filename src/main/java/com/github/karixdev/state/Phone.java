package com.github.karixdev.state;

public class Phone {

    private PhoneState state = new TurnedOffState(this);

    public void clickPowerPowerBtn() {
        state.onPowerButtonClick();
    }

    public void clickHomeButton() {
        state.onHomeButtonClick();
    }

    public void setState(PhoneState state) {
        this.state = state;
    }
}
