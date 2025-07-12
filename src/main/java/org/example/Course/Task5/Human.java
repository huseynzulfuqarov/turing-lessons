package org.example.Course.Task5;

public class Human extends Animal {
    private Dog dog;
    private Cat cat;

    public Human(String name, int age, Dog dog, Cat cat) {
        super(name, age);
        this.dog = dog;
        this.cat = cat;
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
        System.out.println("My dog name is " + dog.getName() + " and my dog age is " + dog.getAge() + ".");
        System.out.println("My cat name is " + cat.getName() + " and my cat age is " + cat.getAge() + ".");
    }

}
