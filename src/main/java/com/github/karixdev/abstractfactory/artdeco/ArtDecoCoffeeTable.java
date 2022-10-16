package com.github.karixdev.abstractfactory.artdeco;

import com.github.karixdev.abstractfactory.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void put(String object) {
        System.out.println("You have put " + object + " on the victorian coffee table");
    }
}
