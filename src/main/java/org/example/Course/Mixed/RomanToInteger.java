package org.example.Course.Mixed;

public class RomanToInteger {
    public static void main(String[] args) {

        String st = "MCMXCIV";
        System.out.println(romanToInt(st));
    }

    public static int romanToInt(String s) {

        String[] arr = s.split("");
        int eded = 0;
        int i = 0;

        while (i < arr.length) {
            if (i + 1 < arr.length && arr[i].equals("I") && arr[i + 1].equals("V")) {
                eded += 4;
                i += 2;
            } else if (i + 1 < arr.length && arr[i].equals("I") && arr[i + 1].equals("X")) {
                eded += 9;
                i += 2;
            } else if (i + 1 < arr.length && arr[i].equals("X") && arr[i + 1].equals("L")) {
                eded += 40;
                i += 2;
            } else if (i + 1 < arr.length && arr[i].equals("X") && arr[i + 1].equals("C")) {
                eded += 90;
                i += 2;
            } else if (i + 1 < arr.length && arr[i].equals("C") && arr[i + 1].equals("D")) {
                eded += 400;
                i += 2;
            } else if (i + 1 < arr.length && arr[i].equals("C") && arr[i + 1].equals("M")) {
                eded += 900;
                i += 2;
            } else if (arr[i].equals("I")) {
                eded += 1;
                i++;
            } else if (arr[i].equals("V")) {
                eded += 5;
                i++;
            } else if (arr[i].equals("X")) {
                eded += 10;
                i++;
            } else if (arr[i].equals("L")) {
                eded += 50;
                i++;
            } else if (arr[i].equals("C")) {
                eded += 100;
                i++;
            } else if (arr[i].equals("D")) {
                eded += 500;
                i++;
            } else if (arr[i].equals("M")) {
                eded += 1000;
                i++;
            }
        }
        return eded;
    }
}

