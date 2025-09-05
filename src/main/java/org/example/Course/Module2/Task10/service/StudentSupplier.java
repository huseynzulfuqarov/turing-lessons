package org.example.Course.Module2.Task10.service;

import org.example.Course.Module2.Task10.model.Student;

import java.util.function.Supplier;

public class StudentSupplier implements Supplier<Student> {

    @Override
    public Student get() {
        return new Student("Ali", 19, "adadds", true);
    }
}
