package org.example.Course.Module2.Task11;

import org.example.Course.Module2.Task11.model.CustomLinkedList;

public class Main {

    public static void main(String[] args) {

        CustomLinkedList<String> list = new CustomLinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");

        System.out.println(list);

        System.out.println(list.get(5));

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        System.out.println(list.remove("d"));

        list.set(3,"gg");

        System.out.println(list);

        list.clear();

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        System.out.println(list);
    }
}
