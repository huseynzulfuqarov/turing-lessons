package org.example.Course.Mixed;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Animal", 1, "red");
        Animal animal2 = new Cat("Animal", 1, "red");

        System.out.println(animal2 == animal1);

    }
}
