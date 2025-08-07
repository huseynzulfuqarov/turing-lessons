package org.example.Course.Module2.Task8.HappyFamily3;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    static {
        System.out.println("New class is being loaded: Pet");
    }

    {
        System.out.println("New object is being created: Pet");
    }

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = new String[0];

    public Pet(String nickname, Species species) {
        this.nickname = nickname;
        this.species = species;
    }

    public Pet(String nickname, Species species, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pet pet)) return false;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Objects.deepEquals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, Arrays.hashCode(habits));
    }
/*
    @Override
    public String toString() {
        return "Pet ->{" +
                " Nickname: " + nickname +
                " | Age: " + age +
                " | TrickLevel: " + trickLevel +
                " | Habits: [" + Arrays.toString(habits) + "]}";
    }*/

    @Override
    public String toString() {
        return species.name() + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                ", canFly=" + species.canFly() +
                ", numberOfLegs=" + species.getNumberOfLegs() +
                ", hasFur=" + species.hasFur() +
                '}';
    }
}

