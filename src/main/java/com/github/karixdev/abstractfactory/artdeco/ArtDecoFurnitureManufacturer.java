package com.github.karixdev.abstractfactory.artdeco;

import com.github.karixdev.abstractfactory.Armchair;
import com.github.karixdev.abstractfactory.CoffeeTable;
import com.github.karixdev.abstractfactory.FurnitureManufacturer;

public class ArtDecoFurnitureManufacturer extends FurnitureManufacturer {
    @Override
    public Armchair createArmchair() {
        return new ArtDecoArmchair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
