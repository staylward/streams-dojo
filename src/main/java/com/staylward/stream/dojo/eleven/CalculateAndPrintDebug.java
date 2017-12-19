package com.staylward.stream.dojo.eleven;

import java.util.List;

public class CalculateAndPrintDebug {

    public static Double getMultipliedTotal(List<Item> items, ItemQuality requestedQuality) {
        Double total = 0d;
        for (Item item : items) {
            if (item.getQuality().equals(requestedQuality)) {
                Double multiplier = item.getMultiplier();
                Double value = item.getValue();
                System.out.println(String.format("Processing m:%3.1f v:%3.1f", multiplier, value));
                total += multiplier * value;
            }
        }
        return total;
    }
}
