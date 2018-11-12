package com.staylward.stream.dojo.six;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleReduceTest {
    @Test
    public void shouldReturnTheTotalOfTheListOfInts() {
        // Given
        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6);

        // When
        Optional<Integer> result = ExampleReduce.getTotal(numbers);

        // Then
        assertThat(result.isPresent()).isTrue();
        assertThat(result.orElse(0)).isEqualTo(21);
    }

    @Test
    public void shouldReturnOptionalEmptyForEmptyList() {
        // Given
        List<Integer> numbers = emptyList();

        // When
        Optional<Integer> result = ExampleReduce.getTotal(numbers);

        // Then
        assertThat(result.isPresent()).isFalse();
        assertThat(result.orElse(5)).isEqualTo(5);
    }
}