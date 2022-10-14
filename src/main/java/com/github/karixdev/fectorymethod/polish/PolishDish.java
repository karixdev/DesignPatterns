package com.github.karixdev.fectorymethod.polish;

import com.github.karixdev.fectorymethod.Dish;
import com.github.karixdev.fectorymethod.DishType;

public record PolishDish(DishType dishType) implements Dish {
    @Override
    public String toString() {
        return "Polish " + dishType;
    }
}
