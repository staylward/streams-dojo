package com.staylward.stream.dojo.ten;

import java.util.List;

public class GetMaxInteger {
    public static Integer getMaximumBy(List<Person> people, String eyeColour) {
        Integer max = 0;
        for (Person person : people) {
            if (person.getEyeColour().equals(eyeColour)) {
                max = person.getAge() > max ? person.getAge() : max;
            }
        }
        return max;
    }
}
