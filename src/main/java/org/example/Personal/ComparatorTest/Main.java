package org.example.Personal.ComparatorTest;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(1L, "Azer", 21, "S1001", 3.8);
        Student s2 = new Student(2L, "Murad", 22, "S1002", 3.5);
        Student s3 = new Student(3L, "Nigar", 20, "S1003", 3.9);
        Student s4 = new Student(4L, "Ramil", 23, "S1004", 3.2);
        Student s5 = new Student(5L, "Lale", 21, "S1005", 3.7);

        Student[] students = new Student[]{s1, s2, s3, s4, s5};

        Comparator<Human> comparator2 = new SortByNameThenAge();

        Arrays.sort(students, comparator2);

        Arrays.sort(students, new SortByNameThenAge());

        Arrays.sort(students, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                int compare = o1.getName().compareTo(o2.getName());
                if (compare == 0) {
                    compare = o1.getAge() - o2.getAge();
                }
                return compare;
            }
        });


        for (Student student : students) {
            System.out.println(student);
        }
    }
}