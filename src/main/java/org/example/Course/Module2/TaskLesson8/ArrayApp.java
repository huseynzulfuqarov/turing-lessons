package org.example.Course.Module2.TaskLesson8;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {

        String[][][] lettersArr3D = new String[3][3][3];

        char letterC = 65;
        char letterL = 97;
        System.out.println(letterC);
        for (int i = 0; i < lettersArr3D.length; i++) {
            for (int j = 0; j < lettersArr3D[i].length; j++) {
                for (int k = 0; k < lettersArr3D[i][j].length; k++) {

                    String letter = String.valueOf(letterC) + String.valueOf(letterL);
                    lettersArr3D[i][j][k] = letter;
                    letterC++;
                    letterL++;
                }
            }
        }

        for (int i = 0; i < lettersArr3D.length; i++) {
            for (int j = 0; j < lettersArr3D[i].length; j++) {
                for (int k = 0; k < lettersArr3D[i][j].length; k++) {
                    System.out.print(lettersArr3D[i][j][k] + " ");
                }
                System.out.println("\n\t");
            }
            System.out.println("\n\t\t");
        }
    }
}
