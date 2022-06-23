package br.com.entra21.main.exercise_30;

import java.util.Scanner;

public class MilitaryEnlistment {

    public static void militaryEnlistment() {

        System.out.println("Make a program that reads the year of birth of a young person and informs, according to his age, if he is still going to enlist in the military, if it is the exact time to enlist or if it is past the time of enlistment.\n" +
                "Your program should also show the time remaining or overdue.\n");

        Scanner input = new Scanner(System.in);

        int age;
        short currentYear, yearBorn;

        System.out.print("Enter the year you were born: ");
        yearBorn = input.nextShort();

        System.out.print("Enter current year: ");
        currentYear = input.nextShort();

        age = currentYear - yearBorn;

        if (age<18 && age>-1) {
            System.out.println("\nIt's not yet time for your enlistment.");
            System.out.println("You have "+(18-age)+" years left for you to enlist.\n");
        } else if (age==18) {
            System.out.println("\nYou're 18, it's time to enlist in the military.\n");
        } else if (age>18) {
            System.out.println("\nYou should have already completed your enlistment.");
            System.out.println((age-18)+" year(s) has passed.");
        } else {
            System.out.println("\nOur! Are you from the future?");
        }



    }
}