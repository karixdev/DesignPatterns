package com.github.karixdev.fectorymethod.polish;

import com.github.karixdev.fectorymethod.Cook;
import com.github.karixdev.fectorymethod.DishType;

public class PolishCook implements Cook {
    @Override
    public void prepareDish(DishType dishType) {
        if (dishType == DishType.BREAKFAST) {
            System.out.println("Prepared Polish Potato Bread");
        } else if (dishType == DishType.DINNER) {
            System.out.println("Prepared Bigos");
        } else {
            System.out.println("Prepared Leczo");
        }
    }
}
