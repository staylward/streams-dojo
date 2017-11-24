package com.staylward.stream.dojo.two;

import java.util.ArrayList;
import java.util.List;

public class ExampleMapToObject {

    public static List<String> createListOfStrings(List<Integer> ints) {
        List<String> strings = new ArrayList<>();
        for (Integer number : ints) {
            strings.add(number.toString());
        }
        return strings;
    }
}
