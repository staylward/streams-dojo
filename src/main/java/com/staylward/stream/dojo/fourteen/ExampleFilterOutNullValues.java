package com.staylward.stream.dojo.fourteen;

import java.util.ArrayList;
import java.util.List;

public class ExampleFilterOutNullValues {
    public static List<String> getAllStudentNames(School school) {
        List<String> studentNames = new ArrayList<>();
        for (Teacher teacher : school.getTeachers()) {
            if (teacher != null) {
                for (Student student : teacher.getStudents()) {
                    if (student != null && student.getName() != null) {
                        studentNames.add(student.getName());
                    }
                }
            }
        }
        return studentNames;
    }
}
