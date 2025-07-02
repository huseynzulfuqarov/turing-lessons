package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class TaskSexsi {
    static  String str = "";
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){
            System.out.println(
                    """
                            1. Cumle daxil et
                            2. Mətndəki ən uzun sözü tap və göstər.
                            3. Mətndəki bütün sözləri əlifba sırası ilə çap et.
                            4. İstifadəçidən bir hərf al və həmin hərflə başlayan bütün sözləri göstər.
                            5. Mətndəki sözlərin sayını göstər.
                            6. Proqramdan çıxış.
                            """

            );

            System.out.print("\nSeçiminizi daxil edin: ");
            int c = sc.nextInt();
            sc.nextLine();
            fun(c);
        }
    }

    public static void fun(int c) {
        switch (c) {
            case 1 -> {
                System.out.print("Yazını daxil edin: ");
                str = sc.nextLine();
            }
            case 2 -> {
                if (str.isEmpty()) {
                    System.out.println("cumle yaz");
                    return;
                }
                int max = 0;
                String maxstr = "";
                String[] split = str.split(" ");
                for (int i = 0; i < split.length; i++) {
                    int lg = split[i].length();
                    if (max < lg) {
                        max = lg;
                        maxstr = split[i];
                    }

                }
                System.out.println("En uzun soz: " + maxstr);


            }
            case 3 -> {
                if (str.isEmpty()) {
                    System.out.println("cumle yaz");
                    return;
                }
                String[] split = str.split(" ");
                Arrays.sort(split);
                for (int i = 0; i < split.length; i++) {
                    System.out.println("Sirlanmis sira: " + split[i]);
                }


            }
            case 4 -> {
                if (str.isEmpty()) {
                    System.out.println("cumle yaz");
                    return;
                }
                String h = sc.next();
                String[] split = str.split(" ");
                for (int i = 0; i < split.length; i++) {
                    if (split[i].startsWith(h)) {
                        System.out.println(h + " ile baslayan sozler " + split[i]);
                    }
                }
            }

            case 5 -> {
                if (str.isEmpty()) {
                    System.out.println("cumle yaz");
                    return;
                }                    String[] split = str.split(" ");
                System.out.println("sozlerin sayi: " + split.length);

            }
            case 6 -> {
                System.exit(0);
            }

        }
    }
}