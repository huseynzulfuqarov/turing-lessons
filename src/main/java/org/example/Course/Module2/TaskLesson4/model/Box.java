package org.example.Course.Module2.TaskLesson4.model;

public abstract class Box<T, E> {
    private T item;
    private E item2;

    public Box(T item, E item2) {
        this.item = item;
        this.item2 = item2;
    }
}
