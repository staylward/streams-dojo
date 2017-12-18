package com.staylward.stream.dojo.ten;

import java.util.List;

public class GetMaxInteger {
    public static Integer getMaximumBy(List<Person> people, String eyeColour) {
        return people.stream()
                .filter(person -> person.getEyeColour().equals(eyeColour))
                .mapToInt(Person::getAge)
                .max()
                .getAsInt();
    }
}
