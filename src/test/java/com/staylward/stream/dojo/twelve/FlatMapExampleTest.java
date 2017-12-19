package com.staylward.stream.dojo.twelve;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

public class FlatMapExampleTest {
    private List<Region> testRegions;

    @Before
    public void setUp() {
        List<Town> townListA = asList(
                new Town("A", 5000),
                new Town("B", 15000),
                new Town("C", 15000),
                new Town("C", 17000),
                new Town("C", 23000),
                new Town("C", 35000),
                new Town("D", 40000)
        );
        List<Town> townListB = asList(
                new Town("ATest", 5000),
                new Town("AllG", 15000),
                new Town("C", 25000),
                new Town("D", 35000)
        );
        testRegions = asList(
                new Region("RegionA", townListA),
                new Region("RegionB", townListB),
                new Region("RegionC", emptyList())
        );
    }

    @Test
    public void shouldReturnTheTotalPopulationFilteredByRegionNameBAndTownNameStartWithA() {
        // Given
        String requestedRegion = "RegionB";
        Character requestedTownStartChar = 'A';

        // When
        Integer result = FlatMapExample.calculateTotalPopulation(testRegions, requestedRegion, requestedTownStartChar);

        // Then
        assertThat(result).isEqualTo(5000 + 15000);
    }

    @Test
    public void shouldReturnTheTotalPopulationFilteredByRegionNameAAndTownNameStartWithC() {
        // Given
        String requestedRegion = "RegionA";
        Character requestedTownStartChar = 'C';

        // When
        Integer result = FlatMapExample.calculateTotalPopulation(testRegions, requestedRegion, requestedTownStartChar);

        // Then
        assertThat(result).isEqualTo(15000 + 17000 + 23000 + 35000);
    }
}