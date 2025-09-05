package org.example.Course.Module2.Task10.service;

import org.example.Course.Module2.Task10.model.Student;

public class StudentConsumer implements java.util.function.Consumer<Student> {

    @Override
    public void accept(Student student) {
        System.out.println("Age of this student is " + student.getAge());
    }
}
