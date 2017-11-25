package com.staylward.stream.dojo.seven;

import java.util.List;
import java.util.function.Predicate;

public class ExampleFilterReduce {
    public static Integer getFilteredTotal(List<Integer> numbers, Predicate<Integer> filter) {
        return numbers.stream().filter(filter).reduce((x, y) -> x+y).orElse(0);
    }
}
