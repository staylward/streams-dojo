package com.staylward.stream.dojo.five;

import java.util.ArrayList;
import java.util.List;

public class ExampleDistinct {

    public static List<Integer> filter(List<Integer> numbers) {
        List<Integer> results = new ArrayList<>();
        for (Integer number : numbers) {
            if (!results.contains(number)) {
                results.add(number);
            }
        }
        return results;
    }
}
