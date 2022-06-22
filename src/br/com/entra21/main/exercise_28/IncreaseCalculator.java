package br.com.entra21.main.exercise_28;

import java.util.Scanner;

public class IncreaseCalculator {

    public static void increaseCalculator() {

        System.out.println("Write a program that asks an employee's salary and calculates the amount of his raise.\n" +
                "For salaries above R$1250.00, calculate a 10% increase. For those below or equal, the increase is 15%.");

        Scanner input = new Scanner(System.in);
        double salary, increase=0;

        System.out.print("\nWhat is your salary: ");
        salary = input.nextDouble();

        if (salary >= 1250) {
            increase = salary + (salary * 10f / 100f);
            System.out.println("-You will receive 10% increase-");
            System.out.println("Your increase will be " +(increase-salary));
        } else if (salary < 1250) {
            increase = salary + (salary * 15f / 100f);
            System.out.println("-You will receive 15% increase-");
            System.out.println("-Your increase will be " +(increase-salary));
        }

    }
}
