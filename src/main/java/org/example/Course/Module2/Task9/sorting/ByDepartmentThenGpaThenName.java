package org.example.Course.Module2.Task9.sorting;

import org.example.Course.Module2.Task9.model.Student;

import java.util.Comparator;

public class ByDepartmentThenGpaThenName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compare = o1.getDepartment().compareTo(o2.getDepartment());
        if (compare == 0) {
            compare = Double.compare(o1.getGpa(), o2.getGpa());
            if (compare == 0) {
                compare = o1.getName().compareTo(o2.getName());
            }
        }
        return compare;
    }
}
