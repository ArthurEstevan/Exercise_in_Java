package br.com.entra21.main.exercise_10;

import java.util.Scanner;

public class RealToDollar {

    public static void realToDollar() {

        System.out.println("Create a program that reads how much money a person has in their wallet and shows how many Dollars they can buy:");

        Scanner input = new Scanner(System.in);

        float money;

        System.out.print("How much money do you have in your wallet? ");
        money = input.nextFloat();

        money = money / 4.79f;

        System.out.println("You can buy " +money+ " dollars.");

    }
}
