package org.example.Course;

import java.util.Scanner;

public class Task0407_rhombus {
    public static void main(String[] args) {

  /*        *         1, 4
           ***        3, 3
          *****       5, 2
         *******      7, 1
        *********     9, 0
         *******      7, 1
          *****       5, 2
           ***        3, 3
            *         1, 4
                            */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n -1;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
                }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * m - i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

