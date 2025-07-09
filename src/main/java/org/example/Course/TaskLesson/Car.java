package org.example.Course.TaskLesson;

public class Car {
    String model;
    String color;
    double price;
    double weight;
    double power;
    int year;

    public Car(String model, String color, double price, double weight, double power, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.power = power;
        this.price = price;
        this.weight = weight;
    }

    public String toString() {
        return "Car{model=%s, color=%s, price=%s, weight=%s, power=%s, year=%d}".formatted(this.model, this.color, this.price, this.weight, this.power, this.year);
    }
}
