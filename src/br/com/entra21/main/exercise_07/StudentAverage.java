package br.com.entra21.main.exercise_07;

import java.util.Scanner;

public class StudentAverage {

    public static void StudentAverage() {

        System.out.println("Develop a program that reads a student's two grades, calculates and displays their average:");

        Scanner input = new Scanner(System.in);

        float gradeA, gradeB;

        System.out.println("What is your test score?");
        gradeA = input.nextFloat();
        if (gradeA > 10 || gradeA < 0) {
            do{
                System.out.println("Your entered score is not correct, repeat pleas.");
                gradeA = input.nextFloat();
            }while(gradeA > 10 || gradeA < 0);
        }

        System.out.println("What is your text score?");
        gradeB = input.nextFloat();
        if (gradeB > 10 || gradeB < 0) {
            do{
                System.out.println("Your entered score is not correct, repeat pleas.");
                gradeA = input.nextFloat();
            }while(gradeB > 10 || gradeB < 0);
        }


        System.out.print("Your average is: " + ((gradeA + gradeB) / 2) + "\n");

    }
}
