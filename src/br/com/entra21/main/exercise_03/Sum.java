package br.com.entra21.main.exercise_03;

import java.util.Scanner;

public class Sum {

    public static void sum() {

        System.out.println("Create a program that reads two numbers and displays the sum between them:");

        Scanner input = new Scanner(System.in);

        float numberA, numberB;

        System.out.print("Enter the number one: ");
        numberA = input.nextFloat();
        System.out.print("Enter the number two: ");
        numberB = input.nextFloat();
        System.out.println(numberA+ " + " +numberB+ " = " +(numberA+numberB));



    }
}
