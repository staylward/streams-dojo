package com.staylward.stream.dojo.one;

import java.util.ArrayList;
import java.util.List;

public class ExampleCollection {
    public static List<String> createListOfStrings(String[] strings) {
        List<String> returnList = new ArrayList<>();
        for (int i=0; i<strings.length; i++) {
            returnList.add(strings[i]);
        }
        return returnList;
    }
}
