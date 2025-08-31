package org.example.Course.Module2.Task9.model;

import lombok.Data;

@Data
public class Student {
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

    public Student(String name, int age, double gpa, String department,
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
}
