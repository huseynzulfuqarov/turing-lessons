package org.example.Course.Module2.Task10.service;

import org.example.Course.Module2.Task10.model.Student;

import java.util.function.Function;

public class StudentFunction implements Function<Student, String> {
    @Override
    public String apply(Student student) {
        return student.getName();
    }
}
