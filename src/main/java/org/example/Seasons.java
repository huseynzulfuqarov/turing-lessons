package org.example;

public class Seasons {
    public static void main(String[] args) {

        int ay = 2;

            System.out.println((ay >= 3 && ay <= 5) ? "Yaz" :
                               (ay >= 6 && ay <= 8) ? "Yay" :
                               (ay >= 9 && ay <= 11) ? "Payız" :
                               ((ay >= 1 && ay <= 2) || ay == 12) ? "Qış" : "Yanlış ay");

    }
}
