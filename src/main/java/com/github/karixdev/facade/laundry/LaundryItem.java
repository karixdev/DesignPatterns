package com.github.karixdev.facade.laundry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaundryItem {
    private String name;
    private LaundryItemStatus status = LaundryItemStatus.UNCLEAN;
}
