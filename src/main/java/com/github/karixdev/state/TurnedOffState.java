package com.github.karixdev.state;

public class TurnedOffState extends PhoneState {

    public TurnedOffState(Phone phone) {
        super(phone);
    }

    @Override
    public void onPowerButtonClick() {
        System.out.println("Turning on");
        phone.setState(new LockedState(phone));
    }

    @Override
    public void onHomeButtonClick() {
        System.out.println("Phone is turned off");
    }
}
