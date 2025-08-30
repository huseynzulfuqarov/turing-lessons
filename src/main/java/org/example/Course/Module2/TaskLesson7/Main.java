package org.example.Course.Module2.TaskLesson7;

import org.example.Course.Module2.TaskLesson7.model.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 19, 3.6, "Information Technology");
        Student student2 = new Student("Bob", 23, 2.8, "Mechanical Engineering");
        Student student3 = new Student("Alice", 21, 3.4, "Electrical Engineering");
        Student student4 = new Student("Diana", 20, 3.6, "Information Technology");
        Student student5 = new Student("Ethan", 20, 3.0, "Civil Engineering");

        Student[] students = new Student[]{student1, student2, student3, student4, student5};

        System.out.println("Original students:");
        printStudents(students);

        System.out.println("\nbubbleSortAgeAsc:");
        printStudents(bubbleSortAgeAsc(Arrays.copyOf(students, students.length)));

        System.out.println("\nbubbleSortGpaDesc:");
        printStudents(bubbleSortGpaDesc(Arrays.copyOf(students, students.length)));

        System.out.println("\nbubbleSortNameAsc:");
        printStudents(bubbleSortNameAsc(Arrays.copyOf(students, students.length)));

        System.out.println("\nselectionSortAgeAsc:");
        printStudents(selectionSortAgeAsc(Arrays.copyOf(students, students.length)));

        System.out.println("\nselectionSortGpaDesc:");
        printStudents(selectionSortGpaDesc(Arrays.copyOf(students, students.length)));

        System.out.println("\nselectionSortNameAsc:");
        printStudents(selectionSortNameAsc(Arrays.copyOf(students, students.length)));

        System.out.println("\n mixedSort");

        System.out.println("\nsortByAgeName:");
        printStudents(sortByAgeName(Arrays.copyOf(students, students.length)));

        System.out.println("\nsortByGpaAge:");
        printStudents(sortByGpaAge(Arrays.copyOf(students, students.length)));

        System.out.println("\nsortByNameDepartment");
        printStudents(sortByNameDepartment(Arrays.copyOf(students, students.length)));
    }

    public static void printStudents(Student[] students) {
        int i = 0;
        for (Student student : students) {
            System.out.println(i + " -> " + student);
            i++;
        }
    }

    public static Student[] bubbleSortAgeAsc(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getAge() > students[j + 1].getAge()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }

    public static Student[] bubbleSortGpaDesc(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getGpa() < students[j + 1].getGpa()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }

    public static Student[] bubbleSortNameAsc(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getName().compareTo(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }

    public static Student[] selectionSortAgeAsc(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getAge() < students[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Student temp = students[minIndex];
            students[minIndex] = students[i];
            students[i] = temp;
        }
        return students;
    }

    public static Student[] selectionSortGpaDesc(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getGpa() > students[maxIndex].getGpa()) {
                    maxIndex = j;
                }
            }
            Student temp = students[maxIndex];
            students[maxIndex] = students[i];
            students[i] = temp;
        }
        return students;
    }

    public static Student[] selectionSortNameAsc(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getName().compareTo(students[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            Student temp = students[minIndex];
            students[minIndex] = students[i];
            students[i] = temp;
        }
        return students;
    }

    public static Student[] sortByAgeName(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getAge() > students[j + 1].getAge()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                } else if (students[j].getAge() == students[j + 1].getAge()) {
                    if (students[j].getName().compareTo(students[j + 1].getName()) > 0) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }

            }
        }
        return students;
    }

    public static Student[] sortByGpaAge(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getGpa() < students[j + 1].getGpa()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                } else if (students[j].getGpa() == students[j + 1].getGpa()) {
                    if (students[j].getAge() > students[j + 1].getAge()) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
        }
        return students;
    }

    public static Student[] sortByNameDepartment(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getName().compareTo(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                } else if (students[j].getName().compareTo(students[j + 1].getName()) == 0) {
                    if (students[j].getDepartment().compareTo(students[j + 1].getDepartment()) > 0) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
        }
        return students;
    }
}
