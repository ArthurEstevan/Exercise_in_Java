package br.com.entra21.main.exercise_26;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TicketPrice {

    public static void ticketPrice() {

        System.out.println("\nDevelop a program that asks the distance of a trip in Km.\n" +
                "Calculate the ticket price, charging R$0.50 per km for trips of up to 200Km and R$0.45 for longer trips.\n");

        String place;
        double price[] = new double[3];
        Scanner input = new Scanner(System.in);

        DecimalFormat formato = new DecimalFormat("####.###");

        ArrayList<String> paises = new ArrayList<>(Arrays.asList("Paris - France","Guadeloupe - Caribbean", "Egypt - Asia"));

        System.out.println("\t_____________| PLACE TO TRAVEL |_____________\n");
        paises.forEach( listaDeViagem -> {
            System.out.println("\tTravel Package = "+listaDeViagem);
        });

        System.out.print("\n\t-Where do you wanna travel: ");
        place = input.nextLine();


        if(paises.get(0).equals(place)) {
            price[0] = 9647 * .45;
            String val1 = String.format("$%,.2f", price[0]);
            System.out.println("\tYour travel to Paris - France cost "+ val1);
        } else if(paises.get(1).equals(place)) {
            price[1] = 5029 * .45;
            String val1 = String.format("$%,.2f", price[1]);
            System.out.println("\tYour travel to Guadeloupe - Caribbean cost "+ val1);
        } else if(paises.get(2).equals(place)) {
            price[2] = 10409 * .45;
            String val1 = String.format("$%,.2f", price[2]);
            System.out.println("\tYour travel to Egypt - Asia "+ val1);
        }
    }
}
