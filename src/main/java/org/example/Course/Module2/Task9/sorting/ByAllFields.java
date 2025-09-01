package org.example.Course.Module2.Task9.sorting;

import org.example.Course.Module2.Task9.model.Student;

import java.util.Comparator;

public class ByAllFields implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compare = o1.getId() - o2.getId();
        if (compare == 0) {
            compare = o1.getName().compareTo(o2.getName());
            if (compare == 0) {
                compare = Integer.compare(o1.getAge(), o2.getAge());
                if (compare == 0) {
                    compare = Double.compare(o1.getGpa(), o2.getGpa());
                    if (compare == 0) {
                        compare = o1.getDepartment().compareTo(o2.getDepartment());
                        if (compare == 0) {
                            compare = o1.getEmail().compareTo(o2.getEmail());
                            if (compare == 0) {
                                compare = o1.getPhone().compareTo(o2.getPhone());
                                if (compare == 0) {
                                    compare = o1.getAddress().compareTo(o2.getAddress());
                                    if (compare == 0) {
                                        compare = o1.getStudyYear() - o2.getStudyYear();
                                        if (compare == 0) {
                                            compare = Boolean.compare(o1.isActive(), o2.isActive());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return compare;
    }
}
