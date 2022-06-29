package br.com.entra21.main.exercise_31;

import java.util.Scanner;

public class NationalSwimming {

    public static void nationalSwimming() {

        System.out.println("The National Swimming Confederation needs a program that reads an athlete's year of birth and shows his category, according to age:\n" +
                "Up to 9 years: MIRIM\n" +
                "Up to 14 years: CHILDREN\n" +
                "Up to 19 years old: JUNIOR\n" +
                "Up to 25 years old: SENIOR\n" +
                "Over 25 years: MASTER");

        Scanner input = new Scanner(System.in);

        int age;
        short currentYear, yearBorn;

        System.out.print("Enter the year you were born: ");
        yearBorn = input.nextShort();

        System.out.print("Enter current year: ");
        currentYear = input.nextShort();

        age = currentYear - yearBorn;

        if (age==9 && age>-1) {
            System.out.println("Category Mirim");
        } else if(age<=14) {
            System.out.println("Category Children");
        } else if (age<=19) {
            System.out.println("Category Junior");
        } else if (age<=25) {
            System.out.println("Category Senior");
        } else {
            System.out.println("Category Master");
        }

    }
}
