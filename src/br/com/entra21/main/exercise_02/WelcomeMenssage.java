package br.com.entra21.main.exercise_02;

import java.util.Scanner;

public class WelcomeMenssage {

    public static void welcomeMenssage() {

        System.out.println("Make a program that reads a person's name and displays a welcome message:");

        Scanner input = new Scanner(System.in);

        String name;

        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println("Welcome " +name+ " on my program!");

    }
}
