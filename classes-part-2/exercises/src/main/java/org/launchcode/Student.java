package org.launchcode;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        if (this.numberOfCredits >= 90) {
            return "Senior";
        } else if (this.numberOfCredits >= 60) {
            return "Junior";
        } else if (this.numberOfCredits >= 30) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 0) {
            return "Freshman";
        } else {
            return null;
        }
        // Determine the grade level of the student based on numberOfCredits
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double quality = this.gpa * this.numberOfCredits;
        quality += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = quality/this.numberOfCredits;
        // Update the appropriate fields: numberOfCredits, gpa
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    @Override
    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f",
                this.name, this.getGradeLevel(), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}