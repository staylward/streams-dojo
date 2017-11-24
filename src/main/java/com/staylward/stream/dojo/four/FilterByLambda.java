package com.staylward.stream.dojo.four;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterByLambda {

    public static List<Integer> filterByLambda(List<Integer> numbers, Predicate<Integer> filter) {
        List<Integer> numbersToReturn = new ArrayList<>();
        for (Integer number : numbers) {
            if (filter.test(number)) {
                numbersToReturn.add(number);
            }
        }
        return numbersToReturn;
    }
}
