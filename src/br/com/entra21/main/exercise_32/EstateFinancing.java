package br.com.entra21.main.exercise_32;

import java.util.Scanner;

public class EstateFinancing {

    public static void estateFinancing() {

        System.out.println("Write a program to approve the bank loan for the purchase of a house.\n" +
                "Ask the value of the home, the buyer's salary and how many years he will pay.\n" +
                "The monthly installment cannot exceed 30% of the salary or else the loan will be denied.");

        Scanner input = new Scanner(System.in);

        double priceHome, salary, financingHome, financingMonth;
        byte yearBuy;

        System.out.print("\nWhat price home: ");
        priceHome = input.nextDouble();

        System.out.print("What is your salary: ");
        salary = input.nextDouble();

        System.out.print("In how many years do you plan to pay: ");
        yearBuy = input.nextByte();

        financingMonth = yearBuy * 12;

        financingHome = priceHome / financingMonth;

        if (financingHome > (salary*0.3f)) {
            System.out.println("Sorry, your funding was not approved.");
            System.out.println("The value of your installment was R$"+financingHome+" it exceeds 30% of your salary.\n");

        } else {
            System.out.println("Congratulations, your funding has been approved.");
            System.out.println("The amount of your installment was R$"+financingHome+" financed in "+financingMonth+" months\n");

        }





    }
}
