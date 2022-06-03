package br.com.entra21.main.exercise_04;

import java.util.Scanner;

public class CountingLetters {

    public static void countingLetters() {

        System.out.println("Make a program that reads a word and tells you how many letters it has:");

        Scanner input = new Scanner(System.in);

        String word;
        int letters;

        System.out.println("What is the word you wanna count?");
        word = input.nextLine();

        letters = word.length();

        System.out.println("Your word has " +letters+ " letters.");


    }
}
