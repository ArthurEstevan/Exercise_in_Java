package br.com.entra21.main.exercise_14;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void celsiusFahrenheit() {

        System.out.println("Write a program that converts a typed temperature to °C and converts it to °F.");

        Scanner input = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.print("Enter the temperature that you wanna convert to Fahrenheit: ");
        celsius = input.nextFloat();

        fahrenheit = (celsius*1.8f) + 32;

        System.out.println("Your temperature in Fahrenheit: " +fahrenheit);

    }
}
