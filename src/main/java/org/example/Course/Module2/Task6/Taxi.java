package org.example.Course.Module2.Task6;

public class Taxi extends Vehicle {
    private int passengerCount;
    private String taxiCompany;

    public Taxi(String brand, String model, String plateNumber, int passengerCount, String taxiCompany) {
        super(brand, model, plateNumber);
        this.passengerCount = passengerCount;
        this.taxiCompany = taxiCompany;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getTaxiCompany() {
        return taxiCompany;
    }

    public void setTaxiCompany(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public void calculateFare(int km) {
        System.out.println("Total fare: " + km * getPassengerCount() * 2);

    }

    public void calculateFare(int km, boolean nightShift) {
        System.out.println("Total fare with night shift: " + (km * getPassengerCount() * 2 + (nightShift ? 10 : 0)));
    }

    @Override
    public void drive() {
        System.out.printf("Taxi from %s is driving with %d passengers\n", taxiCompany, passengerCount);
    }

    @Override
    public String toString() {
        return String.format("Taxi{passengerCount: %s, taxiCompany: %s}", passengerCount, taxiCompany) + super.toString();
    }
}
