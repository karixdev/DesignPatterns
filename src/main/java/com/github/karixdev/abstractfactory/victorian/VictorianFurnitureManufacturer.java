package com.github.karixdev.abstractfactory.victorian;

import com.github.karixdev.abstractfactory.Armchair;
import com.github.karixdev.abstractfactory.CoffeeTable;
import com.github.karixdev.abstractfactory.FurnitureManufacturer;

public class VictorianFurnitureManufacturer extends FurnitureManufacturer {
    @Override
    public Armchair createArmchair() {
        return new VictorianArmchair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
