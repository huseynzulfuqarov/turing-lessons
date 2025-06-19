package org.example;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        int score1, score2, score3;
        double average;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the scores: ");
        score1 = sc.nextInt();
        score2 = sc.nextInt();
        score3 = sc.nextInt();

        average = (score1 + score2 + score3) / 3.0;

        if((score1 < 40) || (score2 < 40) || (score3 < 40))
            System.out.println("Failed - One or more exam scores are too low.");

        else if((average >= 85) && (score1 >= 85) && (score2 >= 85) && (score3 >= 85))
            System.out.println("Congratulations! You have earned a Certificate of Excellence.");

        else if((average >= 70 && average < 85) && (score1 >= 60) && (score2 >= 60) && (score3 >= 60))
            System.out.println("Well done! You have earned a Certificate of Achievement.");

        else if(average >= 50 && average < 70)
            System.out.println("You passed.");

        else
            System.out.println("Failed.");

    }
}
