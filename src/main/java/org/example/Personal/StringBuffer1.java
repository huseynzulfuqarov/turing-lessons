package org.example.Personal;

public class StringBuffer1 {
    public static void main(String[] args) {

        StringBuilder word = new StringBuilder("Hello World");

        word.delete(2,9);

        System.out.println(word);

        System.out.println(word.indexOf("o"));


    }
}
