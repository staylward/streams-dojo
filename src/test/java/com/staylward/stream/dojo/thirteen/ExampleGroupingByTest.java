package com.staylward.stream.dojo.thirteen;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleGroupingByTest {
    private List<Employee> testEmployeeList;
    private Office northOffice;
    private Office southOffice;
    private Office eastOffice;
    private Office westOffice;

    @Before
    public void setUp() {
        northOffice = new Office("North Office");
        southOffice = new Office("South Office");
        eastOffice = new Office("East Office");
        westOffice = new Office("West Office");
        testEmployeeList = asList(
                new Employee("Qiwraek", northOffice, 0),
                new Employee("Qijeon", northOffice, 1),
                new Employee("Glynsalor", northOffice, 10),
                new Employee("Aenorin", southOffice, 0),
                new Employee("Lumaer", southOffice, 3),
                new Employee("Elydark", eastOffice, 0),
                new Employee("Zinmyar", eastOffice, 0),
                new Employee("Sylren", westOffice, 11),
                new Employee("Iliqen", westOffice, 1100)
        );
    }

    @Test
    public void shouldReturnMapOfEmployeesGroupedByOfficeWithAtLeast1YearWorking() {
        // Given
        Integer requiredTimeInCompany = 1;

        // When
        Map<Office, List<Employee>> employeesByOffice = ExampleGroupingBy.getEmployeesByOffice(testEmployeeList, requiredTimeInCompany);

        // Then
        assertThat(employeesByOffice).hasSize(3);
        assertThat(employeesByOffice.get(northOffice)).hasSize(2);
        assertThat(employeesByOffice.get(southOffice)).hasSize(1);
        assertThat(employeesByOffice.get(eastOffice)).isNull();
        assertThat(employeesByOffice.get(westOffice)).hasSize(2);
    }

    @Test
    public void shouldReturnMapOfEmployeesGroupedByOfficeWithAtLeast5YearWorking() {
        // Given
        Integer requiredTimeInCompany = 5;

        // When
        Map<Office, List<Employee>> employeesByOffice = ExampleGroupingBy.getEmployeesByOffice(testEmployeeList, requiredTimeInCompany);

        // Then
        assertThat(employeesByOffice).hasSize(2);
        assertThat(employeesByOffice.get(northOffice)).hasSize(1);
        assertThat(employeesByOffice.get(southOffice)).isNull();
        assertThat(employeesByOffice.get(eastOffice)).isNull();
        assertThat(employeesByOffice.get(westOffice)).hasSize(2);
    }
}