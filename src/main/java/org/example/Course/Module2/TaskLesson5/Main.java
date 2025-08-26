package org.example.Course.Module2.TaskLesson5;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String st = "Hello World";
        String st2 = null;

        Optional2<String> op = new Optional2<>(st);

        op.setValue(st2);

        System.out.println(op.getValue());

        Optional2<String> op2 = Optional2.of(null);

        System.out.println(op2.getValue());

        Optional<String> op3 = Optional.of("Hello World");

        op3.isEmpty();
        op3.isPresent();

        Test test = new Test("dasdsd");

    }
}
