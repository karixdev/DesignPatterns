package com.github.karixdev.fectorymethod.polish;

import com.github.karixdev.fectorymethod.Cook;
import com.github.karixdev.fectorymethod.Restaurant;

public class PolishRestaurant extends Restaurant {
    @Override
    public Cook getCook() {
        return new PolishCook();
    }
}
