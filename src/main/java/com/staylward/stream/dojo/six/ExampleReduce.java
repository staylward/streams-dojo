package com.staylward.stream.dojo.six;

import java.util.List;
import java.util.Optional;

public class ExampleReduce {

    public static Optional<Integer> getTotal(List<Integer> numbers) {
        if (numbers.size() < 1) {
            return Optional.empty();
        }
        Integer total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        return Optional.of(total);
    }
}
