package com.github.karixdev.fectorymethod.italian;

import com.github.karixdev.fectorymethod.Cook;
import com.github.karixdev.fectorymethod.Restaurant;

public class ItalianRestaurant extends Restaurant {
    @Override
    public Cook getCook() {
        return new ItalianCook();
    }
}
