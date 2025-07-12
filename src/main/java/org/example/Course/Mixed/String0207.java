package org.example.Course.Mixed;

import java.util.Arrays;

public class String0207 {
    public static void main(String[] args) {
        String str = "a a";

        String[] strr = new String[10];

        System.out.println(strr.length);

        System.out.println(Arrays.toString(strr));

        String[] strArr = str.split("a");
        System.out.println(strArr.length);
        System.out.println(Arrays.toString(strArr));
        for(int i=0;i<strArr.length;i++){
            System.out.println("1"+strArr[i]);
        }
    }
}
