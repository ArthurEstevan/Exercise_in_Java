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
            option = input.nextByte();

            switch (option) {

                case 1:
                    HelloWorld.helloWorld();
                    break;

                case 2:
                    WelcomeMenssage.welcomeMenssage();
                    break;

                case 3:
                    Sum.sum();
                    break;

                default:
                    break;
            }


        } while (option != 0);

    }

}
