package org.example.Course.Module2.Task6;

public class Vehicle {
    private String brand;
    private String model;
    private String plateNumber;
    private boolean isAvailable;

    public Vehicle(String brand, String model, String plateNumber) {
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.isAvailable = true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void drive() {
        System.out.println("Vehicle is moving..");
    }

    @Override
    public String toString() {
        return String.format("Vehicle{Brand: %s, Model: %s, Plate Number: %s}", brand, model, plateNumber);
    }

}
