package com.staylward.stream.dojo.nine;

import java.util.List;

public class FilterAndAverage {

    public static double getAverageBy(List<Person> people, String hairColour) {
        double total = 0;
        double count = 0;
        for (Person person : people) {
            if (person.getHairColour().equals(hairColour)) {
                total += person.getAge();
                count++;
            }
        }
        return total / count;
    }
}
