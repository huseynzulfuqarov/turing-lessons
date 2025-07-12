package org.example.Course.Task5;

public class FamilyApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruno", 4);
        Cat cat1 = new Cat("Misty", 5);

        Dog dog2 = new Dog("Max", 1);
        Cat cat2 = new Cat("Coco", 3);

        Man man1 = new Man("Jack", 33, dog1, cat1);
        Woman woman1 = new Woman("Luna", 23, dog2, cat2);

        System.out.println();
        man1.introduce();
        System.out.println();
        woman1.introduce();
        System.out.println();

        man1.makeSound();
        woman1.makeSound();
        dog1.makeSound();
        cat1.makeSound();
    }
}
