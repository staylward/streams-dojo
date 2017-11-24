package com.staylward.stream.dojo.three;

import java.util.ArrayList;
import java.util.List;

public class ExampleFilter {

    public static List<Integer> getOnlyEvenNumbers(List<Integer> numbers) {
        List<Integer> evenInts = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenInts.add(number);
            }
        }
        return evenInts;
    }
}
