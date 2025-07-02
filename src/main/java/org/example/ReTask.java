package org.example;

import java.util.Scanner;

public class ReTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Reqem daxil et:");
        int a = sc.nextInt();
        System.out.println("Daxil etiyinz reqem: " + a);

        if(a<10 && a>5)
            System.out.println("a 5 den boyukdur ve 10 dan kicikdir");
        else if(a<5 && a>3)
            System.out.println("a 3 den boyukdur ve 5 den kicikdir");
        else
            System.out.println("else isledi");


        System.out.println("\n\nTernary operaotor");
        String str =  sc.next();

        String str2 = (str.equals("Hello")? "salamlama1" : str.equals("Hi")? "salamlama2" : "adi soz");

        System.out.println(str2 + "\n\n");


        System.out.println("Piramida:");

        for(int i=1; i<=5; i++){

            for(int k=1; k<=5-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

        System.out.println("\n\n");

        System.out.print("reqem daxil et:");

        int num = sc.nextInt();
        int start = 1;

        while(start < num){
            if(num%7==0){
                System.out.println("7ye bolunenler" + num);
            }
            start++;
        }

        System.out.println("\n\n");


        System.out.println("ayin nomresini daxil et: ");
        int d = sc.nextInt();

        switch (d){
            case 1 -> System.out.println("yanvar");
            case 2 -> System.out.println("fevral");
            case 3 -> System.out.println("mart");
            case 4 -> System.out.println("aprel");
            case 5 -> System.out.println("may");
            case 6 -> System.out.println("iyun");
            case 7 -> System.out.println("iyul");
            case 8 -> System.out.println("avgust");
            case 9 -> System.out.println("sentyabr");
            case 10 -> System.out.println("oktyabr");
            case 11 -> System.out.println("noyabir");
            case 12 -> System.out.println("dekabr");
            default -> System.out.println("sehv ay");
        }


        System.out.println("\n\n");


        StringBuilder sb = new StringBuilder(); //thred tehlukesi, suretli
        StringBuffer sbf = new StringBuffer(); //tehlukesiz, yavas
        String sf= "dd"; //string pool da yaradir/effetiv ve immutubledir
        String st = new String("dsda"); //heapde birbasa yardir hemde poolda da yaranir("" olduguna gore)





        int[] arr= new int[5];
        System.out.print("arr daxil et: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        System.out.println("\n\n");


    /*    do{

        }
        while(sert)*/


        System.out.println("method topladi: "+ sum(4,5));

        System.out.println("\n\n");

        System.out.println("str arrray daxil et:");
        String[][] arrs = new String[5][5];
        for(int i=0; i<arrs.length; i++){
            for(int j=0; j<arrs[i].length; j++){
                arrs[i][j] = sc.next();
            }
        }
        for(int i=0; i<arrs.length; i++){
            for(int j=0; j<arrs[i].length; j++){
                System.out.println(arrs[i][j]);
            }
        }


        System.out.println("\n\n");


        int[][] maxrix ={
            {1,3,345,54,45,45},
            {1,3,2,4,4,5,45},
            {1,343,243,434,4,534,45},
        };

        for(int i=0; i<maxrix.length; i++){
            for(int j=0; j<maxrix[i].length; j++){
                System.out.println(maxrix[i][j]);
            }
            System.out.println();
        }














    }


    public static int sum(int a, int b){
        return a+b;
    }
}
