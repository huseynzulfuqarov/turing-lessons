package org.example.Course.Module2.Task9;

import org.example.Course.Module2.Task9.model.Student;
import org.example.Course.Module2.Task9.sorting.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20, 3.5, "Computer Science",
                "alice@example.com", "0501234567", "Baku", 2, true);

        Student s2 = new Student("Bob", 21, 3.8, "Mathematics",
                "bob@example.com", "0512345678", "Ganja", 3, true);

        Student s3 = new Student("Charlie", 19, 3.2, "Physics",
                "charlie@example.com", "0523456789", "Sumqayit", 1, true);

        Student s4 = new Student("Diana", 22, 3.9, "Chemistry",
                "diana@example.com", "0534567890", "Baku", 4, true);

        Student s5 = new Student("Ethan", 20, 3.6, "Biology",
                "ethan@example.com", "0545678901", "Ganja", 2, false);

        Student s6 = new Student("Fiona", 21, 3.7, "Engineering",
                "fiona@example.com", "0556789012", "Sumqayit", 3, true);

        Student[] students = {s1, s2, s3, s4, s5, s6};


        System.out.println("Original list of students:");
        printStudents(students);

        System.out.println("\nSorted by Comparable (natural order):");
        Student[] studentsForComparable = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForComparable);
        printStudents(studentsForComparable);

        System.out.println("\nSorted by Active, then Study Year, then GPA:");
        Student[] studentsForActiveSort = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForActiveSort, new ByActiveThenStudyYearThenGpa());
        printStudents(studentsForActiveSort);

        System.out.println("\nSorted by Name:");
        Student[] studentsForNameSort = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForNameSort, new ByName());
        printStudents(studentsForNameSort);

        System.out.println("\nSorted by Name, then GPA:");
        Student[] studentsForNameGpaSort = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForNameGpaSort, new ByNameThenGpa());
        printStudents(studentsForNameGpaSort);

        System.out.println("\nSorted by GPA, then Age:");
        Student[] studentsForGpaAgeSort = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForGpaAgeSort, new ByGpaThenAge());
        printStudents(studentsForGpaAgeSort);

        System.out.println("\nSorted by Department, then GPA, then Name:");
        Student[] studentsForDeptSort = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForDeptSort, new ByDepartmentThenGpaThenName());
        printStudents(studentsForDeptSort);

        System.out.println("\nSorted by all fields:");
        Student[] studentsForAllFieldsSort = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForAllFieldsSort, new ByAllFields());
        printStudents(studentsForAllFieldsSort);
    }

    public static void printStudents(Student[] students) {
        int i = 0;
        for (Student student : students) {
            System.out.println(i + " -> " + student);
            i++;
        }
    }
}