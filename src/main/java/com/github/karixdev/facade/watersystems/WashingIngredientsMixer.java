package com.github.karixdev.facade.watersystems;

import com.github.karixdev.facade.WashingMachineDrum;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class WashingIngredientsMixer {
    private final WashingMachineWaterPump waterPump;

    public void mixIngredientsWithEachOtherAndWater(List<WashingIngredient> washingIngredients) {
        waterPump.pump();

        StringBuilder message = new StringBuilder();
        message.append("Mixing: ");
        washingIngredients.forEach(ingredient -> message
                .append(ingredient.name)
                .append(" "));

        System.out.println(message);
    }
}
