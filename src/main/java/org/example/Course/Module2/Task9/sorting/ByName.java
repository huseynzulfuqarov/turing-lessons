package org.example.Course.Module2.Task9.sorting;

import org.example.Course.Module2.Task9.model.Student;

import java.util.Comparator;

public class ByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
     return o1.getName().compareTo(o2.getName());
    }
}
