package com.staylward.stream.dojo.eleven;

import java.util.List;

public class CalculateAndPrintDebug {

    public static Double getMultipliedTotal(List<Item> items, ItemQuality requestedQuality) {
        return items
                .stream()
                .filter(item -> item.getQuality().equals(requestedQuality))
                .peek(item -> System.out.println(String.format("Processing m:%3.1f v:%3.1f", item.getMultiplier(), item.getValue())))
                .mapToDouble(item -> item.getValue() * item.getMultiplier())
                .sum();
    }
}
