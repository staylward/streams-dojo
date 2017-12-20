package com.staylward.stream.dojo.fourteen;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleParallelStreamTest {
    private List<Item> testItems;
    private final static long maximumTestDuration = 2000L;

    @Before
    public void setUp() throws Exception {
        testItems = asList(
                new Item("Thing1", new BigDecimal("2.5"), 15),
                new Item("Thing2", new BigDecimal("3.5"), 25),
                new Item("Thing3", new BigDecimal("4.5"), 35),
                new Item("Thing4", new BigDecimal("5.5"), 45),
                new Item("Thing5", new BigDecimal("6.5"), 55),
                new Item("Thing6", new BigDecimal("7.5"), 65),
                new Item("Thing7", new BigDecimal("8.5"), 75),
                new Item("Thing8", new BigDecimal("9.5"), 85),
                new Item("Thing9", new BigDecimal("10.5"), 95),
                new Item("Thing10", new BigDecimal("11.5"), 105)
        );
    }

    @Test(timeout = maximumTestDuration)
    public void shouldProcessAllCalculationInLessThan2Seconds() throws ExecutionException, InterruptedException {
        // Given
        Integer inventoryCountMoreThan = 20;

        // When
        List<BigDecimal> results = ExampleParallelStream.getCalculatedPrices(testItems, inventoryCountMoreThan);

        // Then
        assertThat(results).hasSize(9);
    }

    @Test(timeout = maximumTestDuration)
    public void shouldProcessAllFilteredCalculationInLessThan2Seconds() throws ExecutionException, InterruptedException {
        // Given
        Integer inventoryCountMoreThan = 50;

        // When
        List<BigDecimal> results = ExampleParallelStream.getCalculatedPrices(testItems, inventoryCountMoreThan);

        // Then
        assertThat(results).hasSize(6);
    }
}