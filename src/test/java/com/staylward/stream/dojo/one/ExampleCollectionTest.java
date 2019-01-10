package com.staylward.stream.dojo.one;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleCollectionTest {
    @Test
    public void shouldReturnListOfStringsFromTheArray() {
        // Given
        String[] strings = {"1", "2", "3", "4", "5"};

        // When
        List<String> results = ExampleCollection.createListOfStrings(strings);

        // Then
        assertThat(results).hasSize(5);
        assertThat(results).contains("1");
        assertThat(results).contains("2");
        assertThat(results).contains("3");
        assertThat(results).contains("4");
        assertThat(results).contains("5");
    }
}