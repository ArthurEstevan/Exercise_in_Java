package br.com.entra21.main.exercise_24;

import java.util.Scanner;

public class ElectronicRadar {

    public static void electronicRadar() {

        System.out.println("Write a program that reads the speed of a car.\n" +
                "If he exceeds 80Km/h, show a message saying he has been fined.\n" +
                "The fine will cost R$7.00 for each km over the limit.\n");

        Scanner input = new Scanner(System.in);

        int km, exceedsKM, price;

        System.out.print("What the speed of a car: ");
        km = input.nextInt();

        if (km > 80) {
            exceedsKM = km - 80;
            price = exceedsKM * 7;
            System.out.println("You exceeds speed in " +exceedsKM+ "Km/h, your traffic ticket costs R$" +price);
        } else {
            System.out.println("All right, good travel Sr.");
        }

    }
}
