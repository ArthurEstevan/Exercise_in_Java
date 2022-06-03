package br.com.entra21.main.exercise_05;

import java.util.Scanner;

public class SuccessorAndPredecessor {

    public static void SuccessorAndPredecessor() {

        System.out.println("Write a program that reads an integer and displays it's successor and predecessor on the screen.");

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Type a number to see its successor and predecessor: ");
        number = input.nextInt();

        System.out.println("Sucessor: " +(number+1)+ " | Predecessor: " +(number-1));
    }
}
