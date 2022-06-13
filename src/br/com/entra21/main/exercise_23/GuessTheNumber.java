package br.com.entra21.main.exercise_23;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void guessTheNumber() {

        System.out.println("Write a program that makes the computer \"think\" of an integer between 0 and 5 and ask the user to try to find out which number was chosen by the computer.\n" +
                "The program should write on the screen if the user won or lost.");

        Scanner input = new Scanner(System.in);
        int number, drawnNumber;
        Random generator = new Random();

        System.out.println("\t==Luck House==");
        System.out.println("choose a number that will be drawn |5 between 0|");
        System.out.print("GOOD LUCK --> ");
        number = input.nextInt();

        drawnNumber = generator.nextInt(5)+1;

        if(number == drawnNumber) {
            System.out.println("YOU WINNER | I thought " +drawnNumber);
        } else {
            System.out.println("YOU LOST | I thought " +drawnNumber);
        }


    }
}
