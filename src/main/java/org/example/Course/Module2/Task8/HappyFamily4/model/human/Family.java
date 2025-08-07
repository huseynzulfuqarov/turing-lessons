package org.example.Course.Module2.Task8.HappyFamily4.model.human;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {

    static {
        System.out.println("New class is being loaded: Family");
    }

    {
        System.out.println("New object is being created: Family");
    }

    private Human father;
    private Human mother;
    private Human[] children = new Human[0];
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        if (father.getFamily() != null) {
            father.getFamily().deleteChild(father);
        }
        father.setFamily(this);

        if (mother.getFamily() != null) {
            mother.getFamily().deleteChild(mother);
        }
        mother.setFamily(this);
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human[] getChildren() {
        return Arrays.copyOf(children, children.length);
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        if (child == null) {
            System.out.println("Child can't be null");
            return;
        }
        if (child.getFamily() != null) {
            System.out.println("This human already have a family");
            return;
        }
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[newChildren.length - 1] = child;
        children = newChildren;
        child.setFamily(this);
        System.out.printf("Child: \"%s\" added.\n", child.getName());
    }

    public boolean deleteChild(int indexOfChildInArray) {
        if (indexOfChildInArray < 0 || indexOfChildInArray >= children.length) {
            return false;
        }

        Human[] tempChildren = new Human[children.length - 1];
        children[indexOfChildInArray].setFamily(null);

        int index = 0;
        for (int i = 0; i < children.length; i++) {
            if (i == indexOfChildInArray) {
                continue;
            }
            tempChildren[index++] = children[i];
        }
        children = tempChildren;
        return true;
    }

    public boolean deleteChild(Human child) {
        if (child == null || children.length == 0) return false;
        int foundIndex = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1) {
            return false;
        }
        return deleteChild(foundIndex);
    }

    public int countFamily() {
        return 2 + children.length;
    }

    public void greetPet() {
        if (pet == null) {
            System.out.println("You have not a pet");
            return;
        }
        System.out.printf("Hello, %s!\n", pet.getNickname());
    }

    public void describePet() {
        if (pet == null) {
            System.out.println("You have not a pet");
            return;
        }
        System.out.printf("I have a %s, he is %d years old, he is %s.\n", pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    public boolean feedPet(boolean isTimeToFeed) {
        if (pet == null) {
            System.out.println("You have not a pet");
            return false;
        }
        Random rd = new Random();
        int a = rd.nextInt(100);
        if (isTimeToFeed || a < pet.getTrickLevel()) {
            System.out.printf("Hm... I will feed %s. \nPet say: -> ", pet.getNickname());
            pet.eat();
            return true;
        } else {
            System.out.printf("I think %s is not hungry.\n", pet.getNickname());
            return false;
        }
    }

    private String getChildrenNamesFromArray(Human[] children) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < children.length; i++) {
            sb.append(children[i].getName())
                    .append(" ")
                    .append(children[i].getSurname());
            if (i != children.length - 1) {
                sb.append(" | ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Family family)) return false;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother) && Objects.deepEquals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother, Arrays.hashCode(children), pet);
    }

    @Override
    public String toString() {
        String petData = pet == null ? "null" : pet.getNickname();
        return "\nFamily ->{" +
                " Father: " + father.getName() + " " + father.getSurname() +
                " | Mother: " + mother.getName() + " " + mother.getSurname() +
                "\n\t | Children: " + getChildrenNamesFromArray(children) +
                "\n\t\t | Pet: " + petData + " }";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize: Family object is being destroyed -> " + this.father.getSurname() + " family");
    }
}
