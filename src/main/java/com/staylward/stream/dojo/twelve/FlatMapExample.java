package com.staylward.stream.dojo.twelve;

import java.util.List;

public class FlatMapExample {
    public static Integer calculateTotalPopulation(List<Region> regions, String requestedRegion, Character firstLetterOfTown) {
        Integer total = 0;
        for (Region region : regions) {
            if (region.getName().equals(requestedRegion)) {
                for (Town town : region.getTowns()) {
                    if (town.getName().charAt(0) == firstLetterOfTown) {
                        total += town.getPopulation();
                    }
                }
            }
        }
        return total;
    }
}
