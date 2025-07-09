package org.example.Course.TaskLesson;

public class Moto {
    String model;
    String color;
    double price;
    double weight;
    double power;
    int year;

    public Moto(String model, String color, double price, double weight, double power, int year) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.power = power;
        this.year = year;
    }

    public String toString() {
        return "Moto{model=%s, color=%s, price=%s, weight=%s, power=%s, year=%d}".formatted(this.model, this.color, this.price, this.weight, this.power, this.year);
    }
}
