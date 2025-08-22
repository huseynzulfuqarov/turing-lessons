package org.example.Course.Module2.TaskLesson5;

public class Optional2 <T>{
    T value;

    public Optional2(T value) {
        this.value = value;
    }

    public boolean isEmpty() {
        if(value == null){
            return true;
        }
        return false;
    }

    public boolean isPresent() {
        if(value != null){
            return true;
        }
        return false;
    }

    public T getValue() {
       boolean isEmpty = isEmpty();
        if(!isEmpty){
            return value;
        }
        return null;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

