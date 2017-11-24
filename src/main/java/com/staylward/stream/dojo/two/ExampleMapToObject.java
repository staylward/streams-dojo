package com.staylward.stream.dojo.two;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleMapToObject {

    public static List<String> createListOfStrings(List<Integer> ints) {
        return ints.stream().map(Object::toString).collect(Collectors.toList());
    }
}
