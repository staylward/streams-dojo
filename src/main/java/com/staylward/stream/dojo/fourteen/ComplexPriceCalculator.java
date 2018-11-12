package com.staylward.stream.dojo.fourteen;

import java.math.BigDecimal;

public class ComplexPriceCalculator {
    public static BigDecimal execute(Item item) {
        try {
            doComplexThingsHere();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BigDecimal multiplier = new BigDecimal(item.getInventoryCount()).divide(new BigDecimal(10), 10, BigDecimal.ROUND_DOWN);
        return item.getBasePrice().multiply(multiplier);
    }

    private static void doComplexThingsHere() throws InterruptedException {
        Thread.sleep(1000L);
    }
}
