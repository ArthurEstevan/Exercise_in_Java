package br.com.entra21.main.exercise_29;

import java.util.Scanner;

public class ComparingValues {

    public static void comparingValues() {

        System.out.println("Write a program that reads two integers and compares them. showing on the screen a message according to the condition:\n" +
                "The first value is higher\n" +
                "The second value is higher\n" +
                "There is no greater value, both are equal\n");

        Scanner input = new Scanner(System.in);
        int numeroA, numeroB;

        System.out.print("What number A: ");
        numeroA = input.nextInt();

        System.out.print("What number B: ");
        numeroB = input.nextInt();

        if (numeroA > numeroB) {
            System.out.println("First Number -> " + numeroA + " | " +numeroB+ " <- Second Number");
        } else if (numeroB > numeroA) {
            System.out.println("First Number -> " + numeroB + " | " +numeroA+ " <- Second Number");
        } else {
            System.out.println("The two numbers are same -> " + numeroA + " = " + numeroB);
        }

    }
}
