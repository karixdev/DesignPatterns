package com.github.karixdev.abstractfactory.victorian;

import com.github.karixdev.abstractfactory.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void put(String object) {
        System.out.println("You have put " + object + " on the victorian coffee table");
    }
}
