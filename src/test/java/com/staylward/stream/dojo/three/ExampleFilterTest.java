package com.staylward.stream.dojo.three;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleFilterTest {
    @Test
    public void shouldReturnAListThatOnlyContainsEvenNumbers() {
        // Given
        List<Integer> ints = asList(1, 2, 3, 4, 5, 6);

        // When
        List<Integer> results = ExampleFilter.getOnlyEvenNumbers(ints);

        // Then
        assertThat(results).hasSize(3);
        assertThat(results).contains(2);
        assertThat(results).contains(4);
        assertThat(results).contains(6);
    }
}