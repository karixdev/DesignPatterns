package com.github.karixdev.facade.laundry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LaundryItem {
    private String name;
    private LaundryItemStatus status = LaundryItemStatus.UNCLEAN;
}
