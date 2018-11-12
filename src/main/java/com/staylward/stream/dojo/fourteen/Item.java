package com.staylward.stream.dojo.fourteen;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Item {
    private String name;
    private BigDecimal basePrice;
    private Integer inventoryCount;
}
