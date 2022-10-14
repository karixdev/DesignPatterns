package com.github.karixdev.fectorymethod;

public abstract class Restaurant {
    public abstract Cook getCook();

    public void placeOrder(DishType dishType) {
        Cook cook = getCook();
        cook.prepareDish(dishType);
    }
}
