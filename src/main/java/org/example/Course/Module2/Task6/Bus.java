package org.example.Course.Module2.Task6;

public class Bus extends Vehicle {
    private int capacity;
    private boolean isDoubleDecker;

    public Bus(String brand, String model, String plateNumber, int capacity, boolean isDoubleDecker) {
        super(brand, model, plateNumber);
        this.capacity = capacity;
        this.isDoubleDecker = isDoubleDecker;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    @Override
    public void drive() {
        System.out.printf("Bus with capacity %d is moving\n", capacity);
    }

    @Override
    public String toString() {
        return String.format("Bus{capacity: %d, isDoubleDecker: %b}", capacity, isDoubleDecker) + super.toString();
    }
}
