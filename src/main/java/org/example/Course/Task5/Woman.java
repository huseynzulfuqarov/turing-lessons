package org.example.Course.Task5;

public class Woman extends Human {
    public Woman(String name, int age, Dog dog, Cat cat) {
        super(name, age, dog, cat);
    }

    public void introduce() {
        System.out.println("I am a woman.");
        super.introduce();
    }
}
