package com.staylward.stream.dojo.five;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleDistinctTest {
    @Test
    public void shouldOnlyReturnUniqueNumbers() throws Exception {
        // Given
        List<Integer> numbers = asList(1, 1, 2, 3, 4, 5, 1, 5, 6, 6, 1);

        // When
        List<Integer> results = ExampleDistinct.filter(numbers);

        // Then
        assertThat(results).hasSize(6);
        assertThat(results).contains(1);
        assertThat(results).contains(2);
        assertThat(results).contains(3);
        assertThat(results).contains(4);
        assertThat(results).contains(5);
        assertThat(results).contains(6);
    }
}