package org.example.Course.Module2.Task5;

public class Woman extends Human {
    public Woman(String name, int age) {
        super(name, age);
    }

    public void introduce() {
        System.out.println("I am a woman.");
        super.introduce();
    }
}
