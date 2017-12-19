package com.staylward.stream.dojo.eleven;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Item {
    private Double multiplier;
    private Double value;
    private ItemQuality quality;
}
