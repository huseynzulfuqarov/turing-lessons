package org.example;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {

        String word = "  Hello World   ";

        System.out.println(word.length());  //uzunlugu

        System.out.println(word.charAt(6)); //6ci simvol

        System.out.println(word.isEmpty());

        System.out.println(word.isBlank());

        System.out.println(word.trim());

        System.out.println(word.toLowerCase());

        System.out.println(word.toUpperCase());

        System.out.println(word.replace('o','a'));

        System.out.println(word.replace("o","aaaa"));

        System.out.println(word.replaceAll("[0-9]","!"));

        System.out.println(word.substring(2));//verilen indexden sona qeder

        System.out.println(word.substring(2, 5));

        System.out.println("bye ".repeat(2));

        System.out.println("Java".compareTo("Python")); //int 0 ve ya 1

        String string = "Hello!";

        System.out.println(string.matches("[a-zA-Z]+"));


        System.out.println(word.equals("dfdf"));

        System.out.println(word.equalsIgnoreCase(word));

        System.out.println(word.startsWith("a"));

        System.out.println(word.endsWith("a"));

        System.out.println(word.indexOf("a"));

        System.out.println(word.lastIndexOf("a"));

        String[] words = word.trim().split(" ");

        System.out.println(Arrays.toString(words));

        int number = 100;
        String sNum = String.valueOf(number);
        System.out.println(sNum);

        String name = "aaa";
        int age = 25;
        String info = String.format("User: %s, age: %d", name, age);
        System.out.println(info);

        String[] arr = {"aa", "bb", "dd"};
        String st = String.join(", ", arr);
        System.out.println(st);

        System.out.println(word.getBytes());
    }
}
