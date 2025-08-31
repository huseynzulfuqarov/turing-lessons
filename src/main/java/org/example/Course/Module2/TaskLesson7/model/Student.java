package org.example.Course.Module2.TaskLesson7.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private double gpa;
    private String department;

    @Override
    public String toString() {
        return String.format("Student ->  | Name: %-5s | Age: %-3d | GPA: %-5.2f | Department: %s", this.name, this.age, this.gpa, this.department);
    }
}
