package com.github.karixdev.state;

public class IdleState extends PhoneState {

    public IdleState(Phone phone) {
        super(phone);
    }

    @Override
    public void onPowerButtonClick() {
        System.out.println("Locking phone");
        phone.setState(new LockedState(phone));
    }

    @Override
    public void onHomeButtonClick() {
        System.out.println("Home screen");
    }
}
