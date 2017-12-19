package com.staylward.stream.dojo.thirteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleGroupingBy {
    public static Map<Office, List<Employee>> getEmployeesByOffice(List<Employee> employees, Integer requiredYearsInCompany) {
        Map<Office, List<Employee>> result = new HashMap<>();
        for (Employee employee : employees) {
            if (employee.getYearsInCompany() >= requiredYearsInCompany) {
                Office office = employee.getOffice();
                if (result.containsKey(office)) {
                    List<Employee> currentEmployeeList = result.get(office);
                    currentEmployeeList.add(employee);
                } else {
                    List<Employee> newList = new ArrayList<>();
                    newList.add(employee);
                    result.put(office, newList);
                }
            }
        }
        return result;
    }
}
