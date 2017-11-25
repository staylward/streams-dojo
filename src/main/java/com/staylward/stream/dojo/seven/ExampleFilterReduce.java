package com.staylward.stream.dojo.seven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExampleFilterReduce {
    public static Integer getFilteredTotal(List<Integer> numbers, Predicate<Integer> filter) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (filter.test(number)) {
                filteredNumbers.add(number);
            }
        }
        Integer total = 0;
        for (Integer number : filteredNumbers) {
            total += number;
        }
        return total;
    }
}
