package com.staylward.stream.dojo.nine;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterAndAverageTest {
    @Test
    public void shouldGetAverageAgeOfPeopleWithBrownHair() throws Exception {
        // Given
        List<Person> people = asList(
                new Person(5, "Brown"),
                new Person(6, "Brown"),
                new Person(7, "Brown"),
                new Person(10, "Brown"),
                new Person(30, "Blond"),
                new Person(60, "Black")
        );

        // When
        double average = FilterAndAverage.getAverageBy(people, "Brown");

        // Then
        assertThat(average).isEqualTo((5 + 6 + 7 + 10)/4);
    }
}