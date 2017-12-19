package com.staylward.stream.dojo.thirteen;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleGroupingBy {
    public static Map<Office, List<Employee>> getEmployeesByOffice(List<Employee> employees, Integer requiredYearsInCompany) {
        return employees
                .stream()
                .filter(employee -> employee.getYearsInCompany() >= requiredYearsInCompany)
                .collect(Collectors.groupingBy(Employee::getOffice));
    }
}
