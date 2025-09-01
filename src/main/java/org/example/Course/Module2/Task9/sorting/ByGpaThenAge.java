package org.example.Course.Module2.Task9.sorting;

import org.example.Course.Module2.Task9.model.Student;

import java.util.Comparator;

public class ByGpaThenAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compare = Double.compare(o1.getGpa(), o2.getGpa());
        if (compare == 0) {
            compare = Integer.compare(o1.getAge(), o2.getAge());
        }
        return compare;
    }
}
