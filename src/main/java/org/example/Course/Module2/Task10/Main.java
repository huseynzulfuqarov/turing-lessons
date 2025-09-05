package org.example.Course.Module2.Task10;

import org.example.Course.Module2.Task10.model.Student;
import org.example.Course.Module2.Task10.service.StudentConsumer;
import org.example.Course.Module2.Task10.service.StudentFunction;
import org.example.Course.Module2.Task10.service.StudentPredicate;
import org.example.Course.Module2.Task10.service.StudentSupplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("================ With Manual Method ===================");
        StudentSupplier studentSupplier = new StudentSupplier();
        StudentConsumer studentConsumer = new StudentConsumer();
        StudentFunction studentFunction = new StudentFunction();
        StudentPredicate studentPredicate = new StudentPredicate();

        Student student = studentSupplier.get();

        System.out.println(student);
        System.out.println(studentFunction.apply(student));
        studentConsumer.accept(student);
        System.out.println(studentPredicate.test(student));
        System.out.println("===================================");

        System.out.println("============= With Lambda Expression =================");
        Supplier<Student> supplierLambda = () -> new Student("Emin", 23, "Lambda", true);
        Predicate<Student> predicateLambda = s1 -> s1.isActive();
        Consumer<Student> consumerLambda = s1 -> System.out.println(s1.getName());
        Function<Student, String> functionLambda = s1 -> s1.getAddress();

        Student studentSupplierLambda = supplierLambda.get();

        System.out.println(studentSupplierLambda);
        System.out.println(predicateLambda.test(studentSupplierLambda));
        consumerLambda.accept(studentSupplierLambda);
        System.out.println(functionLambda.apply(studentSupplierLambda));
        System.out.println("===========================");

        System.out.println("============= With Method Reference Expression =================");

        Predicate<Student> isActivePredicate = Student::isActive;
        Function<Student, String> getNameFunction = Student::getName;

        System.out.println(isActivePredicate.test(studentSupplierLambda));
        System.out.println(getNameFunction.apply(studentSupplierLambda));

        Stream.of(studentSupplierLambda)
                .filter(Student::isActive)
                .map(getNameFunction)
                .forEach(System.out::println);
    }
}
