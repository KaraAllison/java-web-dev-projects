package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Henry","Mill",103));
        employees.add(new Employee("Nal","Brown",9));
        employees.add(new Employee("Frank","Hop",865));
        employees.add(new Employee("Deborah","King",980));
        employees.add(new Employee("George","Sky",111));
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println(System.lineSeparator());
        employees.sort(Employee::compare);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
