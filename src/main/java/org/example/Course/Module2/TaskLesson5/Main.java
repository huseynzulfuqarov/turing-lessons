package org.example.Course.Module2.TaskLesson5;

public class Main {

    public static void main(String[] args) {

        String st = "Hello World";
        String st2 = null;

        Optional2<String> op = new Optional2<>(st);

        op.setValue(st2);

        System.out.println(op.getValue());
    }
}
