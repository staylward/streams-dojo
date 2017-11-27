package com.staylward.stream.dojo.nine;

import java.util.List;

public class FilterAndAverage {

    public static double getAverageBy(List<Person> people, String hairColour) {
        return people.stream()
                .filter(p -> p.getHairColour().equals(hairColour))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
    }
}
