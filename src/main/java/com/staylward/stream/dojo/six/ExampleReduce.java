package com.staylward.stream.dojo.six;

import java.util.List;
import java.util.Optional;

public class ExampleReduce {

    public static Optional<Integer> getTotal(List<Integer> numbers) {
        return numbers.stream().reduce((x, y) -> x+y);
    }
}
