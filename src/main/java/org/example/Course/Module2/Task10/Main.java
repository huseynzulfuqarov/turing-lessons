package org.example.Course.Module2.Task10;

import org.example.Course.Module2.Task10.model.Student;
import org.example.Course.Module2.Task10.service.StudentConsumer;
import org.example.Course.Module2.Task10.service.StudentFunction;
import org.example.Course.Module2.Task10.service.StudentPredicate;
import org.example.Course.Module2.Task10.service.StudentSupplier;

public class Main {

    public static void main(String[] args) {

        StudentSupplier studentSupplier = new StudentSupplier();
        StudentConsumer studentConsumer = new StudentConsumer();
        StudentFunction studentFunction = new StudentFunction();
        StudentPredicate studentPredicate = new StudentPredicate();

        Student student = studentSupplier.get();

        System.out.println(student);
        System.out.println(studentFunction.apply(student));
        studentConsumer.accept(student);
        System.out.println(studentPredicate.test(student));
    }
}
