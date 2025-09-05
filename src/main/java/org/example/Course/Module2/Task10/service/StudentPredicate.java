package org.example.Course.Module2.Task10.service;

import org.example.Course.Module2.Task10.model.Student;

import java.util.function.Predicate;

public class StudentPredicate implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.isActive();
    }
}
