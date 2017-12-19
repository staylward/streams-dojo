package com.staylward.stream.dojo.twelve;

import java.util.List;

public class FlatMapExample {
    public static Integer calculateTotalPopulation(List<Region> regions, String requestedRegion, Character firstLetterOfTown) {
        return regions
                .stream()
                .filter(region -> region.getName().equals(requestedRegion))
                .flatMap(region -> region.getTowns().stream())
                .filter(town -> town.getName().charAt(0) == firstLetterOfTown)
                .mapToInt(Town::getPopulation)
                .sum();
    }
}
