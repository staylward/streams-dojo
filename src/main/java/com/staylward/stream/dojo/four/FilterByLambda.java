package com.staylward.stream.dojo.four;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterByLambda {

    public static List<Integer> filterByLambda(List<Integer> numbers, Predicate<Integer> filter) {
        return numbers.stream().filter(filter).collect(Collectors.toList());
    }
}
