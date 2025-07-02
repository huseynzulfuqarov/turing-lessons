package org.example;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        byte a1 = 100;
        short a2 = 20000;
        int a3 = 1500000000;
        long a4 = 90000000000L;
        float a5 = 3.5f;
        double a6 = 3.234534535;
        boolean a7 = true;
        char a8 = 'A';

        System.out.println("a1 (byte): " + a1);
        System.out.println("a2 (short): " + a2);
        System.out.println("a3 (int): " + a3);
        System.out.println("a4 (long): " + a4);
        System.out.println("a5 (float): " + a5);
        System.out.println("a6 (double): " + a6);
        System.out.println("a7 (boolean): " + a7);
        System.out.println("a8 (char): " + a8);





        int reqem = 10;
        char herf = 'B';
        double kesr = 12.123;

        System.out.printf("Result is: %d, %s, %.2f\n", reqem, herf, kesr);

        int  c = 3;
        long  a = 5L;
        double  b = 7.12;

        System.out.printf("%d, %d %d\n", c, a, c+a);


        double netice = (a++) + (--b) - (a + 1) + (a += 3) + (++c);
        System.out.printf("Result is: %.3f\n", netice);

        if(a>b)
            System.out.printf("Faxri");
        else if(a<b)
            System.out.printf("Tural");
        else
            System.out.printf("Murad");

        System.out.printf("\nSecond:\n");

        System.out.printf(a > b ?"Fexri" : a < b ? "Tural" : "Murad");
        System.out.println();

        System.out.println(Integer.MAX_VALUE);


        float k = 10.0f;
        float g= 15.0f;
        double f= k/g;

        System.out.println(f);


    }
}
