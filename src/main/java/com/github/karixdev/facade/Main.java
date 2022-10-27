package com.github.karixdev.facade;

import com.github.karixdev.facade.laundry.LaundryItem;
import com.github.karixdev.facade.watersystems.WashingIngredient;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LaundryItem> laundryItems = List.of(
                LaundryItem.builder()
                        .name("Socks")
                        .build(),
                LaundryItem.builder()
                        .name("Sweater")
                        .build(),
                LaundryItem.builder()
                        .name("Trousers")
                        .build()
        );

        List<WashingIngredient> washingIngredients = List.of(
                new WashingIngredient("Perwoll"),
                new WashingIngredient("Persil")
        );

        WashingMachineFacade washingMachineFacade = new WashingMachineFacade();
        washingMachineFacade.wash(laundryItems, 1, washingIngredients);

        laundryItems.forEach(item -> System.out.println(item.getName() + ": " + item.getStatus()));
    }
}
