package br.com.entra21.main.exercise_09;

import java.util.Scanner;

public class TableMultiplication {

    public static void tableMultiplication() {

        System.out.println("Write a program that reads any integer and displays its multiplication table from 1 to 10 on the screen:");

        Scanner input = new Scanner(System.in);

        int tableMultiplication;

        System.out.print("Enter the number to do the table multiplication: ");
        tableMultiplication = input.nextInt();

        for (byte count = 0; count <= 10; count++) {

            System.out.println(tableMultiplication + " x " + count + " = " +(tableMultiplication*count));
        }

    }
}
