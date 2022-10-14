package com.github.karixdev.fectorymethod;

import com.github.karixdev.fectorymethod.german.GermanRestaurant;
import com.github.karixdev.fectorymethod.italian.ItalianRestaurant;
import com.github.karixdev.fectorymethod.polish.PolishRestaurant;

public class GastronomyBusiness {
    private final Restaurant restaurant;

    public GastronomyBusiness(String cuisine) {
        switch (cuisine) {
            case "polish" -> restaurant = new PolishRestaurant();
            case "german" -> restaurant = new GermanRestaurant();
            case "italian" -> restaurant = new ItalianRestaurant();
            default -> throw new IllegalArgumentException("Restaurant serving provided cuisine does not exist");
        }
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
