package org.example.Course.Module2.Task6;

public class Driver {
    private String name;
    private int age;
    private String licenseNumber;

    public Driver(String name, int age, String licenseNumber) {
        this.name = name;
        this.age = age;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return String.format("Driver{Name: %s, Age: %d, License: %s}", name, age, licenseNumber);
    }
}
