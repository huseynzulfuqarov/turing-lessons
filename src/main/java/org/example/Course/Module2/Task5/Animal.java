package org.example.Course.Module2.Task5;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
