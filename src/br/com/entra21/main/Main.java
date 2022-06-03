package br.com.entra21.main;

import br.com.entra21.main.exercise_01.HelloWorld;
import br.com.entra21.main.exercise_02.WelcomeMenssage;
import br.com.entra21.main.exercise_03.Sum;
import br.com.entra21.main.exercise_04.CountingLetters;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        byte option;

        do {

            System.out.println("Select Exercise");
            System.out.println("0 - Leave");
            System.out.println("1 - Exercise Hello World");
            System.out.println("2 - Exercise Welcome");
            System.out.println("3 - Exercise Sum");
            System.out.println("4 - Exercise Counting Letters");
            System.out.println("5 - Exercise");
            System.out.println("6 - Exercise");
            System.out.println("7 - Exercise");
            System.out.println("8 - Exercise");
            System.out.println("9 - Exercise");
            System.out.println("10 - Exercise");
            System.out.println("11 - Exercise");

            option = input.nextByte();

            switch (option) {

                case 0:

                    break;

                case 1:
                    HelloWorld.helloWorld();
                    exit();
                    break;

                case 2:
                    WelcomeMenssage.welcomeMenssage();
                    exit();
                    break;

                case 3:
                    Sum.sum();
                    exit();
                    break;

                case 4:
                    CountingLetters.countingLetters();
                    exit();
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 12:
                    break;

                case 13:
                    break;

                default:
                    System.out.println("Choose Correct Option");
                    break;
            }


        } while (option != 0);

    }

    public static void exit() {

        String answer;

        System.out.println("Do you wanna exit? (yes or no)");
        answer = input.next();

        if(answer.equalsIgnoreCase("yes")) {
            System.exit(1);
        }

    }

}
