package org.example.Course.Module2.Task10.model;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {
    private static int nextId = 1;

    private int id;
    private String name;
    private int age;
    private String address;
    private boolean active;

    public Student(String name, int age, String address,boolean active) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.active = active;
    }

    @Override
    public int compareTo(Student o) {
        int compare = Boolean.compare(this.active, o.active);
        if (compare == 0) {
            compare =  this.name.compareTo(o.name);
            if (compare == 0) {
                compare = Integer.compare(this.age, o.age);
            }
        }
        return compare;
    }
}
