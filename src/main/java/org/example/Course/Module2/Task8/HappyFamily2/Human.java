package org.example.Course.Module2.Task8.HappyFamily2;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private Family family;
    private String[][] schedule = new String[0][0];

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.birthYear = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = dateOfBirth;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family newFamily) {
        this.family = newFamily;
    }

    public String[][] getSchedule() {
        return Arrays.copyOf(schedule, schedule.length);
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = Arrays.copyOf(schedule, schedule.length);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Human human)) return false;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(birthYear, human.birthYear) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, pet, mother, father, Arrays.deepHashCode(schedule));
    }

    @Override
    public String toString() {
        String motherInfo = (this.mother != null) ? mother.getName() + " " + mother.getSurname() : "null";
        String fatherInfo = (this.father != null) ? father.getName() + " " + father.getSurname() : "null";
        String petInfo = (this.pet != null) ? pet.toString() : "null";
        return "\nHuman ->{" +
                " | Name: " + name +
                " | Surname: " + surname +
                " | DateOfBirth: " + birthYear +
                " | Iq: " + iq +
                " | Mother: " + motherInfo +
                " | Father: " + fatherInfo +
                " | \n\tPet: " + petInfo + "}";
    }
}
