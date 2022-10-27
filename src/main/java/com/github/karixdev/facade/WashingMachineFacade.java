package com.github.karixdev.facade;

import com.github.karixdev.facade.laundry.LaundryItem;
import com.github.karixdev.facade.watersystems.WashingIngredient;
import com.github.karixdev.facade.watersystems.WashingIngredientsMixer;
import com.github.karixdev.facade.watersystems.WashingMachineWaterPump;

import java.util.List;

public class WashingMachineFacade {
    private final WashingMachineWaterPump waterPump = new WashingMachineWaterPump();
    private final WashingIngredientsMixer ingredientsMixer = new WashingIngredientsMixer(waterPump);
    private final WashingMachineDrum washingMachineDrum = new WashingMachineDrum();

    public void wash(List<LaundryItem> laundry, int washingTime, List<WashingIngredient> washingIngredients) {
        ingredientsMixer.mixIngredientsWithEachOtherAndWater(washingIngredients);
        washingMachineDrum.putLaundryIn(laundry);
        washingMachineDrum.start(washingTime);
    }
}
