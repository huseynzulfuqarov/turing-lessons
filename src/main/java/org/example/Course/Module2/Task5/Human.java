package org.example.Course.Module2.Task5;

public class Human extends Animal {
    private Dog dog;
    private Cat cat;

    public Human(String name, int age) {
        super(name, age);
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setDog(Dog newDog) {
        this.dog = newDog;
    }

    public void setCat(Cat newCat) {
        this.cat = newCat;
    }

    public void makeSound() {
        System.out.println("I am talking.");
    }

    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old.");
        if (dog != null)
            System.out.println("My dog-> " + dog.toString());
        if (cat != null)
            System.out.println("My cat-> " + cat.toString());
    }

}
