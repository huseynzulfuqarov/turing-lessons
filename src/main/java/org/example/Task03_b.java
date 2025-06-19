package org.example;

import java.util.Scanner;

public class Task03_b {
    public static void main(String[] args) {

        System.err.println("Product list: Select 1 to 5");
        System.out.println(
                """
                        *********************************
                              1: Chocolate Bar - $2.00
                              2: Soda - $1.50
                              3: Chips - $1.20
                              4: Sandwich - $3.00
                              5: Water - $1.00
                        *********************************""");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Chocolate Bar - $2.00"); break;
            case 2: System.out.println("Soda - $1.50"); break;
            case 3: System.out.println("Chips - $1.20"); break;
            case 4: System.out.println("Sandwich - $3.00"); break;
            case 5: System.out.println("Water - $1.00"); break;
            default: System.out.println("Invalid selection. Please enter a number between 1 to 5"); break;

        }
    }
}
