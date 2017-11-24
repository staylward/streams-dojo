package com.staylward.stream.dojo.three;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleFilter {

    public static List<Integer> getOnlyEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }
}
