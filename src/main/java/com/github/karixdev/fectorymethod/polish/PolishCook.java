package com.github.karixdev.fectorymethod.polish;

import com.github.karixdev.fectorymethod.Cook;
import com.github.karixdev.fectorymethod.DishType;

public class PolishCook implements Cook {
    @Override
    public void prepareDish(DishType dishType) {
        System.out.println("Prepared polish " + dishType);
    }
}
