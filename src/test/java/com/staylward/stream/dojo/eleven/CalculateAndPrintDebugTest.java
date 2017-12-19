package com.staylward.stream.dojo.eleven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculateAndPrintDebugTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private List<Item> testItemList;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        testItemList = asList(
                new Item(0.5, 2.0, ItemQuality.LOW),
                new Item(0.5, 4.0, ItemQuality.LOW),
                new Item(0.5, 5.0, ItemQuality.LOW),
                new Item(0.75, 5.0, ItemQuality.MEDIUM),
                new Item(0.75, 10.0, ItemQuality.MEDIUM),
                new Item(1.5, 24.0, ItemQuality.HIGH),
                new Item(1.5, 34.0, ItemQuality.HIGH),
                new Item(1.5, 38.0, ItemQuality.HIGH),
                new Item(1.5, 44.0, ItemQuality.HIGH)
        );
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void shouldReturnTotalAndPrintedDebugStatementsForLowQuality() {
        // When
        Double result = CalculateAndPrintDebug.getMultipliedTotal(testItemList, ItemQuality.LOW);

        // Then
        assertThat(result).isEqualTo(5.5);
        assertThat(outContent.toString()).contains("Processing m:0.5 v:2.0");
        assertThat(outContent.toString()).contains("Processing m:0.5 v:4.0");
        assertThat(outContent.toString()).contains("Processing m:0.5 v:5.0");
    }

    @Test
    public void shouldReturnTotalAndPrintedDebugStatementsForHighQuality() {
        // When
        Double result = CalculateAndPrintDebug.getMultipliedTotal(testItemList, ItemQuality.HIGH);

        // Then
        assertThat(result).isEqualTo(210.0);
        assertThat(outContent.toString()).contains("Processing m:1.5 v:24.0");
        assertThat(outContent.toString()).contains("Processing m:1.5 v:34.0");
        assertThat(outContent.toString()).contains("Processing m:1.5 v:38.0");
        assertThat(outContent.toString()).contains("Processing m:1.5 v:44.0");
    }
}