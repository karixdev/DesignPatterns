package com.github.karixdev.abstractfactory;

import com.github.karixdev.abstractfactory.artdeco.ArtDecoFurnitureManufacturer;
import com.github.karixdev.abstractfactory.victorian.VictorianFurnitureManufacturer;

import java.util.Map;

public class FurnitureShop {
    private final FurnitureManufacturer furnitureManufacturer;

    public FurnitureShop(String style) {
        switch (style) {
            case "victorian" -> furnitureManufacturer = new VictorianFurnitureManufacturer();
            case "art-deco" -> furnitureManufacturer = new ArtDecoFurnitureManufacturer();
            default -> throw new IllegalArgumentException("We do not sell furniture of this style");
        }
    }

    public Armchair orderArmchair() {
        return furnitureManufacturer.createArmchair();
    }

    public CoffeeTable oderCoffeeTable() {
        return furnitureManufacturer.createCoffeeTable();
    }
}
