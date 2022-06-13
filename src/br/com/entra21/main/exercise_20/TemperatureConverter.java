package br.com.entra21.main.exercise_20;

import java.util.Scanner;

public class TemperatureConverter {

    public static void temperatureConverter() {

        System.out.println("Write a program that, based on a temperature in degrees Celsius, converts it and displays it in Kelvin (K), Reaumur (Re), Rankine (Ra) and Fahrenheit (F), following the formulas:\n" +
                "\tF = C * 1.8 + 32;\n" +
                "\tK = C + 273.15;\n" +
                "\tRe = C * 0.8;\n" +
                "\tRa = C * 1.8 + 32 + 459.67;\n");

        Scanner input = new Scanner(System.in);

        float fahrenheit, kelvin, reaumur, rankine, celsius;

        System.out.print("Enter a temperature in Celsius: ");
        celsius = input.nextFloat();

        fahrenheit = (celsius * 1.8f) + 32;
        System.out.print("\nYour temperature in Fahrenheit: " +fahrenheit);

        kelvin = celsius + 273.15f;
        System.out.print("\nYour temperature in Kelvin: " +kelvin);

        reaumur = celsius * 0.8f;
        System.out.print("\nYour temperature in Reaumur: " +reaumur);

        rankine = ((celsius * 1.8f) + 32) + 459.67f;
        System.out.print("\nYour temperature in Rankine: " +rankine);


    }
}
