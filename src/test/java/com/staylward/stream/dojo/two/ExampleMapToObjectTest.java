package com.staylward.stream.dojo.two;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleMapToObjectTest {
    @Test
    public void shouldReturnListOfIntsAsListOfStrings() {
        // Given
        List<Integer> ints = asList(1, 2, 3, 4, 5);

        // When
        List<String> results = ExampleMapToObject.createListOfStrings(ints);

        // Then
        assertThat(results).hasSize(5);
        assertThat(results).contains("1");
        assertThat(results).contains("2");
        assertThat(results).contains("3");
        assertThat(results).contains("4");
        assertThat(results).contains("5");
    }
}