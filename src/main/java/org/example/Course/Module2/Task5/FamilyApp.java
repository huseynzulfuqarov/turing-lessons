package org.example.Course.Module2.Task5;

public class FamilyApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruno", 4);
        Cat cat1 = new Cat("Misty", 5);

        Dog dog2 = new Dog("Max", 2);
        Cat cat2 = new Cat("Coco", 3);

        Man man1 = new Man("Jack", 25);
        Woman woman1 = new Woman("Luna", 23);

        man1.setDog(dog1);
        man1.setCat(cat1);

        woman1.setDog(dog2);
        woman1.setCat(cat2);

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
