package br.com.entra21.main;

import br.com.entra21.main.exercise_01.HelloWorld;
import br.com.entra21.main.exercise_02.WelcomeMenssage;
import br.com.entra21.main.exercise_03.Sum;

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
            System.out.println("4 - Leave");
            System.out.println("5 - Leave");
            System.out.println("6 - Leave");
            System.out.println("7 - Leave");
            System.out.println("8 - Leave");
            System.out.println("9 - Leave");
            System.out.println("10 - Leave");
            System.out.println("11 - Leave");

            option = input.nextByte();

            switch (option) {

                case 0:

                    break;

                case 1:
                    HelloWorld.helloWorld();
                    break;

                case 2:
                    WelcomeMenssage.welcomeMenssage();
                    break;

                case 3:
                    Sum.sum();
                    break;

                case 4:
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

}
