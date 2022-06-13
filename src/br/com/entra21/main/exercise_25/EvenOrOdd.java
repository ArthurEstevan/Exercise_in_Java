package br.com.entra21.main.exercise_25;

import java.util.Scanner;

public class EvenOrOdd {

    public static void evenOrOdd() {

        System.out.println("\nCreate a program that reads an integer and shows on the screen if it is ODD or EVEN.");

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("\nEnter a number: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number+ " IS EVEN");
        } else {
            System.out.println(number + " IS ODD");
        }
    }
}
