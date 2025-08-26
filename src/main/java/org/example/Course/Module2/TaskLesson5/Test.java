package org.example.Course.Module2.TaskLesson5;

public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName2() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString2() {
        return name;
    }
    public String toUpperCase2() {
        return name.toUpperCase();
    }

    public String toLowerCase2() {
        return name.toLowerCase();
    }

    public String concat2(String a) {
        return this.name.concat(a);
    }
}
