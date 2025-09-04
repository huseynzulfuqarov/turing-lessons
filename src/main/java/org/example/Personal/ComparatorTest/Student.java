package org.example.Personal.ComparatorTest;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Student extends Human {
    private String studentNo;
    private Double gpa;

    public Student(Long id, String name, int age, String studentNo, Double gpa) {
        super(id, name, age);
        this.studentNo = studentNo;
        this.gpa = gpa;
    }
}