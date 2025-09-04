package org.example.Personal.ComparatorTest;

import java.util.Comparator;

public class SortByNameThenAge implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        int compare = o1.getName().compareTo(o2.getName());
        if (compare == 0) {
            compare = o1.getAge() - o2.getAge();
        }
        return compare;
    }
}
