package com.github.karixdev.abstractfactory.victorian;

import com.github.karixdev.abstractfactory.Armchair;

public class VictorianArmchair implements Armchair {
    @Override
    public void sit() {
        System.out.println("You have sat on victorian armchair");
    }
}
