package org.example.Personal;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        printTriangle(size);
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }

