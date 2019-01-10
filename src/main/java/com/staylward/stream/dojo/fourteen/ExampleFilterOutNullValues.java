package com.staylward.stream.dojo.fourteen;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ExampleFilterOutNullValues {
    public static List<String> getAllStudentNames(School school) {
        return school.getTeachers().stream()
                .filter(Objects::nonNull)
                .map(Teacher::getStudents)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(Objects::nonNull)
                .map(Student::getName)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
