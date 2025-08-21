package org.example.Course.Module2.TaskLesson4.model;

import org.example.Course.Module2.TaskLesson4.interfaces.IBox;

public class BoxObject <T, E, F, C> extends Box implements IBox<C> {
    private F item3;
    private C item4;
    public BoxObject(T item1, E item2, F item3, C item4) {
        super(item1, item2);
        this.item3 = item3;
        this.item4 = item4;
    }

    @Override
    public C computer(C item){
        return null;
    }
}
