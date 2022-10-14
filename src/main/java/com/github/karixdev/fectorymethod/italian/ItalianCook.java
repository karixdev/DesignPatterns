package com.github.karixdev.fectorymethod.italian;

import com.github.karixdev.fectorymethod.Cook;
import com.github.karixdev.fectorymethod.DishPrinter;
import com.github.karixdev.fectorymethod.DishType;

public class ItalianCook implements Cook {
    @Override
    public void prepareDish(DishType dishType) {
        DishPrinter.printPreparedDish("italian", dishType);
    }
}
