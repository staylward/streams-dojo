package com.staylward.stream.dojo.five;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleDistinct {

    public static List<Integer> filter(List<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }
}
