package br.com.entra21.main.exercise_27;

import java.util.Scanner;

public class YearVerifier {

    public static void yearVerifier() {

        System.out.println("Make a program that reads any year and shows if it is a leap year.\n" +
                "The conditions for a leap year are:\n" +
                "If the year is evenly divisible by 4 (REST = 0), go to step 3.\n" +
                "If it is NOT evenly divisible by 4, go to step 8.\n" +
                "If the year is evenly divisible by 100, go to step 5.\n" +
                "If the year is NOT evenly divisible by 100, go to step 7.\n" +
                "If the year is evenly divisible by 400, go to step 7.\n" +
                "If the year is NOT evenly divisible by 400, go to step 8.\n" +
                "The year is a leap year (has 366 days).\n" +
                "The year is not a leap year (it has 365 days).\n" +
                "Evenly divisible = REST = 0");

        Scanner input = new Scanner(System.in);
        String year;

        System.out.print("\n-What year do you wanna know: ");
        year = input.next();

        Integer yearInteger = Integer.parseInt(year);

        if (yearInteger % 4 == 0) {
            if (yearInteger % 100 == 0) {
                if (yearInteger % 400 == 0) {
                    System.out.println("-The year " +year + " is leap year.");

                } else {
                    System.out.println("-The year " + year + " isn't leap year.");
                }
            } else {
                System.out.println("-The year " +year + " is leap year.");
            }

        } else {
            System.out.println("-The year " + year + " isn't leap year.");
        }
    }
}
