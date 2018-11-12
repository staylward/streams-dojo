package com.staylward.stream.dojo.ten;

import org.junit.Test;

import java.util.List;

import static com.staylward.stream.dojo.ten.GetMaxInteger.getMaximumBy;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class GetMaxIntegerTest {
    @Test
    public void shouldGetAverageAgeOfPeopleWithBrownHair() {
        // Given
        List<Person> people = asList(
                new Person(5, "Brown"),
                new Person(6, "Brown"),
                new Person(7, "Brown"),
                new Person(10, "Brown"),
                new Person(30, "Red"),
                new Person(60, "Black")
        );

        // When
        Integer maximum = getMaximumBy(people, "Brown");

        // Then
        assertThat(maximum).isEqualTo(10);
    }
}