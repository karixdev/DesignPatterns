package com.github.karixdev.facade;

import com.github.karixdev.facade.laundry.LaundryItemStatus;
import com.github.karixdev.facade.watersystems.WashingIngredientsMixer;
import com.github.karixdev.facade.watersystems.WashingMachineWaterPump;
import com.github.karixdev.facade.laundry.LaundryItem;
import lombok.RequiredArgsConstructor;

import java.util.List;

public class WashingMachineDrum {
    private List<LaundryItem> laundry;

    public void putLaundryIn(List<LaundryItem> laundry) {
        this.laundry = laundry;
    }

    public void start(int time) {
        System.out.println("Washing will be complete in: " + time + " hours");
        laundry.forEach(laundryItem -> laundryItem.setStatus(LaundryItemStatus.CLEAN));
    }
}
