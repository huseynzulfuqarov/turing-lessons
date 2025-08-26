package org.example.Course.Module2.TaskLesson5;

public class Optional2<T> {
    private T value;

    public Optional2(T value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public boolean isPresent() {
        return value != null;
    }

    public T getValue() {
        boolean isEmpty = isEmpty();
        if (!isEmpty) {
            return value;
        }
        return null;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static  <T> Optional2<T> of(T value) {
        if (value == null) {
            throw new NullPointerException("value is null");
        }
        return new Optional2<T>(value);


    }
}

