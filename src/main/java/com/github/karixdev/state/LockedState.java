package com.github.karixdev.state;

public class LockedState extends PhoneState {

    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void onPowerButtonClick() {
        System.out.println("Turning off");
        phone.setState(new TurnedOffState(phone));
    }

    @Override
    public void onHomeButtonClick() {
        phone.setState(new IdleState(phone));
    }
}
