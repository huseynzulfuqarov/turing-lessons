package org.example.Course.Module2.TaskLesson7.model;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double gpa;
    private String department;

    public Student(String name, int age, double gpa, String department) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name) && Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gpa, department);
    }

    @Override
    public String toString() {
        return String.format("Student ->  | Name: %-5s | Age: %-3d | GPA: %-5.2f | Department: %s", this.name, this.age, this.gpa, this.department);
    }
}
