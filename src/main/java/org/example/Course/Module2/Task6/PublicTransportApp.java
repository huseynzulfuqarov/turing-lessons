package org.example.Course.Module2.Task6;

public class PublicTransportApp {

    public static void main(String[] args) {

        Vehicle v1 = new Taxi("BYD", "Destroyer", "10-TP-556", 4, "Bolt");
        Vehicle v2 = new Bus("Mercedes-Benz", "Citaro", "20-BS-789", 100, true);

        Driver dr1 = new Driver("Vasif", 35, "G544061739");

        v1.drive();
        v2.drive();

        System.out.println();

        if (v1 instanceof Taxi) {
            Taxi taxi = (Taxi) v1;
            taxi.calculateFare(10);
        }

        if (v1 instanceof Taxi) {
            Taxi taxi = (Taxi) v1;
            taxi.calculateFare(10, true);
        }

        System.out.println("\n" + v1.toString());
        System.out.println(v2.toString());
        System.out.println(dr1.toString());

        dr1.setAge(41);
        dr1.setName("Elvin");
        dr1.setLicenseNumber("F298342");
        System.out.println();
        System.out.println("Driver with new values: " + dr1.toString());
    }
}
