package org.example.Course.Module1.Task3;

import java.util.Scanner;

public class Task03_c {
    public static void main(String[] args) {
        System.out.println("Enter a number:");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number*i);
        }
    }
}
