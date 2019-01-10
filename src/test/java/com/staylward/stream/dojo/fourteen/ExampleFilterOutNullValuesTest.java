package com.staylward.stream.dojo.fourteen;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;


public class ExampleFilterOutNullValuesTest {

    @Test
    public void shouldOnlyAddStudentNamesFromValuesWithNullsAndOneTeacher() {
        // Given
        String studentName1 = "testName1";
        String studentName2 = "testName2";
        String studentName3 = null;
        Student student1 = new Student(studentName1);
        Student student2 = new Student(studentName2);
        Student student3 = new Student(studentName3);
        List<Student> students = new ArrayList<>(asList(
                student1,
                student2,
                student3,
                null
        ));

        Teacher teacher = new Teacher(students);
        List<Teacher> teachers = new ArrayList<>(asList(
                teacher,
                null
        ));
        School school = new School(teachers);

        // When
        List<String> result = ExampleFilterOutNullValues.getAllStudentNames(school);

        // Then
        assertThat(result).hasSize(2);
        assertThat(result).contains(studentName1, studentName2);
    }

    @Test
    public void shouldOnlyAddStudentNamesFromValuesWithNullsAndTwoTeachers() {
        // Given
        String studentName1 = "testName1";
        String studentName2 = "testName2";
        String studentName3 = "testName3";
        Student student1 = new Student(studentName1);
        Student student2 = new Student(studentName2);
        Student student3 = new Student(studentName3);

        Teacher teacher1 = new Teacher(asList(null, student1, null, student3));
        Teacher teacher2 = new Teacher(singletonList(student2));
        List<Teacher> teachers = new ArrayList<>(asList(
                teacher1,
                teacher2,
                null
        ));
        School school = new School(teachers);

        // When
        List<String> result = ExampleFilterOutNullValues.getAllStudentNames(school);

        // Then
        assertThat(result).hasSize(3);
        assertThat(result).contains(studentName1, studentName2, studentName3);
    }
}