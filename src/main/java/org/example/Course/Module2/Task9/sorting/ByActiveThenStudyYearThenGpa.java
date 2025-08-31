package org.example.Course.Module2.Task9.sorting;

import org.example.Course.Module2.Task9.model.Student;

import java.util.Comparator;

public class ByActiveThenStudyYearThenGpa implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compare = Boolean.compare(o1.isActive(), o2.isActive());
        if (compare == 0) {
            compare = Integer.compare(o1.getStudyYear(), o2.getStudyYear());
            if (compare == 0) {
                compare = Double.compare(o1.getGpa(), o2.getGpa());
            }
        }
        return compare;
    }
}

