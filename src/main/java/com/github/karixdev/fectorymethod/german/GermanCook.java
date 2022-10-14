package com.github.karixdev.fectorymethod.german;

import com.github.karixdev.fectorymethod.Cook;
import com.github.karixdev.fectorymethod.DishPrinter;
import com.github.karixdev.fectorymethod.DishType;

public class GermanCook implements Cook {
    @Override
    public void prepareDish(DishType dishType) {
        DishPrinter.printPreparedDish("German", dishType);
    }
}
