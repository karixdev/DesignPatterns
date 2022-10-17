package com.github.karixdev.adapter;

import com.github.karixdev.adapter.american.AmericanPhoneCharger;
import com.github.karixdev.adapter.american.AmericanPlug;
import com.github.karixdev.adapter.european.EuPhoneCharger;

public class Main {

    private static void chargePhoneInAmerica(AmericanPlug americanPhoneCharger) {
        americanPhoneCharger.connectAmericanPlug();
    }

    public static void main(String[] args) {
        AmericanPhoneCharger americanPhoneCharger = new AmericanPhoneCharger();
        EuPhoneCharger euPhoneCharger = new EuPhoneCharger();

        System.out.println("Moving to America from Europe");
        System.out.println("To charge my phone I need an adapter");

        chargePhoneInAmerica(new AmericanPlugAdapter(euPhoneCharger));
    }
}
