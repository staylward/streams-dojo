package com.staylward.stream.dojo.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleCollection {
    public static List<String> createListOfStrings(String[] strings) {
        return Arrays.stream(strings).collect(Collectors.toList());
    }
}
