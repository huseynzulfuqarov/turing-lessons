package org.example.Course.Module2.Task5;

public class Man extends Human {
    public Man(String name, int age) {
        super(name, age);
    }

    public void introduce() {
        System.out.println("I am a man.");
        super.introduce();
    }
}
