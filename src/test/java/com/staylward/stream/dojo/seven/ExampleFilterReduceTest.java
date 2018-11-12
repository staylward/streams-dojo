package com.staylward.stream.dojo.seven;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleFilterReduceTest {
    @Test
    public void shouldReturnTheTotalOfTheListOfEvenInts() {
        // Given
        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6);

        // When
        Integer result = ExampleFilterReduce.getFilteredTotal(numbers, i -> (i % 2 == 0));

        // Then
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void shouldReturnTheTotalOfTheListOfOddInts() {
        // Given
        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6);

        // When
        Integer result = ExampleFilterReduce.getFilteredTotal(numbers, i -> (i % 2 == 1));

        // Then
        assertThat(result).isEqualTo(9);
    }
}