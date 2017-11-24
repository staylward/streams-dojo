package com.staylward.stream.dojo.four;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterByLambdaTest {
    @Test
    public void shouldOnlyReturnNumbersThatAreEvens() throws Exception {
        // Given
        List<Integer> ints = asList(1, 2, 3, 4, 5, 6);

        // When
        List<Integer> results = FilterByLambda.filterByLambda(ints, i -> (i % 2 == 0));

        // Then
        assertThat(results).hasSize(3);
        assertThat(results).contains(2);
        assertThat(results).contains(4);
        assertThat(results).contains(6);
    }

    @Test
    public void shouldOnlyReturnNumbersThatAreOdds() throws Exception {
        // Given
        List<Integer> ints = asList(1, 2, 3, 4, 5, 6);

        // When
        List<Integer> results = FilterByLambda.filterByLambda(ints, i -> (i % 2 == 1));

        // Then
        assertThat(results).hasSize(3);
        assertThat(results).contains(1);
        assertThat(results).contains(3);
        assertThat(results).contains(5);
    }
}