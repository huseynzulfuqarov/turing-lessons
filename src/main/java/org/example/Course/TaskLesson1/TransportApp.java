package org.example.Course.TaskLesson1;

public class TransportApp {
    public static void main(String[] args) {

        Moto HarleyDavidson = new Moto("123A", "red", 2999.99, 654.3, 600.4, 2025);

        Car BMW = new Car("X5", "black", 99999.99, 2455.6, 350.6, 2024);

        System.out.println(HarleyDavidson.toString());
        System.out.println(BMW.toString());
    }
}
