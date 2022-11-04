package com.github.karixdev.state;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.clickHomeButton();
        phone.clickPowerPowerBtn(); // TurnedOff -> Locked

        phone.clickHomeButton(); // Locked -> Idle

        phone.clickHomeButton();
        phone.clickPowerPowerBtn(); // Idle -> Locked

        phone.clickPowerPowerBtn(); // Locked -> TurnedOff
    }
}
