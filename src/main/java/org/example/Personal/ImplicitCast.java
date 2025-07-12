package org.example.Personal;

import java.util.Arrays;

public class ImplicitCast {
    public static void main(String[] args) {
        byte a=5;
        byte b=6;
        b+=a;
       // b = a+b;
        System.out.println(b);

            int[] arr=new int[3];
            arr[0]=5;
            arr[1]=6;
            arr[2]=7;
            System.out.println(Arrays.toString(arr));
    }
}
