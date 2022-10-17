package com.github.karixdev.adapter;

import com.github.karixdev.adapter.american.AmericanPlug;
import com.github.karixdev.adapter.european.EuropeanPlug;

public class AmericanPlugAdapter implements AmericanPlug {
    private final EuropeanPlug europeanPlug;

    public AmericanPlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void connectAmericanPlug() {
        System.out.println("Lowered voltage to 120VRMS");
        europeanPlug.connectEuropeanPlug();
    }
}
