package org.example.Course;

import java.util.Random;

public class Task0407_Randomizer {

    public static void main(String[] args) {

        Random rd = new Random();
        int[] places = new int[16];

        String[] students = {
                "Aqil", "Huseyn", "Ayla", "Aysu", "Ebulfez",
                "Emin", "Orxan", "Ramzi", "Saleh", "Sedulla",
                "Tural", "Ulvi", "Yusif", "?", "?",
                "?"
        };

        for (int i = 0; i < places.length; i++) {

            int rdPlace = -1;  // vacibdir!!
            boolean check = true;

                    while (check) {

                        check = false;
                        rdPlace = rd.nextInt(16) + 1;

                        for (int j = 0; j < i; j++) {
                            if (places[j] == rdPlace) {
                                check = true;
                                break;
                            }
                        }
                    }
            places[i] = rdPlace;
        }

        for (int i = 0; i < places.length; i++) {
            System.out.println(students[i] + " -> yer: " + places[i]);
        }
    }
}