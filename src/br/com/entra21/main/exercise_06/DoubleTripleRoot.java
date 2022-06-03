package br.com.entra21.main.exercise_06;

import java.util.Scanner;

public class DoubleTripleRoot {

    public static void DoubleTripleRoot() {

        System.out.println("Create a program that reads a number and displays its double, triple and square root:");

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter the number: ");
        number = input.nextInt();
        System.out.println("Double: " +(number*2));
        System.out.println("Triple: " +(number*3));
        System.out.println("Root: " +(Math.sqrt(number)));
    }
}
