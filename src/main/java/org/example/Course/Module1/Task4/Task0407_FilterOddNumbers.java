package org.example.Course.Module1.Task4;

import java.util.Arrays;

public class Task0407_FilterOddNumbers {
    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 8, 3, 10, 15, 22, 3};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        int[] arr2 = Arrays.copyOf(arr, index);

        System.out.println(Arrays.toString(arr2));
    }
}
