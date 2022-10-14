package com.github.karixdev.fectorymethod.german;

import com.github.karixdev.fectorymethod.Cook;
import com.github.karixdev.fectorymethod.Restaurant;

public class GermanRestaurant extends Restaurant {
    @Override
    public Cook getCook() {
        return new GermanCook();
    }
}
