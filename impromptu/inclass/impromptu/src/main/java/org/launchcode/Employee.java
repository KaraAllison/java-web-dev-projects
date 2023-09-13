package org.launchcode;

import java.util.Comparator;
import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    public Employee() {
    }
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int compare(Object o1, Object o2) {
        Employee employee1 = (Employee) o1;
        Employee employee2 = (Employee) o2;
        return employee1.getLastName().compareTo(employee2.getLastName());
    }
}
