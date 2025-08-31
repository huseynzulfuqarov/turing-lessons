package org.example.Course.Module2.Task9.model;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {
    private static int nextId = 1;

    private int id;
    private String name;
    private int age;
    private double gpa;
    private String department;
    private String email;
    private String phone;
    private String address;
    private int studyYear;
    private boolean active;

    public Student (String name, int age, double gpa, String department,
                   String email, String phone, String address,
                   int studyYear, boolean active) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.studyYear = studyYear;
        this.active = active;
    }

    @Override
    public int compareTo(Student o) {
        int compare = Boolean.compare(this.active, o.active);
        if (compare == 0) {
            compare = Integer.compare(this.studyYear, o.studyYear);
            if (compare == 0) {
                compare = Double.compare(this.gpa, o.gpa);
            }
        }
        return compare;
    }
}
